package main;

import java.util.ArrayList;
import java.util.List;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			for(int j=0;j<3;j++) {
				result= result+input.charAt(i);
			}
		
		}
		return result;

	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		
		

		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(a);
		numbers.add(b);
		numbers.add(c);
		numbers.sort(null);
		int checknum1= numbers.get(2)-numbers.get(1);
		int checknum2= numbers.get(1)-numbers.get(0);
		if(checknum1==checknum2) {
			return true;
		}else {
			return false;
		}
//		int group[] = { a, b, c };
//		int big;
//		int medium ;
//		int small ;
//		big = group[2];
//		medium=group[1];
//		small=group[0];
//		for (int i = 0; i <=3; i++) {
//			if (group[i] > small && group[i]>medium) {
//				small = group[i];
		
//			System.out.println(small);
//				}
//			else if (group[i] < big) {
//				medium = group[i];
//			System.out.println(medium);
//				}
//			else if (group[i] < medium) {
//				big = group[i];
//			System.out.println(big);
//				}
//			else if (medium-small==big-medium) {
//				return true;}
//			else
//				return false;
//		}
		
	
		
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {

		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
//
//		if (input.endsWith("dev")) {
//			return true;
//		}
//		if (input.endsWith("Dev")) {
//			return true;
//		}
//
//		else {
//			return false;
//		}
//
//	}
		return input.toLowerCase().endsWith("dev");
	}
	

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {

		return 0;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {

		if (arg1 % 5 == 0 && arg1 % 3 == 0) {
			return "fizzbuzz";
		} else if (arg1 % 5 == 0) {
			return "buzz";
		} else if (arg1 % 3 == 0) {
			return "fizz";
		} else

			return null;

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
//		System.out.println(arg1.split(" "));
		

		return 0;

	}

}
