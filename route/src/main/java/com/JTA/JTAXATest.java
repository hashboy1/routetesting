package com.JTA;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import javax.sql.XAConnection;
import javax.sql.XADataSource;
import javax.transaction.xa.XAException;
import javax.transaction.xa.XAResource;
import javax.transaction.xa.Xid;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlXid;

public class JTAXATest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		XADataSource xaDs1=JTAXATest.getDataSource("jdbc:mysql://192.168.0.160:3306/test2", "root", "root");
		XAConnection xaCon1=null;
		XAResource xaRes1 = null;
		Connection conn1=null;
		Statement stmt1 =null;
		
		
		XADataSource xaDs2=JTAXATest.getDataSource("jdbc:mysql://192.168.0.160:3306/testdb2", "root", "root");
		XAConnection xaCon2=null;
		XAResource xaRes2 = null;
		Connection conn2=null;
		Statement stmt2 =null;
		
		int ret1=0;
		int ret2=0;
		
		Xid xid1=new MysqlXid(new byte[]{0x02},new byte[]{0x01}, 100);
		Xid xid2=new MysqlXid(new byte[]{0x03}, new byte[]{0x01}, 100);
		try {			
			xaCon1 = JTAXATest.getXAConnetion(xaDs1);
			conn1= JTAXATest.getConnection(xaCon1);
			stmt1=conn1.createStatement();
			xaRes1=xaCon1.getXAResource();
			
			xaCon2 = JTAXATest.getXAConnetion(xaDs2);
			conn2= JTAXATest.getConnection(xaCon2);
			stmt2=conn2.createStatement();
			xaRes2=xaCon2.getXAResource();
			
			xaRes1.start(xid1, XAResource.TMNOFLAGS); 
			stmt1.execute("INSERT INTO tablexa (currtime) VALUES ('"+LocalTime.now()+"')");
			xaRes1.end(xid1, XAResource.TMSUCCESS);
							
			xaRes2.start(xid2, XAResource.TMNOFLAGS); 
			stmt2.execute("INSERT INTO tablexa (currtime) VALUES ('"+LocalTime.now()+"')");
			xaRes2.end(xid2, XAResource.TMSUCCESS);
			
			ret1 = xaRes1.prepare(xid1); 
			ret2=xaRes2.prepare(xid2);
			
		
			
			
			if (ret1 == XAResource.XA_OK&&ret2==XAResource.XA_OK) { 
			 xaRes1.commit(xid1, false);
				//Thread.sleep(10000000);
			 
			 xaRes2.commit(xid2, false);
			 
			 
			 /*
			  * 在二阶段提交的阶段二中，当协调者向参与者发送commit请求之后，发生了局部网络异常或者在发送commit请求过程中协调者发生了故障，这回导致只有一部分参与者接受到了commit请求。
而在这部分参与者接到commit请求之后就会执行commit操作。但是其他部分未接到commit请求的机器则无法执行事务提交。于是整个分布式系统便出现了数据部一致性的现象。
			  */
			 
			 /*
			 //xaRes1.rollback(xid1);		
			 if (xaRes2.isSameRM(xaRes1)) {
				xaRes2.rollback(xid1);
			 }else{
				 xaRes2.rollback(xid2);
			 }
			 */
			}
			 else
			 {
				 xaRes1.rollback(xid1);
				 xaRes2.rollback(xid2);
			 }
				 
			 
			 	
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 xaRes1.rollback(xid1);
			 xaRes2.rollback(xid2);
		}
		
	}
	

	private static XADataSource getDataSource(String url,String user,String password) {
		// TODO Auto-generated method stub
		MysqlXADataSource dataSource = new MysqlXADataSource();
		dataSource.setUrl(url);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		return dataSource;
	}	
	

	public static XAConnection getXAConnetion(XADataSource dataSource) {
		XAConnection XAConn = null;
		try {
			XAConn = dataSource.getXAConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return XAConn;
	}

	public static Connection getConnection(XAConnection XAConn) {
		Connection conn = null;
		try {
			conn = XAConn.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("连接关闭失败");
		}
	}

}


