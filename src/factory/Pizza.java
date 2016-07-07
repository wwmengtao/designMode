package factory;

import designmode.tools.ALog;

public class Pizza {
	public String description;
	public void prepare(){
		ALog.Log(description+":prepare");
	}
	
	public void bake(){
		ALog.Log(description+":bake");
	}
	
	public void cut(){
		ALog.Log(description+":cut");
	}	
	
	public void box(){
		ALog.Log(description+":box");
	}	
	
	public String getDescription(){
		return description;
	}
}
