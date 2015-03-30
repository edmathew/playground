//UNL#SQL JOB ('DEV'),'EJPMATEUS',CLASS=G,MSGCLASS=X,
//         REGION=0M,NOTIFY=&SYSUID    
//*-------------------------------------------------------------------
//UNLOAD01 EXEC DSNBATCH,REGION=0K,DB2PRE='SYS1.<qlDB2>'
//*-------------------------------------------------------------------
//* Execute batch sql query in DB2 -> <qlDB2> DB2 Env
//*-------------------------------------------------------------------
//SYSTSIN  DD *                                        
  DSN SYSTEM(<qlDB2>)                                     
  RUN PROGRAM(DSNTIAUL) PLAN(DSNTIAUL) -               
      LIB('SYS1.DSN<qlDB2>.RUNLIB.LOAD') PARM('SQL')      
  END                                                            
//SYSPUNCH DD  SYSOUT=*                         
//SYSREC00 DD DSN=HLQ.DATA.UN.TABNAME,          
//            DISP=(NEW,CATLG,DELETE),
//            UNIT=SYSDA,SPACE=(CYL,(500,500),RLSE)
//*   
//SYSIN    DD *
  SELECT * FROM <QUALIFIER>.<TBNAME> WITH UR;
/*
