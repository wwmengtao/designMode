package observer;

public class ObserverTest {
	public static void main(String []args){
		//自定义观察者模式
		WeatherData mWeatherData=new WeatherData();
		ObserverDemo mObserverDemo=new ObserverDemo(mWeatherData);
		mWeatherData.setMeasurements(78, 25, 29.2f);
		//JDK提供的观察者模式
		WeatherData2 mWeatherData2=new WeatherData2();
		ObserverDemo2 mObserverDemo2=new ObserverDemo2(mWeatherData2);
		mWeatherData2.setMeasurements(76, 26, 28.9f);
	}
}
