package com.javaagent;
import java.lang.instrument.Instrumentation;
 

public class root {
    public static void premain(String agentOps, Instrumentation inst) {
        System.out.println("=========premain方法执行========");
        System.out.println(agentOps);
        // 添加Transformer
        inst.addTransformer(new FirstAgent());
        //inst.addTransformer(new SecondAgent());
    }
}