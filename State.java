

public interface State {
 
	public void insertCoin(CoinValue coin);
	public void ejectCoin();
	public void turnCrank();
	public void dispense();
	//public void hasGumball();
	public void takeGumball();
}
