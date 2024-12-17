/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tryexception;

import java.util.Scanner;

/**
 * Esempio programma in cui l'eccezione non è catturata per gestirla.
 * Es: l'input "fred" causerebbe eccezione del metodo Integer.parseInt()
 * @author cam
 */
public class TestExceptionReadInt {

	public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Digita un intero:");
                
                String line = in.next();
                int intValue = 0;
                try{
                    intValue = Integer.parseInt(line);
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
                System.out.println("Valore: " + intValue);
            }
            
	}
