import java.util.*;

abstract class hero{
	
	public int hp=0;
	public int mp=0;
	public int def=0;
	public int atk=0;


	public abstract int HP();
	public abstract int MP();
	public abstract int DEF();
	public abstract int ATK();
	public abstract void SKILL();
}

class hero1 extends hero{
	
	private int temp;

	public hero1(){
		Random rdm = new Random();
		
		 
		hp = rdm.nextInt(100)+1;
		mp= rdm.nextInt(100)+1;
		def= rdm.nextInt(100)+1;
		atk= rdm.nextInt(100)+1;
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
	public void SKILL(){}

	public void detail(){
		System.out.println("HeroA : Cloud");
		System.out.println("體力值"+hp);
		System.out.println("魔力值"+mp);
		System.out.println("攻擊"+atk);
		System.out.println("防禦"+def);
	}
	public String toString(){
		return "Cloud"+" 體力"+this.hp+" 魔力"+this.mp;
	}
}

class hero2 extends hero{
	
	private int temp;

	public hero2(){
		Random rdm = new Random();
		
		 
		hp = rdm.nextInt(100)+1;
		mp= rdm.nextInt(100)+1;
		def= rdm.nextInt(100)+1;
		atk= rdm.nextInt(100)+1;
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
	public void SKILL(){}

	public void detail(){
		System.out.println("HeroB : Zack");
		System.out.println("體力值"+hp);
		System.out.println("魔力值"+mp);
		System.out.println("攻擊"+atk);
		System.out.println("防禦"+def);
	}
	public String toString(){
		return "Zack"+" 體力"+this.hp+" 魔力"+this.mp;
	}
}

class hero3 extends hero{
	
	private int temp;

	public hero3(){
		Random rdm = new Random();
		
		 
		hp = rdm.nextInt(100)+1;
		mp= rdm.nextInt(100)+1;
		def= rdm.nextInt(100)+1;
		atk= rdm.nextInt(100)+1;
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
	public void SKILL(){}

	public void detail(){
		System.out.println("HeroC : Sephiroth");
		System.out.println("體力值"+hp);
		System.out.println("魔力值"+mp);
		System.out.println("攻擊"+atk);
		System.out.println("防禦"+def);
	}
	public String toString(){
		return "Sephiroth"+" 體力"+this.hp+" 魔力"+this.mp;
	}
}

class boss extends hero{
	
	private int temp;

	public boss(){
		Random rdm = new Random();
		
		 
		hp = rdm.nextInt(100)+1;
		mp= rdm.nextInt(100)+1;
		def= rdm.nextInt(100)+1;
		atk= rdm.nextInt(100)+1;
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
	public void SKILL(){}

	public void detail(){
		System.out.println("Boss : Doraemon");
		System.out.println("體力值"+hp);
		System.out.println("魔力值"+mp);
		System.out.println("攻擊"+atk);
		System.out.println("防禦"+def);
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
	
	for(int i = 1 ; i <= count-3 ; i++){
			
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

	}

}
