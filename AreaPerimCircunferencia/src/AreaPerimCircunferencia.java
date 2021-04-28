import java.util.Scanner;

public class AreaPerimCircunferencia {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        double raio, area, perim;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = entrada.nextDouble();
        // Garante um raio não negativo.
        raio = Math.abs(raio);

        area = Math.PI * Math.sqrt(raio);
        perim = 2 * Math.PI * raio;

        System.out.println("\nÁrea do círculo: " + area);
        System.out.println("Perímetro da circunferência: " + perim);

        entrada.close();
    }
}
