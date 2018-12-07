package tutorial;
import java.util.Arrays;

public class Main { //peg board class
	
	public static void main(String[] args) 
	{
		int height = 5; //height of array
		int width = 5;  //width of array
		char fill = 'x'; //filled spot will be an x
		char blank = '.'; //empty will be an .
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
			System.out.println(line); //print the formed line
		}
		
	}
		
}
