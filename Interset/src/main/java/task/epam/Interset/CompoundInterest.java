package task.epam.Interset;

public class CompoundInterest {

	public double compoundInterest(double principalAmount, double rateOfInterest, double noOfYears) {
		
		//the formula for compound interest is C.I. = ((1+(rateOfInterest/100))^time -1)*principal 
		
		double compoundInterest = (Math.pow(1.0+(rateOfInterest/100), noOfYears) - 1)*principalAmount ;
		
		//bw.write(compoundInterest + "\n") ;
		
		return compoundInterest ;
	}
}
