package api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AAA {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
			try {
				while(true) {
				Thread.sleep(2000);
				Date nowdate = new Date();				
				SimpleDateFormat  sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
				String t = sdf.format(nowdate);
				System.out.println(t);					
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				try {
					Thread.sleep(10000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}


}
