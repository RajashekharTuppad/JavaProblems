package com.kd.Strings;

public class AnagramStrings {

	public boolean isAnagram(String str1,String str2) {
		
		boolean isAnagram=false;
		
		// compare the given String length
		if(str1.length()==str2.length()) {
			//convert the string into array
			char[] crr1=str1.toCharArray();
			char[] crr2=str2.toCharArray();
			
			
			// to verify the swapping condition we crete this method
			crr1=sortCharacterArray(crr1);
			crr2=sortCharacterArray(crr2);
			
			// to check the length of the given length of the string
			for(int i=0;i<crr1.length;i++) {
				if(crr1[i]==crr2[i]) {
					isAnagram=true;
				}else {
					isAnagram=false;
					break;
				}
			}
			}
		return isAnagram;
	}

	// method to sort specified character Array
	public char[] sortCharacterArray(char[] crr) {
		for(int i=0;i<crr.length;i++) {
			boolean swapped=false;
			
			for(int j=0;j<crr.length-1-i;j++) {
				if(crr[j]>crr[j+1]) {
					char temp=crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;
					
					swapped=true;
				}
			}
			if(swapped==false)
				break;
		}
		return crr;
	}

}

/*
 Enter the 1st String:
bat
Enter the 2nd String:
tab
bat&tabare Anagram String
*/
