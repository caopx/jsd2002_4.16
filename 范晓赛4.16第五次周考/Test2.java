package exam416;
/** ������ڶ���  */
public class Test2 {
	public static void main(String[] args) {
		Home home = new Home();
		Thread t1 = new Thread() {
			public void run() {
				home.task();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				home.task();
			}
		};
		t1.start();
		t2.start();
	}
}

class Home{
	public void task() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+"�ڿ����ӣ�");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(t.getName()+"ȥ�����䣡");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}