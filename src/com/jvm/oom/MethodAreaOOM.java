package com.jvm.oom;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MethodAreaOOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(true){
			if(i++%100==0)
				System.out.println(i);
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new MethodInterceptor(){

				@Override
				public Object intercept(Object obj, Method method,
						Object[] args, MethodProxy proxy) throws Throwable {
					// TODO Auto-generated method stub
					return proxy.invokeSuper(obj, args);
				}
				
			});
			enhancer.create();
		}
	}
	
	static class OOMObject{
		
	}

}
