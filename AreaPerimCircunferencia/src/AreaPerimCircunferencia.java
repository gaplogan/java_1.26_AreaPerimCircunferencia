import java.util.Scanner;

public class AreaPerimCircunferencia {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        double raio, area, perim;

        System.out.print("Digite o valor do raio do c�rculo: ");
        raio = entrada.nextDouble();
        // Garante um raio n�o negativo.
        raio = Math.abs(raio);

        area = Math.PI * Math.sqrt(raio);
        perim = 2 * Math.PI * raio;

        System.out.println("\n�rea do c�rculo: " + area);
        System.out.println("Per�metro da circunfer�ncia: " + perim);

        entrada.close();
    }
}
