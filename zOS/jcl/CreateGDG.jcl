//CREGDG   JOB ('DEV'),'EJPMATEUS',CLASS=G,MSGCLASS=X,
//         REGION=0M,NOTIFY=&SYSUID    
//*-------------------------------------------------------------------
//* Create a GDG
//*-------------------------------------------------------------------
//STEP1  EXEC PGM=IDCAMS                                   
//SYSPRINT DD SYSOUT=*                                     
//SYSIN  DD     *                                          
   DEFINE GDG(                    -                        
          NAME(HLQ.FILE.NAME)    -                  
          LIMIT(10)               -                        
          NOEMPTY                 -                        
          SCRATCH)                                         
/*                     
//*-------------------------------------------------------------------
                                    