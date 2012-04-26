
public class Duck {

	protected FlyBehaviour flyBeh;
	protected QuackBehaviour quackBeh;
	
	public FlyBehaviour getFlybeh() {
		return flyBeh;
	}
	public void setFlybeh(FlyBehaviour flybeh) {
		this.flyBeh = flybeh;
	}
	
	public QuackBehaviour getQuackbeh() {
		return quackBeh;
	}
	public void setQuackbeh(QuackBehaviour quackbeh) {
		this.quackBeh = quackbeh;
	}
	
	public void performFly(){
		flyBeh.fly();
	}
	public void performQuack(){
		quackBeh.quack();
	}
	
}
