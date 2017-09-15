package monster.model;

public class MarshmallowMonster 
{
	//Declaration section of data members
	
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//initializes everything to 0, false or null.
	}
	
	public MarshmallowMonster(String name, int eyeCount, int arms, int tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "Oh wowee I surely am a monster, you can refer to me as " + name +", I currently own " + eyeCount + " eyeholes and only" ;
		description += tentacleAmount + " tentacles but I have " + armCount + "arms!." + hasBloop + " tells you";
		description += " if I have a bloop";
		return description;
	}
}
