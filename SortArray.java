public class SortArray{
  public static void main(String[] args){

	int temp = 0;
	
	int[] num = {6, 2, 9, 4, 7};

	temp = num[0];
	num[0] = num[num.length - 1];
	num[num.length -1] = temp;

	
	
	System.out.println("The sorted Array are: ");
	for(int i = 0; i < num.length; i++){
		System.out.print(num[i] + " ");
	}
		

	
		
	

}

}