package observer;

import java.util.Observable;

public class WeatherData2 extends Observable{
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData2(){}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemp(){
		return temp;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}	
}
