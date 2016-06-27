package concurrency;

public class Exercise1 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++){
			new Thread(new MyTask(i)).start();
		}
		System.out.println("Complete!");
	}
}
