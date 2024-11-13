package com.kd.Strings;
public class CharacterCounter {
		
	public void CountCharacter(String str) {
		// convert string into array
		char[] crr=str.toCharArray();
		
		//method to sort the array
		crr=SortCharacterArray(crr);
		
		//Applying yhe comparing logic
		//for(int i=0;i<crr.length;i++) {
			int count =1;
			for(int j=0;j<crr.length-1;j++) {
				if(j+1==crr.length-1) {
					if(crr[j+1]==crr[j]) {
						count++;
						System.out.println(crr[j+1]+"occured"+count+"times.");
					}else {
						System.out.println(crr[j+1]+"occured 1 time only");
						
					}
				}
				if(crr[j+1]==crr[j]) {
					count++;
				}else {
					System.out.println(crr[j]+"occured 1 time only");
					count=1;
				}
			}
		}	

		private char[] SortCharacterArray(char[] crr) {
			int count=0;
			for(int i=0;i<crr.length;i++) {
				for(int j=0;j<crr.length-1-j;j++) {
					if(crr[j]>crr[j+1]) {
						char temp=crr[j+1];
						crr[j]=crr[j+1];
						crr[j+1]=temp;
						count=1;
					}
				}
				if(count==0) {
					break;
				}
			}
			return crr;
	}
}	