package thread;

import java.util.Date;

public class Daemon {

	public static void main(String[] args) {
		
		Thread time=new Thread() {
			public void run() {
				while(true) {
					try {
						Date now=new Date();
						long time=now.getTime();
						System.out.println(time);
						currentThread().sleep(2000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		
		Thread reception=new Thread() {
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		reception.start();
		time.setDaemon(true);
		time.start();
	}

}
