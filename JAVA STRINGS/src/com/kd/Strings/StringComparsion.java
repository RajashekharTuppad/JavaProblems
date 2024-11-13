package com.kd.Strings;

public class StringComparsion {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Sita";
		String s3="Ram+Sita";
		String s4="Ram+Sita";
		
		// Reference Comparsion
		
		System.out.println("Condition 1 : ");
		
		System.out.println("The Reference Comparsion of given data:");
		if(s3==s4) {
			System.out.println("Reference are same");
		}else {
			System.out.println("Reference are different");
		}
		
		// String data comparsion
		System.out.println("The String data  Comparsion of given data:");
		if(s3.equals(s4)) {
			System.out.println("String data equals");
		}else {
			System.out.println("String data are unequal");
		}
		/*output
		 Condition 1:
		 The Reference Comparsion of given data:
		Reference are same
		The String data  Comparsion of given data:
		String data equals
		 */
		
		
		System.out.println("**********************************************************");
		System.out.println("Condition 2 : ");
		
		String s5=s1+s2;
		String s6=s1+s2;
		System.out.println("The Reference Comparsion of given data:");
		if(s5==s6) {
			System.out.println("Reference are same");
		}else {
			System.out.println("Reference are different");
		}
		
		// String data comparsion
		System.out.println("The String data  Comparsion of given data:");
		if(s5.equals(s6)) {
			System.out.println("String data equals");
		}else {
			System.out.println("String data are unequal");
		}
		/*	output
		 	Condition 2:
		 	The Reference Comparsion of given data:
			Reference are different
			The String data  Comparsion of given data:
			String data equals
		 */
		
		System.out.println("**********************************************************");
		
		System.out.println("Condition 3 : ");
		
		String s7="Ram";
		String s8=s7;
		System.out.println("The Reference Comparsion of given data:");
		if(s7==s8) {
			System.out.println("Reference are same");
		}else {
			System.out.println("Reference are different");
		}
		
		// String data comparsion
		System.out.println("The String data  Comparsion of given data:");
		if(s7.equals(s8)) {
			System.out.println("String data equals");
		}else {
			System.out.println("String data are unequal");
		}
		/*output
		Condition 3 : 
			The Reference Comparsion of given data:
			Reference are same
			The String data  Comparsion of given data:
			String data equals
		*/
		
		System.out.println("**********************************************************");
		
		System.out.println("Condition 4 : ");
		
		String s9="Ram";
		String s10="Sita";
		
		System.out.println("s9="+s9);
		System.out.println("s10="+s10);
		
		s9.concat(s10);
		System.out.println("****After concatanation****");
		System.out.println("s9="+s9);
		System.out.println("s10="+s10);
		
		/*output
		 Condition 4 : 
			s9=Ram
			s10=Sita
			****After concatanation****
			s9=Ram
			s10=Sita
		 */
		
		System.out.println("**********************************************************");
		
		System.out.println("Condition 5 : ");
		
		String s11="Ram";
		String s12="Sita";
		
		System.out.println("s11="+s11);
		System.out.println("s12="+s10);
		
		 String s13=s11.concat(s10);
		System.out.println("****After concatanation****");
		System.out.println("s11="+s11);
		System.out.println("s12="+s12);
		System.out.println("s13="+s13);
		
		/*output
		  Condition 5 : 
			s11=Ram
			s12=Sita
			****After concatanation****
			s11=Ram
			s12=Sita
			s13=RamSita
			*/
		
		System.out.println("**********************************************************");
		
		System.out.println("Condition 6 : ");
		String s14="Raja Ram Mohan Roy";
		
		System.out.println("***************");
		System.out.println("To convert String Data in Upper Case:");
		System.out.println(s14.toUpperCase());
		/* output
		 	To convert String Data in Upper Case:
				RAJA RAM MOHAN ROY
		 */
		
		System.out.println("***************");
		System.out.println("To convert String Data in Lower Case:");
		System.out.println(s14.toLowerCase());
		/*output
		 To convert String Data in Lower Case:
				raja ram mohan roy
		 */
		
		System.out.println("***************");
		System.out.println("Return the character at specified index:");
		System.out.println(s14.charAt(6));
		/*output
		 Return the character at specified index:
				a
		 */
		
		System.out.println("***************");
		System.out.println("Return index value of first occurance:");
		System.out.println(s14.indexOf('a'));
		/*output
		 Return index value of first occurance:
				1
		 */
		
		System.out.println("***************");
		System.out.println("Return index value of LAST occurance:");
		System.out.println(s14.lastIndexOf('a'));
		/*output
		 Return index value of LAST occurance:
				12
		 */
		
		System.out.println("***************");
		System.out.println(" decide Starting string position on specified index:");
		System.out.println(s14.substring(0));
		System.out.println(s14.substring(5));
		System.out.println(s14.substring(8));
		/*output
		  decide Starting string position on specified index:
				Raja Ram Mohan Roy
				Ram Mohan Roy
				 Mohan Roy
		 */
		
		System.out.println("***************");
		System.out.println(" decide  string position on specified index with initial and final position:");
		System.out.println(s14.substring(9,14));
		System.out.println(s14.substring(5,8));
		/*output
		  decide  string position on specified index with initial and final position:
				Mohan
				Ram
		 */
		
		System.out.println("***************");
		System.out.println(" Returns true if specified condition string found else false:");
		System.out.println(s14.contains("Ram"));
		System.out.println(s14.contains("Sita"));
		/* output
		 Returns true if specified condition string found else false:
				true
				false
		 */
		
		/* Methods in Strings*/
		System.out.println("***************");
		System.out.println(" measure length of the Given  String:");
		System.out.println(s14.length());
		
		/*output
		  measure length of the Given  String:
			18
		 */
		
		System.out.println("***************");
		System.out.println("Verify the condition true or false :");
		System.out.println(s14.startsWith("Ram"));
		System.out.println(s14.startsWith("Raja"));
		/*
		 Verify the condition true or false :
			false
			true
		 */
		
		System.out.println("***************");
		System.out.println("Verify the condition true or false :");
		System.out.println(s14.endsWith("Ram"));
		System.out.println(s14.endsWith("Roy"));
		/*
		 Verify the condition true or false :
		false
		true
		 */
		
		System.out.println("***************");
		System.out.println("Returns String Character Array :");
		String s15="Raja";
	    char[] result;

	    result = s14.toCharArray();
	    result = s15.toCharArray();
	    System.out.println(s14.toCharArray());
	    System.out.println(s15.toCharArray());
	    System.out.println(result); 
	    /*
	     Returns String Character Array :
			Raja Ram Mohan Roy
	     */
	  
	    System.out.println("***************");
		System.out.println("The trim() method removes any leading (starting) and trailing (ending) whitespaces from the specified string :");
		String s16="      Java Programming      ";
	    System.out.println(s16.trim());
		/*
		 The trim() method removes any leading (starting) and trailing (ending) whitespaces from the specified string :
			Java Programming
		 */
		
	    
	    System.out.println("***************");
		System.out.println("The split() method divides the string at the specified regex and returns an array of substrings. :");
	    String s17 = "Java is a fun programming language";
	    
	    // split string from space
	    String[] split = s14.split(" ");
	    String[] split2 = s17.split(" ");
	    System.out.print("split = ");
	    for (String str : split) {
	      System.out.println(str + "$");
	    }
	    for (String str : split2) {
		      System.out.println(str + ", ");
		    }
		/*
		 The split() method divides the string at the specified regex and returns an array of substrings. :
			split = Raja, 
			Ram, 
			Mohan, 
			Roy, 
			Java, 
			is, 
			a, 
			fun, 
			programming, 
			language, 

		 */
		System.out.println("***************");
		System.out.println("The replace() method replaces each matching occurrence of a character/text in the string with the new character/text:");
	    String s18 = "bat ball";
	    // replace b with c
	    System.out.println(s18.replace('b','c'));
	    /*
	     The replace() method replaces each matching occurrence of a character/text in the string with the new character/text:
			cat call
	     */
	    
	    
	    System.out.println("***************");
		System.out.println("The replaceAll() method replaces each substring that matches the regex of the string with the specified text. :");
		 String str1 = "aabbaaac";
		 String str2 = "Learn223Java55@";

		    // regex for sequence of digits
		    String regex = "\\d+";

		    // all occurrences of "aa" is replaceAll with "zz"
		    System.out.println(str1.replaceAll("aa", "zz")); // zzbbzzac

		    // replace a digit or sequence of digits with a whitespace
		    System.out.print(str2.replaceAll(regex," ")); // Learn Java @6
		   
	}
	
}
