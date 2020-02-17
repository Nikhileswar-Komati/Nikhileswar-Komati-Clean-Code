package task.epam.Interset;

public class SimpleInterest {
	

	public double simpleInterest(double principalAmount, double rateOfInterest, double noOfYears) {

		// the formula for Simple interest is S.I. = (principal * time * rateOfInterest) / 100
		
		double simpleInterest = (principalAmount * noOfYears * rateOfInterest)/100 ;
		
		//bw.write(simpleInterest + "\n") ;
		
		return simpleInterest ;

}

}