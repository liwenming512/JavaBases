package base;

public class Counter {

	long count = 0;
	
	public Counter(){};
	
	public synchronized void add(long value){
		this.count += value;
		System.out.println(Thread.currentThread().getId() + "-" + count);
	}
}
