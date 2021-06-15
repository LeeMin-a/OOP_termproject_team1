package project;

public class Major extends Lecture {
	private int majorCredit;
	//method that number of electiveCredit is 2 or 3
	public void Credit(){
		int count = 0;
		for (int i=0; i<super.getPeriod().length(); i++) {
			try{
				count += Character.getNumericValue(super.getPeriod().charAt(i));
			} catch (Exception e) {
				
			}
		}
		if (count > 2) {
			this.majorCredit = 3;
		} else {
			this.majorCredit = 2;
		}
	}

	public int getMajorCredit() {
		return electiveCredit;
	}
	public void setMajorCredit(int majorCredit) {
		this.majorCredit = majorCredit;
	}
}
