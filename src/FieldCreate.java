
public class FieldCreate {
	static char[][] field = new char[5][10];
	
	public FieldCreate(){}

	public void fieldInitiate( )
	{
		for(int i =0 ; i<5 ; i++)
		{
			for (int j =0; j<10 ; j++)
				{
					field[i][j] = '*';
				}
		}
		
	}
}
