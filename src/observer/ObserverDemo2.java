package observer;

import java.util.Observable;
import java.util.Observer;

import designmode.tools.ALog;

public class ObserverDemo2 implements Observer{
	Observable mObservable;
	private float temp;
	private float humidity;
	public ObserverDemo2(Observable obs){
		mObservable=obs;
		mObservable.addObserver(this);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof WeatherData2){
			WeatherData2 mWeatherData2=(WeatherData2)arg0;
			temp=mWeatherData2.getTemp();
			humidity=mWeatherData2.getHumidity();
			display();
		}
	}

	public void display() {
		// TODO Auto-generated method stub
		ALog.Log("ObserverDemo2_display\ntemp:"+temp+" humidity:"+humidity);
	}
}
