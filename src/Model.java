import java.util.Random;
import java.util.Scanner;

public class Model {

	public int[][] board = new int[8][8];
	
	public Model() {
		for (int i =0; i<8;i++) {
			for (int j=0; j<8;j++) {
				board[i][j] = 0;
			}
		}
	}
	
	public void printBoard() {
		for (int i =0; i<8;i++) {
			for (int j=0; j<8;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void setBadSpaces() {
		Random rand = new Random();
		
		int bad1x = rand.nextInt(8);
		int bad2x = rand.nextInt(8);
		int bad1y = rand.nextInt(8);
		int bad2y = rand.nextInt(8);
		
		while (bad1x == bad2x) {
			bad2x = rand.nextInt(8);
		}
		
		board[bad1x][bad1y] = 1;
		board[bad2x][bad2y] = 1;
	}
	
	public void guess(int x, int y) {
		if (board[x][y] == 1) {
			System.out.println("Game over");
			return;
		}
		System.out.println("Good Guess!");
	}
	
	

}
