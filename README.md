# JDBC-with-SQL
Here we are using JDBC which is related Advanced java. here we are using SQL 
For Insert query you have to follow few Steps;
=======================================================
||Step No : 1 :- Load the Driver ( Driver) (done 👍 ) ||
=======================================================

Class.forName("oracle.jdbc.driver.OracleDriver");
                                     
======================================================
||Step No : 2 :- Established Connection ( done 👍 ) ||
======================================================
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "UserId", "Password");
                                                                                              ( done 👍 )
                                                                                                
==================================================
||Step No : 3 :- Create Statement (done 👍 )    ||
==================================================
Statement st = con.createStatement();
                          

===========================================
|| Step No : 4 :- Send Query (done 👍 )   ||
===========================================
 Note : write query :: query = "insert into gold_diamond values(" + columnNo1 + "," + columnNo2 + "," + columnNo3 + ")";
int result = st.executeUpdate(query);

Note : we are using insert query so it's return intiger value (if record is inserted then it's showing 1 otherwise 0) so we can hold this value in intiger data type 

==========================================================
|| Step No : 5 :- Check data inserted or not (done 👍 )  ||
==========================================================

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
