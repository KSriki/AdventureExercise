/* Simple Text Adventure Exercise
 * Srikant Kumar Kalaputapu
 * June 20, 2017
 * 
 */

import java.util.Scanner;

public class SrikantAdventure {

	public static void main(String[] args){
		
		System.out.println("WELCOME TO SRIKANT'S TINY ADVENTURE!");
		
		//boolean choice1, choice2, choice3;
		int choice;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("You wake up disoriented in a small, dark cell. \nThe cell has a bed, a sink with a mirror and a small barred window. \n1) Check under the bed. \n2) Check the mirror.");
		choice = scan.nextInt();
		
		if(choice == 1){
			System.out.println("You check under the bed. \nYou notice a trap door and a hard rock. \n1) Take the rock. \n2) Open and enter the trap door.");
			choice = scan.nextInt();
			
			if(choice == 1){
				System.out.println("You pick up the hard rock with your hand. \nYou go back to the mirror on the wall above the sink. \n1) Break mirror with the rock. \n2) Look into the mirror. ");
				choice = scan.nextInt();
				
				if(choice == 1){
					System.out.println("You break the mirror with the rock. Shards of glass fly \neverywhere. One shard pierces you in the neck, killing you instantly. \nNow why did you break the mirror like an idiot?");
				}
				else if (choice == 2){
					System.out.println("You look closely into the mirror, only to see a monster behind you \nin the reflection. Startled, you turn around to defend yourself, however \na hand grabs and pulls you through the mirror. Screaming, you wake up \nin your bed to only realize you had a nightmare. Unbeknownst to you, the monster \nlaughs creepily hiding under your bed. He waits for you to go back to sleep, before \nfeasting on your soul." );
				}
				else{
					System.out.println("Wrong number try again!");
				}
			}
			else if (choice == 2){
				System.out.println("You slip and fall down the trap door. \nYou see a rope hanging and footholds on the wall. \n1) Grab the rope. \n2) Grab the footholds.");
				choice = scan.nextInt();
				
				if(choice == 1){
					System.out.println("You grab the rope. Unfortunately the rope has oil \non it and you slide down the rope into a pit of spikes \nand fire. You die a horrible death.");
				}
				else if (choice == 2){
					System.out.println("You grab the footholds in a desperate attempt to slow down. You miraculously \nslow down and climb your way up the wall. You find a secret passageway \non the side of the wall and make your escape.");
				}
				else{
					System.out.println("Wrong number try again!");
				}
			}
			else{
				System.out.println("Wrong number try again!");
			}
		}
		else if (choice == 2){
			System.out.println("You check the mirror. \nIn the reflection you see something shiny hanging from the ceiling above your bed. \n1) Check the shiny object. \n2) Check the sink.");
			choice = scan.nextInt();
			
			if(choice == 1){
				System.out.println("You see that the shiny object is actually the key to your cell! \n1) Jump up from the bed to grab the key. \n2) Check under the bed for anything useful.");
				choice = scan.nextInt();
				
				if(choice == 1){
					System.out.println("You jump up and down from the bed trying to reach the key. \nSuddenly the bed breaks and you fall through the bed, through the secret trap door \nunder the bed to your fiery and pointy doom.");
				}
				else if (choice == 2){
					System.out.println("Under the bed, you find a rock. \nYou throw the rock at the key, causing the key to fall. \nYou use the key to make your escape out of the room, fearful yet excited about the unknown surroundings.");
				
				}
				else{
					System.out.println("Wrong number try again!");
				}
			}
			else if (choice == 2){
				System.out.println("Choice3: 1) , 2),");
				choice = scan.nextInt();
				
				if(choice == 1){
					
				}
				else if (choice == 2){
					
				}
				else{
					System.out.println("Wrong number try again!");
				}
			}
			else{
				System.out.println("Wrong number try again!");
			}
		}
		else{
			System.out.println("Wrong number try again!");
		}
		
	}
	
}
