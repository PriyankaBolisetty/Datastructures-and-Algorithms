package cusutilities.cusdata;

public class PhoneNum {
    private Integer areaCode;
    private String localNum;

    public PhoneNum(Integer newAreaCode, String newLocalNum) {
        areaCode = newAreaCode;
        localNum = newLocalNum;
    }

    public String toString() {
        return "(" + areaCode + ")" + localNum;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaCode == null) ? 0 : areaCode.hashCode());
		result = prime * result + ((localNum == null) ? 0 : localNum.hashCode());
		return result;
	}
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		PhoneNum other = (PhoneNum) obj;
		if (areaCode == null) {
			if (other.areaCode != null)
				return false;
		} else if (!areaCode.equals(other.areaCode))
			return false;
		if (localNum == null) {
			if (other.localNum != null)
				return false;
		} else if (!localNum.equals(other.localNum))
			return false;
		return true;
	}
}