-------------------------------------------------
--   Create tables
-------------------------------------------------

CREATE TABLE hotels.client
(
	ClientNumber 		integer NOT NULL,
    ClientType          char(1) NOT NULL,
	Name  			    text NULL,
    Contact             text NULL,
    NIF                 text NOT NULL,
	CONSTRAINT PK_CLIENT PRIMARY KEY (ClientNumber)
);

CREATE TABLE hotels.invoice
(
	InvoiceNumber 		integer NOT NULL,
	BookingNumber 		integer NOT NULL,
	BookingDate  		timestamp NULL,
	amount   			numeric(30,6) NULL,
	CONSTRAINT PK_INVOICE PRIMARY KEY (InvoiceNumber)
);

CREATE TABLE hotels.Hotel
(
	HotelID 			    text NOT NULL,
	HotelDesignation  		text NULL,
	CONSTRAINT PK_HOTEL PRIMARY KEY (HotelID)
);

CREATE TABLE hotels.room
(
	HotelID 			    text NOT NULL,
	RoomNumber       		integer NOT NULL,
	beds              		integer NULL,
	price 			        numeric(30,6) NULL,
	CONSTRAINT PK_ROOM PRIMARY KEY (HotelID, RoomNumber)
);

CREATE TABLE hotels.booking
(
	BookingNumber 		integer NOT NULL,
	ClientNumber 		integer NOT NULL,
	startDate    		timestamp NULL,
	endDate      		timestamp NULL,
	CONSTRAINT PK_BOOKING PRIMARY KEY (BookingNumber)
);

CREATE TABLE hotels.booking_room
(
	BookingNumber 		    integer NOT NULL,
	HotelID 			    text NOT NULL,
	RoomNumber        		integer NOT NULL,
	extraBed         		bit NULL,
	personCount     		integer NULL,
	CONSTRAINT PK_BOOKING_ROOM PRIMARY KEY (BookingNumber, HotelID, RoomNumber)
);


-------------------------------------------------
--   ADD FOREIGN KEY definitions
-------------------------------------------------

ALTER TABLE hotels.invoice
	ADD CONSTRAINT FK_INVOICE_BOOKING  FOREIGN KEY (BookingNumber) 
	REFERENCES hotels.booking (BookingNumber) on update cascade on delete cascade;

ALTER TABLE hotels.room
	ADD CONSTRAINT FK_ROOM_HOTEL FOREIGN KEY (HotelID) 
	REFERENCES hotels.Hotel (HotelID) on update cascade on delete cascade;

ALTER TABLE hotels.booking
	ADD CONSTRAINT FK_BOOKING_CLIENT FOREIGN KEY (ClientNumber) 
	REFERENCES hotels.client (ClientNumber) on update cascade on delete cascade;

ALTER TABLE hotels.booking_room
	ADD CONSTRAINT FK_BOOKING_ROOM_ROOM FOREIGN KEY (HotelID, RoomNumber) 
	REFERENCES hotels.room (HotelID,RoomNumber) on update cascade on delete cascade;

ALTER TABLE hotels.booking_room
	ADD CONSTRAINT FK_BOOKING_ROOM_BOOKING FOREIGN KEY (BookingNumber) 
	REFERENCES hotels.booking (BookingNumber) on delete cascade on update cascade;

commit;
