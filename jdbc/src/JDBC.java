
import java.sql.*;

//@SuppressWarnings("ALL")
public class JDBC {

    static void sqlRunner(Statement statement, String str)throws SQLException{
        statement.execute(str);
        statement.executeUpdate(null);
        statement.executeQuery(null);
    }

    public static void main(String[] args) {
        try{
            Connection connection=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/prac",
                    "root",
                    "1226"
            );

            Statement statement=connection.createStatement();
            connection.prepareCall(null);
            connection.prepareStatement(null,ResultSet.TYPE_SCROLL_INSENSITIVE)
                    .setBinaryStream(0,null);
            ResultSet set=statement.executeQuery(null);
            sqlRunner(statement, "create table Student\n"+"(Sno char(9) primary key,"+
                    "Sname char(20) unique,"+"Ssex char(2), Sage smallint ,Sdept char(20));");

            sqlRunner(statement,"create table Course\n"+"(Cno char(4) primary key,"+
                    "Cname char(40) not null ,"+"Cpno char(4), Ccredit smallint,"+
                    "foreign key (Cpno) references Course(Cno));");

            sqlRunner(statement,"create table SC\n"+"(Sno char(9) ,Cno char(4),Grade smallint ,"+
                    "primary key (Sno,Cno),foreign key (Sno) references Student(Sno),"+
                    "foreign key (Cno) references Course(Cno))");

        }catch(SQLException se){
            se.printStackTrace();
        }
    }
}
