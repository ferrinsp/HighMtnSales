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
        public String searchable;
        private static int columnLength = 30;
        
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
	public String getNote(){
		return notes;
	}
	public Phone getPhoneNumbers(int index) {
		return phoneList.get(index);
	}

	public void setName(String setName){
		name = setName;
                Contact.updateLength(name.length());
                updateSearch();
	}
	public void setCompany(String setCompanyName){
		company = setCompanyName;
                updateSearch();
	}
	public void setAddress(String setAddress){
		address = setAddress;
	}
	public void setCity(String setCity){
		city = setCity;
                updateSearch();
	}
	public void setState(String setState){
		state = setState;
	}
	public void setZipCode(String setZipCode){
		zipCode = setZipCode;
                updateSearch();
	}	
	public void setEmail(String setEmail){
		email = setEmail;
                updateSearch();
	}
	public void setNote(String setNote) {
		notes = setNote;
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
        @Override
        public String toString(){
            String display = name;
            while(display.length() < columnLength + 6){
                display += " ";
            }
            display += company;            
            System.out.println(display);//(name + " length: " + columnLength);
            return display;
        }
        public void updateSearch() {
            searchable = name + company + email + city + zipCode;
        }
        public static void updateLength(int setColumnLength) {
            columnLength = setColumnLength;
        }
        public String printableView() {
            StringBuilder builder = new StringBuilder();
            String NEW_LINE = System.getProperty("line.separator");
            builder.append("<html><header><h1>");
            builder.append("Customer Name: ").append(name).append(NEW_LINE);
            builder.append("</h1></header>");
            builder.append("<body>");
            builder.append("Company: ").append(company).append(NEW_LINE);
            builder.append("Address: ").append(address).append(NEW_LINE);
            builder.append("City: ").append(city).append(NEW_LINE);
            builder.append("State: ").append(state).append(NEW_LINE);
            builder.append("ZipCode: ").append(zipCode).append(NEW_LINE);
            builder.append("Email: ").append(email).append(NEW_LINE);
            builder.append("Notes: ").append(notes).append(NEW_LINE);
            builder.append("Phone: ").append(phoneList).append(NEW_LINE);
            builder.append("Order Information: ").append(orderList);
            builder.append("</body>");
            builder.append("</html>");
            return builder.toString();
        }        
}
