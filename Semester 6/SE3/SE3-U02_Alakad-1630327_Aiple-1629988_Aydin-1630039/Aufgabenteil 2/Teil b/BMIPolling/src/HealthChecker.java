import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HealthChecker extends Thread {
	private BMI bmi;
	private Random rand;

	public HealthChecker() {
		bmi = new BMI(80, 180);
		rand = new Random();
		this.start();
	}

	/*
	 * Uses external service "BMI" as a CompletableFuture
	 */
	@Override
	public void run() {
		CompletableFuture<Double> future1 = CompletableFuture.supplyAsync(bmi::calcBMI);
		while(!future1.isDone()) {
			try {
				int sleepTime = rand.nextInt((5)+1) * 1000;
				System.out.println("Waiting for first CompletableFuture to finish, will sleep for " 
						+ sleepTime + " ms");
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("=> First CompletableFuture is done");
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(bmi::evaluateBMI);
		while(!future2.isDone()) {
			try {
				int sleepTime = rand.nextInt((5)+1) * 1000;
				System.out.println("Waiting for second CompletableFuture to finish, will sleep for " 
						+ sleepTime + " ms");
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("=> Second CompletableFuture is done");
		try {
			System.out.println("Result of health evaluation is: " +
					"You are " + future2.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
