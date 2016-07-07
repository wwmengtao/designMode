package factory;

import designmode.tools.ALog;

	//定义抽象工厂产品实例
	class ConcreteProductAF2 implements ProductInterfaceAF2{
		String name;
		float mCost;
		
		public ConcreteProductAF2(String str,float fl){
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
