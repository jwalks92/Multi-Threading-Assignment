
// random.nextDouble set to 800 miliseconds as is H, means that H prints out a lot faster than the other two.
public class LetterF extends Main2 implements Runnable {
	public void run() {
		// waits to be printed until called by semaphore, prints f and then calls upon first binary semaphore to run.
		while (true) {
			try {
				Thread.sleep((int) (random.nextDouble() * 700));
				secondBinarySemaphore.P();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Semaphore.P();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			System.out.print("F");
			firstBinarySemaphore.V();;
			
		}
	}
}
