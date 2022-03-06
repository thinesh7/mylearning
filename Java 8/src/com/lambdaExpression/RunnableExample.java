package com.lambdaExpression;

public class RunnableExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Lambda Expression:
		Runnable myRunnableLambda = ()-> {
			for(int i=0; i<3; i++) {
				System.out.println(" HW -  "+Thread.currentThread().getName()+" "+i);
			}
		};
		
		
		Thread thread = new Thread(myRunnableLambda);
		
		thread.start();
		thread.join();
		
	}

}
