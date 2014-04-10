import java.io.*;
import java.lang.Math;
import java.util.HashMap;
import java.util.*;

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
		
		//System.out.println(input);
		//System.out.println("printed out all input");

		test = input.split(",");
		
		elements = new int[test.length];
		for(int i=0; i< test.length; i++){
			String text = test[i];
			int temp = Integer.parseInt(text);
			elements[i] = temp;
//			System.out.println(temp);
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
		if(length == 0){
			return false;
		}
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
		if(length == 0){
			return false;
		}
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
		if(length == 0){
			return 0;
		}
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

	public void reverse(){
       System.out.print("第一個數字集合顛倒輸出:");
	   
	   for(int i= (length -1); i >=0; i--){
	   		System.out.print(elements[i]);
	 		if(i == 0){
				System.out.print("\n");
			}else{
				System.out.print(",");
			}
	   }
	}

	public void showDistinctElement(){
		HashMap<String,Integer>list = new HashMap<String,Integer>();

		list.put(test[0],1);

		System.out.print("第一個數字集合的distinct結果:");
		System.out.print(elements[0]);

		for(int i = 1; i<length; i++){
			
			if(list.get(test[i]) ==null){
				list.put(test[i],1);
				System.out.print(","+elements[i]);
			}
				if( i == (length-1) ){
					System.out.print("\n");
				}
		}
		
	    
	}


	public boolean equals(HW1_F74992231_v1 s){
		if(length == 0){
			return false;
		}
			
			if(Arrays.equals( elements,s.elements ) ){
				return true;
			}else{
				return false;
			}
	}

	public boolean subSet(HW1_F74992231_v1 s){
		if(length == 0){
			return true;
		}

		if( length > s.length ){
			return false;
		}else{
			for(int i = 0;i<length;i++){
				for(int j=0; j<s.length;j++){
					if( elements[i] == s.elements[j]){
						break;
					}else if( j== s.length -1 && elements[i] != s.elements[j]){
				        		return false;
					}
					
				}
			}
		}
		return true;
	}

	public HW1_F74992231_v1 union(HW1_F74992231_v1 s){
	
		HashMap<Integer,Integer>list = new HashMap<Integer,Integer>();
		HW1_F74992231_v1 temp;
		int count = 0;

		
		for(int i = 0; i< length;i++){
			if(list.get(elements[i]) == null){
				list.put(elements[i],elements[i]);
				count++;
			}	
		}

		for(int i = 0; i< s.length;i++){
			if(list.get(s.elements[i]) == null){
				list.put(s.elements[i],s.elements[i]);
				count++;
			}	
		}
		
		temp = new HW1_F74992231_v1();
		temp.length = count;
		temp.elements = new int[count];
		int i=0;
		for(Object key : list.keySet()){
			temp.elements[i]=list.get(key);
			i++;
		}
		return temp;
	}


	public HW1_F74992231_v1 intersection(HW1_F74992231_v1 s){
		if(length == 0){
			return null;
		}
			
		HashMap<Integer,Integer>list = new HashMap<Integer,Integer>();
		HW1_F74992231_v1 temp;
		int count = 0;
		
		for(int i = 0; i< length;i++){
			for(int j = 0 ;j < s.length;j++){
		    	if( elements[i] == s.elements[j]){
					if(list.get(elements[i]) == null){
						list.put(elements[i],elements[i]);
						count++;
					}
				}	
			
			}
			
		}

		
		temp = new HW1_F74992231_v1();
		temp.length = count;
		temp.elements = new int[count];
		int i=0;
		for(Object key : list.keySet()){
			temp.elements[i]=list.get(key);
			i++;
		}
		return temp;
	}

	public static void main(String args[]){

		HW1_F74992231_v1 list1 = new HW1_F74992231_v1(args[0]);
		HW1_F74992231_v1 list2 = new HW1_F74992231_v1(args[1]);
        
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
			if( list1.getMaximalElement() == 0){
			
			}else{
			System.out.println(list1.getMaximalElement());
			}
		//Reverse
			list1.reverse();
 
        //Show Distinct
			list1.showDistinctElement();

		//Check equal
			if( list1.equals(list2) ){
				System.out.println("第一個數字集合與第二個數字集合是否相同:true");
			}else{
				System.out.println("第一個數字集合與第二個數字集合是否相同:false");
			}

		//subset
			if( list1.subSet(list2) == true ){
				System.out.println("第一個數字集合是否為第二個數字集合的子集合:true");
			}
			else{
				System.out.println("第一個數字集合是否為第二個數字集合的子集合:false");
			}
		
		//Union
		HW1_F74992231_v1 union = list1.union(list2);
		System.out.print("第一個數字集合聯集第二個數字集合:");
		System.out.print(union.elements[0]);
		for(int i = 1; i < union.length;i++){
			System.out.print(","+union.elements[i]);
		}
			System.out.print("\n");
		
		//intersection
		
		HW1_F74992231_v1 intersec = list1.intersection(list2);
		System.out.print("第一個數字集合交集第二個數字集合:");
		System.out.print(intersec.elements[0]);
		for(int i = 1; i < intersec.length;i++){
			System.out.print(","+intersec.elements[i]);
		}
			System.out.print("\n");

		

	}
}
