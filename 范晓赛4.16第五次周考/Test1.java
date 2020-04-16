package exam416;
/** 程序题第一题 */
public class Test1 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				while(true) {
					try {
						long time = System.currentTimeMillis();
						System.out.println(time);
						Thread.sleep(2000);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}
}
