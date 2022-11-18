import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FieldCreate fieldCreate = new FieldCreate();
		Bear bear = new Bear();
		Fish fish = new Fish();
		
		fieldCreate.fieldInitiate();
		bear.startLocation(0, 0);
		fish.startLocation(1, 1);
		bear.getLocation();
		
		while (fish.check == 0)
		{
			fieldCreate.fieldInitiate();
			System.out.println("곰을 움직이세요");
			char turn = scanner.next().charAt(0);
			bear.move(turn);
			fish.move(turn);
			while(fish.xf > 4 || fish.xf < 0 || fish.yf > 9 || fish.yf <0)
			{
				fish.move(turn);
			}
			bear.getLocation();
			fish.fishCheck();
		}
		
		
	}
}
