package com.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.serializable.SerialzeUtil;
import com.springannotation.bean.Person;

public class streamTesting {
	

	public void SerialzableFile() throws Exception{
		
		Person pp=new Person("noone", 11);
		FileOutputStream fos=new FileOutputStream("d:\\stream.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(pp);
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("d:\\stream.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);		
		Person p1=(Person)ois.readObject();
		System.out.println(p1);		
		
	}
	
	@Test
	public void SerialzableDB() throws Exception{
		
		Person pp=new Person("noone", 11);
		byte[] by=SerialzeUtil.serialize(pp);
	
		
		  String driver = "com.mysql.jdbc.Driver";
          //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://192.168.0.160:3306/test2?useUnicode=true&characterEncoding=utf-8&&useSSL=true";
        //MySQL配置时的用户名
        String user = "root";
         //MySQL配置时的密码
        String password = "root";
        Connection con = null;
             //加载驱动程序
              Class.forName(driver);
              //1.getConnection()方法，连接MySQL数据库！！
             con = DriverManager.getConnection(url,user,password);
             Statement statement = con.createStatement();

             String sql="insert into tperformance2(uuid) values('"+ new String(by,"ISO-8859-1")+"')";
             statement.execute(sql);
              
             
             String sql2="select id,uuid from tperformance2";
             ResultSet rs=statement.executeQuery(sql2);
             while (rs.next())
             {
            	 byte[] content=rs.getString(2).getBytes("ISO-8859-1");
            	 Person pp2=(Person)SerialzeUtil.deserialization(content);
            	 System.out.println(pp2.toString());
            	 
             }
		   
	}
	
	



}
