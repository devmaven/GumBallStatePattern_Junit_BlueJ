

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(CoinValue coin) {
		gumballMachine.getHasCoinState().insertCoin(coin);
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a Coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no Coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for Coins";
	}
	
	public void takeGumball(){
	    System.out.println("No Gumball. You need to pay first");
	}
}
