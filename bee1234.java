
import java.util.Scanner;

public class bee1234 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String frase = sc.nextLine();

        String re = transformarSentenca(frase);

        System.out.println(re);

    }

    public static String transformarSentenca(String frase) {
        char[] letra = frase.toCharArray();

        for (int i = 0; i < letra.length; i++) {
            if (letra[i] == ' ') {
                i++;
            }
            if (i % 2 == 0) {
                letra[i] = ((Character.toUpperCase(letra[i])));

            } else {
                letra[i] = ((Character.toLowerCase(letra[i])));
            }
        }

        
        return new String(letra);

    }

}
