package thread;

public class synchronizedDemo {

	public static void main(String[] args) {
		Living liv=new Living();
		Thread t1=new Thread() {
			public void run() {
				liv.paly();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				liv.paly();
			}
		};
		t1.start();
		t2.start();
	}

}

class Living{
	public void paly() {
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"���ڿ�����");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(t.getName()+"�����ϲ���");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+"���������ȥ��������");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}