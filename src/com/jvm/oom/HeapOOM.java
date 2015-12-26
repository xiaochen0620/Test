package com.jvm.oom;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
	private final static String aaa = "aaa";
	static class OOMObject{
		
	}
	
	public static void main(String[] args){
		List<OOMObject> list = new ArrayList<OOMObject>();
		int i=0;
		while(true){
			list.add(new OOMObject());
			if(i++%10000==0)
				System.out.println(i);
		}
	}
}
