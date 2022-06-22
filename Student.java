public class Student {
    
    private String name;
    private int idNumber;
    
    // default constructor
    public Student(){
    }
    
    // another constructor - sets name and id number
    public Student(String studentName, int studentIdNumber){
    	name = studentName;
    	idNumber = studentIdNumber;    	
    }
    
    public void printInfo(){
    	System.out.println("Name: " + name + ", Id number: " + idNumber);
    }
    
    public String getName(){
    	return name;
    }
    
    public void setName(String studentName){
    	name = studentName;
    }
    
    public int getIdNumber(){
    	return idNumber;
    }
    
    public void setIdNumber(int studentIdNumber){
    	idNumber = studentIdNumber;
    }
}