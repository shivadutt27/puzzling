package puzzlingCode;

import java.util.ArrayList;

public class TestPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puzzle pz1 = new Puzzle();
		
		/*
		ArrayList<Integer> returnedArray = new ArrayList<Integer>();

		returnedArray = pz1.getTenRolls();
		
		for(int i=0; i<returnedArray.size(); i++)
		{
			System.out.printf("\n Random Numbers are %d -- %d \n ",i, returnedArray.get(i));
			
		}
	
	*/
		
		char getChar = pz1.getRandomLetter();
		System.out.printf("\n Returned Character is %s \n ", getChar);
		
		String getPassword = pz1.generatePassword();
		System.out.printf("\n The new Password is: %s \n", getPassword);
		
		 
		String[] stringArr = pz1.getNewPasswordSet(5);
		int counter =0;
		while(counter<5)
		{
			System.out.printf(" %s, ",stringArr[counter]);
			counter++;
		}
		
	
		String[] strArr = {"shiva", "dutta", "vishal", "duggal"};
		
		for(int i=0; i<strArr.length; i++)
		{
			System.out.println(strArr[i]);
		}
		
		String[] resultArr = pz1.shuffleArray(strArr);
		
		for(int i=0; i<resultArr.length; i++)
		{
			System.out.println("\n"+resultArr[i]);
		}
		
	}

	
	
}
