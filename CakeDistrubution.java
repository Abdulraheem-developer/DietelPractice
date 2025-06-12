public class CakeDistrubution{
 public static void main(String[] args){


	int counter = 0;
	for(int i = 1; i <= 10; i++){
	    if(i == 4){
	      continue;
	}	
	System.out.println("Cupcake served to guest #" + i);
	counter++;
	}



System.out.println("Cupcakes have been served to " + counter + " guests. Skipped Guest #4, She is allergic");
}


}