package highmountaincrm.Classes;

public class Phone {
	
	public String phoneNumber;
	public String type;

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getType() {
		return phoneNumber;
        }
	public Phone(String phoneNumber, String type) {
		this.phoneNumber = phoneNumber;
		this.type = type;
	}	
        public String toString(){
            return type + ": " +"(" + phoneNumber.substring(0, 3) + ")" +
                    phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6);
        }
}

