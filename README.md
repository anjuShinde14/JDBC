	JDBC 

-	Jdbc Stands for java database connectivity.
-	JDBC is an API library which was developed by SUN MICROSYSTEM.
-	It defines A UNIFORM INTERFACE for accessing a virtual Relational database.
-	Using jdbc API library we can connect JAVA APLLICATION TO DATABASE MANEGEMENT system.
-	In java we can create a FRONT-END Application throw which user interact to that application or user provide the information & using JDBC we can connect that front end Application with DATABASE. Where that information Get Stord that is a Back-end application.                                                                                                                                                    
-	The JDBC API use a Driver Manager and database specific driver to provide Connectivity to different database.
-	JDBC deriver translate the standard JDBC calls into a N/W or database protocol that communicate with database.

	DATABSE DRIVER-
-	A software that enables java Application To interact with database management system.
-	It is simple carries to connect your java application to database.
-	Where Driver is acts like a bridge between any application or database.
That store data into database.
	Thear are four type of database Driver-
        1] Type I = JDBC ODBC BRIDGE DRIVER-
                  -JDBC-   java database connectivity design by son Micro system.
                  -ODBC- ODBC stands for oracle database connectivity design by                                                                                                                               windows.
                -  hear ODBC is only windows specific Operating System It is not used for any other Operating System, so it removes support for java 7, in the previous Version it is used.
2] Type II= Native API-
    - Here we avoid the ODBC instead of we use vendor specific driver.
    - in this type finally Remove the OS dependency.
    - But this vendor specific driver must be installed on all system partially c &  java vendor specific.
     - Oracle OCI but now it is outdated.
3] Type III= JDBC NETWORK Protocol DRIVER
      - In this type initially, we instilled our API on server & that server transform                       your Api to client machine.
      - when someone is connected to this server throw the internet small copy of API is sending to the respective client machine.
      - Basically, it is indirectly told that API in your Machine, throw network so it is called NETWORK PROTOCOL DRIVER.
      - Here type 2 driver is running on server& whenever you give the request to server it transform that API in your machine & installed it.
4] Type IV= JDBC THINE UNIVARSAL DRIVER.
           - It is not used any middleware driver to connect the DB.
 	It is Twostep process- 1- java code = type 4&
                                                            2- type 4 to Database & vice versa.
-	Fully in java.  
-	Portable.
-	Vendor specific.
 
	MYSQL= com.mysql.cj.jdbc.Driver.
	ORACLE=oracle.jdbc.oracleDriver.

	JDBC steps- 
1)	Load & Register driver class-
Class.forname(“com.mysql.cj.jdbc.Driver”);
Static{
 ………
}
{
}
             2)Get JDBC connection using driver manager.
                 (jdbc:mysql://localhost:3307/employee.root.root
3)	Create jdbc statement using (SQL query) to fired query .
Query may be select, update, delete.
            4)execute the Query and collect the result.
                   SELECT-executeQuery()Resultset(rows&colms)
                    Or
                    Non- SELECTexecuteUpdate()int (affected rows)
               5)close all

	JDBC OBJECTS: -
1.	Driver
I)	It create a socket connection with database & Authenticate.
II)	Should be register with DriverManager.
III)	It manage a set of jdbc Driver(oracle/MySQL/nosql etc.…).

2.	Connection
I)	It Encapsulate the socket connection.
II)	Used for Creating a Statement.
III)	Use to manage the transaction
3.	Statement-
I)	It represent SQL query.
II)	Can be DDL, DML, or DQL.

4.	Result Set-
I)	Like a cursor in RDBMS.
II)	Use to access records on by one.


 	MySQL Driver connection-
1.	String DB Driver- “com.mysql.cj.jdbc.Driver”;
2.	String DB_URL-“jdbc:mysql://localhost:3307/emp/Employee”;
3.	String DB_URL-“root”;
4.	String DB_Password-“root”;





 	Statement – 
-	Statement is an interface that present in java. SQL package.
-	 It main purpose to represent  sql statement & execute query with           the database. 
-	It is used for accessing your database.
-	It compiles and execute every time each query.
-	It is used to execute different types query like CREATE, UPDATE , SELECT & DELETE.
-	It content different types of methods like execute(),executeQuery(), executeupdate().
-	Each method has its oven functionality-

 	Execute()-  
   -  methods use to perform DDL operation like CREATE, DROP, & TUNCATE the table.
  - It returns only Boolean value either true or false to validate table status changes.


 	 ExecuteQuery()-
           - return ResultSet method use to perform DQL operation.
              like select table data & it return Resultset object.
                       - With the help of ResulSet object we can get data from database. 

 	ExeucteUpdate()-
 - method is use to perform a DML operation.
    Like INSERT, DELETE, UPDATE.
 -  it returns a integer value.
 -  That mining row is updated successfully.


-	If you want to run SQL query only once then this interface is preferred over PreparedStatement. 









 	Prepared Statement ()-
    - prepared statements is an interface that present in java SQL package.
     - prepared statements is sub class of statement, it can do what statement can do, plus more.
     - It is used when you want to use SQL statements many times. 
     - prepared statements object represent a precompiled SQL query.
        Manse when prepared statement is created SQL query is pass as a parameter.
        This prepared statement contains a precompiled SQL statement so you can be used to execute the statements multiple times.
      - we use a prepared statement method of a connection interface.
      - this method accepts the query (parameterized)&returns a prepared statement.
      So, it works both static and Dynamic query.
   -if we use a dynamic query for prepared statement () method then we can set a parameter value by setter method by prepared statement.
   - prepared statement is best choice it escapes the special characters from query & avoid SQL injection attacks.




 	


