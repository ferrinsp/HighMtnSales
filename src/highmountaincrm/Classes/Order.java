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

	public int numOrder;
	public int orderAmount;
	public String orderNotes;
	
	public int getNumOrders(){
		return this.numOrder;
	}
	public int getOrderAmount(){
		return this.orderAmount;
	}
	public String getOrderNotes(){
		return this.orderNotes;
	}
	
	public Order (int numOrder, int orderAmount, String orderNotes) {
		this.numOrder = numOrder;
		this.orderAmount = orderAmount;
		this.orderNotes = orderNotes;
	}
}
