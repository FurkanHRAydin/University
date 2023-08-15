import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class PollingCaller extends Thread {
	private String originalString;
	private Random rand;
	private boolean returned;
	private String hashString;



	public PollingCaller(String originalString) {
		this.originalString = originalString;
		rand = new Random();
		this.start();
	}

	/*
	 * Executes a random task
	 */
	@Override
	public void run() {
		StringBuilder hexString = calcHash();
		System.out.println("Side-Thread => Done calculating hash value of " + originalString);
		int sleepTime = (rand.nextInt(6)+5) * 1000;
		try {
			System.out.println("Side-Thread => I will sleep " + sleepTime + "ms");
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hashString = hexString.toString();
		returned = true;
		System.out.println("Side-Thread => Starting from now the result of my calculation can be retrieved");
	}
	
	/*
	 * Calculates the hash of a given string
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
	
	public boolean returned() { return returned; }
	
	public String getHashString() {
		return hashString;
	}

}
