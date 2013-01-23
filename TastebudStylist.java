public class TastebudStylist extends Employee {
	public TastebudStylist(){
		super(300, "Stylist");
	}

	public void work(){
		makeShake();
	}
	
	public void makeShake(){
		if(calculateChance(90)){
			changeMulitplier(0.1);
		} else {
			setMultiplier(1);
		}
	}
	
	public void earnBonus(){
		setPay(200);
	}
}