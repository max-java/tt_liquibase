url=jdbc:postgresql://localhost:4432/switcher
username=user
password=password
driver=org.postgresql.Driver

# @ComponentScan for entities (dialect must be set)
referenceUrl=hibernate:spring:by.jrr.tt.liquibase.bean?dialect=org.hibernate.dialect.PostgreSQLDialect

diffChangeLogFile=src/main/resources/absentEntitiesChangeLog.xml

changeLogFile=src/main/resources/db/changelog/db.changelog-master.yaml


#### DIALECTS ####
#   RDBMS	                Dialect
#   Oracle (any version)	org.hibernate.dialect.OracleDialect
#   Oracle9i	            org.hibernate.dialect.Oracle9iDialect
#   Oracle10g	            org.hibernate.dialect.Oracle10gDialect
#   MySQL	                org.hibernate.dialect.MySQLDialect
#   MySQL with InnoDB	    org.hibernate.dialect.MySQLInnoDBDialect
#   MySQL with MyISAM	    org.hibernate.dialect.MySQLMyISAMDialect
#   DB2	                    org.hibernate.dialect.DB2Dialect
#   DB2 AS/400	            org.hibernate.dialect.DB2400Dialect
#   DB2 OS390	            org.hibernate.dialect.DB2390Dialect
#   Microsoft SQL Server	org.hibernate.dialect.SQLServerDialect
#   Sybase	                org.hibernate.dialect.SybaseDialect
#   Sybase Anywhere	        org.hibernate.dialect.SybaseAnywhereDialect
#   PostgreSQL	            org.hibernate.dialect.PostgreSQLDialect
#   SAP DB	                org.hibernate.dialect.SAPDBDialect
#   Informix	            org.hibernate.dialect.InformixDialect
#   HypersonicSQL	        org.hibernate.dialect.HSQLDialect
#   Ingres	                org.hibernate.dialect.IngresDialect
#   Progress	            org.hibernate.dialect.ProgressDialect
#   Mckoi SQL	            org.hibernate.dialect.MckoiDialect
#   Interbase	            org.hibernate.dialect.InterbaseDialect
#   Pointbase	            org.hibernate.dialect.PointbaseDialect
#   FrontBase	            org.hibernate.dialect.FrontbaseDialect
#   Firebird	            org.hibernate.dialect.FirebirdDialect