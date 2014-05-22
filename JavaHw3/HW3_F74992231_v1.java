import java.util.*;

abstract class hero{
	
	public int hp=0;
	public int mp=0;
	public int def=0;
	public int atk=0;
	public int round=1;
	public boolean result = false;

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
		hp = rdm.nextInt(100)+20;
		mp= rdm.nextInt(100)+35;
		def= rdm.nextInt(30)+1;
		atk= rdm.nextInt(100)+1;
		
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

	public void detail(){
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


class boss extends hero{
	
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
	
		int count =0;
		int MinRound = 0;
		int winner = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("產生的英雄數:");
		
		//	count = scanner.nextInt();

	    	
				hero1  HeroA = new hero1();
				HeroA.detail();
				System.out.println(" ");
				
			
	
	
		
		boss boss = new boss();
		boss.detail();



		System.out.println("============Battle Start=============");
        
		
		int rotation = 1;
		Random rdm = new Random();
		 



		//HeroA and boss
		
		System.out.print("Doraemon 體力"+boss.hp+" 魔力"+boss.mp);
		System.out.println(" Cloud 體力"+HeroA.hp+" 魔力"+HeroA.mp);

		while( HeroA.HP() > 0 && boss.HP() > 0){
		
	//		rotation = rdm.nextInt(10)+3;

			System.out.println("Round"+HeroA.round);

			if( rotation %2 == 1){//hero attack first
				//Hero part
				if( HeroA.MP() >= HeroA.skillmp ){
					if( HeroA.SKILL() ){

						System.out.print("Cloud 使用技能("+HeroA.skill+")攻擊力:"+HeroA.skillatk+" ");
						HeroA.mp -= HeroA.skillmp;

						if( (HeroA.skillatk - boss.def) > 0){
							boss.hp -= (HeroA.skillatk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp ==  0){
							System.out.println("Cloud win,Doraemon failure");
							HeroA.result = true;
							break;
						}
					
					}else{
						
						System.out.print("Cloud 普通攻擊"+HeroA.atk+" ");

						if( (HeroA.atk - boss.def) > 0){
							boss.hp -= (HeroA.atk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp == 0){
							System.out.println("Cloud win,Doraemon failure");
							HeroA.result = true;
							break;
						 }
					}
								
                }else{
						
						System.out.print("Cloud 普通攻擊"+HeroA.atk+" ");

						if( (HeroA.atk - boss.def) > 0){
							boss.hp -= (HeroA.atk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp == 0){
							System.out.println("Cloud win,Doraemon failure");
							HeroA.result = true;
							break;
						 }
					}
                
				//Boss part
				if( boss.MP() >= boss.skillmp ){
					if( boss.SKILL() ){

						System.out.print("Doraemon 使用技能("+boss.skill+")攻擊力:"+boss.skillatk+" ");
						boss.mp -= boss.skillmp;
						if(boss.mp < 0 ) boss.mp = 0;

						if( (boss.skillatk - HeroA.def) > 0){
							HeroA.hp -= (boss.skillatk - HeroA.def);
							if(HeroA.hp <= 0){
								HeroA.hp = 0;
							}
						}
						
						System.out.println(HeroA.toString());
						
						if( HeroA.hp ==  0){
							System.out.println("Cloud failure,Doraemon win");
							break;
						}
					
					}else{
						
						System.out.print("Doraemon 普通攻擊"+boss.atk+" ");

						if( (boss.atk - HeroA.def) > 0){
							HeroA.hp -= (boss.atk - HeroA.def);
							if(HeroA.hp <= 0){
								HeroA.hp = 0;
							}
						}
						
						System.out.println(HeroA.toString());
						
						if( HeroA.hp == 0){
							System.out.println("Cloud failure,Doraemon win");
							break;
						 }
					}
								
                }else{
						
						System.out.print("Doraemon 普通攻擊"+boss.atk+" ");

						if( (boss.atk - HeroA.def) > 0){
							HeroA.hp -= (boss.atk - HeroA.def);
							if(HeroA.hp <= 0){
								HeroA.hp = 0;
							}
						}
						
						System.out.println(HeroA.toString());
						
						if( HeroA.hp == 0){
							System.out.println("Cloud failure,Doraemon win");
							break;
						 }
					}

			}else if( rotation %2 == 0){//boss attack first
				//boss part
				if( boss.MP() >= boss.skillmp ){
					if( boss.SKILL() ){

						System.out.print("Doraemon 使用技能("+boss.skill+")攻擊力:"+boss.skillatk+" ");
						boss.mp -= boss.skillmp;
						if(boss.mp < 0 ) boss.mp = 0;

						if( (boss.skillatk - HeroA.def) > 0){
							HeroA.hp -= (boss.skillatk - HeroA.def);
							if(HeroA.hp <= 0){
								HeroA.hp = 0;
							}
						}
						
						System.out.println(HeroA.toString());
						
						if( HeroA.hp ==  0){
							System.out.println("Cloud failure,Doraemon win");
							break;
						}
					
					}else{
						
						System.out.print("Doraemon 普通攻擊"+boss.atk+" ");

						if( (boss.atk - HeroA.def) > 0){
							HeroA.hp -= (boss.atk - HeroA.def);
							if(HeroA.hp <= 0){
								HeroA.hp = 0;
							}
						}
						
						System.out.println(HeroA.toString());
						
						if( HeroA.hp == 0){
							System.out.println("Cloud failure,Doraemon win");
							break;
						 }
					}
								
                }else{
						
						System.out.print("Doraemon 普通攻擊"+boss.atk+" ");

						if( (boss.atk - HeroA.def) > 0){
							HeroA.hp -= (boss.atk - HeroA.def);
							if(HeroA.hp <= 0){
								HeroA.hp = 0;
							}
						}
						
						System.out.println(HeroA.toString());
						
						if( HeroA.hp == 0){
							System.out.println("Cloud failure,Doraemon win");
							break;
						 }
					}
				//Hero part
				if( HeroA.MP() >= HeroA.skillmp ){
					if( HeroA.SKILL() ){

						System.out.print("Cloud 使用技能("+HeroA.skill+")攻擊力:"+HeroA.skillatk+" ");
						HeroA.mp -= HeroA.skillmp;

						if( (HeroA.skillatk - boss.def) > 0){
							boss.hp -= (HeroA.skillatk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp ==  0){
							System.out.println("Cloud win,Doraemon failure");
							HeroA.result = true;
							break;
						}
					
					}else{
						
						System.out.print("Cloud 普通攻擊"+HeroA.atk+" ");

						if( (HeroA.atk - boss.def) > 0){
							boss.hp -= (HeroA.atk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp == 0){
							System.out.println("Cloud win,Doraemon failure");
							HeroA.result = true;
							break;
						 }
					}
								
                }else{
						
						System.out.print("Cloud 普通攻擊"+HeroA.atk+" ");

						if( (HeroA.atk - boss.def) > 0){
							boss.hp -= (HeroA.atk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp == 0){
							System.out.println("Cloud win,Doraemon failure");
							HeroA.result = true;
							break;
						 }
					}
			}

			HeroA.round++;
			rotation ++;
		}

		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");

}
}
