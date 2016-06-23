package task133;

public class Threads {
	synchronized void printNumbers(){
		for(int i=1;i<=50000;i++){
			if(i==25000){
				System.out.println(i);
				try{
					wait();
				}catch(Exception e){
					System.out.println(e);
				}
			}
			System.out.println(i);
		}
	}
	
	synchronized void  printText(){
		for(int i=1;i<=20;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println("Running...");
		}
		notify();
	}
}