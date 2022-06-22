
public class StudentInfo {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student();
		Student stu2 = new Student("Fionn MacChumhail", 1234);
		
		stu1.setName("Deirdre");
		System.out.println(stu1.getName());
		System.out.println(stu1.getIdNumber());

		
		System.out.println(stu2.getName());
		System.out.println(stu2.getIdNumber());
		
		stu1.printInfo();
		stu2.printInfo();
		
		Module module1 = new Module("Computer Programing", "Introduction to the Java programing language");
		module1.printInfo();
		module.setName("Programing");
		module1.printInfo();
		if(module1.isRegistered(12456)){
			System.out.println("The student is registered in the module");
		}
		else{
			System.out.println("The student is not registeres in the module");
		}
		
		
	}	
}
