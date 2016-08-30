package highmountaincrm.Classes;

public class Order {

	public int orderId;
	public int orderAmount;
	public String orderNote;
	
	public int getOrderId(){
		return this.orderId;
	}
	public int getOrderAmount(){
		return this.orderAmount;
	}
	public String getOrderNote(){
		return this.orderNote;
	}
	public void setOrderNote(String setOrderNote){
            orderNote = setOrderNote;
        }
        public Order(){}
	public Order (int numOrder, int orderAmount, String orderNote) {
		this.orderId = numOrder;
		this.orderAmount = orderAmount;
		this.orderNote = orderNote;
	}
}
