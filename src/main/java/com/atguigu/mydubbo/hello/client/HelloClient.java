package com.atguigu.mydubbo.hello.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.mydubbo.hello.service.HelloService;


public class HelloClient 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-client.xml");
		
		context.start();

		HelloService helloService = (HelloService) context.getBean("helloService");
		int ret = helloService.add(6, 12);
		System.out.println("*************ret: "+ret);
	}
}
