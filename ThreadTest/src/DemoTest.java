import java.util.concurrent.Semaphore;

public class DemoTest {

//	ReentrantLock r1,r2,r3;
	Semaphore s1,s2,s3;

	 DemoTest() {
		 
		/*
		 r1=new ReentrantLock();
		 r2=new ReentrantLock();
		 r3=new ReentrantLock();
		 r1.lock();
		 r2.lock();
		 r3.lock();*/
		 
		 s1=new Semaphore(1);
		 s2=new Semaphore(1);
		 s3=new Semaphore(1);
		 try {
			s1.acquire();
			s2.acquire();
			s3.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
	
	 public void m1() {
		 System.out.println("method 1");
		 s1.release();
		/* r1.unlock();*/
	}
	 
	 public void m2() {
		 try {
			s1.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 s1.release();
		 System.out.println("method 2");
		 s2.release();
	}
	 
	 public void m3() {
		try {
			s2.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s2.release();
		 System.out.println("method 3");
		 s3.release();
	}
	
}
