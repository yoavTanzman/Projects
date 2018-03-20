import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShipAbstract enemyShip =null;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("what type of ship U/R");
		if(userInput.hasNextLine())
		{
			String typeOfShip = userInput.nextLine();
			enemyShip= shipFactory.makeEnemyShip(typeOfShip);
		}
			doStuff(enemyShip);
	}
	
	
	public static void doStuff(EnemyShipAbstract enemyShip)
	{
		enemyShip.displayEnemyShip();
		enemyShip.followhero();
		enemyShip.enemyShipShoots();
	}

}
