package com.javaagent;
 
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
 
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.time.LocalDateTime;
 
public class FirstAgent implements ClassFileTransformer {
    public final String injectedClassName = "com.socketClient.SocketClient";
    public final String methodName1 = "run";
    public final String methodName2 = "main";
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        className = className.replace("/", ".");
//        System.out.println(className);
        if (className.equals(injectedClassName)) {
            CtClass ctclass = null;
            try {
                ctclass = ClassPool.getDefault().get(className);// 使用全称,用于取得字节码类<使用javassist>
                CtMethod ctmethod = ctclass.getDeclaredMethod(methodName1);// 得到这方法实例
                ctmethod.insertBefore("System.out.println(\"before run\"+java.time.LocalDateTime.now());");
                ctmethod.insertAfter("System.out.println(\"after run\"+java.time.LocalDateTime.now());");  
                CtMethod ctmethod2 = ctclass.getDeclaredMethod(methodName2);// 得到这方法实例
                ctmethod2.insertBefore("System.out.println(\"before main\"+java.time.LocalDateTime.now());");
                ctmethod2.insertAfter("System.out.println(\"after main\"+java.time.LocalDateTime.now());");  
           
                
                return ctclass.toBytecode();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return null;
    }
}
