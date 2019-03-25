package com.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialzeUtil {

	

/**
	 * 
	* @Title: serialize
	* @Description: 输入文件序列化
	* @param @param file
	* @param @return    设定文件
	* @return byte[]    返回类型
	* @throws
	 */
	public static byte[] serialize(Serializable value) {
		try {
			//序列化的核心是ByteArrayOutputStream
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			//创建输出流
			ObjectOutputStream oos = new ObjectOutputStream(bao);
			//输出流写操作
			oos.writeObject(value);
			//关闭流操作
			oos.flush();
			oos.close();
			//返回Byte数组
			return bao.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 
	* @Title: roadSerializable
	* @Description: 读取文件反序列化
	* @param @param value
	* @param @return    设定文件
	* @return Serializable    返回类型
	* @throws
	 */
	public static Object deserialization(byte[] value) {
		Object result;
		try {
			//反序列化的核心ByteArrayInputStream
			ByteArrayInputStream bai = new ByteArrayInputStream(value);
			//创建输入流
			ObjectInputStream ois = new ObjectInputStream(bai);
			//读取文件
			result  = ois.readObject();
			//System.out.println("result>>>>>>>"+result);
			//关闭流
			ois.close();
			return result;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
