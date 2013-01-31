import java.util.Random;

public class Simulator {
	private Employee[] workers;
	
	public static void main(String[] args) {
		Simulator s = new Simulator();
	}
	
	public Simulator() {
		//Populates the Array
		workers = new Employee[6];
		for(int b=0; b<2; b++){
			workers[b] = new TastebudStylist();
		}
		for(int c=0; c<2; c++){
			workers[c+2] = new Shaker();
		}
		for(int d=0; d<2; d++){
			workers[d+4] = new Moover();
		}
		// @BC: What a great touch! Very nicely done, Sam.
		//Changing the first paramater of simulateTime will change the number of months (month = 4 weeks) simulated
		//Changing the second parameter changes the number of days per week they work
		simulateTime(6, 7);
	}
	
	public void simulateTime(int q, int g){
		//A different method for the sake of organization & easy parameter mutability
		
		for(int f=0; f<q; f++){
			//Month
			System.out.println("Month " + (f+1));
			for(int e=0; e<4; e++){
				//Week
				for(int i=0; i<g; i++){
					//Day
					action("work");
				}
				action("payday");
				System.out.println("");
			}
			Random r = new Random();
			int z = r.nextInt(6);
			workers[z].earnBonus();
			System.out.println((z+1) + ") " + workers[z].getJob() + " WON THE LINE DANCING CONTEST!");
			System.out.println("");
			System.out.println("");
		}
	}
	// @BC: Very interesting idea! Effective and nicely implemented.
	//		At some point it might be worth having a conversation about the stylistic choices here -- 
	//		there's a risk it will obfuscate functionality rather than simplify it.
	//		In this case, I think it works nicely.
	public void action(String s){
		//A different method for the sake of organization, s determines the action performed
		//Prints after the paycheck is earned
		for(int a=0; a<6; a++){
			if(s == "work"){
				workers[a].work();
			} else if(s == "payday"){
				workers[a].earnPaycheck();
				System.out.println((a+1) + ") " + workers[a]);
			}
		}
	}
}