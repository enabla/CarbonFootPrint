import java.util.ArrayList;
public class CarbonFootPrintTest{
	public static void main(String[] args){
		CarbonFootPrint myCar = new CarbonFootPrintCar("Nissan",0.5,300);
		CarbonFootPrint bicycle = new CarbonFootPrintCycle("Phoenix",10);
		CarbonFootPrint myHome = new CarbonFootPrintHouse("Bungalow",2.3);
		ArrayList<CarbonFootPrint> sources = new ArrayList<>();
		
		sources.add(myCar);
		sources.add(myHome);
		sources.add(bicycle);
		
		for(CarbonFootPrint source: sources){
			System.out.printf("%n%s",source);
			//System.out.print("%s",CarbonFootPrint.get);
		}
	}
}