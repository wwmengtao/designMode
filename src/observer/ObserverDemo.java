package observer;

import designmode.tools.ALog;

public class ObserverDemo implements ObserverSelf,DisplayElement{
	Subject mWeatherData;
	private float temp;
	private float humidity;
	public ObserverDemo(Subject subj){
		mWeatherData=subj;
		mWeatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		ALog.Log("ObserverDemo_display\ntemp:"+temp+" humidity:"+humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		//这样会使得观察者不想获取的数据也被推送过来
		this.temp=temp;
		this.humidity=humidity;
		display();
	}

}
