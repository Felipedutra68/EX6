package EX6;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class MenuDeOpcoes {
    
public static void main(String[] args) throws InterruptedException {    
    
  Scanner teclado = new Scanner(System.in);  
     
  int n1 = 0;   

  do {  
  
System.out.println("Cadrastar [1]");
System.out.println("Consultar [2]");
System.out.println("Sair [3]");
  
n1 = teclado.nextInt(); 
  


} while (n1 != 3);
    
 }
}
