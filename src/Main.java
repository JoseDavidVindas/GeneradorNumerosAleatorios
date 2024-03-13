import java.util.Random;
/**
 *
 * @author Jose
 */
/**
 * Esta clase proporciona un programa que genera y muestra números aleatorios entre 1 y 100.
 */
public class Main {
   /**
     * El método principal que ejecuta el generador de números aleatorios.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Generando 5 números aleatorios entre 1 y 100:");
        for (int i = 0; i < 5; i++) {
            int numero = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100 inclusive
            System.out.println(numero);
        }
    } 
}
