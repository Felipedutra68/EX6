package EX6;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Contagem {
    
public static void main(String[] args) throws InterruptedException {    
    
  Scanner teclado = new Scanner(System.in);  
    

int c1 = 11;  
  
do {

Thread.sleep(1000);
c1 = c1 - 1;

 System.out.println(c1);

} while (c1 != 1); 
    
 }
}
