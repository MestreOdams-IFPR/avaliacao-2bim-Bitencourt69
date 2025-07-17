
import java.util.Scanner;

public class prova {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int cont = 0;
        int[] vet = new int[N];

    }

    public static int tribonacci(int N, int cont) { // Conceito C, incompleta
        if (N <= cont) {
            return -1;
        }
        if (N <= 1) {
            return 0;

        } else if (N == 2) {
            return 1;
        } else {

            int f = 0;
            f = f * (cont - 1) + f * (cont - 2) + f * (cont - 3);
            return f + tribonacci(N, cont + 1);
        }

    }

    public static int pell(int N, int cont, int[] vet) { // Conceito C, incompleta
        if (cont >= N) { 
            return -1;
        } else if (cont == 0) {
            imprimirPell(N, cont, vet);
            return 0 + pell(N, cont + 1, vet);

        } else if (cont == 1) {
            imprimirPell(N, cont + 1, vet);
            return 1 + pell(N, cont + 1, vet);

        }

        else {
            vet[cont] = 2 * cont * (2 * cont - 1) + cont * (cont - 2);
            imprimirPell(N, cont, vet);
            return pell(N, cont + 1, vet);
        }
    }

    public static void imprimirPell(int N, int cont, int[] vet) {
        int num = vet[cont];
        System.out.println(num);
    }
}
