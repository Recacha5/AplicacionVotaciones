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
public class AplicacionVotaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Votacion votacion = new Votacion ("Delegado");
        boolean bandera=true;
        boolean bandera2=true;
        while (bandera){
            
            switch (Menus.Menu()){
                
                case 1: System.out.println("Dime el nombre de la persona");
                        break;
                case 2: 
                        while(bandera2){
                        switch(Menus.subMenu()){
                            case 1: 
                                    break;
                            case 2: 
                                    break;
                            case 3: 
                                    break;
                            case 4: bandera2 = false;
                                    break;
                        }
                        break;
                        }
                case 3: bandera = false;
                        break;
                        
            }
            
        }
        
    }
    
}
