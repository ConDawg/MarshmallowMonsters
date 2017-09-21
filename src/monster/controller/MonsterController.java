package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController 
	{	
		private MonsterDisplay popup;
		
		public MonsterController()
		{
			popup = new MonsterDisplay();
		}
	
		public void start()
		{
			MarshmallowMonster basic = new MarshmallowMonster();
//			System.out.println(basic);
			popup.displayText(basic.toString());
			MarshmallowMonster Bonquisha = new MarshmallowMonster("Silly Bonquisha monster", 3, 6,  3.0, true);
//			System.out.println(Bonquisha);
			popup.displayText(Bonquisha.toString());
//			System.out.println("I am gettin hungies, Imma eat Bonquisha's arms");
			popup.displayText("I am gettin hungies, Imma eat Bonquisha's eyes");
			Bonquisha.setArmCount(Bonquisha.getArmCount() - 1);
//			popup.displayText(Bonquisha.toString());
			
			interactWithMonster(Bonquisha);
		}	
	 
		private void interactWithMonster(MarshmallowMonster currentMonster)
		{
			Scanner myScanner = new Scanner(System.in);
//			System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many");
			int consumed = 0;
			String response = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many");
			
			if(isValidInterger(response))
			{
			consumed = Integer.parseInt(response);
			}	
			
//			int consumed = myScanner.nextInt();
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
			System.out.println(currentMonster);	
			{
			//consumed = myScanner.nextInt();
			int eyeEat = myScanner.nextInt();
			
			if(eyeEat == 0)
			{
				System.out.println("Freals?, I think the eyes are the best part!");
			}
			else if(eyeEat < 0)
			{
				System.out.println("Silly billy, you cant eat negative eyeholes!");
			}
			else if(eyeEat - currentMonster.getEyeCount() > 0)
			{
				System.out.println("you are being a little too silly");
			}
			}
//			System.out.println("How many arms would you like to consume?, I have " + currentMonster.getArmCount());
			String solute = popup.getResponse(currentMonster.getName() + " wants to know how many arms you want to eat, please type how many");
			
			if(isValidInterger(solute));
			{
			consumed = Integer.parseInt(solute);
			}
			
			//consumed = myScanner.nextInt();
			int armEat = myScanner.nextInt();
			
			if(armEat == 0)
			{
				System.out.println("Not hungry?  That sux bro...");
			}
			else if(armEat < 0)
			{
				System.out.println("Math is hard for you - it is not possible to eat a negative amount");
			}
			else if(armEat - currentMonster.getArmCount() > 0)
			{
				System.out.println("you are not allowed to eat more than exists on me rarXD");
			}
			else
			{
				currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
				System.out.println("OK, now I have this many arms " + currentMonster.getArmCount());
			}
			
			System.out.println("How many tentacles do you wanna eat? I have" + currentMonster.getTentacleAmount());
			double food = myScanner.nextDouble();
			
			if(food == currentMonster.getTentacleAmount())
			{
				System.out.println("wut the hek bro, u ate all my tenticles");
			}
			else
			{
				System.out.println("More Likely");
			}
		
			popup.displayText("Hi there ready to play????????????????");
			String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
			System.out.println(answer);
			
			
			myScanner.close();
		}
		
		//Helper methods
		private boolean isValidInterger(String sample)
		{
			boolean valid = false;
			
			try
			{
				Integer.parseInt(sample);
				valid = true;
			}
			catch(NumberFormatException error)
			{
				popup.displayText("You need to imput an int, " + sample + "is not valid.");
			}
			return valid;
		}
	}	