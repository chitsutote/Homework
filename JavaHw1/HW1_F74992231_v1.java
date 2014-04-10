import java.io.*;
import java.lang.Math;

public class HW1_F74992231_v1{

	private int[] elements;
	private String[] test;
	private String input;
	public int length;

	//constructor to  initial the variable
	public HW1_F74992231_v1(){
		length = 0;
		elements = new int[0];
	}

    //constructor to get input and record
	public HW1_F74992231_v1(String input){
		
		System.out.println(input);
		System.out.println("printed out all input");

		test = input.split(",");
		
		elements = new int[test.length];
		for(int i=0; i< test.length; i++){
			String text = test[i];
			int temp = Integer.parseInt(text);
			elements[i] = temp;
			System.out.println(temp);
		}
		length = elements.length;
		//System.out.println(test[0]);
	}

	//Count number
	public int size(){
		return length;
	}

	public boolean isEmpty(){
		if( length == 0){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isPnumber(){
		boolean flag = false;
		int count = 0;

		for(int i=0; i< length; i++){
			
			for(int j = 1; j< Math.sqrt(elements[i]) ; j++){
				if( (elements[i] % j) == 0){
					count++;	
				}else{
		
				}
			}
			if(count <= 2){
				flag = true;
			}else{
				flag = false;
				break;
			}
		}	
		return flag;
	}

	public boolean isEvennumber(){
		int count = 0;
		for(int i=0; i<length; i++){
			if( (elements[i] % 2) == 0){
				count++;
			}
		}
		if( count == length){
			return true;
		}else{
			return false;
		}
	}

	public int getMaximalElement(){
		int temp = elements[0] ;
		int max = 0;

		for(int i=1; i<length; i++){
			if( temp < elements[i]){
				temp = elements[i];
			}
		}
		max = temp;
		return max;
	}
/*
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

		HW1_F74992231_v1 list1 = new HW1_F74992231_v1(args[0]);
        
		//size
		int size = list1.size();
		boolean isEmpty = list1.isEmpty();
		System.out.print("第一個數字集合長度:");
		System.out.println(size);
		
		//isEmpty
		if(isEmpty == true){
			System.out.print("第一個數字集合是否為空集合:");
			System.out.println("true");
		}else{
			System.out.print("第一個數字集合是否為空集合:");
			System.out.println("false");
		}
		
		//Prime number
		if( list1.isPnumber() == false ){
			System.out.print("第一個數字集合是否都為質數:");
			System.out.println("false");
		}else{
			System.out.print("第一個數字集合是否都為質數:");
			System.out.println("true");
		}
		
		//Event number
		if( list1.isEvennumber() == false ){
			System.out.print("第一個數字集合是否都為偶數:");
			System.out.println("false");
		}else{
			System.out.print("第一個數字集合是否都為偶數:");
			System.out.println("true");
		}
		
		//Maximum
			System.out.print("第一個數字集合中最大的數字:");
			System.out.println(list1.getMaximalElement());
	}
}
