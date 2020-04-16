package exam416;
/** 程序题第二题  */
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
			System.out.println(t.getName()+"在看电视！");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(t.getName()+"去卫生间！");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}