package com.SPI;

import java.util.ServiceLoader;

public class SPIMain {
    public static void main(String[] args) {
    	//ServiceLoader will scan the folder /META_INF/services,it is to find the configuration file by interface name
        ServiceLoader<HelloInterface> loaders = 
              ServiceLoader.load(HelloInterface.class);       
        for (HelloInterface in : loaders) {
            in.sayHello();
        }
             
        StringBuffer sb=new StringBuffer();
        sb.append("abcdefghijklmn");
        System.out.println(sb.reverse());
    }
}