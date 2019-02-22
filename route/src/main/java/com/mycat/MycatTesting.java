package com.mycat;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import org.apache.log4j.Logger;





public class MycatTesting  {
   

	public static void main(String[] args) {
		
		
		Connection con = null;
        String driver = "com.mysql.jdbc.Driver";
          //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://192.168.0.249:8066/TESTDB";
        //MySQL配置时的用户名
        String user = "root";
         //MySQL配置时的密码
        String password = "Hebut_Vrkb_649";
        String sql= "/*!mycat:catlet=io.mycat.catlets.ShareJoin */ select * from employee ee,role rl where ee.Role=rl.role";
        
          //遍历查询结果集
         try {
             //加载驱动程序
            Class.forName(driver);
              //1.getConnection()方法，连接MySQL数据库！！
             con = DriverManager.getConnection(url,user,password);
             Statement statement = con.createStatement();
             
             ResultSet rs=statement.executeQuery(sql);
             while (rs.next())
             {
            	 
            	 System.out.println(rs.getString("ID"));
             }
	
		
	} 
	
	catch (Exception e) {
		
		e.printStackTrace();
	}
     finally{
    	 try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
		
	}
   
   
	
	

}
