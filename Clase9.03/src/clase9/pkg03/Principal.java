/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9.pkg03;
import javax.swing.JOptionPane;
/**
 *
 * @author SALA
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto A1 = new Auto("BMW", "ABC123", "Azul");
        
        //JOptionPane cuadro de dialogo 
        
        JOptionPane.showMessageDialog(null, "La placa del auto es: "+ A1.placa);
        
        //modificar la placa
        A1.placa = "Perro";
        JOptionPane.showMessageDialog(null, "La placa del auto es: "+ A1.placa);
    }
    
}
