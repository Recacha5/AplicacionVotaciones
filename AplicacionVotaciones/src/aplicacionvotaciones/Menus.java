/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionvotaciones;

import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Menus {
    
    public static int Menu(){
        Scanner leer = new Scanner (System.in);
        int opcion=0;
        
        System.out.println("-------------------------");
        System.out.println("1- Añadir votante + voto.");
        System.out.println("2- Terminar votación.");
        System.out.println("3- Salir.");
        System.out.println("-------------------------");
        
        System.out.println("Dime qué opcion eliges");
        opcion = leer.nextInt();
        return opcion;
    }
    
    public static int subMenu(){
        Scanner leer = new Scanner (System.in);
        int opcion=0;
        
        System.out.println("----------------");
        System.out.println("1- Ver votantes.");
        System.out.println("2- Ver votos.");
        System.out.println("3- Resultado.");
        System.out.println("4- Salir.");
        System.out.println("----------------");
        
        System.out.println("Dime qué opcion eliges");
        opcion = leer.nextInt();
        return opcion;
    }
    
}
