package coursework;

import java.util.ArrayList;
import java.util.Arrays;

public class CompanyList{
	public Company[] projects;
	private ArrayList<String> projectArray = new ArrayList<String>();
	
	int size;
	
	public CompanyList(Integer size) {
		this.projects = new Company[size];
		this.size=0;
	}
	

	public String toString() {
		String projectDetails = new String();
		if(this.size!=0) {
            for (Integer index = 0; index < this.size; index++)
                projectDetails += this.projects[index] + "\n";
		}
        else
            projectDetails+="There are no projects in the system";
		
		return projectDetails;
	}
	

}