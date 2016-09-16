package highmountaincrm.Classes;

import java.io.Serializable;
import java.util.Objects;

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
        public String toString(){
            return "Order Number: " + orderId + ", Order Amount: " + orderAmount;
        }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.orderId, other.orderId)) {
            return false;
        }
        if (!Objects.equals(this.orderAmount, other.orderAmount)) {
            return false;
        }
        if (!Objects.equals(this.orderNote, other.orderNote)) {
            return false;
        }
        return true;
    }
        
}
