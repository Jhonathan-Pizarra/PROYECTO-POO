
package proyecto_final;

import java.io.Serializable;


public class Jugadores implements Serializable{ //Tenemos que hacerlo Serializable!
    
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String nick;
    //String victorias; //Este todavía ni lo he usado,

    public Jugadores() {} //Hago este contrcutor vacío para poder hacer un castign de Objetos a Jugadores (Y mandar Jugadores al combobox)

    public Jugadores(int id, String nombre, String apellido, String cedula, String nick) { //Hago este contrcutor con parametros para que cada vez que se registre un jugador me mande a la tabla en este orden. "ID""NOMBRE"APELLIDO...
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.nick = nick;
    }
    
    //Setter y Getters 

    //Estos me permitirán tener acceso a los valores de un objeto.
    //Por ejemplo player.getId(); me devolverá el numero identificador de mi Jugador player.
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    
    
    //To String

    
    
    @Override
    public String toString() {
        
        return  this.apellido+" "+this.nombre; //Sólo quiero que en el combo Box me aparezca la cédula.
    }
    
    
}
