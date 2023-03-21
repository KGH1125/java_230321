package day18;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 200; i++) {
			System.out.println(i + "번째" + Thread.currentThread().getName());
		}
	}

}

public class ThreadEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt2 = new MyThread2();
		Thread th1 = new Thread(mt2);
		Thread th2 = new Thread(mt2);
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main끝");

	}

}
