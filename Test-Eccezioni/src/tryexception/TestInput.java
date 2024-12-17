/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tryexception;

import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class TestInput {
    public static void testScanner(){
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
