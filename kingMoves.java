/**
 *This method finds the number of moves
 *that are allowed for the king.
 *
 * @author
 * @version 1.00 2016/10/26
 */

public class kingMoves {

    /**
     *This method is for the user's input.
     */
    public int kingMoves(String n) {

		int o = 0;//for output
		char r = n.charAt(0);//for the row of the chess board
		char c = n.charAt(1);//for the column of the chess board

		if (c == 'a' || c == 'h'){
			if (r == '1' || r == '8'){
				o = 3;

			}else{
				o = 5;
			}
		}else if (r == '1' || r == '8'){
			o = 5;
		}else{
			o = 8;
		}
		return o;
	}
}

