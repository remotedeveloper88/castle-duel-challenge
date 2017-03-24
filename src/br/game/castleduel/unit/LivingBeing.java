package br.game.castleduel.unit;

public abstract class LivingBeing {
	protected int healthMax;
	protected int health;
	
	public void looseHealth(int attack) {
		health -= attack;
		System.out.println("------------");
		System.out.println("\tTake damage: " + attack);
		System.out.println("\tHealth: " + health);
	}
	
	public boolean isDead() {
		return health <= 0;
	}
	
	public double getHealthPercentage() {
		return health * 1.0 / healthMax;
	}
}
