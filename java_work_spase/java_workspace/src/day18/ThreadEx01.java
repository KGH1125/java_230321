package day18;

class MyTread extends Thread{
	public void run() {
		
		for(int i =0 ;i<200;i++) {
			System.out.println(i+"번째"+getName());
			
		}
	}

}


public class ThreadEx01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTread th = new MyTread();
		System.out.println(Thread.currentThread());
		th.run();
		MyTread th2 = new MyTread();
		th2.run();
		
	}

}
