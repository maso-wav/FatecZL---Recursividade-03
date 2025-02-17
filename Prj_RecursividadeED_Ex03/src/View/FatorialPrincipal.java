package View;

import Controller.FatorialController;

public class FatorialPrincipal {
    
    public static void main (String args[]){
        
        FatorialController fc = new FatorialController();
        
        int numero = 4;
        
        if((numero < 1) || (numero > 12)){
            
            System.out.println("NÚMERO INVÁLIDO!");
            
        } else {
            
            System.out.println(numero + "! É IGUAL A: " + fc.calculaFat(numero) + ".");
        }
        
    }
    
}
