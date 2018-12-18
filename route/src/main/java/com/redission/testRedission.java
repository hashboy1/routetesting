package com.redission;

import java.time.LocalDateTime;

import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;


public class testRedission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Config config = new Config();
		//指定使用单节点部署方式
		config.useSingleServer().setAddress("redis://192.168.0.160:6379");
		//创建客户端(发现创建RedissonClient非常耗时，基本在2秒-4秒左右)
		RedissonClient redisson = Redisson.create(config);
		 
		//首先获取redis中的key-value对象，key=time不存在没关系
		RBucket<String> keyObject = redisson.getBucket("time");
		//如果key=time存在，就设置key=time的值为新值20171013
		//如果key=time不存在，就设置key的值为20171013
		
		System.out.println("key:"+keyObject.get());
		
		//keyObject.set("20171013");
		keyObject.set(LocalDateTime.now().toString());
		redisson.shutdown();
	}

}
