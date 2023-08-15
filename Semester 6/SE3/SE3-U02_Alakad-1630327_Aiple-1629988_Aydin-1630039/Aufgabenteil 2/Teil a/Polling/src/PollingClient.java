import java.util.Random;


public class PollingClient {
	private int counter;
	private boolean stop;
	private Random rand ;
	private PollingCaller caller ;
	private String message;

	public PollingClient(String message) {
		this.message = message;
		stop = false;
		rand = new Random();
	}

	/**
	 * Does task as long as caller i still busy with processing request
	 */
	public void doTask() {
		System.out.println("Main-Thread => PollingCaller started.");
		caller = new PollingCaller(this.message);

		do {
			int sleepTime = rand.nextInt((3)+1) * 1000;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			if (!caller.returned()) {
				counter++;
				System.out.println("Main-Thread => Waiting for the side thread to finish. " +
				"Sleep time in the " + counter + ". iteration is: " + sleepTime + "ms");
			}
		} while(!caller.returned());
		System.out.println("Main-Thread => PollingCaller is finished.\nHash value of '" 
				+ message + "' is: " + caller.getHashString());
	}

}
