package e.thread;

public class RunThreads {

	public static void main(String[] args) {
		RunThreads obj = new RunThreads();
		//obj.runBasic();
//		obj.runBasic2();
		//obj.endless();
		obj.chkThreadProperty();
	}

	public void runBasic() {
		RunnableTest runnable = new RunnableTest();
		ThreadTest thread = new ThreadTest();
		
		new Thread(runnable).start();
		thread.start();
		System.out.println("RunThreads.runBasic() is ended.");	
	}

	public void runBasic2() {
		RunnableTest[] runnable = new RunnableTest[5];
		ThreadTest[] thread = new ThreadTest[5];
		
		for (int i = 0; i < 5; i++) {
			runnable[i] = new RunnableTest();
			thread[i] = new ThreadTest();
			
			new Thread(runnable[i]).start();
			thread[i].start();
			
		}
		System.out.println("RunThreads.runBasic2() is ended.");	
	}
	
	public void endless() {
		EndlessThread thread = new EndlessThread();
		thread.start();
	}
	
	public void chkThreadProperty() {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		ThreadTest dm = new ThreadTest();
		
		System.out.println("t1 id=" + t1.getId());
		System.out.println("t2 id=" + t2.getId());
		
		System.out.println("t1 name=" + t1.getName());
		System.out.println("t2 name=" + t2.getName());
		
		System.out.println("t1 priority=" + t1.getPriority());
		System.out.println("t2 priority=" + t2.getPriority());
		
		dm.setDaemon(true);
		System.out.println("t1 isDaemon =" + t1.isDaemon());
		System.out.println("dm isDaemon =" + dm.isDaemon());
	}
	
	public void runDaemonThread() {
		DaemonThread thread = new DaemonThread();
		thread.setDaemon(true);
		thread.start();
	}
}
