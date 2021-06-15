package project;

public class Elective extends Lecture {
	private int electiveCredit;
	// method that number of electiveCredit is 2 or 3 
	public void Credit(){
		int count = 0;
		for (int i=0; i<super.getPeriod().length(); i++) {
			try{
				count += Character.getNumericValue(super.getPeriod().charAt(i));
			} catch (Exception e) {

			}
		}
		if (count > 2) {
			this.setElectiveCredit(3);
		} else {
			this.setElectiveCredit(2);
		}	
	}
	public int getElectiveCredit() {
		return electiveCredit;
	}
	public void setElectiveCredit(int electiveCredit) {
		this.electiveCredit = electiveCredit;
	}
}
