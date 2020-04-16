package Step2;

import java.util.Arrays;
import java.util.Objects;

public class TeamMember {
	private String memberName;
	private Integer empNumber;
	private String division;
	private String array[];
	private int size;
	private int scope;
	public int index;
	
    public TeamMember(){
        array = new String[2];
        size=0;
        scope=2;
    }
	
    
    public void addMember(String element){
        if (size == scope){
            ensureScope(2); 
        }
        element = element.replaceAll("\\[|\\]", "");
        array[size] = element;
        size++;
    }

	public Object getMember(int index) {
        System.out.println(array[index]);
		return array[index];	
	}
    
    public void remove(int index){
        if(index>=size || index<0){
            System.out.println("No element at this index");
        }else{
            for(int i=index;i<size-1;i++){
                array[i] = array[i+1];
            }
            array[size-1]= null;
            size--;
        }
    }
	
    public void ensureScope(int minCapacity){
        String temp[] = new String[scope*minCapacity];
        for (int i=0; i < scope; i++){
            temp[i] = array[i];
        }
        array = temp;
        scope = scope * minCapacity;
    }
    
    public void trimToSize(){
        System.out.println("Trimming the array");
        String temp[] = new String[size];
        for (int i=0; i < size; i++){
            temp[i] = array[i];
        }
        array = temp;
        scope = array.length;
         
    }

    public int size(){
        return size;
    }
     
    public int scope(){
        return scope;
    }
    public void printElements(){
        System.out.format("%-5s%-25s%-25s%-25s\n","ID",  "Member Name", "Employee Number", "Division");
        
        
        for(int i = 0;i < array.length; i++)
        	if (array[i] != null)
            	System.out.println(array[i]);
    }



}
