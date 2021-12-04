
package proyecto_final;

import java.io.Serializable;
import javax.swing.ImageIcon;


public class Escenarios implements Serializable{
    
    String nombre;
    ImageIcon imagen;

    public Escenarios() { }
    
    

    public Escenarios(String nombre, ImageIcon imagen) {
        
        this.nombre = nombre;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        
        return nombre;
    }

   
    
    
    
}
