package api;

public class Bbb {

	public static void main(String[] args) {
		See see = new See();
		Thread t1 = new Thread() {
			public void run() {
				see.start();				
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				see.start();
			}
		};
		t1.start();
		t2.start();
	}

}
 class See{
	 public void start(){
		 try {
			 Thread t = Thread.currentThread();
			 System.out.println(t.getName()+"�ڿ���������");
			Thread.sleep(5000);
			synchronized(this) {
				System.out.println(t.getName()+"�����ϲ���");
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
}