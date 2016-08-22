package highmountaincrm.Classes;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	
	public String name;
	public String companyName;
	public String address;
	public String city;
	public String state;
	public String zipCode;	
	public String customerEmail;
	public String customerNotes;
		
	List<Phone> phoneList = new ArrayList<>();
        private List<Order> orderList = new ArrayList<>();
        
	public String getName(){
		return name;
	}
	public String getCompanyName(){
		return companyName;
	}
	public String getAddress(){
		return address;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public String getZipCode(){
		return zipCode;
	}
	public String getCustomerEmail(){
		return customerEmail;
	}
	public String getCustomerNotes(){
		return customerNotes;
	}
	public Phone getPhoneNumbers(int index) {
		return phoneList.get(index);
	}
	
	public void setName(String setName){
		name = setName;
	}
	public void setCompanyName(String setCompanyName){
		companyName = setCompanyName;
	}
	public void setAddress(String setAddress){
		address = setAddress;
	}
	public void setCity(String setCity){
		city = setCity;
	}
	public void setState(String setState){
		state = setState;
	}
	public void setZipCode(String setZipCode){
		zipCode = setZipCode;
	}	
	public void setCustomerEmail(String setCustomerEmail){
		customerEmail = setCustomerEmail;
	}
	public void setCustomerNotes(String setCustomerNotes) {
		customerNotes = setCustomerNotes;
	}
        public void setPhoneList(List<Phone> phoneList){
            this.phoneList = phoneList;
        }
        public List<Phone> getPhoneList(){
            return phoneList;
        }

    public List<Order> getOrderList() {
        return orderList;
    }
    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}



























