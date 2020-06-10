/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_7a;

/**
 *
 * @author Carlos Eduardo
 */

import javax.swing.JOptionPane;

class triangulo{
    
    float al, ba, area;
    
public void SetDados(float altura, float base){
    
    al = altura;
    ba = base;
}  
public float GetArea(){
    
    area = (ba*al)/2;
    return area;
}

public void area(){
    
    al = 0;
    ba = 0;
    area = 0;
}
}
      
public class Aula_7a {

    public static void main(String[] args) {
       
        float a, b, area;
        
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite a base: "));
        
        triangulo t1 = new triangulo();
        t1.SetDados(a,b);
        
        JOptionPane.showConfirmDialog(null,"A area é = "+ t1.GetArea());
    }
    
}
