package Test;

public class Tets4_16_2 {
	public static void main(String[] args) {
		Person p = new Person();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				p.something();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				p.something();
			}
		};
		t1.start();
		t2.start();
	}
}

class Person {
	public void something() {
		try {
			Thread t1 = Thread.currentThread();
			String name = t1.getName();
			System.out.println(name + "正在看电视");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(name + "上厕所");
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
