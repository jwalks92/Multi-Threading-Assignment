public class LetterH extends Main2 implements Runnable {
	public void run() {
		while (true) {
			try {
				Thread.sleep((int) (random.nextDouble() * 500));
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.print("H");
			Semaphore.V();
		}
	}
}

//prints out h and then uses v method means that it is unlocked until other threads call other methods to lock h. 
//f will do so in the first instance. 
//first letter to print out.  
