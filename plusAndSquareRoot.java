/**
 *This method finds any sequence of number inputs allowing the
 *user to reach higher level.
 *
 * @author
 * @version 1.00 2016/10/24
 */

public class plusAndSquareRoot {


    public long plusAndSquareRoot(long n) {

    	long formula = 0;// formula use for the second if statement

    	if (n==1)
    		return 2;

		for (long i = 1; i <= n; i++) { //This will loop the input of the user

			if (i > 1){ //if the user inputs are greater than 1

		    	formula = (i+1)*(i+1)*i-(i-1);
				System.out.println(formula);
			}
		}
		return formula;

    }

}

