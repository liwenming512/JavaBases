package base;

public class ThreadTest2 {

	public static void main(String[] args) {
		Counter counterA = new Counter();
		Counter counterB = new Counter();
		Thread threadA = new CounterThread(counterA);
		Thread threadB = new CounterThread(counterB);
		threadA.start();
		threadB.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(counterA.count);
		System.out.println(counterB.count);
	}

}
