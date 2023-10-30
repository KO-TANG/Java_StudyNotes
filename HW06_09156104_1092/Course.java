//資一A 09156104 朱可棠
package HW06_09156104_1092;

public class Course {
	private String courseName;
	private String[] students = new String[3];
	int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}
	//新增一個新的陣列，並複製學生名稱
	public String[] getStudents() {
		String[] s = new String[numberOfStudents];
		s = students;
		return s;
	}
	//加選
	public void addStudent(String student) {
		// 如果修課人數滿了，自動加大陣列長度
		if (numberOfStudents >= students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents] = student;// 將學生加入陣列
		numberOfStudents++;// 人數+1
		// 判斷學生是否已在修課名單
		for (int i = 0; i < numberOfStudents - 1; i++) {
			if (student.equalsIgnoreCase(students[i])) {
				System.out.println(student + " is already in " + courseName);
				students[numberOfStudents-1] = "";// 將新加入的學生移除
				numberOfStudents--;// 人數-1
			}
		}
	}
	//退選
	public void dropStudent(String student) {
		// 退選學生是否在修課名單內
		int index = -1;
		for (int i = 0; i < numberOfStudents; i++) {
			if (student.equalsIgnoreCase(students[i])) {
				index = i;
				students[index]=null;
				numberOfStudents--;// 人數-1
			}
		}
		if (index == -1) {
			System.out.println("Can not find " + student + " in " + courseName);
		}
		//最後一個學生取代要退選的學生
		for (int i = 0; i < numberOfStudents; i++) {
			if(students[i]==null) {
				students[i] = students[numberOfStudents];
			}
		}
	}
	//學生人數
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	//將學生人數歸0
	public void clear() {
		for (int i = 0; i < numberOfStudents; i++) {
			students[i] = null;
		}
		numberOfStudents = 0;
		System.out.println("Remove all students from the "+courseName);
		System.out.println("Number of students in Data Structure: "+numberOfStudents);
		
	}

}
