import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerimeterTest {

    @Test
    public void perimeterEquals(){
        System.out.println("Test perimeterEquals");
        assertEquals(Perimeter.perim(3, 6, 2), 18);
    }
    @Test
    public void perimeterNotEquals() {
        System.out.println("Test perimeterNotEquals");
        assertNotEquals(Perimeter.perim(4, 5, 3), 21);
    }
}