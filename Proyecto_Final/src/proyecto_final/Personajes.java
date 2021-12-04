
package proyecto_final;

import java.io.Serializable;
import javax.swing.ImageIcon;


public class Personajes implements Serializable, Poderes {
    
    private int id;
    private String nombre;
    private String tipo;
    private String ataque;
    private String ataqueFinal;
    private double danioAtaque;
    private double danioAtaquefinal;
    private double vida;
    private double estamina;
    private ImageIcon imagen;

    public Personajes() {}

    
    public Personajes(int id, String nombre, String tipo, String ataque, String ataqueFinal, double vida, double estamina, double danioAtaque, double danioAtaquefinal,  ImageIcon imagen) {
        
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.ataqueFinal = ataqueFinal;
        this.vida = vida;
        this.estamina = estamina;
        this.danioAtaque = danioAtaque;
        this.danioAtaquefinal = danioAtaquefinal;
        this.imagen = imagen;
        
        
    }

    //Metodos setter y Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
     public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    
    //Poderes
      public double getDanioAtaque() {
        return danioAtaque;
    }

    public void setDanioAtaque(double danioAtaque) {
        this.danioAtaque = danioAtaque;
    }

    public double getDanioAtaquefinal() {
        return danioAtaquefinal;
    }

    public void setDanioAtaquefinal(double danioAtaquefinal) {
        this.danioAtaquefinal = danioAtaquefinal;
    }

 
    
    //Aqui van mis habilidades (Métodos Abstractos)

    @Override
    public double ataqueNormal() {
     
        //double ataque = danioAtaque*(100);
        
        return getDanioAtaque();
    }

    @Override
    public double defensa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double curar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double ataqueEspecial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    //To String

    @Override
    public String toString() {
        
        return this.nombre;
    }

  
    
    
}
