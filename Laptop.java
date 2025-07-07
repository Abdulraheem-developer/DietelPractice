public class Laptop{
    private String brand;
    private String processor;
    private int ramSize;
    private double price;

    public Laptop(String brand, String processor, int ramSize, double price){
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
        this.price = price;
    }
    public Laptop(String brand, String processor, int ramSize) {
        this(brand, processor, ramSize, 0.0);
    }
    public Laptop(String brand, String processor)  {
        this(brand, processor, 8, 0.0);

    }
    public Laptop(String brand ){
        this(brand, "Intel Core i5", 8, 0.0);
    }
    public Laptop(){
        this("Unknown", "Intel Celeron", 4, 0.0);
    }
    public String displaySpecs(){
        return"Brand: | " + this.brand + " | Processor: | " + this.processor + " | RAM Size: | " + this.ramSize + " | Price: | " + this.price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getProcessor() {
        return this.processor;
    }
    public int getRamSize() {
        return this.ramSize;
    }
    public double getPrice() {
        return this.price;
    }

    public static void main(String[] args) {

    }



}