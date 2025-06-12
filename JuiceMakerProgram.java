 class JuiceMaker{

  private String fruit;
  private int quantity;


   public JuiceMaker(String fruit, int quantity){

	this.fruit = fruit;
	this.quantity = quantity;


	}
	public void makeJuice(){
	System.out.println("Making " + this.quantity + " of " + this.fruit + " juice");
	}

	public String getFruit(){
	    return fruit;
	}

	public void setFruit(String fruit){
	    this.fruit = fruit;
	}
	

	public int getQuantity(){
		return quantity;
	}

	public void setQuantity(int quantity){
	  this.quantity = quantity;
	}

	

}


public class JuiceMakerProgram{
  public static void main(String[] args){

	JuiceMaker juice = new JuiceMaker("Mango", 3);
	juice.makeJuice();

	juice.setFruit("Apple");
	juice.setQuantity(5);

	juice.makeJuice();
	
}

}