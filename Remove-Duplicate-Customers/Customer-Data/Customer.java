package cusutilities.cusdata;

public class Customer {
    private Name name;
    private PhoneNum phone;

    public Customer(Name cusName, PhoneNum cusPhone) {
        name = cusName;
        phone = cusPhone;
    }

    public Name getName() {
        return name;
    }

    public PhoneNum getPhone() {
        return phone;
    }

    public String toString() {
        return "Customer: " + name + "  " + phone;
    }

    public void print() {
        System.out.println(this);
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
    
    @Override
    public boolean equals(Object otherObj){
    	Customer otherCustomer = (Customer)otherObj;
    	
    	if(!(otherCustomer instanceof Customer)){
    		return false;
    	}
    	return getName().equals(otherCustomer.getName()) && getPhone().equals(otherCustomer.getPhone());
    }
}