package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController 
	{	
	
		public void start()
		{
			MarshmallowMonster basic = new MarshmallowMonster();
			System.out.println(basic);
			MarshmallowMonster Bonquisha = new MarshmallowMonster("Silly Bonquisha monster", 3, 6,  3.0, true);
			System.out.println(Bonquisha);
			System.out.println("I am gettin hungies, Imma eat Bonquisha's arms");
			Bonquisha.setArmCount(Bonquisha.getArmCount() - 1);
			System.out.println(Bonquisha);
			
			interactWithMonster(Bonquisha);
		}	
	 
		private void interactWithMonster(MarshmallowMonster currentMonster)
		{
			Scanner myScanner = new Scanner(System.in);
			System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many");
			int consumed = myScanner.nextInt();
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
			System.out.println(currentMonster);
			
			myScanner.close();
		}
}
