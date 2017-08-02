package org.sri.util;

public class Consumer implements Runnable {

	Q q;
	
	public Consumer(Q q){
		this.q =q;
		new Thread(this).start();
	}
	
	public void run() {
		
		while(true) {
			q.getN();
		}
	}

}
