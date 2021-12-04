/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author HP
 */
public class GUIBatalla extends javax.swing.JFrame {

    AudioClip audio;
    ArrayList <Object> listaJugadores = new ArrayList();
    ArrayList <Object> listaPersonajes = new ArrayList();
    ArrayList <Object> listaEscenarios = new ArrayList();
    Control registro = new Control();
    Personajes personaje1 = new Personajes();
    Personajes personaje2 = new Personajes();
    Jugadores player1 = new Jugadores();
    Jugadores player2 = new Jugadores();
    
    
    int vidaPlayer1 = 0;
    int vidaPlayer2 = 0;
    int cont1 = 0;
    int cont2 = 0;
    int contDefensa = 0;
    int contDefensa2 = 0;
    int ataqueFinal = 0;
    int ataque = 0;
    
    int idPersonaje1;
    int idPersonaje2;
    int idPlayer1;
    int idPlayer2; 
    int escena;
    
    boolean atacar = false;
    boolean atacar2 = false;
    boolean defensa = false;
    boolean defensa2 = false;
    boolean curar = false;
    boolean curar2 = false;
    boolean especial = false;
    boolean especial2 = false;
    /**
     * Creates new form GUIBatalla
     */
    public GUIBatalla(int idJugador1, int idJugador2, int idPersonajeA, int idPersonajeB, int idEscena) {
        initComponents();
       
        ponerAudio();
        
      
        idPersonaje1 = idPersonajeA;
        idPersonaje2 = idPersonajeB;
        
        idPlayer1 = idJugador1;
        idPlayer2 = idJugador2;
        
        escena = idEscena;
         ponerFondo();
         
        System.out.println("Ninja utilizado " + idPersonaje1);
        System.out.println("Nija utilizado2 " + idPersonaje2);
        
        System.out.println("Jugador utilizado " + idPlayer1);
        System.out.println("Jugador utilizado " + idPlayer2);
        
        
        System.out.println("Escena seleccionada " + escena);
        
        listaJugadores = registro.cargarObjetos("archivoJugadores.dat");
        listaPersonajes = registro.cargarObjetos("archivoPersonajes.dat");
        listaEscenarios = registro.cargarObjetos("archivoEscenarios.dat");
        
       
        llenarDatos();
        llenarCampo();
        //vaciarCampo();
       barraVidaPlayer1.setValue(100);
       barraVidaPlayer2.setValue(100);
       barraEstaminaPlayer2.setValue(100);
       barraEstaminaPlayer1.setValue(100);
        
       deshabilitarBotones();
       habilitarBotones1();
        
    }
 
    
    private void llenarDatos(){
    
     
        String nombrePlayer1 = null;
        String apellidoPlayer1 = null;
        String nombrePlayer2 = null;
        String apellidoPlayer2 = null;
        
        /*   String nombrePersonaje1 = null;
        String nombrePersonaje2 = null;*/
        
        for(Object each: listaJugadores){
        
            player1 = (Jugadores) each;
            player2 = (Jugadores) each;
           
            if(idPlayer1 == player1.getId() ){
            
                System.out.println("Id:"+idPlayer1+"Actual: "+player1.getId());
                nombrePlayer1 = player1.getNombre();
                apellidoPlayer1 = player1.getApellido();
               
            }
            
            if(idPlayer2 == player2.getId() ){
            
                System.out.println("Id: "+idPlayer2+" Actual: "+player2.getId());
                nombrePlayer2 = player2.getNombre();
                apellidoPlayer2 = player2.getApellido();
                
            }
        }
        
        System.out.println("JUGADOR 1: "+nombrePlayer1+" "+apellidoPlayer1);
        System.out.println("JUGADOR 2: "+nombrePlayer2+" "+apellidoPlayer2);
     
        
        
        textUsuario1.setEnabled(false);
        textUsuario1.setText(nombrePlayer1+" "+apellidoPlayer1);
        
        textUsuario2.setText(nombrePlayer2+" "+apellidoPlayer2);
        textUsuario2.setEnabled(false);
     
        //Personajes
       
        String nombrePersonaje1 = null;
        String nombrePersonaje2 = null;
       
        //Personaje 1
        if(idPersonaje1 == 0){
            nombrePersonaje1 = "Naruto Uzumaki";
            
        }else if(idPersonaje1 == 1 ){
            nombrePersonaje1 = "Sasuke Uchiha";
           
        }else if(idPersonaje1 == 2 ){
            nombrePersonaje1 = "Sakura Haruno";
            
        }else if(idPersonaje1 == 3 ){
            nombrePersonaje1 = "Hinata Hyuga";

        }
        
        //Personaje 2
        if(idPersonaje2 == 0){
            nombrePersonaje2 = "Naruto Uzumaki";
            
        }else if(idPersonaje2 == 1 ){
            nombrePersonaje2 = "Sasuke Uchiha";
           
        }else if(idPersonaje2 == 2 ){
            nombrePersonaje2 = "Sakura Haruno";
            
        }else if(idPersonaje2 == 3 ){
            nombrePersonaje2 = "Hinata Hyuga";

        }
        
        System.out.println("PERSONAJE 1: "+nombrePersonaje1);
        System.out.println("PERSONAJE 2: "+nombrePersonaje2);
        
        labelNombrePersonaje.setText(nombrePersonaje1);
        labelNombrePersonaje2.setText(nombrePersonaje2);
      
        //Llamar funcion
        personajeJugador1();
        personajeJugador2();
        
    }
    
    private void vaciarCampo(){
   
       //false
       labelRegistrar.setVisible(false);
       labelPersonajes.setVisible(false);
       labelEscenarios.setVisible(false);
       labelSalir.setVisible(false);
       
       labelUsuario.setVisible(false);
       labelUsuario2.setVisible(false);
       labelFotoJ1.setVisible(false);
       labelFotoJ2.setVisible(false);
       labelVida.setVisible(false);
       labelVidaJ2.setVisible(false);
       labelEstamina.setVisible(false);
       labelEstaminaJ2.setVisible(false);
       labelNombrePersonaje.setVisible(false);
       labelNombrePersonaje2.setVisible(false);
       
       textArea1.setVisible(false);
       textArea2.setVisible(false);
       cuadroTexto.setVisible(false);
       cuadroTexto2.setVisible(false);
       textUsuario1.setVisible(false);
       textUsuario2.setVisible(false);
       
       labelResumen.setVisible(false);
       labelResumen2.setVisible(false);
       
       //Botones
       buttonAtacarJ1.setVisible(false);
       buttonAtacarJ2.setVisible(false);
       buttonCurarJ1.setVisible(false);
       buttonCurarJ2.setVisible(false);
       buttonDefenzaJ1.setVisible(false);
       buttonDefenzaJ2.setVisible(false);
       buttonEspecialJ1.setVisible(false);
       buttonEspecialJ2.setVisible(false);
       
       barraVidaPlayer1.setVisible(false);
       barraVidaPlayer2.setVisible(false);
       barraEstaminaPlayer1.setVisible(false);
       barraEstaminaPlayer2.setVisible(false);
       
       buttonRegistrar.setVisible(false);
       buttonPersonaje.setVisible(false);
       buttonEscenario.setVisible(false);
       buttonSalir.setVisible(false);
               
     
       labelPersonaje1.setVisible(false);
       labelPersonaje2.setVisible(false);
   
       labelAnimacion.setVisible(false);
       labelEspecial.setVisible(false);
       
   }
    
    private void llenarCampo(){
      
   
       //false
       labelRegistrar.setVisible(true);
       labelPersonajes.setVisible(true);
       labelEscenarios.setVisible(true);
       labelSalir.setVisible(true);
       
       labelUsuario.setVisible(true);
       labelUsuario2.setVisible(true);
       labelFotoJ1.setVisible(true);
       labelFotoJ2.setVisible(true);
       labelVida.setVisible(true);
       labelVidaJ2.setVisible(true);
       labelEstamina.setVisible(true);
       labelEstaminaJ2.setVisible(true);
       labelNombrePersonaje.setVisible(true);
       labelNombrePersonaje2.setVisible(true);
       
       textArea1.setVisible(true);
       textArea2.setVisible(true);
       cuadroTexto.setVisible(true);
       cuadroTexto2.setVisible(true);
       textUsuario1.setVisible(true);
       textUsuario2.setVisible(true);
       
       labelResumen.setVisible(true);
       labelResumen2.setVisible(true);
       
       //Botones
       buttonAtacarJ1.setVisible(true);
       buttonAtacarJ2.setVisible(true);
       buttonCurarJ1.setVisible(true);
       buttonCurarJ2.setVisible(true);
       buttonDefenzaJ1.setVisible(true);
       buttonDefenzaJ2.setVisible(true);
       buttonEspecialJ1.setVisible(true);
       buttonEspecialJ2.setVisible(true);
       
       barraVidaPlayer1.setVisible(true);
       barraVidaPlayer2.setVisible(true);
       barraEstaminaPlayer1.setVisible(true);
       barraEstaminaPlayer2.setVisible(true);
       
       buttonRegistrar.setVisible(true);
       buttonPersonaje.setVisible(true);
       buttonEscenario.setVisible(true);
       buttonSalir.setVisible(true);
               
     
       labelPersonaje1.setVisible(true);
       labelPersonaje2.setVisible(true);
   
       labelAnimacion.setVisible(true);
   
    
    
    }
   
   //ANIMACION 
    private Timer tiempo ;
    private TimerTask task;
    private int speed = 60;
    private int frame=0;
    boolean run = false;
     
           
  
    public void peleaJ1(){
    
            if(atacar == true){
        
            vaciarCampo();
            labelAnimacion.setVisible(true);
            ponerAtaquesPersonaje1();
           
            atacar = false;
            
        }
        if(defensa == true){
        
            vaciarCampo();
            labelAnimacion.setVisible(true);
            ponerDefensasPersonaje1();
 
            defensa = false;
            
        }
        if(curar == true){
        
            vaciarCampo();
            labelAnimacion.setVisible(true);
           ponerCurasPersonaje1();
            
            curar = false;
            
        }
        if(especial == true){
        
            vaciarCampo();
            labelEspecial.setVisible(true);
            ponerEspecial();
            
            especial = false;
            
        }
    }
    
    public void peleaJ2(){
    
            if(atacar2 == true){
        
            vaciarCampo();
            labelAnimacion.setVisible(true);
            ponerAtaquesPersonaje2();
           
            atacar2 = false;
            
        }
        if(defensa2 == true){
        
            vaciarCampo();
            labelAnimacion.setVisible(true);
            ponerDefensasPersonaje2();
 
            defensa2 = false;
            
        }
        if(curar2 == true){
        
            vaciarCampo();
            labelAnimacion.setVisible(true);
           ponerCurasPersonaje2();
            
            curar2 = false;
            
        }
        if(especial2 == true){
        
            vaciarCampo();
            labelEspecial.setVisible(true);
            ponerEspecial2();
            
            especial2 = false;
            
        }
    }
    
    //para la animacion  
    public void startAnimation() {    
        
           peleaJ1();
           peleaJ2();

           run=true;
           tiempo = new Timer();
           task = new TimerTask() {
int c = 0;               
                          
               public void run() {
                   frame++;                   
                   if (frame<=12){
                        
                     //Haber..
                        
                   }
                   else{frame=0;}
                   
                   if(c > 50){
                       //Aqui se detendría y todo volvería a ser normal
                       stopAnimation();
                      
                       labelAnimacion.setVisible(false);
                       labelEspecial.setVisible(false);
                   }
                   c++;
               }
           };
           //se inicia la animacion
           System.out.println("Se inicia la animacion");                                             
           tiempo.schedule(task,0,speed);           
    }
    //detiene la animacion
     public void stopAnimation() {        
        tiempo.cancel();
        task.cancel();
        run = false;
        System.out.println("La animacion fue detenida"); 
        llenarCampo();
    }

     //Funconalidad del Personaje 1
    public void personajeJugador1(){
    
        ImageIcon imagen;
        ImageIcon imagenFoto;
        ImageIcon personaje;
        ImageIcon fotoPersonaje;
       
        
        if(idPersonaje1 == 0){
            imagen = new ImageIcon(getClass().getResource("/imagenes/NarutoStart.gif"));        
            imagenFoto = new ImageIcon(getClass().getResource("/imagenes/FotoNaruto.png"));
            personaje = new ImageIcon(imagen.getImage().getScaledInstance(labelPersonaje1.getWidth(), labelPersonaje1.getHeight(), Image.SCALE_DEFAULT));
            fotoPersonaje = new ImageIcon(imagenFoto.getImage().getScaledInstance(labelFotoJ1.getWidth(), labelFotoJ1.getHeight(), Image.SCALE_DEFAULT));
            
            labelFotoJ1.setIcon(fotoPersonaje);
            labelPersonaje1.setIcon(personaje);
            
        }else if(idPersonaje1 == 1){
        
            imagen = new ImageIcon(getClass().getResource("/imagenes/SasukeStart.gif"));
            imagenFoto = new ImageIcon(getClass().getResource("/imagenes/FotoSasuke.png"));
            personaje = new ImageIcon(imagen.getImage().getScaledInstance(labelPersonaje1.getWidth(), labelPersonaje1.getHeight(), Image.SCALE_DEFAULT));
            fotoPersonaje = new ImageIcon(imagenFoto.getImage().getScaledInstance(labelFotoJ1.getWidth(), labelFotoJ1.getHeight(), Image.SCALE_DEFAULT));

            labelFotoJ1.setIcon(fotoPersonaje);
            labelPersonaje1.setIcon(personaje);
        
        }else if(idPersonaje1 == 2){
        
            imagen = new ImageIcon(getClass().getResource("/imagenes/SakuraStart.gif"));
            imagenFoto = new ImageIcon(getClass().getResource("/imagenes/FotoSakura.png"));
            personaje = new ImageIcon(imagen.getImage().getScaledInstance(labelPersonaje1.getWidth(), labelPersonaje1.getHeight(), Image.SCALE_DEFAULT));
            fotoPersonaje = new ImageIcon(imagenFoto.getImage().getScaledInstance(labelFotoJ1.getWidth(), labelFotoJ1.getHeight(), Image.SCALE_DEFAULT));

            labelFotoJ1.setIcon(fotoPersonaje);
            labelPersonaje1.setIcon(personaje);
        
        }else if(idPersonaje1 == 3){
        
            imagen = new ImageIcon(getClass().getResource("/imagenes/HinataStart.gif"));
            imagenFoto = new ImageIcon(getClass().getResource("/imagenes/FotoHinata.png"));
            personaje = new ImageIcon(imagen.getImage().getScaledInstance(labelPersonaje1.getWidth(), labelPersonaje1.getHeight(), Image.SCALE_DEFAULT));
            fotoPersonaje = new ImageIcon(imagenFoto.getImage().getScaledInstance(labelFotoJ1.getWidth(), labelFotoJ1.getHeight(), Image.SCALE_DEFAULT));

            labelFotoJ1.setIcon(fotoPersonaje);
            labelPersonaje1.setIcon(personaje);
        
        }
    
    }
    
    public void ponerAtaquesPersonaje1(){
    
        ImageIcon ataque, imagen;
        
        if(idPersonaje1 == 0){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/NAttack_1.gif"));
            ataque = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(ataque);
            
        }else if(idPersonaje1 == 1){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/SAttack_1.gif"));
            ataque = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(ataque);
            
        }else if(idPersonaje1 == 2){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/SSAttack_1.gif"));
            ataque = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(ataque);
            
        }else if(idPersonaje1 == 3){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/HAttack_1.gif"));
            ataque = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(ataque);
            
        }

                          
    
    }
    
    public void ponerDefensasPersonaje1(){
    
        ImageIcon defensa, imagen;
        
        if(idPersonaje1 == 0){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/NDef_1.gif"));
            defensa = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(defensa);
            
        }else if(idPersonaje1 == 1){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/SDef_1.gif"));
            defensa = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(defensa);
            
        }else if(idPersonaje1 == 2){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/SSDef_1.gif"));
            defensa = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(defensa);
            
        }else if(idPersonaje1 == 3){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/HDef_1.gif"));
            defensa = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(defensa);
            
        }

    }
    
    public void ponerCurasPersonaje1(){
    
    ImageIcon curas, imagen;
    
    if(idPersonaje1 == 0){
    imagen = new ImageIcon(getClass().getResource("/tecnicas/NCuras_1.gif"));
    curas = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
    labelAnimacion.setIcon(curas);
    
    }else if(idPersonaje1 == 1){
    imagen = new ImageIcon(getClass().getResource("/tecnicas/SCuras_1.gif"));
    curas = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
    labelAnimacion.setIcon(curas);
    
    }else if(idPersonaje1 == 2){
    imagen = new ImageIcon(getClass().getResource("/tecnicas/SSCuras_1.gif"));
    curas = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
    labelAnimacion.setIcon(curas);
    
    }else if(idPersonaje1 == 3){
    imagen = new ImageIcon(getClass().getResource("/tecnicas/HCuras_1.gif"));
    curas = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
    labelAnimacion.setIcon(curas);
    
    }
    
    }
     
    public void ponerEspecial(){
     
          ImageIcon especial, imagen;

          
          if(idPersonaje1 == 0){
              imagen = new ImageIcon(getClass().getResource("/tecnicas/NEspecial_1.gif"));
              especial = new ImageIcon(imagen.getImage().getScaledInstance(labelEspecial.getWidth(), labelEspecial.getHeight(), Image.SCALE_DEFAULT));
              labelEspecial.setIcon(especial);
              
          }else if(idPersonaje1 == 1){
              imagen = new ImageIcon(getClass().getResource("/tecnicas/SEspecial_1.gif"));
              especial = new ImageIcon(imagen.getImage().getScaledInstance(labelEspecial.getWidth(), labelEspecial.getHeight(), Image.SCALE_DEFAULT));
              labelEspecial.setIcon(especial);
              
          }else if(idPersonaje1 == 2){
              imagen = new ImageIcon(getClass().getResource("/tecnicas/SSEspecial_1.gif"));
              especial = new ImageIcon(imagen.getImage().getScaledInstance(labelEspecial.getWidth(), labelEspecial.getHeight(), Image.SCALE_DEFAULT));
              labelEspecial.setIcon(especial);
              
          }else if(idPersonaje1 == 3){
              imagen = new ImageIcon(getClass().getResource("/tecnicas/HEspecial_1.gif"));
              especial = new ImageIcon(imagen.getImage().getScaledInstance(labelEspecial.getWidth(), labelEspecial.getHeight(), Image.SCALE_DEFAULT));
              labelEspecial.setIcon(especial);
              
          }
         
         
     }
    
    //Funcionalidad del peronaje 2
    
    public void personajeJugador2(){
    
        ImageIcon imagen;
        ImageIcon imagenFoto;
        ImageIcon personaje;
        ImageIcon fotoPersonaje;
       
        
        if(idPersonaje2 == 0){
            imagen = new ImageIcon(getClass().getResource("/imagenes/NarutoStart2.gif"));        
            imagenFoto = new ImageIcon(getClass().getResource("/imagenes/FotoNaruto.png"));
            personaje = new ImageIcon(imagen.getImage().getScaledInstance(labelPersonaje2.getWidth(), labelPersonaje2.getHeight(), Image.SCALE_DEFAULT));
            fotoPersonaje = new ImageIcon(imagenFoto.getImage().getScaledInstance(labelFotoJ2.getWidth(), labelFotoJ2.getHeight(), Image.SCALE_DEFAULT));
            
            labelFotoJ2.setIcon(fotoPersonaje);
            labelPersonaje2.setIcon(personaje);
            
        }else if(idPersonaje2 == 1){
        
            imagen = new ImageIcon(getClass().getResource("/imagenes/SasukeStart2.gif"));
            imagenFoto = new ImageIcon(getClass().getResource("/imagenes/FotoSasuke.png"));
            personaje = new ImageIcon(imagen.getImage().getScaledInstance(labelPersonaje2.getWidth(), labelPersonaje2.getHeight(), Image.SCALE_DEFAULT));
            fotoPersonaje = new ImageIcon(imagenFoto.getImage().getScaledInstance(labelFotoJ2.getWidth(), labelFotoJ2.getHeight(), Image.SCALE_DEFAULT));

            labelFotoJ2.setIcon(fotoPersonaje);
            labelPersonaje2.setIcon(personaje);
        
        }else if(idPersonaje2 == 2){
        
            imagen = new ImageIcon(getClass().getResource("/imagenes/SakuraStart2.gif"));
            imagenFoto = new ImageIcon(getClass().getResource("/imagenes/FotoSakura.png"));
            personaje = new ImageIcon(imagen.getImage().getScaledInstance(labelPersonaje2.getWidth(), labelPersonaje2.getHeight(), Image.SCALE_DEFAULT));
            fotoPersonaje = new ImageIcon(imagenFoto.getImage().getScaledInstance(labelFotoJ2.getWidth(), labelFotoJ2.getHeight(), Image.SCALE_DEFAULT));

            labelFotoJ2.setIcon(fotoPersonaje);
            labelPersonaje2.setIcon(personaje);
        
        }else if(idPersonaje2 == 3){
        
            imagen = new ImageIcon(getClass().getResource("/imagenes/HinataStart2.gif"));
            imagenFoto = new ImageIcon(getClass().getResource("/imagenes/FotoHinata.png"));
            personaje = new ImageIcon(imagen.getImage().getScaledInstance(labelPersonaje2.getWidth(), labelPersonaje2.getHeight(), Image.SCALE_DEFAULT));
            fotoPersonaje = new ImageIcon(imagenFoto.getImage().getScaledInstance(labelFotoJ2.getWidth(), labelFotoJ2.getHeight(), Image.SCALE_DEFAULT));

            labelFotoJ2.setIcon(fotoPersonaje);
            labelPersonaje2.setIcon(personaje);
        
        }
    
    }
    
    public void ponerAtaquesPersonaje2(){
    
        ImageIcon ataque, imagen;
        
        if(idPersonaje2 == 0){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/NAttack_2.gif"));
            ataque = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(ataque);
            
        }else if(idPersonaje2 == 1){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/SAttack_2.gif"));
            ataque = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(ataque);
            
        }else if(idPersonaje2 == 2){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/SSAttack_2.gif"));
            ataque = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(ataque);
            
        }else if(idPersonaje2 == 3){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/HAttack_2.gif"));
            ataque = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(ataque);
            
        }

                          
    
    }
    
    public void ponerDefensasPersonaje2(){
    
        ImageIcon defensa, imagen;
        
        if(idPersonaje2 == 0){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/NDef_2.gif"));
            defensa = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(defensa);
            
        }else if(idPersonaje2 == 1){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/SDef_2.gif"));
            defensa = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(defensa);
            
        }else if(idPersonaje2 == 2){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/SSDef_2.gif"));
            defensa = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(defensa);
            
        }else if(idPersonaje2 == 3){
            imagen = new ImageIcon(getClass().getResource("/tecnicas/HDef_2.gif"));
            defensa = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
            labelAnimacion.setIcon(defensa);
            
        }

    }
    
    public void ponerCurasPersonaje2(){
    
    ImageIcon curas, imagen;
    
    if(idPersonaje2 == 0){
    imagen = new ImageIcon(getClass().getResource("/tecnicas/NCuras_2.gif"));
    curas = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
    labelAnimacion.setIcon(curas);
    
    }else if(idPersonaje2 == 1){
    imagen = new ImageIcon(getClass().getResource("/tecnicas/SCuras_2.gif"));
    curas = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
    labelAnimacion.setIcon(curas);
    
    }else if(idPersonaje2 == 2){
    imagen = new ImageIcon(getClass().getResource("/tecnicas/SSCuras_2.gif"));
    curas = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
    labelAnimacion.setIcon(curas);
    
    }else if(idPersonaje2 == 3){
    imagen = new ImageIcon(getClass().getResource("/tecnicas/HCuras_2.gif"));
    curas = new ImageIcon(imagen.getImage().getScaledInstance(labelAnimacion.getWidth(), labelAnimacion.getHeight(), Image.SCALE_DEFAULT));
    labelAnimacion.setIcon(curas);
    
    }
    
    }
     
    public void ponerEspecial2(){
     
          ImageIcon especial, imagen;

          
          if(idPersonaje2 == 0){
              imagen = new ImageIcon(getClass().getResource("/tecnicas/NEspecial_2.gif"));
              especial = new ImageIcon(imagen.getImage().getScaledInstance(labelEspecial.getWidth(), labelEspecial.getHeight(), Image.SCALE_DEFAULT));
              labelEspecial.setIcon(especial);
              
          }else if(idPersonaje2 == 1){
              imagen = new ImageIcon(getClass().getResource("/tecnicas/SEspecial_2.gif"));
              especial = new ImageIcon(imagen.getImage().getScaledInstance(labelEspecial.getWidth(), labelEspecial.getHeight(), Image.SCALE_DEFAULT));
              labelEspecial.setIcon(especial);
              
          }else if(idPersonaje2 == 2){
              imagen = new ImageIcon(getClass().getResource("/tecnicas/SSEspecial_2.gif"));
              especial = new ImageIcon(imagen.getImage().getScaledInstance(labelEspecial.getWidth(), labelEspecial.getHeight(), Image.SCALE_DEFAULT));
              labelEspecial.setIcon(especial);
              
          }else if(idPersonaje2 == 3){
              imagen = new ImageIcon(getClass().getResource("/tecnicas/HEspecial_2.gif"));
              especial = new ImageIcon(imagen.getImage().getScaledInstance(labelEspecial.getWidth(), labelEspecial.getHeight(), Image.SCALE_DEFAULT));
              labelEspecial.setIcon(especial);
              
          }
         
         
     }
    
    public void traerJugadores(int idJugador1, int idJugador2) {
        Jugadores jugador1 = new Jugadores();
        Jugadores jugador2 = new Jugadores();
        
        for (int i = 0; i < listaJugadores.size(); i++) {
            jugador1 = (Jugadores) listaJugadores.get(i);
            jugador2 = (Jugadores) listaJugadores.get(i);

            if (jugador1.getId() == idJugador1) {
                player1 = jugador1;
                
                System.out.println("jugador1 Bucle: " + player1.getId());
            }
            if (jugador2.getId() == idJugador2) {
                player2 = jugador2;
                
                System.out.println("jugador2 Bucle: " + player2.getId());
            }
        }
    }
    
    public void traerPersonajes(int idPersonaje1, int idPersonaje2) {
         
        Personajes per = new Personajes();
        /*for (int i = 0; i < listaPersonajes.size(); i++) {
        per = (Personajes) listaPersonajes.get(i);
        if (per.getId() == idPersonaje1) {
        personaje1 = per;
        vidaPlayer1 = personaje1.getVida();
        System.out.println("pokemion1 Bucle: " + personaje1.getId());
        }
        if (per.getId() == idPersonaje2) {
        personaje2 = per;
        vidaPlayer2 = personaje2.getVida();
        System.out.println("pokemon2 Bucle: " + personaje2.getId());
        }
        }*/
    }
    
    private void ponerAudio(){
    
        audio = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/Batalla.wav")); 
        audio.play();
    }
    
    
    //Imagenes
    private void ponerFondo(){
    
        ImageIcon imagenFondo;
        ImageIcon fondo;
        
        if(escena == 0){
        
            imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Escena_1.jpg"));        
            fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
            labelFondo.setIcon(fondo);
            
        }else if(escena == 1){
        
            imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Escena_2.png"));        
            fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
            labelFondo.setIcon(fondo);
            
        }else if(escena == 2){
        
            imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Escena_3.jpg"));        
            fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
            labelFondo.setIcon(fondo);
            
        }else if(escena == 3){
        
            imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Escena_4.png"));        
            fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
            labelFondo.setIcon(fondo);
            
        }else if(escena == 4){
        
            imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Escena_5.png"));        
            fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
            labelFondo.setIcon(fondo);
            
        }else if(escena == 5){
        
            imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Escena_6.gif"));        
            fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
            labelFondo.setIcon(fondo);
            
        }
        
        
    }
    
     
     //Voy a trabajar en la barra que tiene que dismiuir
 
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAtacarJ1 = new javax.swing.JButton();
        buttonDefenzaJ1 = new javax.swing.JButton();
        buttonCurarJ1 = new javax.swing.JButton();
        buttonEspecialJ1 = new javax.swing.JButton();
        barraVidaPlayer1 = new javax.swing.JProgressBar();
        barraEstaminaPlayer1 = new javax.swing.JProgressBar();
        labelVida = new javax.swing.JLabel();
        labelEstamina = new javax.swing.JLabel();
        labelVidaJ2 = new javax.swing.JLabel();
        labelEstaminaJ2 = new javax.swing.JLabel();
        barraVidaPlayer2 = new javax.swing.JProgressBar();
        barraEstaminaPlayer2 = new javax.swing.JProgressBar();
        buttonAtacarJ2 = new javax.swing.JButton();
        buttonDefenzaJ2 = new javax.swing.JButton();
        buttonCurarJ2 = new javax.swing.JButton();
        buttonEspecialJ2 = new javax.swing.JButton();
        labelFotoJ1 = new javax.swing.JLabel();
        labelFotoJ2 = new javax.swing.JLabel();
        labelNombrePersonaje = new javax.swing.JLabel();
        labelNombrePersonaje2 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        textUsuario1 = new javax.swing.JTextField();
        labelUsuario2 = new javax.swing.JLabel();
        textUsuario2 = new javax.swing.JTextField();
        labelPersonaje1 = new javax.swing.JLabel();
        labelPersonaje2 = new javax.swing.JLabel();
        cuadroTexto = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        cuadroTexto2 = new javax.swing.JScrollPane();
        textArea2 = new javax.swing.JTextArea();
        labelResumen = new javax.swing.JLabel();
        labelResumen2 = new javax.swing.JLabel();
        buttonRegistrar = new javax.swing.JButton();
        buttonPersonaje = new javax.swing.JButton();
        buttonEscenario = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        labelRegistrar = new javax.swing.JLabel();
        labelPersonajes = new javax.swing.JLabel();
        labelEscenarios = new javax.swing.JLabel();
        labelSalir = new javax.swing.JLabel();
        labelAnimacion = new javax.swing.JLabel();
        labelEspecial = new javax.swing.JLabel();
        labelEscudo = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAtacarJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IAtacar.png"))); // NOI18N
        buttonAtacarJ1.setContentAreaFilled(false);
        buttonAtacarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtacarJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAtacarJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, 70));

        buttonDefenzaJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IDefensa.png"))); // NOI18N
        buttonDefenzaJ1.setContentAreaFilled(false);
        buttonDefenzaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDefenzaJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDefenzaJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 70));

        buttonCurarJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ICurar.png"))); // NOI18N
        buttonCurarJ1.setContentAreaFilled(false);
        buttonCurarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCurarJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCurarJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 70, 70));

        buttonEspecialJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IEspecial.png"))); // NOI18N
        buttonEspecialJ1.setBorderPainted(false);
        buttonEspecialJ1.setContentAreaFilled(false);
        buttonEspecialJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 70, 70));

        barraVidaPlayer1.setBackground(new java.awt.Color(102, 255, 102));
        barraVidaPlayer1.setForeground(new java.awt.Color(51, 51, 51));
        barraVidaPlayer1.setStringPainted(true);
        getContentPane().add(barraVidaPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 138, 400, 28));

        barraEstaminaPlayer1.setStringPainted(true);
        getContentPane().add(barraEstaminaPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 192, 400, 28));

        labelVida.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelVida.setForeground(new java.awt.Color(255, 255, 255));
        labelVida.setText("VIDA:");
        getContentPane().add(labelVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 118, -1, -1));

        labelEstamina.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelEstamina.setForeground(new java.awt.Color(255, 255, 255));
        labelEstamina.setText("ENERGIA:");
        getContentPane().add(labelEstamina, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 172, -1, -1));

        labelVidaJ2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelVidaJ2.setForeground(new java.awt.Color(255, 255, 255));
        labelVidaJ2.setText(":VIDA");
        getContentPane().add(labelVidaJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1279, 113, -1, -1));

        labelEstaminaJ2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelEstaminaJ2.setForeground(new java.awt.Color(255, 255, 255));
        labelEstaminaJ2.setText(":ENERGÍA");
        getContentPane().add(labelEstaminaJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1259, 172, -1, -1));

        barraVidaPlayer2.setStringPainted(true);
        getContentPane().add(barraVidaPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 133, 400, 28));

        barraEstaminaPlayer2.setStringPainted(true);
        getContentPane().add(barraEstaminaPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 192, 400, 28));

        buttonAtacarJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IAtacar.png"))); // NOI18N
        buttonAtacarJ2.setBorderPainted(false);
        buttonAtacarJ2.setContentAreaFilled(false);
        buttonAtacarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtacarJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAtacarJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 260, 70, 70));

        buttonDefenzaJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IDefensa.png"))); // NOI18N
        buttonDefenzaJ2.setContentAreaFilled(false);
        buttonDefenzaJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDefenzaJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDefenzaJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 330, 70, 70));

        buttonCurarJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ICurar.png"))); // NOI18N
        buttonCurarJ2.setContentAreaFilled(false);
        buttonCurarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCurarJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCurarJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 410, 70, 70));

        buttonEspecialJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IEspecial.png"))); // NOI18N
        buttonEspecialJ2.setContentAreaFilled(false);
        buttonEspecialJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 490, 70, 70));

        labelFotoJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FotoSasuke.png"))); // NOI18N
        getContentPane().add(labelFotoJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 90));

        labelFotoJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FotoSakura.png"))); // NOI18N
        getContentPane().add(labelFotoJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 10, 90, 90));

        labelNombrePersonaje.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelNombrePersonaje.setForeground(new java.awt.Color(255, 255, 255));
        labelNombrePersonaje.setText("Nombre del Personaje");
        getContentPane().add(labelNombrePersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 93, -1, -1));

        labelNombrePersonaje2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelNombrePersonaje2.setForeground(new java.awt.Color(255, 255, 255));
        labelNombrePersonaje2.setText("Nombre del personaje");
        getContentPane().add(labelNombrePersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 93, -1, -1));

        labelUsuario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuario:");
        getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));
        getContentPane().add(textUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, -1));

        labelUsuario2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario2.setText(":Usuario");
        getContentPane().add(labelUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, -1, -1));
        getContentPane().add(textUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 140, -1));

        labelPersonaje1.setForeground(new java.awt.Color(255, 255, 255));
        labelPersonaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelPersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 220, 220));

        labelPersonaje2.setForeground(new java.awt.Color(255, 255, 255));
        labelPersonaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPersonaje2.setText("ANIMACIONES GIF");
        getContentPane().add(labelPersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 348, 220, 220));

        textArea1.setColumns(20);
        textArea1.setRows(5);
        cuadroTexto.setViewportView(textArea1);

        getContentPane().add(cuadroTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 592, 450, 80));

        textArea2.setColumns(20);
        textArea2.setRows(5);
        cuadroTexto2.setViewportView(textArea2);

        getContentPane().add(cuadroTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 592, 450, 80));

        labelResumen.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        labelResumen.setForeground(new java.awt.Color(255, 255, 255));
        labelResumen.setText("Resumen:");
        getContentPane().add(labelResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 574, -1, -1));

        labelResumen2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        labelResumen2.setForeground(new java.awt.Color(255, 255, 255));
        labelResumen2.setText("Resumen");
        getContentPane().add(labelResumen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1263, 574, -1, -1));

        buttonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/S6.png"))); // NOI18N
        buttonRegistrar.setBorder(null);
        buttonRegistrar.setBorderPainted(false);
        buttonRegistrar.setContentAreaFilled(false);
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, 70, 70));

        buttonPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/S1.png"))); // NOI18N
        buttonPersonaje.setBorder(null);
        buttonPersonaje.setBorderPainted(false);
        buttonPersonaje.setContentAreaFilled(false);
        buttonPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 70, 70));

        buttonEscenario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/S2.png"))); // NOI18N
        buttonEscenario.setBorder(null);
        buttonEscenario.setBorderPainted(false);
        buttonEscenario.setContentAreaFilled(false);
        buttonEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEscenarioActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEscenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 70, 70));

        buttonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/S3.png"))); // NOI18N
        buttonSalir.setContentAreaFilled(false);
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 70, 70));

        labelRegistrar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelRegistrar.setText("REGISTRAR/");
        getContentPane().add(labelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        labelPersonajes.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelPersonajes.setText("PERSONAJES/");
        getContentPane().add(labelPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, -1, -1));

        labelEscenarios.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelEscenarios.setText("ESCENARIOS/");
        getContentPane().add(labelEscenarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, -1, -1));

        labelSalir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelSalir.setText("SALIR");
        getContentPane().add(labelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));
        getContentPane().add(labelAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 360, 250));
        getContentPane().add(labelEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 690));
        getContentPane().add(labelEscudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 290, 270));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        // TODO add your handling code here:
        audio.stop();
        this.setVisible(false);
        GUIRegistro registro = new GUIRegistro();
        registro.setVisible(true);
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonajeActionPerformed
        // TODO add your handling code here:
        audio.stop();
        this.setVisible(false);
        GUISeleccion seleccion = new GUISeleccion();
        seleccion.setVisible(true);
        
    }//GEN-LAST:event_buttonPersonajeActionPerformed

    private void buttonEscenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEscenarioActionPerformed
        // TODO add your handling code here:
        audio.stop();
        this.setVisible(false);
        GUILoading load = new GUILoading(idPlayer1, idPlayer2, idPersonaje1, idPersonaje2);
        load.setVisible(true);
    }//GEN-LAST:event_buttonEscenarioActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        // TODO add your handling code here:
        audio.stop();
        System.exit(0);
        
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void buttonAtacarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtacarJ1ActionPerformed
        // TODO add your handling code here:
        atacar = true;     
        startAnimation();    
     
        barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()+10));
        switch(idPlayer1){
            case 0:
                double ataqueNaruto = 140*(0.100);
                barraVidaPlayer2.setValue((int) (barraVidaPlayer2.getValue()-ataqueNaruto));
                barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-5));
                
         
                break;
            case 1:
                double ataqueSasuke = 110*(0.100);
                barraVidaPlayer2.setValue((int) (barraVidaPlayer2.getValue()-ataqueSasuke));
                barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-5));
                
                break;
            case 2:
                double ataqueSakura = 95*(0.100);
                barraVidaPlayer2.setValue((int) (barraVidaPlayer2.getValue()-ataqueSakura));
                barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-5));
                break;
            case 3:
                double ataqueHinata= 100*(0.100);
                barraVidaPlayer2.setValue((int) (barraVidaPlayer2.getValue()-ataqueHinata));
                barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-5));
                break;
        }
        
       if(barraVidaPlayer2.getValue() <= 0){
            JOptionPane.showMessageDialog(rootPane, "Ha ganado el jugador 1", "VICTORIA", 1);
        deshabilitarBotones();
        this.setVisible(false);
            
        }else{
       
           deshabilitarBotones();
       habilitarBotones2();
       }
      
       
      
    }//GEN-LAST:event_buttonAtacarJ1ActionPerformed

    private void buttonDefenzaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDefenzaJ1ActionPerformed
        // TODO add your handling code here:
        buttonDefenzaJ1.setEnabled(false);
        defensa = true;
       
        barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer1.getValue()+10));
        barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-10));
        if(contDefensa >= 3 ){
        
            startAnimation();
            buttonDefenzaJ1.setEnabled(true);
            contDefensa = 0;
            System.out.println("Sin escudo");
        }else {
        
            ImageIcon escudo, fondoEscudo;
            
            escudo = new ImageIcon(getClass().getResource("/imagenes/Shield.gif"));
            System.out.println("Escudo activo");
        
        }
       
        deshabilitarBotones();
        habilitarBotones2();
    }//GEN-LAST:event_buttonDefenzaJ1ActionPerformed

    private void buttonCurarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCurarJ1ActionPerformed
        // TODO add your handling code here:
        curar = true;
         barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()+10));
        if(barraEstaminaPlayer1.getValue() >= 20){
              startAnimation();
              barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()+20));
               
        
        }else{
             JOptionPane.showMessageDialog(rootPane, "No tienes suficiente energía para curarte.."+"\n"+" Has perdido tu oportunidad..", " ¡QUE MALA SUERTE!", 1);
            
        
        }
      
       deshabilitarBotones();
       habilitarBotones2();
    }//GEN-LAST:event_buttonCurarJ1ActionPerformed

    private void buttonEspecialJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialJ1ActionPerformed
        // TODO add your handling code here:
        especial = true;
         barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()+10));

        if(barraEstaminaPlayer1.getValue() >= 50){
            startAnimation();
            switch(idPlayer1){
                case 0:
                    double ataqueNaruto = 200*(0.100);
                    barraVidaPlayer2.setValue((int) (barraVidaPlayer2.getValue()-ataqueNaruto));
                    barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-50));
                    
                    
                    break;
                case 1:
                    double ataqueSasuke = 230*(0.100);
                    barraVidaPlayer2.setValue((int) (barraVidaPlayer2.getValue()-ataqueSasuke));
                    barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-50));
                    
                    
                    break;
                case 2:
                    double ataqueSakura = 156*(0.100);
                    barraVidaPlayer2.setValue((int) (barraVidaPlayer2.getValue()-ataqueSakura));
                    barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-50));
                    
                    
                    break;
                case 3:
                    double ataqueHinata= 210*(0.100);
                    barraVidaPlayer2.setValue((int) (barraVidaPlayer2.getValue()-ataqueHinata));
                    barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()-50));
                    
                    
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "No tienes suficiente energía para atacarlo!"+"\n"+" Has perdido tu oportunidad..", " ¡QUE MALA SUERTE!", 1);
            this.setVisible(false);
        }
        if(barraVidaPlayer2.getValue() <= 0){
        JOptionPane.showMessageDialog(rootPane, "Ha ganado el jugador 1", "VICTORIA", 1);
        deshabilitarBotones();
        this.setVisible(false);
        
        }else{
        
             deshabilitarBotones();
        habilitarBotones2();
        }
        
       
    }//GEN-LAST:event_buttonEspecialJ1ActionPerformed

    private void buttonAtacarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtacarJ2ActionPerformed
        // TODO add your handling code here:
        atacar2 = true;
        startAnimation();
        contDefensa++;
        
        barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()+10));
        switch(idPlayer2){
            case 0:
                double ataqueNaruto = 140*(0.100);
                barraVidaPlayer1.setValue((int) (barraVidaPlayer1.getValue()-ataqueNaruto));
                barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()-5));
                
         
                break;
            case 1:
                double ataqueSasuke = 110*(0.100);
                barraVidaPlayer1.setValue((int) (barraVidaPlayer1.getValue()-ataqueSasuke));
                barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()-5));
                
                break;
            case 2:
                double ataqueSakura = 95*(0.100);
                barraVidaPlayer1.setValue((int) (barraVidaPlayer1.getValue()-ataqueSakura));
                barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()-5));
                break;
            case 3:
                double ataqueHinata= 100*(0.100);
                barraVidaPlayer1.setValue((int) (barraVidaPlayer1.getValue()-ataqueHinata));
                barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()-5));
                break;
        }
        
       if(barraVidaPlayer1.getValue() <= 0){
            JOptionPane.showMessageDialog(rootPane, "Ha ganado el jugador 2", "VICTORIA", 1);
            deshabilitarBotones();
            this.setVisible(false);
        }else{
           deshabilitarBotones();
           habilitarBotones1();
       }
      
       
        
    }//GEN-LAST:event_buttonAtacarJ2ActionPerformed

    private void buttonDefenzaJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDefenzaJ2ActionPerformed
        // TODO add your handling code here:
        defensa2 = true;
        startAnimation();
        
         barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()+10));
        if(contDefensa2 >= 3 ){
        
            startAnimation();
            buttonDefenzaJ2.setEnabled(true);
            contDefensa2 = 0;
            System.out.println("Sin escudo");
        }else {
        
            ImageIcon escudo, fondoEscudo;
            
            escudo = new ImageIcon(getClass().getResource("/imagenes/Shield.gif"));
            System.out.println("Escudo activo");
        
        }
        
       
        deshabilitarBotones();
       habilitarBotones1();
        
    }//GEN-LAST:event_buttonDefenzaJ2ActionPerformed

    private void buttonCurarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCurarJ2ActionPerformed
        // TODO add your handling code here:
        curar2 = true;
        contDefensa++;
        barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()+10));
        if(barraEstaminaPlayer2.getValue() >= 20){
              startAnimation();
              barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()+20));
               
        
        }else{
             JOptionPane.showMessageDialog(rootPane, "No tienes suficiente energía para curarte.."+"\n"+" Has perdido tu oportunidad..", " ¡QUE MALA SUERTE!", 1);
            
        
        }
      
         deshabilitarBotones();
       habilitarBotones1();
        
    }//GEN-LAST:event_buttonCurarJ2ActionPerformed

    private void buttonEspecialJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialJ2ActionPerformed
        // TODO add your handling code here:
        especial2 = true;
        startAnimation();
        contDefensa++;
        
          barraEstaminaPlayer1.setValue((int) (barraEstaminaPlayer1.getValue()+10));

        if(barraEstaminaPlayer2.getValue() >= 50){
            startAnimation();
            switch(idPlayer2){
                case 0:
                    double ataqueNaruto = 200*(0.100);
                    barraVidaPlayer1.setValue((int) (barraVidaPlayer1.getValue()-ataqueNaruto));
                    barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()-50));
                    
                    
                    break;
                case 1:
                    double ataqueSasuke = 230*(0.100);
                    barraVidaPlayer1.setValue((int) (barraVidaPlayer1.getValue()-ataqueSasuke));
                    barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()-50));
                    
                    
                    break;
                case 2:
                    double ataqueSakura = 156*(0.100);
                    barraVidaPlayer1.setValue((int) (barraVidaPlayer1.getValue()-ataqueSakura));
                    barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()-50));
                    
                    
                    break;
                case 3:
                    double ataqueHinata= 210*(0.100);
                    barraVidaPlayer1.setValue((int) (barraVidaPlayer1.getValue()-ataqueHinata));
                    barraEstaminaPlayer2.setValue((int) (barraEstaminaPlayer2.getValue()-50));
                    
                    
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "No tienes suficiente energía para atacarlo!"+"\n"+" Has perdido tu oportunidad..", " ¡QUE MALA SUERTE!", 1);
            
        }
        if(barraVidaPlayer1.getValue() <= 0){
        JOptionPane.showMessageDialog(rootPane, "Ha ganado el jugador 2", "VICTORIA", 1);
        this.setVisible(false);
        GUIDatos estadisitcas = new GUIDatos();
        
        deshabilitarBotones();
        }else{
        
             deshabilitarBotones();
        habilitarBotones1();
        }
        
       
        
    }//GEN-LAST:event_buttonEspecialJ2ActionPerformed

    public void habilitarBotones1(){
    
        buttonAtacarJ1.setEnabled(true);
        buttonCurarJ1.setEnabled(true);
        buttonDefenzaJ1.setEnabled(true);
        buttonEspecialJ1.setEnabled(true);
    
    }
    
     public void habilitarBotones2(){
    
        buttonAtacarJ2.setEnabled(true);
        buttonCurarJ2.setEnabled(true);
        buttonDefenzaJ2.setEnabled(true);
        buttonEspecialJ2.setEnabled(true);
    
    }
     
     public void deshabilitarBotones(){
    
        buttonAtacarJ1.setEnabled(false);
        buttonCurarJ1.setEnabled(false);
        buttonDefenzaJ1.setEnabled(false);
        buttonEspecialJ1.setEnabled(false);
        buttonAtacarJ2.setEnabled(false);
        buttonCurarJ2.setEnabled(false);
        buttonDefenzaJ2.setEnabled(false);
        buttonEspecialJ2.setEnabled(false);
    
    }
     
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBatalla(0,0,0,0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraEstaminaPlayer1;
    private javax.swing.JProgressBar barraEstaminaPlayer2;
    private javax.swing.JProgressBar barraVidaPlayer1;
    private javax.swing.JProgressBar barraVidaPlayer2;
    private javax.swing.JButton buttonAtacarJ1;
    private javax.swing.JButton buttonAtacarJ2;
    private javax.swing.JButton buttonCurarJ1;
    private javax.swing.JButton buttonCurarJ2;
    private javax.swing.JButton buttonDefenzaJ1;
    private javax.swing.JButton buttonDefenzaJ2;
    private javax.swing.JButton buttonEscenario;
    private javax.swing.JButton buttonEspecialJ1;
    private javax.swing.JButton buttonEspecialJ2;
    private javax.swing.JButton buttonPersonaje;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JScrollPane cuadroTexto;
    private javax.swing.JScrollPane cuadroTexto2;
    private javax.swing.JLabel labelAnimacion;
    private javax.swing.JLabel labelEscenarios;
    private javax.swing.JLabel labelEscudo;
    private javax.swing.JLabel labelEspecial;
    private javax.swing.JLabel labelEstamina;
    private javax.swing.JLabel labelEstaminaJ2;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFotoJ1;
    private javax.swing.JLabel labelFotoJ2;
    private javax.swing.JLabel labelNombrePersonaje;
    private javax.swing.JLabel labelNombrePersonaje2;
    private javax.swing.JLabel labelPersonaje1;
    private javax.swing.JLabel labelPersonaje2;
    private javax.swing.JLabel labelPersonajes;
    private javax.swing.JLabel labelRegistrar;
    private javax.swing.JLabel labelResumen;
    private javax.swing.JLabel labelResumen2;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelUsuario2;
    private javax.swing.JLabel labelVida;
    private javax.swing.JLabel labelVidaJ2;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JTextArea textArea2;
    private javax.swing.JTextField textUsuario1;
    private javax.swing.JTextField textUsuario2;
    // End of variables declaration//GEN-END:variables
}
