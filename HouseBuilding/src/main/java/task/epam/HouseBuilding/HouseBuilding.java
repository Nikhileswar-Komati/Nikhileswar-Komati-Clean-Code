package task.epam.HouseBuilding;

public class HouseBuilding {
	
	public double costOfBuilding(double areaOfHouse, String buildingType) {
		
		double Cost = 0;
		
		if(buildingType.equalsIgnoreCase("Standard Materials")) {
			
			//constructing house using standard materials
			Cost = (areaOfHouse) * 1200 ;
		}
		else if(buildingType.equalsIgnoreCase("Above Standard Materials")) {
			
			//constructing house using above standard materials
			Cost = (areaOfHouse) * 1500 ;
		}
		else if(buildingType.equalsIgnoreCase("High Standard Materials")) {
			
			//constructing house using high standard materials
			Cost = (areaOfHouse) * 1800 ;
		}
		else if(buildingType.equalsIgnoreCase("High Standard Material and Fully Automated Home")) {
			
			//constructing house using high standard material and fully automated home
			Cost = (areaOfHouse)*2500 ;
		}
		
		return Cost ;
	}

}
