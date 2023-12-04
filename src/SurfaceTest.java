import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SurfaceTest {

    @Test
    public void surfaceEquals(){
        System.out.println("Test surfaceEquals");
        assertEquals(Surface.surf(3, 6), 18);
    }
    @Test
    public void surfaceNotEquals() {
        System.out.println("Test surfaceNotEquals");
        assertNotEquals(Surface.surf(4, 5), 21);
    }
}