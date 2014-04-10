import java.io.*;

public class HW1_F74992231_v1{

	private int[] elements;
	private String[] test;
	private String input;
	public int length;

	//constructor to  initial the variable
	public HW1_F74992231_v1(){
		length = 0;
//		System.out.println("Hello");
	}

    //constructor to get input and record
	public HW1_F74992231_v1(String input){
		System.out.println(input);
		System.out.println("printed out all input");

		test = input.split(",");
		System.out.println(test[0]);
	}

	//Count number
/*	public int size(){
	
	}

	public boolean isEmpty(){
	
	}

	public boolean isPnumber(){
	
	}

	public boolean isEvennumber(){
	
	}

	public int getMaximalElement(){
	
	}

	public void reverse(){
	
	}

	public void showDistinctElement(){
	
	}

	public boolean equals(HW1_F74992231_v1 s){
	
	}

	public boolean subSet(HW1_F74992231_v1 s){
	
	}

	public HW1_F74992231_v1 union(HW1_F74992231_v1 s){
	
	}

	public HW1_F74992231_V1 intersection(HW1_F74992231_V1 s){
	
	}
*/
	public static void main(String args[]){
		HW1_F74992231_v1 one = new HW1_F74992231_v1();

		HW1_F74992231_v1 two = new HW1_F74992231_v1(args[0]);
		System.out.println("Success");
	
	}
}
