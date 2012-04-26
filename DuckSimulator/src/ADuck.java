
public class ADuck extends Duck {

	public ADuck() {
		flyBeh = new FlyToSky();
		quackBeh = new QuakWithSound();
	}
	
}
