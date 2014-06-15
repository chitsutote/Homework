import java.io.*;
import java.util.*;


public class dbms{

	public static void main(String[] argv)throws IOException{
	
		String field[][] = new String[5][9];
		String bat[][] = new String[8][21];
		String pitch[][] = new String[9][21];
		String player[][] = new String[6][41];
		String team[][] = new String[5][5];
		String[] filename ={"FIELD.txt","BAT.txt","PITCH.txt","PLAYER.txt","TEAM.txt"};  

		int j=0,k=0;

		for(int i = 0; i < 5; i++){
		    FileReader	fr = new FileReader(filename[i]);
			BufferedReader br = new BufferedReader(fr);
		
			if(i == 0){
				
				while(br.ready()){
					String[] tokens = br.readLine().split("\t");
					for( String token:tokens){
						filed[j][k] = token; 
						System.out.println(token);
						j++
					}
					k++;
				}
			}

			fr.close();
		}
	}

}

