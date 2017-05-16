import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Biodata[] bd = new Biodata[50];

		for (int i = 0; i < 3; i++) {
			String name = sc.nextLine();
			String schoolName = sc.nextLine();
			String roll = sc.nextLine();
			int age = Integer.parseInt(sc.nextLine());

//			Biodata bio = new Biodata();
//			bio.setName(name.toString());
//			bio.setSchoolName(schoolName);
//			bio.setRoll(roll);
//			bio.setAge(age);
			
			bd[i] = new Biodata(name, schoolName, roll, age);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(bd[i].getName());
			System.out.println(bd[i].getSchoolName());
			System.out.println(bd[i].getRoll());
			System.out.println(bd[i].getAge());
		}
		System.out.println("The names are:");
		for(int i=0;i<3;i++){
			if(bd[i].getSchoolName().equalsIgnoreCase("Kushtia Zilla School"))
			{
				System.out.println("Name="+bd[i].getName()+" Roll="+bd[i].getRoll()+" Age="+bd[i].getAge());
			}
		}

	}
}
