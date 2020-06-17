/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_8;

/**
 *
 * @author Carlos Eduardo
 */
public class Superior {
    
    int N1, N2, N3;
    float M;
    
    public void SetNotas(int nota1, int nota2, int nota3){
    
    N1 = nota1;
    N2 = nota2;
    N3 = nota3;
}
    
    public float GetMedia(){
        
       M =(float) ((N1*0.35) + (N2*0.5) + (N3*0.15));
       return M;
    }
    
    Superior(){
        
        N1=0;
        N2=0;
        N3=0;
        M=0;
    }  
}
