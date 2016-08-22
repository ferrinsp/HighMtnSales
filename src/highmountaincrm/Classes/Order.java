/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highmountaincrm.Classes;

/**
 *
 * @author ferrinsp
 */
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
	
	public Order (int numOrder, int orderAmount, String orderNotes) {
		this.orderId = numOrder;
		this.orderAmount = orderAmount;
		this.orderNote = orderNotes;
	}
}
