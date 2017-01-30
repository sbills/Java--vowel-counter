/* CS 225 - Intro to Computer Science II
 * File Name: CS225_Lab1.java
 * Java Programming
 * Lab 1 - Due 09/13/2016
 * Instructor: Dr. James Yeh
 * 
 * Name 1: Sean Billideau
 * Name 2: 
 * Description: This file contains the source code for Lab 1, Problem 1.
 */

public class CS225_Lab1
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Sean Billideau");
		System.out.println("Lab 1");
		System.out.println("");

		public static char[] strtoCharArray (String s)  {
			char[] foo = new char [s.length()];
			for (int index = 0; index < s.length(); index++)// initialize
				foo[index]= s.charAt(index);//array foo increased (index) using charat



			return foo;

		}
		public static void printNumVowels( char[] c) {
			int[] vowels; 
			vowels = new int [5];
			for (int index = 0; index < c.length; index++)
			{
				if (c[index]== 'A'|| c[index]=='a'){
					vowels[0]++;}
					if (c[index]== 'E'|| c[index]=='e'){
						vowels[1]++;}
						if (c[index]== 'I'|| c[index]=='i'){
							vowels[2]++;}
							if (c[index]== 'O'|| c[index]=='o'){
								vowels[3]++;}
								if (c[index]== 'U'|| c[index]=='u'){
									vowels[4]++;}

								
							
						




					
				}
			}
		}
	}
}
