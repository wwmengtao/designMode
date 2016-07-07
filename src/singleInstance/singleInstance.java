package singleInstance;

public class singleInstance {
	public static volatile singleInstance mSingleInstance;//为什么加volatile？提示：双重检查锁定
	
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
