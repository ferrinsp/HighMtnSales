package highmountaincrm.Classes;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	
	public String name;
	public String company;
	public String address;
	public String city;
	public String state;
	public String zipCode;	
	public String email;
	public String notes;
		
	private List<Phone> phoneList = new ArrayList<>();
        private List<Order> orderList = new ArrayList<>();
        
	public String getName(){
		return name;
	}
	public String getCompany(){
		return company;
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
	public String getEmail(){
		return email;
	}
	public String getCustomerNotes(){
		return notes;
	}
	public Phone getPhoneNumbers(int index) {
		return phoneList.get(index);
	}
	
	public void setName(String setName){
		name = setName;
	}
	public void setCompany(String setCompanyName){
		company = setCompanyName;
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
	public void setEmail(String setCustomerEmail){
		email = setCustomerEmail;
	}
	public void setCustomerNotes(String setCustomerNotes) {
		notes = setCustomerNotes;
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



























