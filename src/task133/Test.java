package task133;

public class Test {
	public static void main(String[] args) {
		final Threads newT=new Threads();
		new Thread(){
			public void run(){
				newT.printNumbers();
			}
		}.start();
		
		
		new Thread(){
			public void run(){
				newT.printText();
			}
		}.start();
	}

}

