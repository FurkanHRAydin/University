import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class CallbackCaller extends Thread {
	private CallbackClient client;
	private String originalString;
	private Random rand;



	public CallbackCaller(CallbackClient client, String originalString) {
		this.client = client;
		this.originalString = originalString;
		rand = new Random();
		this.start();
	}

	/*
	 * Does random task (mimics an external service)
	 */
	@Override
	public void run() {
		StringBuilder hexString = calcHash();
		System.out.println("Side-Thread => Done calculating hash value");
		int sleepTime = (rand.nextInt(6)+5) * 1000;
		try {
			System.out.println("Side-Thread => I will sleep " + sleepTime + "ms");
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		client.callBack(hexString.toString());
	}
	
	/*
	 * Calculates hash of a given string
	 */
	public StringBuilder calcHash() {
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] encodedhash = digest.digest(
				originalString.getBytes(StandardCharsets.UTF_8));
		StringBuilder hexString = new StringBuilder(2 * encodedhash.length);
		for (int i = 0; i < encodedhash.length; i++) {
			String hex = Integer.toHexString(0xff & encodedhash[i]);
			if(hex.length() == 1) {
				hexString.append('0');
			}
			hexString.append(hex);
		}
		return hexString;
	}
}
