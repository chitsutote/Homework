import java.io.*;
import java.util.*;


public class dbms{

	public static void main(String[] argv)throws IOException{
	
		String field[][] = new String[19][5];
		String bat[][] = new String[21][8];
		String pitch[][] = new String[21][9];
		String player[][] = new String[41][6];
		String team[][] = new String[5][5];
		String[] filename ={"FIELD.txt","BAT.txt","PITCH.txt","PLAYER.txt","TEAM.txt"};  

		int j=0,k=0;
		int i=0,q=0,p=0;
		int count = 0;

		for(i = 0; i < 5; i++){
		    FileReader	fr = new FileReader(filename[i]);
			BufferedReader br = new BufferedReader(fr);

		
			if(i == 0){
				k = 0;
				j = 0;
				
				while(br.ready()){
					String[] tokens = br.readLine().split("\t");
					for(String token:tokens){
						if( k == 5){
							k = 0;
							j++;
						}
						field[j][k] = token;
						k++;
					}
				}

				/*for( p = 0; p < field.length;p++){
					for(q = 0; q < field[p].length ;q++){
						System.out.println(field[p][q]);
					}
				}*/
			}

			if(i == 1){
				k = 0;
				j = 0;
				while(br.ready()){
					String[] tokens = br.readLine().split("\t");
					for(String token:tokens){
						if( k == 8){
							k = 0;
							j++;
						}
						bat[j][k] = token;
						k++;
					}
				}

				/*for( p = 0; p < bat.length;p++){
					for(q = 0; q < bat[p].length ;q++){
						System.out.println(bat[p][q]);
					}
				}*/
			}
			if(i == 2){
				k = 0;
				j = 0;
				
				while(br.ready()){
					String[] tokens = br.readLine().split("\t");
					for(String token:tokens){
						if( k == 9){
							k = 0;
							j++;
						}
						pitch[j][k] = token;
						k++;
					}
				}

				/*for( p = 0; p < pitch.length;p++){
					for(q = 0; q < pitch[p].length ;q++){
						System.out.println(pitch[p][q]);
					}
				}*/
			}
			if(i == 3){
				k = 0;
				j = 0;
				
				while(br.ready()){
					String[] tokens = br.readLine().split("\t");
					for(String token:tokens){
						if( k == 6){
							k = 0;
							j++;
						}
						player[j][k] = token;
						k++;
					}
				}

				/*for( p = 0; p < player.length;p++){
					for(q = 0; q < player[p].length ;q++){
						System.out.println(player[p][q]);
					}
				}*/
			}
			if(i == 4){
				k = 0;
				j = 0;
				
				while(br.ready()){
					String[] tokens = br.readLine().split("\t");
					for(String token:tokens){
						if( k == 5){
							k = 0;
							j++;
						}
						team[j][k] = token;
						k++;
					}
				}

				/*for( p = 0; p < team.length;p++){
					for(q = 0; q < team[p].length ;q++){
						System.out.println(team[p][q]);
					}
				}*/
			}
			fr.close();
		}
		//End of Preprocessing : Establishing SQL table
		
		int SelectIndex = 0;
		int FromIndex = 0;
		int WhereIndex = 0;


		Scanner input = new Scanner(System.in);
		String command = input.nextLine();

		
/*		System.out.println(command.indexOf("SELECT"));
		System.out.println(command.indexOf("FROM"));
		System.out.println(command.indexOf("WHERE"));*/


		SelectIndex = command.indexOf("SELECT");
		FromIndex = command.indexOf("FROM");
		WhereIndex = command.indexOf("WHERE");

		String attributeList = command.substring(SelectIndex+7,FromIndex-1);
		String tableList = command.substring(FromIndex+5,WhereIndex-1);
		String condition = command.substring(WhereIndex+6);

		System.out.println(attributeList);
		System.out.println(tableList);
		
					for(i = 0; i < 19 ; i++){
						System.out.println(field[i][0]);
					}
				

			if(tableList.equals("FIELD")){
				System.out.println("Fuck");
				if(attributeList.equals("F_NAME")){
					for(i = 0; i < 19 ; i++){
						System.out.println(field[i][0]);
					}
				}
			}
		
	
	}

}

