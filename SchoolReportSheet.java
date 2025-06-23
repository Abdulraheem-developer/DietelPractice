public class SchoolReportSheet{
   public static void main(String[] args){

   String[] students = {"Titi", "Tope", "Sade", "Bolu"};
    int[][] scores = { {87, 76, 84, 69}, 
			{90, 57, 87, 91},
			{77, 84, 62, 62},
			{81, 83, 71, 100}

			};
	for(int i = 0; i < students.length; i++){
		int sum = 0;
	System.out.print(students[i] + " scored: ");

	   for(int j = 0; j < scores[i].length; j++){
			System.out.print(scores[i][j] + " ");
				sum += scores[i][j];
		}
		
	
	 int average = sum / scores[i].length;

	System.out.println(" | Average: " + average);
	
	}

}
}