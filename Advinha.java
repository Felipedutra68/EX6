package EX6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Advinha {
    
 public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);
  
  int r1 = new Random().nextInt(100);   
    int c1 = 0;
do { 
  
System.out.println("Digite um numero");
  int n1 = teclado.nextInt();      
  
  if (n1 > r1) {
    System.out.println("O numero eh menor");
    
  }  else if (n1 < r1) {
  
   System.out.println("O numero eh maior");
        
          
   } else if (n1 == r1) { 
  
   System.out.println("Voce venceu");  
   }    
  
  c1 = c1 + 1;
    
}  while (c1 != 7); 
 

}
}
