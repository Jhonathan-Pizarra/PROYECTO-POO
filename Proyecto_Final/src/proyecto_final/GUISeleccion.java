/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.applet.AudioClip;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class GUISeleccion extends javax.swing.JFrame {
    
    AudioClip audio;
    ArrayList<Object> listaPersonajes = new ArrayList();
    ArrayList<Object> listaJugadores = new ArrayList();
    DefaultComboBoxModel modeloComboBox, modeloComboBox2, modeloComboBoxPersonajes;
    int idJugador1 = 0; //Al incio del programa
    int idJugador2 = -1; //Hago que los jugdores sean diferntes, este valor cambiará cuando el usuario filtre un jugador.
    
    int idPersonajePlayer1;
    int idPersonajePlayer2; 
    
    boolean personajePlayer1 = false;
    boolean personajePlayer2 = false;
    
    Control registro = new Control();
    Personajes personajeSeleccionado = new Personajes();
    Jugadores jugador1Seleccionado = new Jugadores();
    Jugadores jugador2Seleccionado = new Jugadores();
    
    ImageIcon imagenPersonaje[] = new ImageIcon[4];
    ImageIcon personaje[] = new ImageIcon[4];
        
    ImageIcon imagenFondo;
    ImageIcon fondo;
    ImageIcon imagenNartuo, imagenSasuke, imagenSakura, imagenHinata, imagenVS;
    ImageIcon naruto, sasuke, sakura, hinata, vs;
    ImageIcon imagenClick;
    ImageIcon click;
    ImageIcon imagen;
    ImageIcon atributo;
    /**
     * Creates new form GUISeleccion
     */
    public GUISeleccion() {
        initComponents();
       
        ponerFondo();
        ponerAudio();
        
        listaJugadores = registro.cargarObjetos("archivoJugadores.dat");
        registro.escribirObjeto("archivoPersonajes.dat", listaPersonajes);
        
        controlBotones();
        ponerImagenesPersonajes();
        ponerDatosPersonajes();
        llenarComboJugadores();
        llenarComboPersonajes();
    
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxPlayer1 = new javax.swing.JComboBox();
        buttonPlayer1 = new javax.swing.JButton();
        comboBoxPersonajes = new javax.swing.JComboBox();
        comboBoxPlayer2 = new javax.swing.JComboBox();
        buttonPlayer2 = new javax.swing.JButton();
        buttonSeleccionar = new javax.swing.JButton();
        labelPlayer1 = new javax.swing.JLabel();
        labelClick = new javax.swing.JLabel();
        labelPlayer2 = new javax.swing.JLabel();
        labelSeleccion = new javax.swing.JLabel();
        labelRegistrar = new javax.swing.JLabel();
        buttonListo = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        labelListo = new javax.swing.JLabel();
        buttonCambiarPlayer1 = new javax.swing.JButton();
        buttonCambiarPlayer2 = new javax.swing.JButton();
        labelElemento = new javax.swing.JLabel();
        labelAtributos = new javax.swing.JLabel();
        labelPersonaje = new javax.swing.JLabel();
        labelPersonaje1 = new javax.swing.JLabel();
        labelPersonaje2 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(comboBoxPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 56, 190, 35));

        buttonPlayer1.setText("SELECCIONAR");
        buttonPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlayer1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 56, -1, 35));

        comboBoxPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPersonajesActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 56, 250, 35));

        getContentPane().add(comboBoxPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 56, 190, 35));

        buttonPlayer2.setText("SELECCIONAR");
        buttonPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 56, -1, 35));

        buttonSeleccionar.setText("SELECCIONAR");
        buttonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, -1, 35));

        labelPlayer1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        labelPlayer1.setText("Seleccionar Jugador 1:");
        getContentPane().add(labelPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 35, -1, -1));
        getContentPane().add(labelClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 590, 80, 80));

        labelPlayer2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        labelPlayer2.setText("Seleccionar Jugador 2:");
        getContentPane().add(labelPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 35, -1, -1));

        labelSeleccion.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        labelSeleccion.setText("Seleccionar un Personaje:");
        getContentPane().add(labelSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 35, -1, -1));

        labelRegistrar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistrar.setText("REGISTRAR: ");
        getContentPane().add(labelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        buttonListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rinegan.png"))); // NOI18N
        buttonListo.setContentAreaFilled(false);
        buttonListo.setMaximumSize(new java.awt.Dimension(433, 309));
        buttonListo.setMinimumSize(new java.awt.Dimension(433, 309));
        buttonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 520, 120, 120));

        buttonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Volver.png"))); // NOI18N
        buttonVolver.setBorder(null);
        buttonVolver.setBorderPainted(false);
        buttonVolver.setContentAreaFilled(false);
        buttonVolver.setDefaultCapable(false);
        buttonVolver.setMaximumSize(new java.awt.Dimension(129, 129));
        buttonVolver.setMinimumSize(new java.awt.Dimension(129, 129));
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 130, 140));

        labelListo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelListo.setForeground(new java.awt.Color(255, 255, 255));
        labelListo.setText("¡LISTO!");
        getContentPane().add(labelListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1188, 499, -1, -1));

        buttonCambiarPlayer1.setText("MODIFICAR");
        buttonCambiarPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCambiarPlayer1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCambiarPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 56, 107, 35));

        buttonCambiarPlayer2.setText("MODIFICAR");
        buttonCambiarPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCambiarPlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCambiarPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 56, 107, 35));
        getContentPane().add(labelElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 80, 80));

        labelAtributos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelAtributos.setForeground(new java.awt.Color(255, 255, 255));
        labelAtributos.setText("ATRIBUTO:");
        getContentPane().add(labelAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, -1, -1));
        getContentPane().add(labelPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 400, 450));

        labelPersonaje1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tu Personaje:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(labelPersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 280, 330));

        labelPersonaje2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tu Personaje:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(labelPersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, 280, 330));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void controlBotones(){
    
        //Combo Personajes
        comboBoxPersonajes.setEnabled(false);
        
        //Habilitados:
        buttonCambiarPlayer1.setEnabled(false);
        buttonCambiarPlayer2.setEnabled(false);
        buttonPlayer2.setEnabled(false);
        buttonSeleccionar.setEnabled(false);
        
        //Visibles:
        buttonCambiarPlayer1.setVisible(false);
        buttonCambiarPlayer2.setVisible(false);
        
        labelListo.setVisible(false);
        labelClick.setVisible(false);
        buttonListo.setVisible(false); //Se desbloqueará cuando se tengan los jugadores y personajes seleccionados.
        
        
      
    }
    
    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        // TODO add your handling code here:
        audio.stop();
        GUIRegistro abrir = new GUIRegistro();
        
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonVolverActionPerformed

    public void ponerImagenesJugador2(){
    
       
        imagenPersonaje[0] = new ImageIcon(getClass().getResource("/imagenes/Naruto.png"));  
        imagenPersonaje[1] = new ImageIcon(getClass().getResource("/imagenes/Sasuke.png"));  
        imagenPersonaje[2] = new ImageIcon(getClass().getResource("/imagenes/Sakura.png"));  
        imagenPersonaje[3] = new ImageIcon(getClass().getResource("/imagenes/Hinata.png"));  
        
        for(int i=0; i<listaPersonajes.size(); i++){
             
        personaje[i] = new ImageIcon(imagenPersonaje[i].getImage().getScaledInstance(labelPersonaje1.getWidth(), labelPersonaje1.getHeight(), Image.SCALE_DEFAULT));
        
    }
      
        //Deebo poner el personaje
        personajeSeleccionado =(Personajes) comboBoxPersonajes.getSelectedItem();
     
            idPersonajePlayer2 = personajeSeleccionado.getId();
            if(idPersonajePlayer2 == 0){
                labelPersonaje2.setIcon(personaje[0]);
                
            }else if(idPersonajePlayer2 == 1){
                labelPersonaje2.setIcon(personaje[1]);
                
            }else if(idPersonajePlayer2 == 2){
                labelPersonaje2.setIcon(personaje[2]);
                
            }else if(idPersonajePlayer2 == 3){
                labelPersonaje2.setIcon(personaje[3]);
                
            }
           // Si el personaje es falso... y luego de ver si el modificar estab    
        
        
    }    
    
    public void ponerImagenesJugador1(){
       
        imagenPersonaje[0] = new ImageIcon(getClass().getResource("/imagenes/Naruto.png"));  
        imagenPersonaje[1] = new ImageIcon(getClass().getResource("/imagenes/Sasuke.png"));  
        imagenPersonaje[2] = new ImageIcon(getClass().getResource("/imagenes/Sakura.png"));  
        imagenPersonaje[3] = new ImageIcon(getClass().getResource("/imagenes/Hinata.png"));  
        
        for(int i=0; i<listaPersonajes.size(); i++){
             
        personaje[i] = new ImageIcon(imagenPersonaje[i].getImage().getScaledInstance(labelPersonaje1.getWidth(), labelPersonaje1.getHeight(), Image.SCALE_DEFAULT));
        
    }
      
        //Deebo poner el personaje
        personajeSeleccionado =(Personajes) comboBoxPersonajes.getSelectedItem();
     
          
        idPersonajePlayer1 = personajeSeleccionado.getId();
        
        if(idPersonajePlayer1 == 0){
            labelPersonaje1.setIcon(personaje[0]);
            
        }else if(idPersonajePlayer1 == 1){
            labelPersonaje1.setIcon(personaje[1]);
            
        }else if(idPersonajePlayer1 == 2){
            labelPersonaje1.setIcon(personaje[2]);
            
        }else if(idPersonajePlayer1 == 3){
            labelPersonaje1.setIcon(personaje[3]);
            
         }
      
        personajePlayer1 = true;
    }
    
    private void buttonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeleccionarActionPerformed
        // TODO add your handling code here:
        
        if(personajePlayer1 == false){
        
        int iconoPregunta = JOptionPane.QUESTION_MESSAGE;
        int opcionRespuesta = JOptionPane.WARNING_MESSAGE;
        int eleccion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro que deseas usar este personaje?", "PREGUNTA", opcionRespuesta, iconoPregunta);
        
       
        if(eleccion == 0){
          
            
            ponerImagenesJugador1();
            
            if(buttonCambiarPlayer2.isEnabled() == true){
            
                 comboBoxPlayer2.setEnabled(false);   //No desploquees al jugador seleccionado
                 comboBoxPersonajes.setEnabled(false);
                 buttonSeleccionar.setEnabled(false);
                 
                 labelListo.setVisible(true);
                 buttonListo.setVisible(true);
            
            }else{
            
               buttonCambiarPlayer2.setEnabled(true);
               comboBoxPersonajes.setEnabled(false);
               comboBoxPlayer2.setEnabled(true);           
               buttonSeleccionar.setEnabled(false);
               buttonPlayer2.setEnabled(true);
            }
          
            }
            
        }else{
        
        int iconoPregunta = JOptionPane.QUESTION_MESSAGE;
        int opcionRespuesta = JOptionPane.WARNING_MESSAGE;
        int eleccion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro que deseas usar este personaje?", "PREGUNTA", opcionRespuesta, iconoPregunta);
        
       
        if(eleccion == 0){
          
            ponerImagenesJugador2();
            
            if(buttonCambiarPlayer2.isEnabled() == true){
            
                 comboBoxPlayer2.setEnabled(false);   //No desploquees al jugador seleccionado
                 comboBoxPersonajes.setEnabled(false);
                 buttonSeleccionar.setEnabled(false);
                 
                 labelListo.setVisible(true);
                 buttonListo.setVisible(true);
                 
                 
            }else{
            
               buttonCambiarPlayer2.setEnabled(true);
               comboBoxPersonajes.setEnabled(false);
               comboBoxPlayer2.setEnabled(true);           
               buttonSeleccionar.setEnabled(false);
               buttonPlayer2.setEnabled(true);
            }
          
        }

        
        }
        
        if(labelListo.isVisible() == true){
        JOptionPane.showMessageDialog(rootPane, "¡Personajes seleccionados con éxito!", "INFORMACIÓN", 1);
        
        labelPersonaje.setIcon(vs);
        labelClick.setVisible(true);
        labelAtributos.setVisible(false);
        labelElemento.setVisible(false);
            
        }
        
        
    }//GEN-LAST:event_buttonSeleccionarActionPerformed

    private void buttonPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlayer1ActionPerformed
        // TODO add your handling code here:
          
        personajePlayer1 = false;
        
        idJugador1 = comboBoxPlayer1.getSelectedIndex();
        
        if(idJugador1 == idJugador2){
            int iconoAdvertencia= JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "  ...Jugador 1 y Jugador 2 son iguales...    "+"\n"+"      (>'.')>  Escoge otro jugador  <('o'<)","SELECCIÓN NO VÁLIDA ", iconoAdvertencia);
            
        }else{
            
            comboBoxPersonajes.setEnabled(true);
            comboBoxPlayer1.setEnabled(false);
            buttonPlayer1.setEnabled(false);
            buttonPlayer1.setVisible(false);
            
            buttonCambiarPlayer1.setEnabled(true);
            buttonCambiarPlayer1.setVisible(true);
            buttonSeleccionar.setEnabled(true);
            
            if(listaJugadores.size() > 0){
                jugador1Seleccionado =(Jugadores) comboBoxPlayer1.getSelectedItem();
                personajeSeleccionado = (Personajes) comboBoxPersonajes.getSelectedItem();
                idPersonajePlayer1 = personajeSeleccionado.getId();
                
            }            
        }
    }//GEN-LAST:event_buttonPlayer1ActionPerformed

    private void buttonCambiarPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCambiarPlayer1ActionPerformed
        // TODO add your handling code here:

        labelPersonaje.setIcon(naruto); //Esta va a cambiar pro "Escoge"
        labelClick.setVisible(false);
        
        if(buttonCambiarPlayer2.isEnabled() == true && comboBoxPersonajes.isEnabled() == true){
            
            JOptionPane.showMessageDialog(rootPane, "No has seleccionado un personaje para el jugador 2 todavía", "ERROR DE CONFIRMACIÓN", 0);
            
            
        }else{
            personajePlayer1 = false;
            //El boton que me llevará al load no estará
            labelListo.setVisible(false);
            buttonListo.setVisible(false);
            
            //Oculto el botón mdoficar
            buttonCambiarPlayer1.setEnabled(false);
            buttonCambiarPlayer1.setVisible(false);
            
            //Revelelo el boton Seleccionar
            buttonPlayer1.setEnabled(true);
            buttonPlayer1.setVisible(true);
            
            //El combo box se habilita
            comboBoxPlayer1.setEnabled(true);
            
            //El combo Personajes se deshabilita
            comboBoxPersonajes.setEnabled(false);
            
            //El boton seleccion de personajes se deshabilita
            buttonSeleccionar.setEnabled(false);
            
            
            comboBoxPlayer2.setEnabled(false);
            
            if(buttonCambiarPlayer2.isVisible() == true){
                
                buttonPlayer2.setEnabled(false);
                buttonPlayer2.setVisible(false);
                
                //  buttonCambiarPlayer2.setEnabled(true);
                
            }else{
                
                buttonPlayer2.setEnabled(false); //No lo hago habilitado, porque el botón 1 es el que está sleccionado
                buttonPlayer2.setVisible(true);
                
                buttonCambiarPlayer2.setEnabled(false);
                buttonCambiarPlayer2.setVisible(false);
            }
                      
        }
        

        
    }//GEN-LAST:event_buttonCambiarPlayer1ActionPerformed

    private void buttonCambiarPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCambiarPlayer2ActionPerformed
        // TODO add your handling code here:
        
        labelPersonaje.setIcon(naruto); //Esta va a cambiar pro "Escoge"
        labelClick.setVisible(false);
        
        if(buttonPlayer1.isEnabled() == true){
            JOptionPane.showMessageDialog(rootPane, "No selecionaste al jugador 1", "ERROR DE CONFIRMACIÓN", 0);
            
            comboBoxPlayer1.setEnabled(true);
    
        }else{
        
            personajePlayer2 = false;
            
        comboBoxPersonajes.setEnabled(false);
        buttonSeleccionar.setEnabled(false);
        
        labelListo.setVisible(false);
        buttonListo.setVisible(false);
        
        comboBoxPlayer2.setEnabled(true);
        buttonCambiarPlayer2.setEnabled(false);
        buttonCambiarPlayer2.setVisible(false);
        
        buttonPlayer2.setEnabled(true);
        buttonPlayer2.setVisible(true);
        
        }
    }//GEN-LAST:event_buttonCambiarPlayer2ActionPerformed

    private void buttonPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlayer2ActionPerformed
        // TODO add your handling code here:
        
        idJugador2 = comboBoxPlayer2.getSelectedIndex();
         
        if(idJugador2 == idJugador1){
        int iconoAdvertencia= JOptionPane.WARNING_MESSAGE;
        JOptionPane.showMessageDialog(rootPane, "  ...Jugador 1 y Jugador 2 son iguales...    "+"\n"+"      (>'.')>  Escoge otro jugador  <('o'<)","SELECCIÓN NO VÁLIDA ", iconoAdvertencia);
        
        }else{
        personajePlayer2 = false;
        comboBoxPersonajes.setEnabled(true);
        buttonSeleccionar.setEnabled(true);
        
        buttonPlayer2.setEnabled(false);
        buttonPlayer2.setVisible(false);
        
        comboBoxPlayer2.setEnabled(false);
        
          
        buttonCambiarPlayer2.setEnabled(true);
        buttonCambiarPlayer2.setVisible(true);
        }
            
        if(listaJugadores.size() > 0){
                jugador2Seleccionado =(Jugadores) comboBoxPlayer2.getSelectedItem();
                personajeSeleccionado = (Personajes) comboBoxPersonajes.getSelectedItem();
                idPersonajePlayer2 = personajeSeleccionado.getId();
        
            }
      
    }//GEN-LAST:event_buttonPlayer2ActionPerformed

    private void comboBoxPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPersonajesActionPerformed
        // TODO add your handling code here:
        
        int item = comboBoxPersonajes.getSelectedIndex();
        ponerAtributos();
        switch(item){
            case 0:
                labelPersonaje.setIcon(imagenNartuo);
                break;
            case 1:
                labelPersonaje.setIcon(imagenSasuke);
                break;
            case 2:
                labelPersonaje.setIcon(imagenSakura);
                break;
            case 3:
                labelPersonaje.setIcon(imagenHinata);
                break;
                
            default:
                break;                
                
        }
   
    }//GEN-LAST:event_comboBoxPersonajesActionPerformed

    private void buttonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListoActionPerformed
        // TODO add your handling code here:
        audio.stop();
        
        idJugador1 = jugador1Seleccionado.getId();
        idJugador2 = jugador2Seleccionado.getId();
        
     
        GUILoading load = new GUILoading(idJugador1, idJugador2, idPersonajePlayer1, idPersonajePlayer2);
        load.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonListoActionPerformed

    private void ponerAudio(){
    
        audio = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/Seleccion.wav")); 
        audio.play();
    }
    
    //Imagenes
     private void ponerFondo(){
    
        ImageIcon imagenFondo;
        ImageIcon fondo;
        
        imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondoSeleccion.gif"));        
        fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(fondo);
    }
     
     public void ponerAtributos(){
     
         
         int idNinjas = comboBoxPersonajes.getSelectedIndex();
         
         if(idNinjas == 0){
              
            imagen = new ImageIcon(getClass().getResource("/imagenes/AViento.png"));        
            atributo = new ImageIcon(imagen.getImage().getScaledInstance(labelElemento.getWidth(), labelElemento.getHeight(), Image.SCALE_DEFAULT));
            labelElemento.setIcon(atributo);
         
         }else if(idNinjas == 1){
         
            imagen = new ImageIcon(getClass().getResource("/imagenes/AFuego.png"));        
            atributo = new ImageIcon(imagen.getImage().getScaledInstance(labelElemento.getWidth(), labelElemento.getHeight(), Image.SCALE_DEFAULT));
            labelElemento.setIcon(atributo);
            
         }else if(idNinjas == 2){
         
            imagen = new ImageIcon(getClass().getResource("/imagenes/ATierra.png"));        
            atributo = new ImageIcon(imagen.getImage().getScaledInstance(labelElemento.getWidth(), labelElemento.getHeight(), Image.SCALE_DEFAULT));
            labelElemento.setIcon(atributo);
         
         }else if(idNinjas == 3){
         
            imagen = new ImageIcon(getClass().getResource("/imagenes/AAgua.png"));        
            atributo = new ImageIcon(imagen.getImage().getScaledInstance(labelElemento.getWidth(), labelElemento.getHeight(), Image.SCALE_DEFAULT));
            labelElemento.setIcon(atributo);
         }
         
     
     }
    
     private void ponerImagenesPersonajes(){ //Aqui pondré las imagenes
         
         ImageIcon Atributos;
         ImageIcon iamgenes;
         
        imagenVS = new ImageIcon(getClass().getResource("/imagenes/VS.png"));        
        vs = new ImageIcon(imagenVS.getImage().getScaledInstance(labelPersonaje.getWidth(), labelPersonaje.getHeight(), Image.SCALE_DEFAULT));
        labelPersonaje.setIcon(vs); 

        imagenNartuo = new ImageIcon(getClass().getResource("/imagenes/Naruto.png"));        
        naruto = new ImageIcon(imagenNartuo.getImage().getScaledInstance(labelPersonaje.getWidth(), labelPersonaje.getHeight(), Image.SCALE_DEFAULT));
        labelPersonaje.setIcon(naruto);
        
        imagenSasuke = new ImageIcon(getClass().getResource("/imagenes/Sasuke.png"));        
        sasuke = new ImageIcon(imagenSasuke.getImage().getScaledInstance(labelPersonaje.getWidth(), labelPersonaje.getHeight(), Image.SCALE_DEFAULT));
        labelPersonaje.setIcon(sasuke);
        
        imagenSakura = new ImageIcon(getClass().getResource("/imagenes/Sakura.png"));        
        sakura = new ImageIcon(imagenSakura.getImage().getScaledInstance(labelPersonaje.getWidth(), labelPersonaje.getHeight(), Image.SCALE_DEFAULT));
        labelPersonaje.setIcon(sakura);
        
        imagenHinata = new ImageIcon(getClass().getResource("/imagenes/Hinata.png"));        
        hinata = new ImageIcon(imagenHinata.getImage().getScaledInstance(labelPersonaje.getWidth(), labelPersonaje.getHeight(), Image.SCALE_DEFAULT));
        labelPersonaje.setIcon(hinata);
        
       
        imagenClick = new ImageIcon(getClass().getResource("/imagenes/Click.gif"));        
        click = new ImageIcon(imagenClick.getImage().getScaledInstance(labelClick.getWidth(), labelClick.getHeight(), Image.SCALE_DEFAULT));
        labelClick.setIcon(click); 
        
       
     
        
   }
   
     private void ponerDatosPersonajes(){
     
         //Naruto
        String nombre = "Naruto Uzumaki";
        String atriubto = "Aire";
        String hablidad = "¡Rasengan!";
        String ataqueFinal = "Elemento Viento: Super Gran Bola Rasen Shuriken";
        double vida = 950;
        double estamina = 400;
        double danioAtaque = 140;
        double danioAtaquefinal = 230;
       
        Personajes naruto = new Personajes(0,nombre, atriubto, hablidad, ataqueFinal, vida, estamina, danioAtaque, danioAtaquefinal, imagenNartuo);
       
        //Sasuke
        String nombre2 = "Sasuke Uchiha";
        String atriubto2 = "Fuego";
        String hablidad2 = "¡Chidori!";
        String ataqueFinal2 = "Estilo de Fuego: ¡Amaterasu!";
        double vida2 = 1300;
        double estamina2 = 500;
        double danioAtaque2 = 140;
        double danioAtaquefinal2 = 230;
       
        Personajes sasuke = new Personajes(1,nombre2, atriubto2, hablidad2, ataqueFinal2, vida2, estamina2, danioAtaque2, danioAtaquefinal2, imagenSasuke);
        
        //Sakura
        String nombre3 = "Sakura Haruno";
        String atriubto3 = "Tierra";
        String hablidad3 = "Jutsu de Réplica";
        String ataqueFinal3 = "Estilo Fuinjutsu: Sello-Fuerza de un Centenar";
        double vida3 = 1400;
        double estamina3 = 700;
        double danioAtaque3 = 95;
        double danioAtaquefinal3 = 156;
       
        Personajes sakura = new Personajes(2,nombre3, atriubto3, hablidad3, ataqueFinal3, vida3, estamina3, danioAtaque3, danioAtaquefinal3, imagenSakura);
        
        //Hinata
        String nombre4 = "Hinata Hyuga";
        String atriubto4 = "Agua";
        String hablidad4 = "Puño Suave";
        String ataqueFinal4 = "Protección: Ocho Trigramas Sesenta y Cuatro Palmas.";
        double vida4 = 1200;
        double estamina4 = 600;
        double danioAtaque4 = 100;
        double danioAtaquefinal4 = 210;
       
        Personajes hinata = new Personajes(3,nombre4, atriubto4, hablidad4, ataqueFinal4, vida4, estamina4, danioAtaque4, danioAtaquefinal4, imagenHinata);
        
        
       //Añadimos a la lista
       listaPersonajes.add(naruto);
       listaPersonajes.add(sasuke);
       listaPersonajes.add(sakura);
       listaPersonajes.add(hinata);
     
     }
     
     //Flujo de información
    private void llenarComboJugadores() {
        
   
        if (listaJugadores.size() > 0) {
            
            comboBoxPlayer1.setEnabled(true);
            comboBoxPlayer2.setEnabled(false);
            listaJugadores = registro.cargarObjetos("archivoJugadores.dat");
            
            modeloComboBox = new DefaultComboBoxModel(listaJugadores.toArray());
            modeloComboBox2 = new DefaultComboBoxModel(listaJugadores.toArray());
            
            comboBoxPlayer1.setModel(modeloComboBox);
            comboBoxPlayer2.setModel(modeloComboBox2);
            
        } else {
            comboBoxPlayer1.setEnabled(false);
            comboBoxPlayer2.setEnabled(false);
        }

        
    }
   
    private void llenarComboPersonajes(){
    
        modeloComboBoxPersonajes = new DefaultComboBoxModel(listaPersonajes.toArray());
        comboBoxPersonajes.setModel(modeloComboBoxPersonajes);
        
        
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
            java.util.logging.Logger.getLogger(GUISeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISeleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCambiarPlayer1;
    private javax.swing.JButton buttonCambiarPlayer2;
    private javax.swing.JButton buttonListo;
    private javax.swing.JButton buttonPlayer1;
    private javax.swing.JButton buttonPlayer2;
    private javax.swing.JButton buttonSeleccionar;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox comboBoxPersonajes;
    private javax.swing.JComboBox comboBoxPlayer1;
    private javax.swing.JComboBox comboBoxPlayer2;
    private javax.swing.JLabel labelAtributos;
    private javax.swing.JLabel labelClick;
    private javax.swing.JLabel labelElemento;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelListo;
    private javax.swing.JLabel labelPersonaje;
    private javax.swing.JLabel labelPersonaje1;
    private javax.swing.JLabel labelPersonaje2;
    private javax.swing.JLabel labelPlayer1;
    private javax.swing.JLabel labelPlayer2;
    private javax.swing.JLabel labelRegistrar;
    private javax.swing.JLabel labelSeleccion;
    // End of variables declaration//GEN-END:variables
}
