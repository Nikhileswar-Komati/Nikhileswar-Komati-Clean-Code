package task.epam.Interset;

import java.io.*;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	SimpleInterest si = new SimpleInterest();
    	CompoundInterest ci = new CompoundInterest();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ;
        
        try {
        	
			String inp[] = br.readLine().split(" ") ;
			double principalAmount = Double.parseDouble(inp[0]) ;
			double rateOfInterest = Double.parseDouble(inp[1]) ;
			double noOfYears = Double.parseDouble(inp[2]) ;
			bw.write("Simple Interest is : "+si.simpleInterest(principalAmount , rateOfInterest , noOfYears)+"\n") ;
			bw.write("Compound Interest is : "+ci.compoundInterest(principalAmount , rateOfInterest , noOfYears)+"\n") ;
		} 
        
        catch (IOException e) {
			e.printStackTrace();
		}
        
        bw.flush();
    }
}
