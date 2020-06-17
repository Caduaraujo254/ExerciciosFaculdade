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
public class Tecnico extends Superior {
    
    @Override
    public float GetMedia(){
        
        M = (N1 + N2*2 + N3*2)/5;
        return M;
    }  
}
