public class Moover extends Employee {
	public Moover(){
		super(200, "Moover");
	}
	
	public void work(){
		takeOrder();
		deliverShake();
	}
	
	public void takeOrder(){
		if(calculateChance(80)){
			changeMulitplier(0.05);
		} else {
			changeMulitplier(0.1);
		}
	}
	
	public void deliverShake(){
		if(calculateChance(95)){
			changeMulitplier(0.03);
		} else {
			changeMulitplier(0.1);
		}
	}
	
	public void earnBonus(){
		setPay(150);
	}
}