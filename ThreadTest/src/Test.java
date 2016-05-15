
public class Test {

	public static void main(String[] args) {
		

		DemoTest d = new DemoTest();
		
			
		Thread t1 = new Thread(new t1(d));
		Thread t2 = new Thread(new t2(d));
		Thread t3 = new Thread(new t3(d));
		
		t3.start();
		t2.start();
		t1.start();
		
	}
}


class t1 implements Runnable{

	DemoTest d;
	
	public t1(DemoTest demoTest) {
		d = demoTest;
	}
	
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.m1();
	}
}

class t2 implements Runnable{

	DemoTest d;
	
	public t2(DemoTest demoTest) {
		d = demoTest;
	}
	
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.m2();
	}
}


class t3 implements Runnable{

	DemoTest d;
	
	public t3(DemoTest demoTest) {
		d = demoTest;
	}
	
	public void run() {
		d.m3();
	}
}
