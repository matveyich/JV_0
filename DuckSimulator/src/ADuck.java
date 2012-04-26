
public class ADuck extends Duck {

	public ADuck() {
		flyBeh = new FlyToSky();
		setQuackbeh(new QuakWithSound());
	}
	
}
