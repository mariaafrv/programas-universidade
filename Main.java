import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in); //solicita quantidade de elementos
    System.out.println("Quantos elementos serão lidos?");
   
    int quantidade = input.nextInt();
    int[] numeros = new int[quantidade]; //solicita que insira quantidade x de elementos
    
    for (int i = 0; i < quantidade; i++){
      System.out.println("Informe um valor: ");
      numeros[i] = input.nextInt();
    }  

    int maior = maiorValor(numeros);
    int menor = menorValor(numeros);
    int diferenca = diferencaValores(maior, menor);
    System.out.println("A maior diferença entre os valores do vetor é: " + diferenca);
    
    String ordem = ordem(numeros);
    System.out.println("O vetor está em ordem crescente? " + ordem);
    }
    
  public static int maiorValor (int[] numeros) { //verifica o maior valor do vetor
      int maior = Integer.MIN_VALUE;
      
      for (int i = 0; i < numeros.length; i++){
        int x = numeros[i];
        if (x > maior){
          maior = x;}
      }
      return maior;
    }
    
  public static int menorValor (int[] numeros) { // verifica o menor valor do vetor
      int menor = Integer.MAX_VALUE;
      
      for (int i = 0; i < numeros.length; i++){
        int x = numeros[i];
        if (x < menor){
          menor = x;
        }
      }
      return menor;
    }
  
  public static int diferencaValores (int maior, int menor) { //verifica maior diferença entre dois numeros do vetor
    int diferenca = maior - menor;
    return diferenca;
  }
  
  public static String ordem (int[] numeros){ //verifica se está em ordem crescente
    String ordemCrescente = "não";
    for (int i = 0; i < (numeros.length - 1); i++){
      if(numeros[i] < numeros[(i+1)]){
        ordemCrescente = "Sim";
      }else {
       ordemCrescente = "Não";
        break;
      }
    } 
    return ordemCrescente;
  }
}