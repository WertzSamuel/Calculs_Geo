import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduitTest {

    @Test
    public void multEquals(){
        System.out.println("Test multEquals");
        assertEquals(Produit.mult(5, 3), 15);
    }
    @Test
    public void multNotEquals() {
        System.out.println("Test multNotEquals");
        assertNotEquals(Addition.add(1, 1), 3);
    }

}