import java.util.Random;

public abstract class Employee {
	private double multiplier;
	private int basePay;
	private int totalPay;
	private String job;
	
	public Employee(int n, String s){
		basePay = n;
		multiplier = 1.0;
		totalPay = 0;
		job = s;
	}
	
	public abstract void work();
	
	public abstract void earnBonus();
	
	public boolean calculateChance(int n){
		Random r = new Random();
		int i = r.nextInt(100);
		return i <= n;
	}
	
	public void earnPaycheck(){
		totalPay += (basePay*multiplier);
	}
		
	public void roundMultiplier(){
		//Only called by toString
		multiplier = (multiplier*100);
		multiplier = Math.round(multiplier);
		multiplier = (multiplier/100);
	}
	
	public String toString(){
		roundMultiplier();
		return job + ", Salary: " + basePay + ", Multiplier:" + multiplier + ", Total Pay : " + totalPay; 
	}
	
	public void changeMulitplier(double n){
		multiplier = multiplier + n;
	}
	
	public void setMultiplier(int s){
		multiplier = s;
	}
	
	public void setPay(int n){
		totalPay += n;
	}
	
	public String getJob(){
		return job;
	}
	
}
	
	