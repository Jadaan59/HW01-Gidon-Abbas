public class LinearEq {
	public static void main(String[] args) { 

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        		// We need the variables to be doubles, 
        		// because the devision is not always a natural number.

    System.out.println(a + " * x + " + b + " = "  + c);                     
	System.out.println("x = " + ((c-b)/a)); 
				
				// algorithem to solve the linear equation.

    }
}