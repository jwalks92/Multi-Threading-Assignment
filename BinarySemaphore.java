
public class BinarySemaphore extends Semaphore {
	protected int value;

	public BinarySemaphore() {
		value = 0;
	}
    //  binary sempahores have to be set to only two integers 0 or 1 and the constructor ensures it.
	public BinarySemaphore(int initial) {
		value = (initial > 0) ? 1 : 0;
	}

	// synchronized used the same way as Sempahore class, ensures mutual exclusion.
	//while value is zero it waits else 1 decrements to 0;
	// P and V methods override those found in Semaphore class.
	public synchronized void P() throws InterruptedException {
		while (value == 0) {
			wait();
		}
		value--;
	}

	public synchronized void V() {
		value++;
		notify();
	}
	
}

