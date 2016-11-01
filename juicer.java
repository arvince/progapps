/**
*
*
*
* @author
* @version 1.00 2016/10/27
*/

public class juicer {

	    /**
	     *
	     */
	    public int juicer(int n,int b,int d,int x, int y) {
	    	int count = 0;
	    	int sum = 0;

		for (int i = 0; i < n; i++){

			x = 0;

			if(x > b)
				continue;
				sum += x;

			if (sum > d) {

				sum = 0;
				count++;

			}

		}
		return count++;

	    }
}

