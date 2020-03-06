public class CarbonFootPrintHouse implements CarbonFootPrint{
	private final String type;
	private double power;
	
	public CarbonFootPrintHouse(String type, double power){
		if(power < 0.0){
			throw new IllegalArgumentException("There can never be negative power consumption.");
		}
		this.type = type;
		this.power = power;
	}
	
	public String getType(){
		return type;
	}
	
	public void setPower(double power){
		if(power < 0.0){
			throw new IllegalArgumentException("Power consumption cannot be negative.");
		}
		this.power = power;
	}
	
	public double getPower(){
		return power;
	}
	
	@Override
	public double getCarbonFootPrint(){
		return 2.7*getPower();
	}
	
	@Override
	public String toString(){
		return String.format("This is a house witht the following details:%n%s: %s%n%s: %.2f%n%s: %.2f%n",
							"Type",getType(),
							"Power usage",getPower(),
							"Carbon Foot Print",getCarbonFootPrint());
	}
}