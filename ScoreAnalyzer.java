public class ScoreAnalyzer{
 public static void main(String[] args){

   int[] scores = {75, 88, 66, 90, 45, 82};

	//1. Print each scores
	for(int i = 0; i < scores.length; i++){

		System.out.println(scores[i]);
	}
	
	//2. Calculate the total score.

		int total = 0; 
	
	for(int i = 0; i < scores.length; i++){
		
		total += scores[i];
	}

	//3. Calculate the average score.
	

	  int average = total / scores.length;
	   System.out.println("Average: " + average);
	

	//4. Highest and Lowest Score.
		
		int highest = scores[0];
		int lowest = scores[0];
	for(int i = 0; i < scores.length; i++){
		if(scores[i] > highest){
		  highest = scores[i];
		}	
	
		if(scores[i] < lowest){
		lowest = scores[i];
	}
	  }	
		System.out.println("Highest Score:" + highest);
		System.out.println("Lowest Score:" + lowest);

	//5. Count lesser than 50.

			int count = 0;
		for(int i = 0; i < scores.length; i++){
			if(scores[i] > 50){
			 count++;
			}	
		}
		System.out.println("Number of students who passed: " + count);

	
}
}