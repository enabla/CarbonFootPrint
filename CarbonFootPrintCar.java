public class CarbonFootPrintCar implements CarbonFootPrint{
	private final String make;
	private final double fuelConsumption;
	private double km;
	
	public CarbonFootPrintCar(String make, double fuelConsumption, double km){
		if(fuelConsumption < 0.0){
			throw new IllegalArgumentException("Fuel consumption cannot ne less than zero.");
		}
		if(km < 0.0){
			throw new IllegalArgumentException("Distance covered cannot be less than zero.");
		}
		this.make = make;
		this.fuelConsumption = fuelConsumption;
		this.km = km;
	}
	
	public String getMake(){
		return make;
	}
	
	public double getFuelConsumption(){
		return fuelConsumption;
	}
	
	public void setKm(int km){
		if(km < 0.0){
			throw new IllegalArgumentException("Distance cannot be less than zero.");
		}
	}
	
	public double getKm(){
		return km;
	}
	
	@Override
	public double getCarbonFootPrint(){
		return 2.3*getFuelConsumption()*getKm();
	}
	
	@Override
	public String toString(){
		return String.format("This is a car with the following details:%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
							"Type",getMake(),
							"Fuel Consumption",getFuelConsumption(),
							"mileage",getKm(),
							"Carbon Foot Print",getCarbonFootPrint());
	}
}