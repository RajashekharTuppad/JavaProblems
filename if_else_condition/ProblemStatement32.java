package com.kd.if_else_condition;
/* 
   Problem Statement 32: You're creating a game that includes a feature to check if a player
    has found a special item in the game. The special item is found if the player has more
    than 10 gold coins, the player's level is above 5, and the player has a special key.
    The program should first check if the player has more than 10 gold coins and then if
    the player's level is above 5. If both conditions are met, the program should check if 
    the player has the special key. If all conditions are met, it should print "Special Item Found".*/

import java.util.Scanner;

public class ProblemStatement32 {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
			System.out.println(" Enter the gold coins : ");
			int goldCoin = scan.nextInt();
			
			System.out.println(" Enter the player level : ");
			int playerLevel  = scan.nextInt(); 
			
			
			isSpecialPlayer(goldCoin,playerLevel);
			scan.close();
			
		}

			

			private static void isSpecialPlayer(int goldCoin, int playerLevel) {
				
				if(goldCoin>=10)
				{
					
					System.out.println("  eligible for special item ");
					
				
				if(playerLevel>=5)
				{
					System.out.println("  eligible for special item ");
				}else if(goldCoin>=10 && playerLevel>=5)
				{
					System.out.println("   special item ");
				}else {

					System.out.println(" not eligible for special item ");
				}
			}else
			{
				System.out.println(" not eligible for special item ");
			}
				
			
			
			}
		}
  /*  
      
      * Enter the gold coins : 
			5
 		Enter the player level : 
			6
 		not eligible for special item
 		
 		  Enter the gold coins : 
			12
 		Enter the player level : 
			7
  		eligible for special item 
  		eligible for special item
 		 */
	
