package observer;

public class ObserverTest {
	public static void main(String []args){
		//�Զ���۲���ģʽ
		WeatherData mWeatherData=new WeatherData();
		ObserverDemo mObserverDemo=new ObserverDemo(mWeatherData);
		mWeatherData.setMeasurements(78, 25, 29.2f);
		//JDK�ṩ�Ĺ۲���ģʽ
		WeatherData2 mWeatherData2=new WeatherData2();
		ObserverDemo2 mObserverDemo2=new ObserverDemo2(mWeatherData2);
		mWeatherData2.setMeasurements(76, 26, 28.9f);
	}
}
