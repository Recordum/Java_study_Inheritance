
import java.util.Random;
import java.util.Scanner;

import javax.swing.tree.FixedHeightLayoutCache;


public abstract class GameObject {
	
	
	public abstract void startLocation(int x, int y);
	public abstract void move(char turn);
	public void getLocation()
	{
		
		FieldCreate.field[Fish.xf][Fish.yf] = 'F';
		FieldCreate.field[Bear.yb][Bear.xb] = 'B';
		for (int i = 0 ; i<5 ; i++)
			{
			for(int j =0; j<10 ; j++)
				{
				System.out.print(FieldCreate.field[i][j] + " ");
				}
				System.out.println("");
			}
	}
	

}

class Bear extends GameObject
{	
	static int xb, yb;
	
	public Bear() {}
	@Override
	public void startLocation(int x, int y)
	{
		FieldCreate.field[y][x] = 'B';
		xb = x;
		yb = y;
	}
	@Override
	public void move(char turn)
	{	
		
		switch(turn)
		{
		case 'a' : xb--;
			break;
		case 'd' : xb++;
			break;
		case 'w' : yb--;
			break;
		case 's' : yb++;
			break;

		}
		FieldCreate.field[yb][xb] = 'B';
		
		
	}
	
	
}
class Fish extends GameObject
{	
	static int xf, yf;
	static int check = 0;
	Random random = new Random();
		
	public Fish() {}
	@Override
	public void startLocation(int x, int y)
	{
		x = random.nextInt(5);
		y = random.nextInt(10);
		
		FieldCreate.field[x][y] = 'F';
		
		xf = x;
		yf = y;
		
	}
	@Override
	public void move(char turn)
	{	
		
		if (random.nextInt(5) > 2)
		{
			switch(random.nextInt(4))
			{
				case 0 : xf ++;
					break;
				case 1 : xf --;
					break;
				case 2 : yf ++;
					break;
				case 3 : yf --;
					break;
					
			}
		}
		
	}
	public void fishCheck()
	
	{
		for ( int i = 0; i < 5 ; i++)
		{
			for(int j = 0; j< 10 ;j++)
			{
				if (FieldCreate.field[i][j] == 'F')
				{
					
					check = 0;
					return ;
				}
				else 
				{
					check = 1;
				}
			}
		}
	}
}
