package com.javaassist;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

import javassist.*;




public class ChangeMethodInJar {

	public static void main(String[] args) {
	        try {
	            ///////////////////////////////////
	            //  使用javaassist修改 class/jar 代码
	            ///////////////////////////////////
	            //  设置jar包路径
	            ClassPool.getDefault().insertClassPath("E:\\workspace\\routetest\\route\\jar\\socketclient.jar");
	 
	            // 获取需要修改的类
	            CtClass testJarClass = ClassPool.getDefault().getCtClass("com.socketClient.SocketClient");
	            // 获取类中的printTest方法
	            CtMethod runMethod = testJarClass.getDeclaredMethod("run");
	            // 修改该方法的内容
	            //runMethod.setBody("System.out.println(\"hello javaassist\");");
	            runMethod.insertBefore("System.out.println(\"hello javaassist\");");

	 
	            ///////////////////////////////////
	            //  使用反射测试输出,查看修改结果
	            ///////////////////////////////////
	            /*
	            Class newTestJarClass = testJarClass.toClass();
	            // 使用修改过的类创建对象
	            Object newTestJar = newTestJarClass.newInstance();
	            Method newPrintTestMethod = newTestJarClass.getDeclaredMethod("run");
	            newPrintTestMethod.invoke(newTestJar);
	           */
	            // 解除代码锁定,恢复可编辑状态
	            testJarClass.defrost();
	            // 写出到外存中
	            //testJarClass.writeFile();
	           //只能生成class，然后手工添加到jar里
	           testJarClass.writeFile("E:\\workspace\\routetest\\route\\jar\\");
	            //testJarClass.writeFile(other path);
	           
	           /*
	           String cmd="jar cvfm socketclient.jar com\\socketClient\\SocketClient.class";
	           Process ps = Runtime.getRuntime().exec(cmd);
	         //get feedback 
	     	  BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
	     	  String line;
	           while ((line = br.readLine()) != null) {
	         	  System.out.println(line);
	     	 }
	           */
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        


	}

}
