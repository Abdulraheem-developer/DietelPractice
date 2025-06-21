public class MamaTiti{
  public static void main(String[] args){


	String[] students = new String[6];

	students[0] = "Titi";
	students[1] = "Bola";
	students[2] = "Femi";
	students[3] = "Sade";
	students[4] = "Tope";
	students[5] = "Zainab";

	for(int i = 0; i < students.length; i++){
		System.out.println(students[i] +" - Present!");
	}
	students[2] = "Kehinde";

	System.out.println("\n--Updated Roll Call--");
	for(String student : students) {
       	System.out.println(student + " - Present!");
	}
	System.out.println("Total number of students: " + students.length);
}
}