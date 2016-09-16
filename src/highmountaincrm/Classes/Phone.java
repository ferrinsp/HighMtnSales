package highmountaincrm.Classes;

import java.io.Serializable;

public class Phone implements Serializable{
	
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
            if (phoneNumber.length() >= 7)
                return type + ": " +"(" + phoneNumber.substring(0, 3) + ")" +
                        phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6);
            else
                return type + ": " + phoneNumber;
        }
}

