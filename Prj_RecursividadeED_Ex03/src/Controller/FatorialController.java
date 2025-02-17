/*
    Ponto de parada: subtrair o número até chegar a um.
    A função é chamada e vai atribuindo a "fat" a multiplicação de "num" pelo seu antecessor, até que "num"
    seja igual a um.
 
 */

package Controller;

public class FatorialController {
    
    public FatorialController(){
        super();
        
    }
    
    public int calculaFat(int num){
        
        if(num > 1){
            
            int fat = num * calculaFat(num - 1);
            
            return fat;
            
        } else {
           
            return num;
        }
    }
}
