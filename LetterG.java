// first binary semaphore is locked, meaning that it will not print out f or g twice before the other has been completed. 
//semaphore is locked, G is printed out and second binary semaphore is called to run, thus beginning the alternating process again. 
public class LetterG extends Main2 implements Runnable {
	public void run() {
		while (true) {
			try {
				
				Thread.sleep(1 + (int) (random.nextDouble() * 800));
				firstBinarySemaphore.P();;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Semaphore.P();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			System.out.print("G");
			secondBinarySemaphore.V();;
		}
	}
}

