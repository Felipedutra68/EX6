package EX6;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Notas {
    
 public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);       
    
int m1 = 0;   
  int n1 = 1; 
int c1 = 0;  
do {  
  
System.out.println("Digite uma nota");
 n1 = teclado.nextInt();     
    
c1 = c1 + 1;
 
m1 = m1 + n1;

    
    
} while (c1 != 4);   
    
System.out.println("A media das notas eh " + m1/4);

 }
}
