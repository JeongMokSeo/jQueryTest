package e.thread;

public class EndlessThread  extends Thread {
	public void run() {
		while(true) {
			try {
				System.out.println(System.currentTimeMillis());
				Thread.sleep(1000);   // sleep  --> try catch 필요
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
