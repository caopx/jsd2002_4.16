package day01;
/**
 * 
 * @author Felix
 *
 */

public class Person {
	public static void main(String[] args) {
		Runnable r1 = new Person1();
		Runnable r2 = new Person2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
	}

}
class Person1 implements Runnable{
	public void run(){
		
	}
}
class Person2 implements Runnable{
	public void run(){
	
	}
}