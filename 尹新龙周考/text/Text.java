package text;
/**
 * 1. 采用匿名内部类的方式创建2个线程，一个线程为计时线程，每隔2s输出当前时间的毫秒表示，
另一个线程为前台线程，任务是线程开始，休眠10秒结束，当前台线程结束，计时线程也随之结束。请完成以上案例。
 * @author 尹新龙
 *
 */
public class Text {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("线程1开始");
				for(int i = 0;i<100;i++){
					int time = i;
					System.out.println(time);
					try {
					     Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				System.out.println("线程1结束！");
				
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				try {
					System.out.println("线程2开始！");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					t1.interrupt();
				}
				System.out.println("结束2！");
			}
			
		};
		t1.start();
		t2.start();
	}
	
}


	   