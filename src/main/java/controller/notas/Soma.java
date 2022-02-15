/*
    Adrian Machado - 201965001AB
    Mário José - 201965507B

*/ 
package controller.notas;

import java.util.ArrayList;


public class Soma extends CalculaNota{
      @Override
    public float calcular(ArrayList<Float> Nota) {
        int i = 0;
        float soma = 0;
        for(float aux:Nota)
        {
            soma += aux;
            i++;
        } 
        return soma;
        
        //throw new UnsupportedOperationException("Not supported yet."); 
    }
}
