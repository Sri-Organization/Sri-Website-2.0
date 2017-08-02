package org.sri.util;

public class MyPriorityThread implements Runnable{

	public long click = 0;
	public Thread t;
	private volatile boolean running = true;

	public MyPriorityThread(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}

	public void run() {
		while (running) {
			click++;
		}
	}

	public void stop() {
		running = false;
	}

	public void start() {
		t.start();
	}
}
