package text;

public class Text1 {
		public static void main(String[] args) {
			Tv tv = new Tv();
			
			Thread t1 = new Thread() {
				public void  run() {
					tv.go();
				}
			};
			Thread t2 = new Thread() {
				public void run() {
					tv.go();
				}
			};
			t1.start();
			t2.start();
		}

	}
	class Tv{
		public void go() {
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+"�������ӡ�����");
				Thread.sleep(5000);		
				synchronized(this) {
					System.out.println(t.getName()+"�����ϲ���������");
					Thread.sleep(5000);
				}
				System.out.println(t.getName()+"������");
			}catch(Exception e) {
				
			}
		}
	}



