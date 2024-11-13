package com.kd.Strings;

public class LongestString {
	public static void main(String[] args) {
		String s="I am learning java";
		String[] word=s.split(" ");
		String longestword="";
		for(int i=0;i<word.length;i++) {
			for(int j=i+1;j<word.length;j++) {
				if(word[i].length()>=word[j].length()) {
					 longestword = word[i];
				}
			}
		}
		System.out.println("longest word is:"+longestword);

	}

}
/*output:
 longest word is:learning
 */
