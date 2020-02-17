package task.epam.HouseBuilding;

import java.io.*;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ;
    	HouseBuilding obj = new HouseBuilding() ;
    	
    	double areaOfHouse = 0.0 ;
    	String buildingType = null;
    	double cost = 0.0;
    	
		try {
			
				areaOfHouse = Double.parseDouble(br.readLine());
				buildingType = br.readLine();
				cost = obj.costOfBuilding(areaOfHouse, buildingType);
				if (cost == 0.0) {
					
					bw.write("Enter Valid Building Materials");
				}
				else {
					
					bw.write("Total Cost of Construction of building  is  : " + obj.costOfBuilding(areaOfHouse, buildingType)) ;
				}
				
				
				
		} 
		
		catch (IOException e) {
			
				e.printStackTrace();
		}
    	
		bw.flush();
    	
    }
}
