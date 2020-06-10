/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_7b;

/**
 *
 * @author Carlos Eduardo
 */
import javax.swing.JOptionPane;

class Equacao{
    int A, B, C, delta;
    
    public void SetDados(int aa, int bb, int cc){
        
        A = aa;
        B = bb;
        C = cc;
    }
    
     public int GetRaiz(){
        
        delta = (B*B)-4*A*C;
            
        return delta;    
    } 
    
    public void raiz(){
       A=0;
       B=0;
       C=0;
       delta=0;
    }         
}
              
public class Aula_7b {
    
    public static void main(String[] args) {
       
        int a, b, c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'a': "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'b': "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'c': "));
        
        Equacao e1 = new Equacao();
        e1.SetDados(a,b,c);
      
                if (e1.GetRaiz()== 0){
            
            JOptionPane.showMessageDialog(null,"delta = "+e1.GetRaiz()+" as raízes são iguais");
    } 
        else if (e1.GetRaiz()< 0){
            
            JOptionPane.showMessageDialog(null,"delta = "+e1.GetRaiz()+" não existem raízes reais");
        }
        
        else if (e1.GetRaiz()> 0){
            
            JOptionPane.showMessageDialog(null,"delta = "+e1.GetRaiz()+" existem duas raízes diferentes");
        }
    }
}


