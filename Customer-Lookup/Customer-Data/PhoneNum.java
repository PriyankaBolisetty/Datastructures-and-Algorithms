package cusutils.cusData;

public class PhoneNum {
    private int areaCode;
    private String localNum;

    public PhoneNum(int newAreaCode, String newLocalNum) {
        areaCode = newAreaCode;
        localNum = newLocalNum;
    }

    public String toString() {
        return "(" + areaCode + ")" + localNum;
    }
    
    @Override
    public boolean equals(Object otherObj) {
		if(otherObj == null){
			return false;
		} 
		if(this == otherObj){
			return true;
		}
		
		PhoneNum otherPhone = (PhoneNum)otherObj;
		if(!(otherPhone instanceof PhoneNum)){
			return false;
		}
		return areaCode == otherPhone.areaCode && localNum.equals(otherPhone.localNum);
	}
}