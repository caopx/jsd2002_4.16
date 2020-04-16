package day01;
/**
 * 
 */

import java.util.Date;

public class Time {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				while(true) {
					try {
						Date now=new Date();//当前时间
						long time=now.getTime();//转换毫秒
						System.out.println(time);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		}	
}

