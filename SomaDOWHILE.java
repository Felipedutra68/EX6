package EX6;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class SomaDOWHILE {
    
public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);    
    
  int m1 = 0;
  
  //System.out.println("Digite um numero");
  int n1 = 1; //teclado.nextInt();   
  
 do {  
  
 System.out.println("Digite um numero");
   n1 = teclado.nextInt();   
     
m1 += n1;      
     
    
     
 } while (n1 != 0 );
     
 
 
 System.out.println("O resultado da soma eh " + m1);
 
 
 }
}
