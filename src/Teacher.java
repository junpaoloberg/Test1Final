
public class Teacher {
	
	private String name;
	private String id;
	
	public Teacher(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public String toString() {
		return name + id;
	}

		public static void main(String[]args) {
			
			Teacher t1 = new Teacher("2016-1123 ", "Paragele, Tracy");
			
			System.out.println("Teacher Name: " + t1);
			
		}		
}
