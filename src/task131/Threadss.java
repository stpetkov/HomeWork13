package task131;

public class Threadss extends Thread {

	public void run() {
		System.out.print("The thread is started!");

		try {

			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.print(e);
			e.printStackTrace();
		}
		System.out.print("The thread is completed!");
	}
}

class Threadss1 extends Thread {

	public void run() {

		System.out.print("The thread is started!");
		try {

			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.print(e);
			e.printStackTrace();
		}
		System.out.print("The thread is completed!");
	}
}

class Threadss2 extends Thread {

	public void run() {
		System.out.print("The thread is started!");

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.print(e);
			e.printStackTrace();
		}
		System.out.print("The thread is completed!");
	}
}

class Threadss3 extends Thread {

	public void run() {
		System.out.print("The thread is started!");

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			System.out.print(e);
			e.printStackTrace();
		}
		System.out.print("The thread is completed!");
	}
}

class Threadss4 extends Thread {

	public void run() {
		System.out.print("The thread is started!");
		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			System.out.print(e);
			e.printStackTrace();
		}

		System.out.print("The thread is completed!");
	}

	public static void main(String[] args) {
		Thread t1 = new Threadss();
		t1.setPriority(MAX_PRIORITY);
		Thread t2 = new Threadss1();
		Thread t3 = new Threadss2();
		Thread t4 = new Threadss3();
		Thread t5 = new Threadss4();
		t1.setName("Gosho");
		t2.setName("Aosho");
		t3.setName("Hosho");
		t4.setName("Kosho");
		t5.setName("Posho");
		System.out.println("Hello i`m " + t1.getName());
		System.out.println("Hello i`m " + t2.getName());
		System.out.println("Hello i`m " + t3.getName());
		System.out.println("Hello i`m " + t4.getName());
		System.out.println("Hello i`m " + t5.getName());

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
