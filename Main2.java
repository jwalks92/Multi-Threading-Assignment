

import java.util.Random;
// two binary sempahore interleave and cannot go beyond 1 if they do, set back to 0, or wait for the other one 
//to complete thus preventing deadlock.
//interleave is neccessary to ensure than f and g are always alternating. 
public class Main2 {
	 static BinarySemaphore firstBinarySemaphore = new BinarySemaphore(
			0);
	 static BinarySemaphore secondBinarySemaphore = new BinarySemaphore(
			1);
	 static Semaphore Semaphore = new BinarySemaphore(
			0);
// standard sempahore runs between the two interleaving ones. 
	protected static final Random random = new Random();
//starts prinitng out each thread. 
	public static void main(String args[]) throws InterruptedException {
		new Thread(new LetterH()).start();
		new Thread(new LetterF()).start();
		new Thread(new LetterG()).start();
		Thread.sleep(90000);
		System.exit(0);
	}
}

//system.exit used as opposed to interrupt methods in thread. 