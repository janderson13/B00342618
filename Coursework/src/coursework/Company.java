package coursework;

import java.util.Comparator;

public class Company{
    private String projectName;
    private String startDateString;
    private String endDateString;
  
    public Company(String projectName,  String startDateString, String endDateString){
    	this.projectName = projectName;
        this.startDateString = startDateString;
        this.endDateString = endDateString; 
        
    }	
    public String toString() {
    	String projectDetails = new String();
    	
    	projectDetails = String.format("%-25s%-15s%-15s\n", this.projectName, this.startDateString, this.endDateString);
    	return projectDetails; 
    }
    public String getName() {
		return projectName;	
    }
    	
    
	public static Comparator<Company> ProjectComparator = new Comparator<Company>() {
		@Override
		public int compare(Company s1, Company s2) {
			String projectname1 = s1.getName().toUpperCase();
			String projectname2 = s2.getName().toUpperCase();
			
			return projectname1.compareTo(projectname2);
		}
	
	};
   
}