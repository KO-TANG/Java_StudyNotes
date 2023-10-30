//資一A 09156104 朱可棠
package HW06_09156104_1092;

public class TestCourse_09156104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("Data Structure");
		Course course2 = new Course("Database Systems");
		//樣本1
		course1.addStudent("Peter");
		course1.addStudent("Brian");
		course1.addStudent("Anne");
		course1.addStudent("Jenny");
		course1.addStudent("Chris");
		course1.dropStudent("Brian");
		course1.addStudent("Terry");
		course1.addStudent("Ricky");
		course1.dropStudent("Jenny");
		course1.dropStudent("Cindy");
		course1.addStudent("Ricky");

		course2.addStudent("Peter");
		course2.addStudent("Steve");
		course2.addStudent("John");
		course2.addStudent("Ben");
		course2.dropStudent("Peter");
		course2.addStudent("Jack");
		course2.addStudent("Peter");
		course2.dropStudent("Steve");
		course2.dropStudent("Ben");
		course2.addStudent("Peter");
		course2.dropStudent("Pig");

		String[] students1 = course1.getStudents();
		System.out.println("Number of students in Data Structure : " + course1.getNumberOfStudents());
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(students1[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));
			/*if (i == course1.getNumberOfStudents()-1) {
				System.out.print(students1[i]);
			}
			else
				System.out.print(students1[i] + ",　");*/
		}
		

		String[] students2 = course2.getStudents();
		System.out.println();
		System.out.println("Number of students in Data Structure : " + course2.getNumberOfStudents());
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			if (i == course2.getNumberOfStudents()-1)
				System.out.print(students2[i]);
			else
				System.out.print(students2[i] + ",　");
		}
		System.out.println();
		course1.clear();
		course2.clear();
	}
}
