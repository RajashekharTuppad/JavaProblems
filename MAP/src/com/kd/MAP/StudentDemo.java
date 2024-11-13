package com.kd.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class StudentDemo {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------");
		System.out.println(":::::TreeMap/Re-Map::::::");
		TreeMap map=new TreeMap<>();
		map.put(01, new Student(01,"Raj",7.9));
		map.put(02, 200);
		map.put(03,  new Student(04,"RoyalRaj",5.9));
		map.put(04, 400);
		System.out.println(map);
		//hetrogenous key values are not allowed
		
		System.out.println("---------------------------------");
		System.out.println(":::::HashMap::::::");
		HashMap map1=new HashMap<>();
		map1.put(01, 500);
		map1.put(02, 200);
		map1.put(03,  new Student(04,"RoyalRaj",5.9));
		map1.put(04, 400);
		map1.put( "Six",new Student(01,"Raj",7.9));
		System.out.print(map1);
		System.out.println("---------------------------------");
		//Inseration order is not allowed//
		
		System.out.println("---------------------------------");
		System.out.println(":::::LinkedHashMap::::::");
		LinkedHashMap map2=new LinkedHashMap<>();
		map2.put(01, 500);
		map2.put(02, 200);
		map2.put(03,  new Student(04,"RoyalRaj",5.9));
		map2.put(04, 400);
		map2.put( "Six",new Student(01,"Raj",7.9));
		System.out.print(map2);
		//	//Inseration order is allowed//
	}

}
/*output
 * ---------------------------------
:::::TreeMap/Re-Map::::::
{1=Student [id=1, name=Raj, cgpa=7.9], 2=200, 3=Student [id=4, name=RoyalRaj, cgpa=5.9], 4=400}
---------------------------------
:::::HashMap::::::
{1=500, 2=200, 3=Student [id=4, name=RoyalRaj, cgpa=5.9], Six=Student [id=1, name=Raj, cgpa=7.9], 4=400}
---------------------------------
:::::LinkedHashMap::::::
{1=500, 2=200, 3=Student [id=4, name=RoyalRaj, cgpa=5.9], 4=400, Six=Student [id=1, name=Raj, cgpa=7.9]}
 */
