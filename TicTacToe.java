import java.util.*;
  
public class TicTacToe {
	
	/**
	 * checks to see if the board is full for tie game
	 * @param board
	 * @return
	 */
	public static boolean fullBoard(char[][] gameBoard) 
	{
		int i = 1;
		for(int r = 0; r < 3; r++) 
		{
			for(int c = 0; c < 3; c++) 
			{
				if(gameBoard[r][c] == 'X' || gameBoard[r][c] == 'O') 
				{
					i++;
				}
			}
		}
		if (i == 10)
		{
			return true;
		}
		return false;
    }
	
	/**
	 * draws the tictactoe board
	 * @param board
	 */
	public static void printBoard(char[][] gameBoard) 
	{
		System.out.println();
		for(int r = 0; r < 3; r++) 
		{
			for(int c = 0; c < 3; c++) 
			{
				System.out.print("[" + gameBoard[r][c] + "]");
			}
		
			System.out.println();
		}
	}

	/**
	 * checks all possible win combinations to see if either X or O has won
	 * @param board
	 * @return
	 */
	public static char winner(char[][] gameBoard) 
	{
		
		
		if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != ' ')
		{
			return gameBoard[0][0];
		}
				
		if(gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] ==  gameBoard[0][2] && gameBoard[2][0] != ' ') 
		{
			return gameBoard[2][0];
		}	
		
		if(gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2] && gameBoard[1][0] != ' ')
		{
			return gameBoard[1][0];
		}
		
		if(gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2] && gameBoard[2][0] != ' ')
		{
			return gameBoard[2][0];
		}
		
		if(gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2] && gameBoard[0][0] != ' ')
		{
			return gameBoard[0][0];
		}
		
		if(gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2] && gameBoard[0][0] != ' ')
		{
			return gameBoard[0][0];
		}
		if(gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2] && gameBoard[1][0] != ' ')
		{
			return gameBoard[1][0];
		}
		if(gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2] && gameBoard[2][0] != ' ')
		{
			return gameBoard[2][0];
		}
		
		if(gameBoard[0][0] == gameBoard[1][0] && gameBoard[1][0] == gameBoard[2][0] && gameBoard[0][0] != ' ')
		{
			return gameBoard[0][0];
		}
		if(gameBoard[0][1] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][1] && gameBoard[0][1] != ' ')
		{
			return gameBoard[0][1];
		}
		if(gameBoard[0][2] == gameBoard[1][2] && gameBoard[1][2] == gameBoard[2][2] && gameBoard[0][2] != ' ')
		{
			return gameBoard[0][2];
		}
		
		return ' ';
	}


}
    

