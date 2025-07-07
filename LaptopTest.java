import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class LaptopTest {

    @Test
    public void FullConstructor() {
        Laptop laptop1 = new Laptop("Dell", "Intel Core i5 8th Gen", 8, 367000.00);
        assertEquals("Dell", laptop1.getBrand());
        assertEquals("Intel Core i5 8th Gen", laptop1.getProcessor());
        assertEquals(8, laptop1.getRamSize());
        assertEquals(367000.00, laptop1.getPrice(), 0.001);
    }

    @Test
    public void ThreeArguementConstructor() {
        Laptop laptop1 = new Laptop("Dell", "Intel Core i5 8th Gen", 8);
        assertEquals("Dell", laptop1.getBrand());
        assertEquals("Intel Core i5 8th Gen", laptop1.getProcessor());
        assertEquals(8, laptop1.getRamSize());
        assertEquals(0.0, laptop1.getPrice(), 0.001);

    }

    @Test
    public void TwoArguementConstructor() {
        Laptop laptop1 = new Laptop("Dell", "Intel Core i5 8th Gen");
        assertEquals("Dell", laptop1.getBrand());
        assertEquals("Intel Core i5 8th Gen", laptop1.getProcessor());
        assertEquals(8, laptop1.getRamSize());
        assertEquals(0.0, laptop1.getPrice(), 0.001);
    }

    @Test
    public void oneArguementConstructor() {
        Laptop laptop1 = new Laptop("Dell");
        assertEquals("Dell", laptop1.getBrand());
        assertEquals("Intel Core i5", laptop1.getProcessor());
        assertEquals(8, laptop1.getRamSize());
        assertEquals(0.0, laptop1.getPrice(), 0.001);
    }

    @Test
    public void NoArguementConstructor() {
        Laptop laptop1 = new Laptop();
        assertEquals("Unknown", laptop1.getBrand());
        assertEquals("Intel Celeron", laptop1.getProcessor());
        assertEquals(4, laptop1.getRamSize());
        assertEquals(0.0, laptop1.getPrice(), 0.001);
    }

    @Test
    public void displaySpecificationTest() {
        Laptop laptop1 = new Laptop();
        assertEquals("Brand: | Unknown | Processor: | Intel Celeron | RAM Size: | 4 | Price: | 0.0", laptop1.displaySpecs());

    }
}