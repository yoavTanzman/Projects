
public class EnemyShipFactory {
	
	public EnemyShipAbstract makeEnemyShip(String newShipName)
	{
		EnemyShipAbstract newShip = null;
		
		
		if(newShipName.toUpperCase().equals("U"))
		{
			return new UfoEnemyShip();
		}
		else {
			if(newShipName.toUpperCase().equals("R"))
			{
				return new RocketenemyShip();
			}
		}
		
		return newShip;
		
	}

}
