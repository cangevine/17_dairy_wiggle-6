public class Shaker extends Employee {
	public Shaker(){
		super(100, "Shaker");
	}
		
	public void work(){
		shake();
	}
	
	public void shake(){
		changeMulitplier(0.2);
	}
	
	public void earnBonus(){
		setPay(100);
	}
}