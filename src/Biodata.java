
public class Biodata {
	
	private	String name;
	private String schoolName;
	private String roll; 
	private int age;
	
	public Biodata() {
	}
	
	public Biodata( String name, String schoolName, String roll, int age) {
		
		this.name = name;
		this.schoolName = schoolName;
		this.roll = roll;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
