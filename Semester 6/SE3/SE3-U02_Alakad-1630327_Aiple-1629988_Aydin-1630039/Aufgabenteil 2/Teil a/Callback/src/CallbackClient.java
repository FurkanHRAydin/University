import java.util.Random;


public class CallbackClient {
	private int counter;
	private boolean stop;
	private Random rand ;
	private CallbackCaller caller ;
	private String message;

	public CallbackClient(String message) {
		this.message = message;
		stop = false;
		rand = new Random();
	}

	/*
	 * Executed as long as callback is not called
	 */
	public void doTask() {
		System.out.println("Main-Thread => CallBackCaller started.");
		caller = new CallbackCaller(this, this.message);

		do {
			int sleepTime = rand.nextInt((3)+1) * 1000;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}                
			counter++;
			if (!stop) {
				System.out.println("Main-Thread => Waiting for the side thread to finish. Sleep time in " + 
						counter +". iteration is: " + sleepTime + "ms");
			}
		} while(!stop);
	}

	/*
	 * Notifies client that callback is done
	 */
	public void callBack(String hash) {
		System.out.println("Main-Thread => CallBackCaller is finished.\nHash value of '" + message + "' is: " + hash);
		this.stop = true;
	}
}
