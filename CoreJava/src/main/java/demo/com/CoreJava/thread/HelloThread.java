package demo.com.CoreJava.thread;


class RunabbleThread implements Runnable
{

	public void run() {
		
		 System.out.println("Runnable Child thread start");
	}
	
}





public class HelloThread extends Thread{
	
	public void run() {
        System.out.println("Child thread start");
    }
	
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread();
		t1.start();
		System.out.println("main thread");
		
		
		RunabbleThread task = new RunabbleThread();
		Thread t2 = new Thread(task);
		t2.start();
	}   
	

}
