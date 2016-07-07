package factory;

import designmode.tools.ALog;

	//������󹤳���Ʒʵ��
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
