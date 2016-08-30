package cusutils.cusData;

public class Name {
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
        return firstName;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
    
    @Override
    public boolean equals(Object otherObj) {
		if(otherObj == null){
			return false;
		} 
		if(this == otherObj){
			return true;
		}
		
		Name otherName = (Name)otherObj;
		if(!(otherName instanceof Name)){
			return false;
		}
		return getFirstName().equals(otherName.getFirstName()) && getLastName().equals(otherName.getLastName());
	}
}