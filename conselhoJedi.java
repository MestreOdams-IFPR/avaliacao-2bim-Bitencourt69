import java.util.Scanner;

public class conselhoJedi{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] vet = new int[N];
            for (int i = 0; i < vet.length; i++) {
                vet[i] = sc.nextInt();
            }
            int K = sc.nextInt();
            
        }
    }
    static void margeSorte(int[] vet, int inicio, int fim){
        int meio = 0;
        if (inicio < fim - 1) {
            meio = (inicio + fim)/2;
            margeSorte(vet, inicio, fim);
            margeSorte(vet, meio+1, fim);
            intercalar(vet, inicio, meio, fim);
        }
    }
    static void intercalar(int[] vet, int inicio, int meio, int fim){
        int i=inicio, j=meio, k= 0;
        int[] aux = new int [fim];
        while (i < inicio && j < fim) {
            if(vet[i]>=vet[j]){
                aux[k++] = vet[i++];

            }
            else{
                aux[k++] = vet[j++];
            }
        }
        while (i < meio) {
            aux[k++] = vet[i++];

        }
        while (j < fim) {
            aux[k++] = vet[j++];
        }
        for (int l = 0; l < aux.length; l++) {
            vet[i] = aux[i];
        }
    }
}