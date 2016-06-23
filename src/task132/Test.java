package task132;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		ExecutorService executor= Executors.newFixedThreadPool(7);
		for(int i=0;i<6;i++){
			Threads newThread=new Threads();
			executor.execute(newThread);
			newThread.setName("thread number "+i);
			System.out.println("My name is: "+newThread.getName());
			
		}
		executor.shutdown();
		while(!executor.isTerminated()){
		}
		System.out.println("Finished ");
	}

}