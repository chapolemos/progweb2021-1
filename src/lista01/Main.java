package lista01;

import java.util.*;

class Main {
  public static void main(String[] args) {
    //Lista 01 Questão 01
    Scanner scan = new Scanner(System.in);
    float total = 0;
    System.out.println("Alo mundo!");

    //Lista 01 Questão 02
    
    System.out.println("Por favor escreva um numero: ");
    int input = scan.nextInt();
    System.out.println("O numero informado foi: "+input);
    
    //Lista 01 Questão 03
    
    for(int i=1;i<4;i++){
      System.out.println("Por favor escreva a nota de numero "+i+": ");
      total += scan.nextFloat();
    }
    total /= 3;
    System.out.println("A média aritmética das notas é: "+total);

    //Lista 01 Questão 04
    
    float n1 = 0, n2 = 0, n1p = 0, n2p = 0;
    System.out.println("Por favor escreva a primeira nota");
    n1 = scan.nextFloat();
    System.out.println("Agora escreva o peso da primeira nota");
    n1p = scan.nextFloat();
    System.out.println("Por favor escreva a segunda nota");
    n2 = scan.nextFloat();
    System.out.println("Agora escreva o peso da segunda nota");
    n2p = scan.nextFloat();

    n1 *= n1p; n2 *= n2p; total = (n1+n2)/(n1p+n2p);
    System.out.println("A média ponderada das notas é: "+total);

    //Lista 01 Questão 05
    int m = 0;
    System.out.println("Quantos metros você quer converter?");
    m = scan.nextInt();
    System.out.println(m+" metros são "+m*100+" centímetros.");

    //Lista 01 Questão 06
    int r = 0;
    System.out.println("Qual o raio do círculo em metros?");
    r = scan.nextInt();
    System.out.println("A área do círculo é de "+(r*r)*Math.PI+" metros quadrados.");

    
  }
  
}