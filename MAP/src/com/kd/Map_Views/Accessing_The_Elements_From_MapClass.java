package com.kd.Map_Views;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import com.kd.MAP.Student;

public class Accessing_The_Elements_From_MapClass {

	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println(":::::LinkedHashMap::::::");
		LinkedHashMap map2=new LinkedHashMap<>();
		map2.put(01, 500);
		map2.put(02, 200);
		map2.put(03,  new Student(04,"RoyalRaj",5.9));
		map2.put(04, 400);
		map2.put( "Six",new Student(01,"Raj",7.9));
		System.out.println(map2);
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------");
		//Accessing keys only using keyset() which returns a set object
		Set keys=map2.keySet();
		System.out.println("Keys:::-->"+keys);
		
		System.out.println("-------------------------------------------------------------------------");
		//Accessing key value pair using entryset()method which return set object
		Set kv=map2.entrySet();
		System.out.println("Key-Values::-->"+kv);
		
		
		System.out.println("-------------------------------------------------------------------------");  
		////Accessing only values values()method which return collection object
		Collection values =map2.values();
		System.out.println("Values:::-->"+values);
		System.out.println("-------------------------------------------------------------------------");
		}
}
/* output
 * ---------------------------------
:::::LinkedHashMap::::::
{1=500, 2=200, 3=Student [id=4, name=RoyalRaj, cgpa=5.9], 4=400, Six=Student [id=1, name=Raj, cgpa=7.9]}-------------------------------------------------------------------------
-------------------------------------------------------------------------
Keys:::-->[1, 2, 3, 4, Six]
-------------------------------------------------------------------------
Key-Values::-->[1=500, 2=200, 3=Student [id=4, name=RoyalRaj, cgpa=5.9], 4=400, Six=Student [id=1, name=Raj, cgpa=7.9]]
-------------------------------------------------------------------------
Values:::-->[500, 200, Student [id=4, name=RoyalRaj, cgpa=5.9], 400, Student [id=1, name=Raj, cgpa=7.9]]
-------------------------------------------------------------------------

 */
