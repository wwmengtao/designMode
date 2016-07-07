package factory;
import designmode.tools.ALog;

//����ͨ�ò�Ʒ��
class ConcreteProduct implements ProductInterface{
	String name;
	float mCost;
	public ConcreteProduct(String name,float cost){
		setCost(cost);
		setName(name);
	}
	public void setCost(float fl){
		mCost = fl;
	}
	public void setName(String str){
		name=str;
	}
	public void show(){
		ALog.Log(name+" Cost:"+mCost);
	}
}