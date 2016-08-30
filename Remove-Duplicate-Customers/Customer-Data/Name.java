package cusutilities.cusdata;

public class Name implements Comparable<Name>{
    private String lastName;
    private String firstName;

    public Name(String lName, String fName) {
        lastName = lName;
        firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return lastName;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
    
    @Override
    public boolean equals(Object otherObj){
    	
    	if(otherObj == null){
    		return false;
    	}
    	Name otherName = (Name)otherObj;
    	
    	if(!(otherName instanceof Name)){
    		return false;
    	}
    	return getFirstName().equals(otherName.getFirstName()) && getLastName().equals(otherName.getLastName());
    }
    
    @Override
    public int compareTo(Name otherName){
    	int diff = getFirstName().compareTo(otherName.getFirstName());
    	if(diff != 0){
    		return diff;
    	}
    	diff = getLastName().compareTo(otherName.getLastName());
    	return diff;
    }
}