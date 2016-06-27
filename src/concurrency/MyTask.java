package concurrency;

public class MyTask implements Runnable {
	int no;
	
	public MyTask(int no) {
		System.out.println("Begin!");
		this.no = no;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++){
			System.out.println(no + "," + i);
			Thread.yield();
		}
	}
	
}
