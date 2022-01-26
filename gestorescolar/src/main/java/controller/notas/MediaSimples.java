
package controller.notas;

import java.util.ArrayList;


public class MediaSimples extends CalculaNota{

    @Override
    public float calcular(ArrayList<Float> Nota) {
        int i = 0;
        float soma = 0;
        for(float aux:Nota)
        {
            soma += aux;
            i++;
        } 
        return soma/i;
        
        //throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
