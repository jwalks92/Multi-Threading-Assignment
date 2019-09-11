

public class Semaphore {

	protected int value;

	public Semaphore() {
		value = 0;
	}

	public Semaphore(int initial) {
		value = (initial >= 0) ? initial : 0;

	}

	// use of synchronized method prevents two threads from accessing it at the same
	// time and allows them to behave atomically.
	// this prevents any interference and in particular prevents deadlock from
	// occuring
	// v method - reference to Dijkstra's to increment operation - waits for an
	// operation to occur.

	public synchronized void P() throws InterruptedException {
		while (value == 0) {
			wait();
		}
		value--;
	}

	// v method - reference to Dijkstra's to increment operation - activates any
	// threads.

	public synchronized void V() {
		value++;
		notify();
	}
}