package interview.prep.practice;

import java.util.ArrayList;
import java.util.List;

//Fibbonacy series 0 1 1 2 3 5 8....
// by swapping the numbers
//by recursion
class CompleteSeries {
	public static void main(String[] args) {
		completeNumberSeries(20);

		int N = 20;
		for(int i=0;i<N;i++){
			System.out.println( fibo(i) + "");
		}

		boolean[] bool = new boolean[200];
		double[] darr = new double[29292929];

		System.out.println(bool.toString());
	}

	 public static void completeNumberSeries(int n) {

		 int n1 = 0, n2 =1;
		 for (int i = 0; i < n; i++) {
			 int n3 = n1+n2; //0+1 =n3 = 1
			 System.out.println("n1  :" + n1);
			 //swap
			 n1 = n2;
			 n2 = n3;
		 }

	 }
//Using recursion
	 public static int fibo(int n){

		if(n <=1){
			return n;
		}

		return fibo(n-1) + fibo(n-2);


	 }
	 }