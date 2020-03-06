public class CarbonFootPrintCycle implements CarbonFootPrint{
	private final String make;
	private double km;
	
	public CarbonFootPrintCycle(String make, double km){
		if(km < 0.0){
			throw new IllegalArgumentException("Mileage cannot be negative.");
		}
		this.make = make;
		this.km = km;
	}
	
	public String getMake(){
		return make;
	}
	
	public void setKm(double km){
		if(km < 0.0){
			throw new IllegalArgumentException("Mileage cannot be less than zero.");
		}
	}
	
	public double getKm(){
		return km;
	}
	
	@Override
	public double getCarbonFootPrint(){
		return 0.0;
	}
	
	@Override
	public String toString(){
		return String.format("This is a bicycle with the following details:%n%s: %s%n%s: %.2f%n%s: %.2f%n",
							"Model",getMake(),
							"Mileage",getKm(),
							"Carbon Foot Print",getCarbonFootPrint());
	}
}