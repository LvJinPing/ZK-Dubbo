package com.atguigu.mydubbo.hello.sp;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartHelloSP {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-hello-sp.xml");
		
		ctx.start();

		try 
		{
			System.in.read();   // 按任意键退出 
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
