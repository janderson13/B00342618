package Step2;

import java.util.ArrayList;
import java.util.Arrays;

public class TeamMemberList {
	
	private String memberName;
	private Integer empNumber;
	private String division;
	
	public TeamMemberList(String memberName, Integer empNumber, String division) {
		this.memberName = memberName;
		this.empNumber = empNumber;
		this.division = division;
				
	}
    public String toString() {
    	String memberArray = new String();
    	memberArray = String.format("%-25s%-15s%-15s\n", this.memberName, this.empNumber, this.division);
    	return memberArray; 
    }

}
