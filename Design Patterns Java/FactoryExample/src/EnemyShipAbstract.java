
public abstract class EnemyShipAbstract {
	
	private double damage;
	private String name;
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void followhero()
	{
		System.out.println(getName()+" following the hero");
	}
	public void displayEnemyShip()
	{
		System.out.println(getName()+" is on the screen");
	}
	
	public void enemyShipShoots()
	{
		System.out.println(getName()+" attack and does"+getDamage());
	}

	

}
