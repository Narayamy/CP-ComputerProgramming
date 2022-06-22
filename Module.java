
class Module {
	private String name;
	private String information;
	private int[] registeredStudents={12312, 5646, 8798};
	
	public Module(String moduleName, String moduleInformation){
    	name = moduleName;
    	information = moduleInformation;
    }
	
	public void printInfo(){
		System.out.println("Module name: "+ name + "\nModule Information: " + information);
	}
	
	public void setName (String moduleName){
		name= moduleName;
	}
	
	public boolean isRegistered(int studentNumber){
		// write code to check if the studentNumber exists in
		// your registeredStudents array. Return true if you find it,
		// otherwise return false
		boolean numberFound = false;
		for(int i=0; i<registeredStudents.length && !numberFound; i++){
			if(registeredStudents[i]== studentNumber){
				numberFound = true;
			}
		} 
		return numberFound;
	}
	
}
