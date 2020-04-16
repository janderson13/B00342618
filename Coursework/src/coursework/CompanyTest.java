package coursework;


import java.text.ParseException;

import java.util.ArrayList;
import java.util.Collections;

public class CompanyTest{

	public static void main(String[] args) throws ParseException {
    	ArrayList<Company> projectArray = new ArrayList<Company>();
        String projectName;
        Integer startDate, endDate;
        Integer option = 0;
        Integer id = 0;
        
        do{ 
        	try {
        	
        	Collections.sort(projectArray, Company.ProjectComparator);
        	System.out.println("\n");
            System.out.println("0: Quit");
            System.out.println("1: Add Project");
            System.out.println("2: Find Project");
            System.out.println("3: Remove Project");
            System.out.println("4: Display Projects");
            option = Input.getInteger("Option: ");
        	
            
            switch (option) {
            	
                case 0:
                	
                    System.out.println("Quitting Program...");
                    System.exit(0);
                    
                case 1:
                	
                    projectName = Input.getString("Project Name: ");
                    startDate = Input.getInteger("Projected Start Date(dd/MM/YY): ");
                    endDate = Input.getInteger("Projected End Date(dd/MM/YY): ");
                    id = id+ 1;
                    Company projectDetails = new Company(projectName, startDate, endDate);
                    projectArray.add((projectDetails));
                    break;
                	
                	//catch(NumberFormatException error) {
                    	//System.out.println("Please enter a number"); 
                	
                case 2:
                	int projectSearch = 0;
                    System.out.format("%-10s%-25s%-15s%-15s\n","ID",  "Project Name", "Start Date", "End Date");
                    
                
                    for(int i = 0;i < projectArray.size(); i++)
                    	System.out.println(i + "          " + projectArray.get(i));
                	projectSearch =Input.getInteger("Project ID: ");
                	
                	if (projectArray.size()> 0) {
                		System.out.println("Project details for project: " + projectSearch);
                		System.out.format("%-10s%-25s%-15s%-15s\n","ID",  "Project Name", "Start Date", "End Date");
                		System.out.println(projectSearch + "          " + projectArray.get(projectSearch));
                		break;
                	}
                	else {
                		System.out.println("No projects with that ID");
                		break;
                	}
                	
                case 3:
                	int projectRemove;
                	System.out.format("%-10s%-25s%-15s%-15s\n","ID",  "Project Name", "Start Date", "End Date");
                    for(int i = 0;i < projectArray.size(); i++)
                    	System.out.println(i + "          " + projectArray.get(i));
                	projectRemove =Input.getInteger("Project ID: ");
                	projectArray.remove(projectRemove);
                		break;
                	
                case 4:
                	if (projectArray.size() < 1){
                        System.out.println("There are no projects in the system.");
                    }
                    else{
                        System.out.format("%-10s%-25s%-15s%-15s\n","ID",  "Project Name", "Start Date", "End Date");
                        
                    }
                	for(int i = 0;i < projectArray.size(); i++)
                		System.out.println(i + "          " + projectArray.get(i));
                    break;
                default:
                	System.out.println("Invalid option");
            }
            }
        	catch(NumberFormatException error) {
        	System.out.println("");	
        	System.out.println("Please enter a number");
        	option = 10;
        	}
        
        }
        while (option !=0);
        }
	}
