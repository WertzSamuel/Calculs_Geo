public class Perimeter {

    public static int perim(int a, int b, int c){
        return new Produit().mult(new Addition().add(a, b), c);
    }
}
