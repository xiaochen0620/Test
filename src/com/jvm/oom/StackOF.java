package com.jvm.oom;

public class StackOF {
	
	private int stackLength = 1;
	
	public void stackLeak(){
		if(stackLength++%10000==0)
			System.out.println(stackLength);
		stackLeak();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOF oom = new StackOF();
		try{
			oom.stackLeak();
		}catch(Throwable e){
			System.out.println("stack length:"+oom.stackLength);
			throw e;
		}

	}

}
