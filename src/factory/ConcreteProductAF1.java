package factory;

import designmode.tools.ALog;

	//定义抽象工厂产品实例
	class ConcreteProductAF1 implements ProductInterfaceAF1{
		String name;
		float mCost;
		
		public ConcreteProductAF1(String str,float fl){
			setName(str);
			setCost(fl);
		}
		
		public void setCost(float fl) {
			mCost=fl;
		}
	
		public void setName(String str) {
			name=str;
		}
	
		public void show() {
			ALog.Log(name+" Cost:"+mCost);
		}
	}
