
public class Main {
    public static void main(String[] args) {

        Addition addition = new Addition();
        System.out.println(addition.add(2, 8));
        Produit produit = new Produit();
        System.out.println(produit.mult(2, 8));
        Surface surface = new Surface();
        System.out.println(surface.surf(3, 6));
        Perimeter perimeter = new Perimeter();
        System.out.println(perimeter.perim(3, 6, 2));
    }
}