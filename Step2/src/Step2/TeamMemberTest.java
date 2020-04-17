package Step2;
import java.util.Arrays;

public class TeamMemberTest {
	private static Object memberArray[];
	public static void main(String[] args) {
		TeamMember array = new TeamMember();
		Integer option;
		String memberName , division;
		Integer empNumber;
		Integer id = 0;
		Integer index, input;
		memberArray = new Object[4];
		
		
        do{ 
        	try {
        	
        	
            System.out.println("\n");
            System.out.println("0: Quit");
            System.out.println("1: Add Member");
            System.out.println("2: Display All Members");
            System.out.println("3: Remove Member");
            System.out.println("4: Find Member");
            option = Input.getInteger("Option: ");
        	
            
            switch (option) {
            	
                case 0:
                	
                    System.out.println("Quitting Program...");
                    System.exit(0);
                    
                case 1:
                    memberName = Input.getString("Member Name: ");
                    if (memberName.length() <=0) {
                    	System.out.println("Please enter a member name");
                    	break;}
                    empNumber = Input.getInteger("Employee Number: ");
                    if (empNumber <0 || empNumber > 999999) {
                    	System.out.println("Please enter the correct date format");
                    	break;}
                    division = Input.getString("Division: ");
                    if (division.length() <=0) {
                    	System.out.println("Please enter a division");
                    	break;}
                    id = id+ 1;
                    memberArray[0]= id;
                    memberArray[1] = "   " + memberName;
                    memberArray[2] = "                   " +empNumber;
                    memberArray[3] = "                       " +division;
                    array.addMember(Arrays.toString(memberArray));
                    System.out.println("Member add to system");
                    
                    break;
                	
                case 2:
                   // System.out.println(array.size());
                    if (array.size()<=0)
                       
                      System.out.println("There are no members in the system");
                    else;
                         array.printElements();
                            
                    break;
                	
                case 3:
                    if (array.size()<=0)
                        
                        System.out.println("There are no members in the system");
                      else;
                		index = Input.getInteger("Member ID: ");
                		array.remove(index);
                	break;
                	
                case 4:
                    if (array.size()<1) {
                        
                        System.out.println("There are no members in the system");}
                    
                      else;
                      	array.printElements();
                        index = Input.getInteger("Member ID: ");
                       //System.out.println(array[index]);
                        array.getMember(index);

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


