package singleInstance;

public class singleInstance {
	public static volatile singleInstance mSingleInstance;//Ϊʲô��volatile����ʾ��˫�ؼ������
	
	private singleInstance(){}
	
	public static singleInstance getInstance(){
		if(null == mSingleInstance){
			synchronized(singleInstance.class){
				if(null == mSingleInstance){
					mSingleInstance = new singleInstance();
				}
			}
		}

		return mSingleInstance;
	}
	public static void main(String []args){
		singleInstance mSingleInstance = singleInstance.getInstance();
	}
}
