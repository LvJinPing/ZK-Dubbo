package com.atguigu.mydubbo.hello.biz;



import com.atguigu.mydubbo.hello.service.HelloService;






public class HelloServiceImpl implements HelloService 
{
	@Override
	public int add(int a, int b)
	{
		System.out.println("**O(∩_∩)O哈哈~*****a: "+a+"\t b: "+b);
		return a+b;
	}
	
	
}
