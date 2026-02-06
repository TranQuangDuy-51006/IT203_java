package ss9.Test;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== NHAP THONG TIN CHIM ===");
        BirdAnimal bird = new BirdAnimal();
        bird.input();
        System.out.println("\n--- THONG TIN CHIM ---");
        bird.display();

        System.out.println("\n=== NHAP THONG TIN DONG VAT CO VU ===");
        MamalAnimal mamal = new MamalAnimal();
        mamal.input();
        System.out.println("\n--- THONG TIN DONG VAT CO VU ---");
        mamal.display();
    }
}

