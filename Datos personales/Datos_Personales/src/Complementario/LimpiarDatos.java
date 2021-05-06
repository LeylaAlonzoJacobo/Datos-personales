//Limpiar los datos ene el TXT
package Complementario;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LimpiarDatos {
    public void LimbiarDatos(JPanel panel){
        for(int i=0; panel.getComponents().length>i; i++){
            if(panel.getComponents()[i]instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText("");
                
            }else if(panel.getComponents()[i]instanceof JPasswordField)
                 ((JPasswordField)panel.getComponents()[i]).setText("");
             
            
        
    }
    }
    }
    