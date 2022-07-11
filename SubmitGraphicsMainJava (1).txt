

import processing.core.PApplet;

public class GraphicsMain extends PApplet{


	private boolean Xturn = true;
	private boolean move = false;

	public static void main(String[] args)
	{
		PApplet.main("GraphicsMain");

	}
	
	
	/**
	 * set window size
	 */
	public void settings()
	{
		size(600, 600);
	}
	
	
	/**
	 * draw the board
	 */
	public void setup()
	{
		background(255);
		boolean Xturn = true;

		line(200, 0, 200, 600);
		line(400, 0, 400, 600);
		line(0, 200, 600, 200);
		line(0, 400, 600, 400);
		
		
	}
	
	/**
	 * check if the mouse has been pressed
	 */
	public void mousePressed()
	{
		move = true;
	}
	
	
	/**
	 * see where the user has clicked and draw either and X or an O
	 */
	public void draw()
	{
	
		int arr[] = new int[2];
		
		boolean gameFinished = false;
		
		if(move == true)
		{
			move = false;
			//checks the board[0][0]
			if (mouseX > 0 && mouseX < 200 && mouseY > 0 && mouseY < 200)
			{
				arr[0] = 0;
				arr[1] = 0;
				if (Xturn)
				{
					line(50, 50, 150, 150);
					line(50, 150, 150, 50);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(100, 100, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			//checks the board[0][1]
			else if (mouseX > 200 && mouseX < 400 && mouseY > 0 && mouseY < 200)
			{
				arr[0] = 0;
				arr[1] = 1;
				if (Xturn)
				{
					line(250, 50, 350, 150);
					line(250, 150, 350, 50);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(300, 100, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			//checks the board[0][2]
			else if (mouseX > 400 && mouseX < 600 && mouseY > 0 && mouseY < 200)
			{
				arr[0] = 0;
				arr[1] = 2;
				if (Xturn)
				{
					line(450, 50, 550, 150);
					line(450, 150, 550, 50);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(500, 100, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			//checks the board[1][0]
			else if (mouseX > 0 && mouseX < 200 && mouseY > 200 && mouseY < 400)
			{
				arr[0] = 1;
				arr[1] = 0;
				if (Xturn)
				{
					line(50, 250, 150, 350);
					line(50, 350, 150, 250);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(100, 300, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			//checks the board[1][1]
			else if (mouseX > 200 && mouseX < 400 && mouseY > 200 && mouseY < 400)
			{
				arr[0] = 1;
				arr[1] = 1;
				if (Xturn)
				{
					line(250, 250, 350, 350);
					line(350, 250, 250, 350);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(300, 300, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			//checks the board[1][2]
			else if (mouseX > 400 && mouseX < 600 && mouseY > 200 && mouseY < 400)
			{
				arr[0] = 1;
				arr[1] = 2;
				if (Xturn)
				{
					line(450, 250, 550, 350);
					line(450, 350, 550, 250);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(500, 300, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			
			//checks the board[2][0]
			else if (mouseX > 0 && mouseX < 200 && mouseY > 400 && mouseY < 600)
			{
				arr[0] = 2;
				arr[1] = 0;
				if (Xturn)
				{
					line(50, 450, 150, 550);
					line(50, 550, 150, 450);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(100, 500, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			//checks the board[2][1]
			else if (mouseX > 200 && mouseX < 400 && mouseY > 400 && mouseY < 600)
			{
				arr[0] = 2;
				arr[1] = 1;
				if (Xturn)
				{
					line(250, 450, 350, 550);
					line(350, 450, 250, 550);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(300, 500, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			//checks the board[2][2]
			else if (mouseX > 400 && mouseX < 600 && mouseY > 400 && mouseY < 600)
			{
				arr[0] = 2;
				arr[1] = 2;
				if (Xturn)
				{
					line(450, 450, 550, 550);
					line(450, 550, 550, 450);
					Xturn = !Xturn;
				}
				else
				{
					ellipse(500, 500, 100, 100);
					Xturn = !Xturn;
				}
				
			}
			
			}
		
	
	}	


	}
	
//____________________________________________________________________________________________________________________________________

	
//	public int[] chosenSquare()
//	{
//		int x = 0;
//		int y = 0;
//		
//		int arr[] = new int[2];
//		if(mousePressed)
//		{
//			if (mouseX > 0 && mouseX < 200 && mouseY > 0 && mouseY < 200)
//			{
//				arr[0] = 0;
//				arr[1] = 0;
//			}
//		}
//		return arr;
//	}
		
	

//}




//boolean Oturn = false;
//boolean gameFinished = false;
//if (mousePressed == true && mouseX > 0 && mouseX < 200 && mouseY > 0 && mouseY < 200)
//	if (Oturn)
//	{
//		 ellipse(100, 100, 80, 80);
//		 Oturn = false;
//	}
//	else
//	{
//		line(50,50, 150, 150);
//		line(150, 50, 50, 150);
//		Oturn = true;
//	}
//while (!gameFinished) 
//{
//	if (mousePressed == true && mouseX > 0 && mouseX < 200 && mouseY > 0 && mouseY < 200)
//		if (Oturn)
//		{
//			 ellipse(100, 100, 80, 80);
//			 Oturn = false;
//		}
//		else
//		{
//			line(50,50, 150, 150);
//			line(150, 50, 50, 150);
//			Oturn = true;
//		}
//	if (mousePressed == true && mouseX > 200 && mouseX < 400 && mouseY > 0 && mouseY < 200)
//		if (Oturn)
//		{
//			 ellipse(300, 100, 80, 80);
//			 Oturn = false;
//		}
//		else
//		{
//			line(250,50, 350, 150);
//			line(350, 50, 250, 150);
//			Oturn = true;
//		}
//	
//	
//}

//char[][] gameBoard = new char[3][3];
//
//int row = 0;
//int col = 0;
//
//for(int i = 0; i < 3; i++) 
//{
//	for(int j = 0; j < 3; j++) 
//	{
//		gameBoard[i][j] = ' ';
//	}
//}
//
////Scanner sc = new Scanner(System.in);
//
//
//
//boolean Xturn = true;
//
//
//boolean gameFinished = false;
//
//while(!gameFinished) 
//{
//
//	
////	TicTacToe.drawBoard(gameBoard);
//
//	
////	if(Xturn) 
////	{
////		System.out.println("X's turn");
////	} 
////	else 
////	{
////		System.out.println("O's turn");
////	}
//
//	char c = ' ';
//	if(Xturn) 
//	{
//		c = 'X';
//	} else
//	{
//		c = 'O';
//	}
//
//	
//	while(true) 
//	{
//
//		
//		
//		int x = 0;
//		int y = 0;
//		boolean square1 = false;
//		int arr[] = new int[2];
//		while(!mousePressed)
//		{
//			if(mousePressed)
//			{
//				if (mouseX > 0 && mouseX < 200 && mouseY > 0 && mouseY < 200)
//				{
//					arr[0] = 0;
//					arr[1] = 0;
//					square1 = true;
//					
//				}
//				
//				
//			}
//		}
//			//System.out.println("Enter row number");
//			row = arr[0];
//			//System.out.println("Enter column number");
//			col = arr[1];
//		
//
//			
//			if(row < 0 || col < 0 || row > 2 || col > 2) 
//			{
//				//System.out.println("Chosen position is not on the board");
//			
//			
//			} 
//			
//			else if(gameBoard[row][col] != ' ') 
//			{
//				//System.out.println("Position already been ");
//			
//			
//			} 
//			
//			else 
//			{
//				System.out.println(square1);
//				if (square1 == true)
//				{
//					line(50, 50, 150, 150);
//					line(150, 50, 50, 150);
//				}
//				break;
//			}
//		}
//		
//	
//	
//
//	
//	gameBoard[row][col] = c;
//
//	
//	if(TicTacToe.winner(gameBoard) == 'X') 
//	{
//		//System.out.println("X wins!");
//		gameFinished = true;
//	} 
//	
//	else if(TicTacToe.winner(gameBoard) == 'O') 
//	{
//		System.out.println("O has won!");
//		gameFinished = true;
//	} 
//	
//	else 
//	{
//
//		if(TicTacToe.fullBoard(gameBoard)) 
//		{
//			System.out.println("Tie game!");
//			gameFinished = true;
//		} 
//		else 
//		{
//			
//			Xturn = !Xturn;
//		}
//
//	}

