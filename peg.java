package tutorial;
import java.util.Arrays;

/*
moves = (
  (0,1,3),
  (0,2,5),
  (1,3,6),
  (1,4,8),
  (2,4,7),
  (2,5,9),
  (3,6,10),
  (3,7,12),
  (4,7,11),
  (4,8,13),
  (5,8,12),
  (5,9,14),
  (3,4,5),
  (6,7,8),
  (7,8,9),
  (10,11,12),
  (11,12,13),
  (12,13,14)
)
*/

public static void parser(char array[][]); //declare parsing function with array as argument

public class Main { //peg board class
	
	public static void parser(char array[][])
	{
		//search array for possible moves
		//fills can only move to blanks on line above, IF IN RANGE
		//if "node" in array is empty, it can never be populated
		int height = 5; //height of array
		int width = 2*height-1;  //width of array
		char fill = 'x'; //filled spot will be an x
		char blank = '.'; //empty will be an .
		char empty = ' ';
		char toParse[][] = new toParse[height][width];
		for(int i; i<height; i++)
			for(int j; j<width; j++)
			{
				if()
			}

		//can edit array directly but no
	}

	public static void main(String[] args) 
	{
		int height = 5; //height of array
		int width = 2*height-1;  //width of array
		char fill = 'x'; //filled spot will be an x
		char blank = '.'; //empty will be an .
		char empty = ' ';
		char array [][]= new char[height][width]; //create array for peg board
		
		//populate array
		for(int row = 0; row < height; row++)
		{
			StringBuilder line = new StringBuilder(width); //build line according to length
			
			//nested for
			for(int column = 1; column <= width; column++)
			{
				char out = Math.abs(column - height) <= row ? fill : blank; //do math and if in limits pring x if not fill with blank
				line.append(out);
				
				//populate array
				array[row][column] = out;
			}
			System.out.println(line); //print the formed line what the array should look like
		}

		array[0][3] = blank; //create the one space on top that is empty

		//further edit the array
		for(int i=0; i<height; i++)
			for(int j=0; j<height; j++)
			{
				if(array[i][j] != fill && array[i][j] != blank) // if current node is not blank or fill
				{
					array[i][j] == empty; //make it empty
				}
			}

		//call function
		parse(array);
		
	}
		
}
