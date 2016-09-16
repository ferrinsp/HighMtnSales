package highmountaincrm.Classes;

import java.io.Serializable;

public class Order implements Serializable {

	public String orderId;
	public String orderAmount;
	public String orderNote = "";
	
	public String getOrderId(){
		return this.orderId;
	}
	public String getOrderAmount(){
		return this.orderAmount;
	}
	public String getOrderNote(){
		return this.orderNote;
	}
	public void setOrderNote(String setOrderNote){
            orderNote = setOrderNote;
        }
        
	public Order (String numOrder, String orderAmount) {
		this.orderId = numOrder;
		this.orderAmount = orderAmount;
	}
}
