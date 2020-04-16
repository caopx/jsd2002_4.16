package Test;

public class Test4_16_1 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println(System.currentTimeMillis());
					try {
						Thread.sleep(2000);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
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
