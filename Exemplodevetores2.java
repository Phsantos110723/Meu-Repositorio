public class Exemplodevetores {
    public static void main(String[] args){
        
        int maior = 0; 
        int [] numeros = new int [] {90, 234 , 34 , 688, 888, 988};
        
        //Econtrar o maior numeros
        for (int i = 0; i < 7; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("o maior numero é: " + maior);
    }
}