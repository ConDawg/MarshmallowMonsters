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
			int count = 0;
			while(count < 10)
			{
				popup.displayText("Am I not the coolest???");
				count +=2;
			}
			
			
			
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
//			System.out.println("How many arms are you gunna eat?");
			response = popup.getResponse("Neat! how many arms are you gonna eat?");
			{
			//consumed = myScanner.nextInt();
			int armEat = myScanner.nextInt();
			
			if(armEat == 0)
			{
				System.out.println("Freals?, I think the arms are the best part!");
			}
			else if(armEat < 0)
			{
				System.out.println("Silly billy, you cant eat negative arms!");
				popup.displayText("Silly Billy, you cant eat negative arms!");
			}
			else if(armEat - currentMonster.getEyeCount() > 0)
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
//				System.out.println("Not hungry?  That sux bro...");
				popup.displayText("not hungry?  That sux bro...");
			}
			else if(armEat < 0)
			{
//				System.out.println("Math is hard for you - it is not possible to eat a negative amount");
				popup.displayText("Math is hard for you - it is not possible to eat a negative amount");
			}
			else if(armEat - currentMonster.getArmCount() > 0)
			{
				System.out.println("you are not allowed to eat more than exists on me");
				popup.displayText("you are not allowed to eat more than exists on me");
			}
			else
			{
				currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
//				System.out.println("OK, now I have this many arms " + currentMonster.getArmCount());
				popup.displayText("OK, now I have this many arms " + currentMonster.getArmCount());
			}
			
			
			
//			System.out.println("How many tentacles do you wanna eat? I have" + currentMonster.getTentacleAmount());
			popup.displayText("How many tentacles do you wanna eat? I have" + currentMonster.getTentacleAmount());
			
			double food = myScanner.nextDouble();
			
			String tentacleResponse = popup.getResponse("How many tentacles do you want to eat? I have" + currentMonster.getTentacleAmount());
			if(isValidDouble(tentacleResponse))
			{
				food = Double.parseDouble(tentacleResponse);
			}
			
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
		
		private boolean isValidDouble(String sampleDouble)
		{
			boolean valid = false;
			
			try
			{
				Double.parseDouble(sampleDouble);
				valid = true;
			}
			catch(NumberFormatException error)
			{
				popup.displayText("You need to type in a double - " + sampleDouble + "is not a valid answer");
			}
			
			return valid;
		}	
			
		private boolean isValidBoolean(String sampleBoolean)
		{
			boolean valid = false;
			
			try
			{
				Boolean.parseBoolean(sampleBoolean);
				valid = true;
			}
			catch(NumberFormatException error)
			{
				popup.displayText("Type in a boolean value" + sampleBoolean + " does not count.");
					
			}
			
			return valid;
		}
			
		
	}	