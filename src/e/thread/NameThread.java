package e.thread;

public class NameThread extends Thread{

	private int calcNo;
	
	public NameThread(String name, int calcNo) {
		//super("ThreadName");
		super(name);
		this.calcNo = calcNo;
	}
	
	public void run() {
		calcNo++;
	}
}
