
public class BMI {
	
	private double kg;
	private double cm;
	private double bmi;
	
	public BMI(double kg, double cm) {
		this.kg = kg;
		this.cm = cm;
	}
	
	/*
	 * Calculates BMI
	 */
	public Double calcBMI() {
		this.bmi = (kg / (cm*cm/10000));
		return bmi;
	}
	
	/*
	 * Gives an evaluation of the BMI measurement
	 */
	public String evaluateBMI() {
		if (bmi < 18.5) {
			return "under weight";
		} else if (bmi >= 25) {
			return "over weight";
		} else {
			return "normal weight";
		}
	}
}
