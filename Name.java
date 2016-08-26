package practicePrograms;

public class Name {
	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode(){
		return (firstName.hashCode() + lastName.hashCode()) * 31;
	}
	
	@Override
	public boolean equals(Object otherObj){
		Name otherName;
		otherName = (Name)otherObj;
		
		if(!(otherName instanceof Name)){
			return false;
		}
		return this.firstName.equals(otherName.getFirstName()) && this.lastName.equals(otherName.getLastName());
	}
	
	public String toString(){
		return firstName + " " + lastName;
	}
}
