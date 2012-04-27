import java.util.*;


public class DataStation implements Observable{

	List<Observer> observers;
	
	float fdata;
	float sdata;
	
	public DataStation(){
		observers = new ArrayList<Observer>();	
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int value = observers.indexOf(o);
		if (value >= 0) 
			observers.remove(value);
	}

	@Override
	public void notifyObservers() {
		for (Observer o: observers){
			o.update(fdata, sdata);
		}
	}

	public void setData(float fdata, float sdata)
	{
		this.fdata = fdata;
		this.sdata = sdata;
		
		notifyObservers();
	}
}
