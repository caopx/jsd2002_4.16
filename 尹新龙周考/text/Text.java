package text;
/**
 * 1. ���������ڲ���ķ�ʽ����2���̣߳�һ���߳�Ϊ��ʱ�̣߳�ÿ��2s�����ǰʱ��ĺ����ʾ��
��һ���߳�Ϊǰ̨�̣߳��������߳̿�ʼ������10���������ǰ̨�߳̽�������ʱ�߳�Ҳ��֮��������������ϰ�����
 * @author ������
 *
 */
public class Text {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("�߳�1��ʼ");
				for(int i = 0;i<100;i++){
					int time = i;
					System.out.println(time);
					try {
					     Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				System.out.println("�߳�1������");
				
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				try {
					System.out.println("�߳�2��ʼ��");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					t1.interrupt();
				}
				System.out.println("����2��");
			}
			
		};
		t1.start();
		t2.start();
	}
	
}


	   