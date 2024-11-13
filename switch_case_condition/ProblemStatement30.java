package com.kd.switch_case_condition;

import java.util.Scanner;

/*  Problem Statement 30: You're creating an application for a gardening shop that provides 
  advice on the type of fertilizer to use based on the type of plant.
   The application should take a plant type as input (1 for Roses, 2 for Sunflowers, 3 for Orchids, 4 for Cacti, 5 for Ferns)
   and suggest the type of fertilizer to use.
    Consider the following fertilizers: Roses - Rose Food, Sunflowers - All Purpose Fertilizer,
     Orchids - Orchid Fertilizer, Cacti - Cactus Mix, Ferns - Organic Compost.*/
public class ProblemStatement30 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Plant type:");
		int  planttype =scan.nextInt();
		
		fertilizerforplants(planttype);
		scan.close();
	}
	
	static void fertilizerforplants(int planttype) {
		
	switch(planttype){
	case 1:
	System.out.println("Roses");
	System.out.println("For this plant type use below fertilizer");
	System.out.println("Roses - Rose Food");
	break;

	case 2:
		System.out.println("Sunflowers ");
		System.out.println("For this plant type use below fertilizer");
		System.out.println("Sunflowers - All Purpose Fertilizer");
		break;

	
	case 3:
		System.out.println("Orchids");
		System.out.println("For this plant type use below fertilizer");
		System.out.println("Orchids - Orchid Fertilizer");
		break;
		
	case 4:
		System.out.println("Cacti");
		System.out.println("For this plant type use below fertilizer");
		System.out.println("Cacti - Cactus Mix");
		break;
		
	case 5:
		System.out.println("Ferns");
		System.out.println("For this plant type use below fertilizer");
		System.out.println("Ferns - Organic Compost");
		break;
		
	
	default:
		System.out.println("plant type not found");
		
		break;
	}

}
}
/*  
 Enter the Plant type:
2
Sunflowers 
For this plant type use below fertilizer
Sunflowers - All Purpose Fertilizer

 Enter the Plant type:
5
Ferns
For this plant type use below fertilizer
Ferns - Organic Compost
 
 */
