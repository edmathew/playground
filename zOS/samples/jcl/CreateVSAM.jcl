//CREVSAM  JOB ('DEV'),'EJPMATEUS',CLASS=G,MSGCLASS=X,
//         REGION=0M,NOTIFY=&SYSUID    
//*-------------------------------------------------------------------
//* Create a VSAM
//*-------------------------------------------------------------------
//STEP1  EXEC PGM=IDCAMS                                   
//SYSPRINT DD SYSOUT=*           
//LOADINFO DD DISP=SHR,DSN=HLQ.VSAM.ORIGIN                          
//SYSIN  DD     *                                          
 DELETE HLQ.VSAM.NAME.CLU
 IF MAXCC GT 0 THEN SET MAXCC = 0
 
 DEFINE CLUSTER (NAME (HLQ.VSAM.NAME.CLU) -
    VOLUMES      (*,*,*)     -
    RECORDSIZE   (66 66)     -
    TRACKS       (200 200)   - 
    KEYS         (30 0)      - 
    SHR          (4,3))      -
   DATA (NAME (HLQ.VSAM.NAME.DATA) - 
          SHR (4,3)) - 
   INDEX (NAME (HLQ.VSAM.NAME.INDEX) -
          SHR (4,3)) 
          
   REPRO INFILE(LOADINFO) OUTDATASET(HLQ.VSAM.NAME.CLU)
/*                     
//*-------------------------------------------------------------------
                                    