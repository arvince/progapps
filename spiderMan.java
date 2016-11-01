/**
 *This method determines the cycle of the game
 *and also helps the user to know who will win the game.
 *
 *
 * @author
 * @version 1.00 2016/10/25
 */
public class spiderMan {
    /**
     *This method is for the inputs n and k
     */
    public int spiderMan(int n, int k) {

    	k = 0;//number of cycles

		for (int i = 0; i < n; i++) {//looping of cycles

		k += -1; //this is for separating the input(if multiple)

		if (k % 2 == 0){//this is will execute if the user/player loses the game
			System.out.println("2");

		}else{ //this will execute  if the user/player who moves first wins
			System.out.println("1");
		}
		}
    	return k;
    }

}