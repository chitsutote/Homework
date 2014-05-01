import java.util.*;

abstract class hero{
	
	public int hp=0;
	public int mp=0;
	public int def=0;
	public int atk=0;

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
	
	private int temp;
	Random rdm = new Random();

	public hero1(){
		
		 
		hp = rdm.nextInt(100)+20;
		mp= rdm.nextInt(100)+30;
		def= rdm.nextInt(30)+1;
		atk= rdm.nextInt(100)+1;
		
		skill = "超究武神霸斬";
		skillatk = 60;
		skillmp = 30;
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
}

class hero2 extends hero{
	
	private int temp;
	Random rdm = new Random();
	
	public hero2(){
		
		 
		hp = rdm.nextInt(100)+20;
		mp= rdm.nextInt(100)+20;
		def= rdm.nextInt(30)+1;
		atk= rdm.nextInt(100)+1;
		
		skill = "蹦蹦蹦";
		skillatk = 35 ;
		skillmp = 20 ;
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
		if(dice % 5 == 0){
			return true;
		}else{
			return false;
		}
	}

	public void detail(){
		System.out.println("HeroB : Zack");
		System.out.println("體力值"+hp);
		System.out.println("魔力值"+mp);
		System.out.println("攻擊"+atk);
		System.out.println("防禦"+def);
		System.out.println("技能("+skill+") 對對手造成體力"+skillatk+"的傷害"+"/消耗魔力"+skillmp);
	}
	public String toString(){
		return "Zack"+" 體力剩下"+this.hp+" 防禦"+this.def+" 魔力"+this.mp;
	}
}

class hero3 extends hero{
	
	private int temp;
	Random rdm = new Random();

	public hero3(){
		
		 
		hp = rdm.nextInt(100)+20;
		mp= rdm.nextInt(100)+15;
		def= rdm.nextInt(30)+1;
		atk= rdm.nextInt(100)+1;

		skill = "八刀一閃";
	    skillatk = 40;
		skillmp = 15;
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
		System.out.println("HeroC : Sephiroth");
		System.out.println("體力值"+hp);
		System.out.println("魔力值"+mp);
		System.out.println("攻擊"+atk);
		System.out.println("防禦"+def);
		System.out.println("技能("+skill+") 對對手造成體力"+skillatk+"的傷害"+"/消耗魔力"+skillmp);
	}
	public String toString(){
		return "Sephiroth"+" 體力剩下"+this.hp+" 防禦"+this.def+" 魔力"+this.mp;
	}
}

class boss extends hero{
	
	public int temp=0;
	Random rdm = new Random();

	public boss(){
		
		 
		hp = rdm.nextInt(100)+55;
		mp= rdm.nextInt(85)+40;
		def= rdm.nextInt(30)+1;
		atk= rdm.nextInt(100)+1;

		temp = hp;

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

public class HW2_F74992231_v1{

	public static void main(String[] args){
	
		int count =0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("產生的英雄數:");
		
		while(true){
			count = scanner.nextInt();

			if( count < 3) {
				System.out.println("好像有點少喔!! 再多一點");
			}else{
				break;
			}
		}
	    	
				hero1  HeroA = new hero1();
				HeroA.detail();
				System.out.println(" ");
				
				hero2  HeroB = new hero2();   	
				HeroB.detail();
				System.out.println(" ");
			
				hero3  HeroC = new hero3();
				HeroC.detail();
				System.out.println(" ");
	
	for(int i = 3 ; i <= count ; i++){
			
			if( (i % 3) == 1){
				
				hero1  HeroD = new hero1();
				HeroD.detail();
				System.out.println(" ");
			}else if( (i % 3) == 2){
				
				hero2  HeroE = new hero2();   	
				HeroE.detail();
				System.out.println(" ");
			}else if( (i % 3) == 0){
			
				hero3  HeroF = new hero3();
				HeroF.detail();
				System.out.println(" ");
			}
		}
		
		boss boss = new boss();
		boss.detail();

		System.out.println("============Battle Start=============");
        
		
		int rotation = 0;
		Random rdm = new Random();
		 

		int round = 1;


		//HeroA and boss
		
		System.out.print("Doraemon 體力"+boss.hp+" 魔力"+boss.mp);
		System.out.println(" Cloud 體力"+HeroA.hp+" 魔力"+HeroA.mp);

		while( HeroA.HP() > 0 && boss.HP() > 0){
		
			rotation = rdm.nextInt(2)+1;

			System.out.println("Round"+round);

			if( rotation %2 == 1){//hero attack first
				//Hero part
				if( HeroA.MP() > HeroA.skillmp ){
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
							break;
						 }
					}
								
                }

				//Boss part
				if( boss.MP() > boss.skillmp ){
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
								
                }

			}else if( rotation %2 == 0){//boss attack first
				//boss part
				if( boss.MP() > boss.skillmp ){
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
								
                }
				//Hero part
				if( HeroA.MP() > HeroA.skillmp ){
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
							break;
						 }
					}
								
                }
			}

			round++;
		}

		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");

		round = 1;
		boss.hp=boss.temp;
		//HeroB and boss
		System.out.print("Doraemon 體力"+boss.hp+" 魔力"+boss.mp);
		System.out.println(" Zack 體力"+HeroB.hp+" 魔力"+HeroB.mp);

		while( HeroB.HP() > 0 && boss.HP() > 0){
		
			rotation = rdm.nextInt(2)+1;

			System.out.println("Round"+round);

			if( rotation %2 == 1){//hero attack first
				//Hero part
				if( HeroB.MP() > HeroB.skillmp ){
					if( HeroA.SKILL() ){

						System.out.print("Zack 使用技能("+HeroB.skill+")攻擊力:"+HeroB.skillatk+" ");
						HeroB.mp -= HeroB.skillmp;

						if( (HeroB.skillatk - boss.def) > 0){
							boss.hp -= (HeroB.skillatk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp ==  0){
							System.out.println("Zack win,Doraemon failure");
							break;
						}
					
					}else{
						
						System.out.print("Zack 普通攻擊"+HeroB.atk+" ");

						if( (HeroB.atk - boss.def) > 0){
							boss.hp -= (HeroB.atk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp == 0){
							System.out.println("Zack win,Doraemon failure");
							break;
						 }
					}
								
                }

				//Boss part
				if( boss.MP() > boss.skillmp ){
					if( boss.SKILL() ){

						System.out.print("Doraemon 使用技能("+boss.skill+")攻擊力:"+boss.skillatk+" ");
						boss.mp -= boss.skillmp;
						if(boss.mp < 0 ) boss.mp = 0;

						if( (boss.skillatk - HeroB.def) > 0){
							HeroB.hp -= (boss.skillatk - HeroB.def);
							if(HeroB.hp <= 0){
								HeroB.hp = 0;
							}
						}
						
						System.out.println(HeroB.toString());
						
						if( HeroB.hp ==  0){
							System.out.println("Zack failure,Doraemon win");
							break;
						}
					
					}else{
						
						System.out.print("Doraemon 普通攻擊"+boss.atk+" ");

						if( (boss.atk - HeroB.def) > 0){
							HeroB.hp -= (boss.atk - HeroB.def);
							if(HeroB.hp <= 0){
								HeroB.hp = 0;
							}
						}
						
						System.out.println(HeroB.toString());
						
						if( HeroB.hp == 0){
							System.out.println("Zack failure,Doraemon win");
							break;
						 }
					}
								
                }

			}else if( rotation %2 == 0){//boss attack first
				//boss part
				if( boss.MP() > boss.skillmp ){
					if( boss.SKILL() ){

						System.out.print("Doraemon 使用技能("+boss.skill+")攻擊力:"+boss.skillatk+" ");
						boss.mp -= boss.skillmp;
						if(boss.mp < 0 ) boss.mp = 0;

						if( (boss.skillatk - HeroB.def) > 0){
							HeroB.hp -= (boss.skillatk - HeroB.def);
							if(HeroB.hp <= 0){
								HeroB.hp = 0;
							}
						}
						
						System.out.println(HeroB.toString());
						
						if( HeroB.hp ==  0){
							System.out.println("Zack failure,Doraemon win");
							break;
						}
					
					}else{
						
						System.out.print("Doraemon 普通攻擊"+boss.atk+" ");

						if( (boss.atk - HeroB.def) > 0){
							HeroB.hp -= (boss.atk - HeroB.def);
							if(HeroB.hp <= 0){
								HeroB.hp = 0;
							}
						}
						
						System.out.println(HeroB.toString());
						
						if( HeroB.hp == 0){
							System.out.println("Zack failure,Doraemon win");
							break;
						 }
					}
								
                }
				//Hero part
				if( HeroB.MP() > HeroB.skillmp ){
					if( HeroB.SKILL() ){

						System.out.print("Zack 使用技能("+HeroB.skill+")攻擊力:"+HeroB.skillatk+" ");
						HeroB.mp -= HeroB.skillmp;

						if( (HeroB.skillatk - boss.def) > 0){
							boss.hp -= (HeroB.skillatk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp ==  0){
							System.out.println("Zack win,Doraemon failure");
						}
					
					}else{
						
						System.out.print("Zack 普通攻擊"+HeroB.atk+" ");

						if( (HeroB.atk - boss.def) > 0){
							boss.hp -= (HeroB.atk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp == 0){
							System.out.println("Zack win,Doraemon failure");
							break;
						 }
					}
								
                }
			}

			round++;
		}
		//End
		

                System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");

		round = 1;
		boss.hp=boss.temp;
		//HeroC and boss
		System.out.print("Doraemon 體力"+boss.hp+" 魔力"+boss.mp);
		System.out.println(" Sephiroth 體力"+HeroC.hp+" 魔力"+HeroC.mp);

		while( HeroC.HP() > 0 && boss.HP() > 0){
		
			rotation = rdm.nextInt(2)+1;

			System.out.println("Round"+round);

			if( rotation %2 == 1){//hero attack first
				//Hero part
				if( HeroC.MP() > HeroC.skillmp ){
					if( HeroA.SKILL() ){

						System.out.print("Sephiroth 使用技能("+HeroC.skill+")攻擊力:"+HeroC.skillatk+" ");
						HeroC.mp -= HeroC.skillmp;

						if( (HeroC.skillatk - boss.def) > 0){
							boss.hp -= (HeroC.skillatk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp ==  0){
							System.out.println("Sephiroth win,Doraemon failure");
							break;
						}
					
					}else{
						
						System.out.print("Sephiroth 普通攻擊"+HeroC.atk+" ");

						if( (HeroC.atk - boss.def) > 0){
							boss.hp -= (HeroC.atk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp == 0){
							System.out.println("Sephiroth win,Doraemon failure");
							break;
						 }
					}
								
                }

				//Boss part
				if( boss.MP() > boss.skillmp ){
					if( boss.SKILL() ){

						System.out.print("Doraemon 使用技能("+boss.skill+")攻擊力:"+boss.skillatk+" ");
						boss.mp -= boss.skillmp;
						if(boss.mp < 0 ) boss.mp = 0;

						if( (boss.skillatk - HeroC.def) > 0){
							HeroC.hp -= (boss.skillatk - HeroC.def);
							if(HeroC.hp <= 0){
								HeroC.hp = 0;
							}
						}
						
						System.out.println(HeroC.toString());
						
						if( HeroC.hp ==  0){
							System.out.println("Sephiroth failure,Doraemon win");
							break;
						}
					
					}else{
						
						System.out.print("Doraemon 普通攻擊"+boss.atk+" ");

						if( (boss.atk - HeroC.def) > 0){
							HeroC.hp -= (boss.atk - HeroC.def);
							if(HeroC.hp <= 0){
								HeroC.hp = 0;
							}
						}
						
						System.out.println(HeroC.toString());
						
						if( HeroC.hp == 0){
							System.out.println("Sephiroth failure,Doraemon win");
							break;
						 }
					}
								
                }

			}else if( rotation %2 == 0){//boss attack first
				//boss part
				if( boss.MP() > boss.skillmp ){
					if( boss.SKILL() ){

						System.out.print("Doraemon 使用技能("+boss.skill+")攻擊力:"+boss.skillatk+" ");
						boss.mp -= boss.skillmp;
						if(boss.mp < 0 ) boss.mp = 0;

						if( (boss.skillatk - HeroC.def) > 0){
							HeroC.hp -= (boss.skillatk - HeroC.def);
							if(HeroC.hp <= 0){
								HeroC.hp = 0;
							}
						}
						
						System.out.println(HeroC.toString());
						
						if( HeroC.hp ==  0){
							System.out.println("Sephiroth failure,Doraemon win");
							break;
						}
					
					}else{
						
						System.out.print("Doraemon 普通攻擊"+boss.atk+" ");

						if( (boss.atk - HeroC.def) > 0){
							HeroC.hp -= (boss.atk - HeroC.def);
							if(HeroC.hp <= 0){
								HeroC.hp = 0;
							}
						}
						
						System.out.println(HeroC.toString());
						
						if( HeroC.hp == 0){
							System.out.println("Sephiroth failure,Doraemon win");
							break;
						 }
					}
								
                }
				//Hero part
				if( HeroC.MP() > HeroC.skillmp ){
					if( HeroC.SKILL() ){

						System.out.print("Sephiroth 使用技能("+HeroC.skill+")攻擊力:"+HeroC.skillatk+" ");
						HeroC.mp -= HeroC.skillmp;

						if( (HeroC.skillatk - boss.def) > 0){
							boss.hp -= (HeroC.skillatk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp ==  0){
							System.out.println("Sephiroth win,Doraemon failure");
						}
					
					}else{
						
						System.out.print("Sephiroth 普通攻擊"+HeroC.atk+" ");

						if( (HeroC.atk - boss.def) > 0){
							boss.hp -= (HeroC.atk - boss.def);
							if(boss.hp <= 0){
								boss.hp = 0;
							}
						}
						
						System.out.println(boss.toString());
						
						if( boss.hp == 0){
							System.out.println("Sephiroth win,Doraemon failure");
							break;
						 }
					}
								
                }
			}

			round++;
		}
		//End	
	}

}
