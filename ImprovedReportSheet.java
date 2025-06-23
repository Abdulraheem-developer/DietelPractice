public class ImprovedReportSheet{
  public static void main(String[] args){

	String[] students = {"Tolu", "Emeka", "Amina", "Bolaji", "Ada"};
	String[] subjects = {"Math", "English", "Science"};
	int[][] scores = {{78, 65, 89}, 
			    {55, 72, 60}, 
			   {92, 88, 95}, 
			    {38, 42, 35},
			     {74, 98, 69}	
					
			};

	for(int i= 0; i < students.length; i++){
            System.out.println(students[i] + " scored: ");
	
		int sum = 0; 
	for(int j = 0; j < subjects.length; j++){
		System.out.println(subjects[j] + ": " + scores[i][j]);
			sum += scores[i][j];
	
		}
		 int average = sum / subjects.length;

		
    String grade;
	String Status;
    if (average >= 70) {
        grade = "A";
	Status = "Pass";
    } else if (average >= 60) {
        grade = "B";
	Status = "Pass";
    } else if (average >= 50) {
        grade = "C";
	Status = "Pass";
    } else if (average >= 40) {
        grade = "D";
	Status = "Fail";
	
    } else {
        grade = "F";
	Status = "Fail";
    }

			
	
		 System.out.println("Average: " + average + " | Grade: " + grade + " | Status: " + Status + "\n");

	
	}
	 
}


