package highmountaincrm.Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact implements Serializable {
	
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
        public void addOrder(Order o){
            orderList.add(o);
        }
        @Override
        public String toString(){
            String display = name;
            while(display.length() < columnLength + 6){
                display += " ";
            }
            display += company;            
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
        public String htmlView() {
            StringBuilder builder = new StringBuilder();
            String NEW_LINE = "<br>";
            builder.append("<html><header><h3>");
            builder.append("Customer Name: ").append(name).append(NEW_LINE);
            builder.append("</h3></header>");
            builder.append("<body>");
            if(company != null && !company.isEmpty()) builder.append("Company: ").append(company).append(NEW_LINE);
            if(address != null && !address.isEmpty()) builder.append("Address: ").append(address).append(NEW_LINE);
            if(city != null && !city.isEmpty()) builder.append("City: ").append(city).append(NEW_LINE);
            if(state != null && !state.isEmpty()) builder.append("State: ").append(state).append(NEW_LINE);
            if(zipCode != null && !zipCode.isEmpty()) builder.append("ZipCode: ").append(zipCode).append(NEW_LINE);
            if(email != null && !email.isEmpty()) builder.append("Email: ").append(email).append(NEW_LINE);
            if(notes != null && !notes.isEmpty()) builder.append("Notes: ").append(notes).append(NEW_LINE);
            if(!phoneList.isEmpty()){
                builder.append("<h4>Phone Numbers: </h4>");
                for(Phone p : phoneList)
                    builder.append(p).append(NEW_LINE);
            }
            //builder.append("Order Information: ").append(orderList);
            builder.append("</body>");
            builder.append("</html>");
            return builder.toString();
        }  
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        return true;
    }
        
}
