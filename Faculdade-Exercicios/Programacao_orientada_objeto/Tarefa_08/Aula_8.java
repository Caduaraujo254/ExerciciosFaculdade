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
import javax.swing.JOptionPane;

public class Aula_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2, n3;
        float m;
        String escolha;
        
       escolha = JOptionPane.showInputDialog("'1' para superior \n '2' para técnico");
       
       switch(escolha){
           
       case "1":
               
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da P1: "));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da P2: "));
        n3= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota dos trabalhos: "));
        
        Superior s1 = new Superior();
        s1.SetNotas(n1, n2, n3);
        
        JOptionPane.showMessageDialog(null,"A média das notas é: " + s1.GetMedia());
        
        break;
        
       case "2":
         
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do 1º Trimestre: "));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do 2º Trimestre: "));
        n3= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do 3º Trimestre: "));
        
        Tecnico t1 = new Tecnico();
        t1.SetNotas(n1, n2, n3);
        
        JOptionPane.showMessageDialog(null,"A média das notas é: " + t1.GetMedia());
        
        break;
           
       }
        
       
        
       
        
        
        
        
        
        
        
    }
    
}
