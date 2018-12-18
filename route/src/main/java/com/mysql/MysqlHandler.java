package com.mysql;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import org.apache.log4j.Logger;




/*
 * the logic detail when socket connected
 * 
 * 
 * 
 */

public class MysqlHandler implements Runnable {
   
	private int i;
	public static Logger logger1 = Logger.getLogger(MysqlHandler.class);
	public MysqlHandler(int argi)
	{
		i=argi;	
	}
	
	@Override
	public void run() {
				Connection con = null;
		        String driver = "com.mysql.jdbc.Driver";
		          //URL指向要访问的数据库名mydata
		        String url = "jdbc:mysql://192.168.0.160:3306/test2?useUnicode=true&characterEncoding=utf-8&&useSSL=true";
		        //MySQL配置时的用户名
		        String user = "root";
		         //MySQL配置时的密码
		        String password = "root";
		          //遍历查询结果集
		         try {
		             //加载驱动程序
		            Class.forName(driver);
		              //1.getConnection()方法，连接MySQL数据库！！
		             con = DriverManager.getConnection(url,user,password);
		             Statement statement = con.createStatement();
		             
		             for (int j=1;j<=10000;j++)
		             {
		             String sql="insert into tperformance(uuid) values('"+ UUID.randomUUID().toString()+"')";
		             statement.execute(sql);
		             }
		             
				
				
				
			} 
			
			catch (Exception e) {
				// TODO Auto-generated catch block
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
