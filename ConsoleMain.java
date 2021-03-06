import java.util.Scanner;

class ConsoleMain {
	  
	public static void main(String[] args) {
		
		//see if it is either X or O turn
		boolean Xturn = true;

		//check whether or not someone has won
		boolean gameFinished = false;
		
		int row = 0;
		int col = 0;
		
		//creates 2D array for the game board
		char[][] gameBoard = new char[3][3];
		
		for(int r = 0; r < 3; r++) 
		{
			for(int c = 0; c < 3; c++) 
			{
				gameBoard[r][c] = ' ';
			}
		}

		
		//scanner to take in user input
		Scanner sc = new Scanner(System.in);
		
		while(!gameFinished) 
		{
			char symbol = ' ';
			if(Xturn) 
			{
				symbol = 'X';
			} else
			{
				symbol = 'O';
			}

			TicTacToe.printBoard(gameBoard);

			if(Xturn) 
			{
				System.out.println("X's turn");
			} 
			else 
			{
				System.out.println("O's turn");
			}
			
			boolean validPos = false;
			while(validPos == false) {
				//ask each user to input values
				
				System.out.println("Enter row number");
				row = sc.nextInt();
				System.out.println("Enter column number");
				col = sc.nextInt();

				//check if user input is valid
				if(row < 0 || row > 2 || col < 0 || col > 2) 
				{
					System.out.println("Chosen position is not on the board");
				
				} 
				
				else if(gameBoard[row][col] != ' ') 
				{
					System.out.println("Position already taken");
				
				} 
				
				else 
				{
					validPos = true;
				}
			
			}

			
			gameBoard[row][col] = symbol;

			//check if the game is over
			if(TicTacToe.winner(gameBoard) == 'O') 
			{
				gameFinished = true;
				System.out.println("O wins!");
				
			} 
			
			else if(TicTacToe.winner(gameBoard) == 'X') 
			{
				gameFinished = true;
				System.out.println("X wins!");
				
			} 
			
			else 
			{

				if(TicTacToe.fullBoard(gameBoard)) 
				{
					gameFinished = true;
					System.out.println("Tie game!");
					
				} 
				else 
				{
					Xturn = !Xturn;
				}

			}
			TicTacToe.printBoard(gameBoard);

		}
	
  }

	
}
