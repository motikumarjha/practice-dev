import java.util.*;
import java.io.*;
import java.lang.*;

class FindPlaceValue {

	static int placeValue(int originalNumber, int pValueOf)
	{
		int total =1;
		int value = 0;
		while (originalNumber>0) {
			int rem = originalNumber % 10;//3
			originalNumber = originalNumber / 10; //1234512

			 if(rem == pValueOf) {
			 	value = total * rem;
			//	break;
			}
			if (pValueOf == 2 || pValueOf == 4 || pValueOf == 6 || pValueOf == 8) {
				value = 0;
				System.out.println("skip even numbers place holder");
			}
			total = total * 10;
		}
		return value;
	}

	public static void main(String[] args)
	{
		int originalNumber = 12345123;
		int pValueOf = 5;
		System.out.println(placeValue(originalNumber,pValueOf));
	}
}
