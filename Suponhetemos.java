import java.util.Scanner;

public class Suponhetemos {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        // laço para ler as Notas 
        for (int i = 0; i < 5; i++){
            System.out.println("Informe as notas " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
    
        

        // Exibindo as Notas armazenadas
        System.out.println("notas armazenadas: ");
        for (int i = 0; i< notas.length; i++){
            System.out.println("notas " + (i + 1) + ": " + notas[i]);
        }

        scanner.close();
           
    
    }
}