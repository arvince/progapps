/**
 *This method helps the user to
 *determine if the photo
 *is black and white or colored.
 *
 * @author
 * @version 1.00 2016/10/24
 */

public class brainPhotos {

    /**
     *This method is for the inputs of the users
     */
    public String brainPhotos(int n, int m,String s) {

    		s = ""; //string containing a character'C', 'M', 'Y'


			if(n>0 && m > 0 && n<=100 && m<=100){

	        	for(int i=0; i<n; i++){//the n lines is for matrix rows

	        		for(int c=0; c<m; c++){//m is for space-separated characters describing colors of pixels in a row

	        			continue;
	        		}
	        	}

			// Displaying the output if it is Black and white or colored
	        System.out.println(s.contains("C") || s.contains("M") || s.contains("Y") ? "#Color" : "#Black&White");
	    }
		return s;

	}
}

