import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;


abstract class hero{
	
	public int hp=0;
	public int mp=0;
	public int def=0;
	public int atk=0;
	public int round=1;
	public boolean result = false;
	public int level = 1;
	public int exp = 0;
	public int LevelExp = 5;

	public int dice = 0;

	public String skill=null;
	public int skillatk = 0;
	public int skillmp = 0;


	public abstract int HP();
	public abstract int MP();
	public abstract int DEF();
	public abstract int ATK();
	public abstract boolean SKILL();
	public abstract int Level();
	public abstract int Exp();
}
abstract class bossproto{
	
	public int hp=0;
	public int mp=0;
	public int def=0;
	public int atk=0;
	public int round=1;
	public boolean result = false;
	public int level = 1;
	public int exp = 0;
	public int LevelExp = 5;

	public int dice = 0;

	public String skill=null;
	public int skillatk = 0;
	public int skillmp = 0;


	public abstract int HP();
	public abstract int MP();
	public abstract int DEF();
	public abstract int ATK();
	public abstract boolean SKILL();
}

class hero1 extends hero{
	
	private int temp=0;
	int lucky =0;
	Random rdm = new Random();

	public hero1(){
		
		HP(); 
		hp = rdm.nextInt(100)+300;
		mp= rdm.nextInt(100)+200;
		def= rdm.nextInt(30)+10;
		atk= rdm.nextInt(100)+10;
		
		skill = "超究武神霸斬";
		skillatk = 60;
		skillmp = 30;
	}

	public int HP(){
		lucky +=3;
		return hp;
	}
	public int MP(){
		lucky +=3;
		return mp;
	}
	public int DEF(){
		lucky +=3;
		return def;
	}
	public int ATK(){
		lucky +=3;
		return atk;
	}
	public boolean SKILL(){
		lucky +=3;
		dice = rdm.nextInt(100)+1;
		if(dice % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	public int Level(){
		if( exp == LevelExp){
			level++;
			exp = 0;
			LevelExp +=5;
		}
		return level;
	}
	public int Exp(){
		return exp;
	}

	public void detail(){
		System.out.println("LV: "+level);
		System.out.println("HeroA : Cloud");
		System.out.println("體力值"+hp);
		System.out.println("魔力值"+mp);
		System.out.println("攻擊"+atk);
		System.out.println("防禦"+def);
		System.out.println("技能("+skill+") 對對手造成體力"+skillatk+"的傷害"+"/消耗魔力"+skillmp);
		
	}
	public String toString(){
		return "Cloud"+" 體力剩下"+this.hp+" 防禦"+this.def+" 魔力"+this.mp;
	}
	public String toString(int a){
		return "Cloud 共花了"+this.round+"回合擊敗魔王獲得勝利";
	}
}


class boss extends bossproto{
	
	public int temp=0;
	public int tempmp=0;
	Random rdm = new Random();

	public boss(){
		
		 
		hp = rdm.nextInt(100)+55;
		mp= rdm.nextInt(85)+45;
		def= rdm.nextInt(30)+1;
		atk= rdm.nextInt(100)+1;

		temp = hp;
		tempmp = mp;

		skill = "任意門";
		skillatk = 70;
		skillmp = 40;
	}

	public int HP(){
		return hp;
	}
	public int MP(){
		return mp;
	}
	public int DEF(){
		return def;
	}
	public int ATK(){
		return atk;
	}
	public boolean SKILL(){
		dice = rdm.nextInt(100)+1;
		if(dice % 7 == 0){
			return true;
		}else{
			return false;
		}
	}

	public void detail(){
		System.out.println("Boss : Doraemon");
		System.out.println("體力值"+hp);
		System.out.println("魔力值"+mp);
		System.out.println("攻擊"+atk);
		System.out.println("防禦"+def);
		System.out.println("技能("+skill+") 對對手造成體力"+skillatk+"的傷害"+"/消耗魔力"+skillmp);
	
	}
	public String toString(){
		return "Doraemon"+" 體力剩下"+this.hp+" 防禦"+this.def+" 魔力"+this.mp;
	}
}

public class HW3_F74992231_v1{

	public static void main(String[] args){
	
		
		int MinRound = 0;
		int winner = 0;
		Scanner scanner = new Scanner(System.in);
		//check hero is create or noti
		int start = 0;
		int save = 0;
		
		System.out.println("new : 產生新英雄");
		System.out.println("info : 英雄資訊");
		System.out.println("batt : 開啟一場戰鬥");
		System.out.println("save : 儲存");
		System.out.println("load : 讀取");
		System.out.println("exit : 離開");
		System.out.println("help : 幫助");
		
		String command;

		hero1 heroA = new hero1();
		
		while( true ){
		
			command = scanner.next();
		
			
			if( command.equals("new") ){
				System.out.println("A");
				heroA = new hero1();
				start = 1;
				heroA.detail();
			}else if( command.equals("info")){
					if( start == 1){
						System.out.println("B");
						heroA.detail();
					}
					else{
						System.out.println("請先創建英雄");
					}
			}else if( command.equals("batt") ){
					if( start == 1){
						System.out.println("c");
					}
					else{
						System.out.println("請先創建英雄");
					}
			}else if( command.equals("save") ){
					if( start == 1){
						try{
						FileWriter fw = new FileWriter("stat.txt");
						fw.write(Integer.toString(heroA.level)+'\n');
						fw.write(Integer.toString(heroA.hp)+'\n');
						fw.write(Integer.toString(heroA.mp)+'\n');
						fw.write(Integer.toString(heroA.atk)+'\n');
						fw.write(Integer.toString(heroA.def)+'\n');
						fw.close();
						System.out.println("存檔成功");
						}
						catch(Exception e){
							e.printStackTrace();
						}
						save = 1;
					}
					else{
						System.out.println("請先創建英雄");
					}
			}else if( command.equals("load")  ){
					if( (start == 1) && (save == 1) ){
						try{
							FileReader fr = new FileReader("stat.txt");
							BufferedReader br = new BufferedReader(fr);
							heroA.level =Integer.valueOf(br.readLine());
							heroA.hp =Integer.valueOf(br.readLine());
							heroA.mp =Integer.valueOf(br.readLine());
							heroA.atk =Integer.valueOf(br.readLine());
							heroA.def =Integer.valueOf(br.readLine());
						}
						catch(Exception e){
							e.printStackTrace();
						}
					}
					else{
						System.out.println("請先創建英雄或存檔");
					}
			}else if( command.equals("exit") ){
						break;
			}else if( command.equals("help") ){
						System.out.println("Nothing");
					}
			
		}	
		
		 


		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");

 }
}
