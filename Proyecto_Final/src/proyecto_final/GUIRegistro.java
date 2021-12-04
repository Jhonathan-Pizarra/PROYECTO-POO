
package proyecto_final;

import java.applet.AudioClip;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class GUIRegistro extends javax.swing.JFrame {
    
    AudioClip audio;
    ArrayList<Object> listaJugadores = new ArrayList();
    DefaultTableModel modeloTablaJugadores;
    DefaultComboBoxModel modeloComboBoxJugadores;
    Control registro = new Control();
    int contador = 0; //Contador para registros... 

    
   
    public GUIRegistro() {
        initComponents();
       
       
       listaJugadores = registro.cargarObjetos("archivoJugadores.dat");
       
        verificarJugador();
        ponerFondo();
        ponerAudio(); 
        llenarComboBox();
        llenarTabla();
        
        labelApodo.setVisible(false);
        buttonModificar.setEnabled(false);
        buttonEliminar.setEnabled(false);
        
        this.setLocationRelativeTo(null);
        
        
    }
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelNick = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textCedula = new javax.swing.JTextField();
        textUsuario = new javax.swing.JTextField();
        comboBoxJugadores = new javax.swing.JComboBox();
        labelSeleccionar = new javax.swing.JLabel();
        buttonRegistrar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegistroJugadores = new javax.swing.JTable();
        buttonSeleccionarPersonaje = new javax.swing.JButton();
        labelApodo = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelNombre.setText("NOMBRE:");
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 82, 70, 20));

        labelApellido.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelApellido.setText("APELLIDO:");
        getContentPane().add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 114, 70, 20));

        labelCedula.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelCedula.setText("CÉDULA:");
        getContentPane().add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 149, 70, 20));

        labelNick.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelNick.setText("NICK-NAME:");
        getContentPane().add(labelNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 184, 70, 20));
        getContentPane().add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 80, 100, 26));
        getContentPane().add(textApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 112, 100, 26));
        getContentPane().add(textCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 147, 100, 26));
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 182, 100, 26));

        comboBoxJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 59, 220, 30));

        labelSeleccionar.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelSeleccionar.setText("SELECCIONAR JUGADOR:");
        getContentPane().add(labelSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 33, 150, 20));

        buttonRegistrar.setText("REGISTRAR");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 242, 120, 35));

        buttonModificar.setText("MODIFICAR");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 120, 35));

        buttonEliminar.setText("ELIMINAR");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 120, 35));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableRegistroJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID:", "NOMBRE:", "APELLIDO:", "CÉDULA:", "NICK:", "VICTORIAS:"
            }
        ));
        jScrollPane1.setViewportView(tableRegistroJugadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 342, 538, 240));

        buttonSeleccionarPersonaje.setText("SELECCIONAR PERSONAJE");
        buttonSeleccionarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeleccionarPersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSeleccionarPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 620, 210, 35));

        labelApodo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelApodo.setForeground(new java.awt.Color(255, 0, 0));
        labelApodo.setText("¡Ese apodo ya existe!");
        getContentPane().add(labelApodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, -1));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        // TODO add your handling code here:
        //Por: Andrea Quishpe.
        System.out.println("Registrando..."); //Cada vez que se preione el botón, aparecerá este mensaje.
        contador++; //Cuando presiones el bton el contador se aumentará 1.. y por eend eel id, tenemos que hacer control de eso

        int id = contador;
        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String cedula = textCedula.getText();
        String usuario = textUsuario.getText();
        
        
        if(nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || usuario.isEmpty()){
        
            int iconoError = JOptionPane.ERROR_MESSAGE;
            
             JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos para registrar a este jugador. \\(^◡^ )","CAMPO(S) SIN LLENAR",iconoError);
             System.out.println("Falta llenar un campo...");
             
        }else{
        

        boolean existe = false; //Esta variable la declaré para poder comparar
        //EL constrctor tiene como parámetros el id (o contador), el nombre, el apellido...todos esos atributos tomados de los textfields
    
        Jugadores player = new Jugadores(id, nombre, apellido, cedula, usuario); //Los valores de la textField que estoy registrando, los voy a comprar...
        
        //Validaciones:
        //Un jugador...
        //Si tiene el mismo nombre, apellido, cedula, y nick, es que ya fue registrado.
        //No puede tener el mismo numero de cedula aunque tengan difertens nombres y apellido
        //No puedentener el mismo nick así tengan diferetens nombre, diferentes cedulas
        
        //Vamos a comprar.. Comentado...
        //<editor-fold defaultstate="collapsed" desc="comment">
        for(Object each: listaJugadores){ //Por "cada" objeto de mi lista de Jugadores
            Jugadores player2 = (Jugadores) each; //A cada objeto de mi lista, le hice un casting y lo ocnertí en jugaodores "player2"
            
            if(player2.getNombre().equals(player.getNombre())){ //Si el jugador 2, tiene el mismo nombre del jugador 1
                if(player2.getApellido().equals(player.getApellido())){ //Y además, también tiene el mismo apellido
                    if(player2.getCedula().equals(player.getCedula())){ // Y también tiene la misma cédula
                        if(player2.getNick().equals(player.getNick())){ //Y también tieen el mismo nick
                            
                            existe = true; //Es que ese jugador ya fue registrado
                            contador = contador-1; //Si no re registra, entonces, el contador que regrese al valor que tenía, no debió aumentar
                            int iconoInfomracion = JOptionPane.INFORMATION_MESSAGE;
                            JOptionPane.showMessageDialog(rootPane, "Este jugador ya fue registrado anteriormente!", "INFORMACIÓN", iconoInfomracion);
                            System.out.println("Jugador no registrado.");
                            break;
                        }
                    }
                }
            }
            
            if(player2.getCedula().equals(player.getCedula())){
                
                existe = true; //Es que ese jugador ya fue registrado
                contador = contador-1; //Si no re registra, entonces, el contador que regrese al valor que tenía, no debió aumentar
                String numeroCedula = player.getCedula();
                int iconoError= JOptionPane.ERROR_MESSAGE;
                JOptionPane.showMessageDialog(rootPane, "CI: ["+numeroCedula+"] ya existe."+"\n"+"Por favor verificalo y vuelve a intentar. ", "ERROR DE IDENTIFICACIÓN", iconoError);
                System.out.println("Jugador no registrado.");
                break;
            }
            
            if(player2.getNick().equals(player.getNick())){
                
                existe = true; //Es que ese jugador ya fue registrado
                contador = contador-1; //Si no re registra, entonces, el contador que regrese al valor que tenía, no debió aumentar
                String nick = player.getNick();
                
                labelApodo.setVisible(true);
                textUsuario.setText(null);
                System.out.println("Jugador no registrado.");
                break;
                
            }
        }
//</editor-fold> 
        
       //Si el jugador es nuevo
        if(existe == false){
           //contador++; //El contador aumentará en 1 cada vez que se preione el botón registrar y ademas, siempre que ese jugador no exista!
        
            listaJugadores.add(player); //Añadelo a mi lista de jugadores
            registro.escribirObjeto("archivoJugadores.dat", listaJugadores); //Registra en mi archivo, la lista actualizada.
            limpiarCampos(); //Luego de presionar el boton registrar, los textfields se vuelven a poner vacios
            llenarComboBox(); //Luego de presionar registrar, el comboBox se llena (Y se ha de llenar con todos los jugadores del archivo)

            
            Object jugadorRegistrado[] = {id, nombre, apellido, cedula, usuario}; //Sólo es el orden en que la información del jugador aparecerá en la tabla
            modeloTablaJugadores = (DefaultTableModel) tableRegistroJugadores.getModel(); //Debo de coger el modelo de mi tabla
            modeloTablaJugadores.addRow(jugadorRegistrado); //Añado a mi talba
            System.out.println("Jugador registrado exitosamente!");
            
            labelApodo.setVisible(false);
        }
    } 
        
        
        
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        // TODO add your handling code here:
        //Por: Jhonathan Pizarra

        System.out.println("Modificando...");
        //Condiciones de modificación
        //Si el modificado tiene el mismo nombre, apellido, cedula, y nick que otro jugador, ese jugador ya existe!
        //Si se modifica la cedula, y esa coincide con la de otro jugador, ese jugador ya existe
        //Si se modifica el nick, y ese nick coicide con el de otro jugador, ese nick está ocupado.
        
    
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxJugadores.getSelectedItem(); //Hago esto para coger el item de mi comboBox, y "convertirlo a Jugador". Recuerda que esto me devolvería la dirección en memoria si fuera un objeto nada más...
        boolean existe = false;  //Esta variable me ayudará a comprobar si ya existe ese jugador que se pretende modificar
        boolean cambio = false;
        //Estas vairablas tendrán los valores del jugador filtrado
        String nombreAnterior   = jugadorSeleccionado.getNombre();
        String apellidoAnterior = jugadorSeleccionado.getApellido();
        String cedulaAnterior   = jugadorSeleccionado.getCedula();
        String usuarioAnterior  = jugadorSeleccionado.getNick();
        
        //Esto lo que hace es guardar el nuevo texto que he modificado cuando filtré el combobox, y presioné modificar
        String nuevoNombre   = textNombre.getText();
        String nuevoApellido = textApellido.getText();
        String nuevaCedula   = textCedula.getText();
        String nuevoUsaurio  = textUsuario.getText();
        
        if(nuevoNombre.isEmpty() || nuevoApellido.isEmpty() || nuevaCedula.isEmpty() || nuevoUsaurio.isEmpty()){
        
            int iconoError = JOptionPane.ERROR_MESSAGE;
             JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos para registrar a este jugador. \\(^◡^ )","CAMPO(S) SIN LLENAR",iconoError);
             System.out.println("Falta llenar un campo...");
             
             if(nuevoNombre.isEmpty()){
             textNombre.setText("");
             }
             if(nuevoApellido.isEmpty()){
             textApellido.setText("");
             }
             if(nuevaCedula.isEmpty()){
             textCedula.setText("");
             }
             if(nuevoUsaurio.isEmpty()){
             textUsuario.setText("");
             }
            
             
        }else{
        
       
        //Primero hago una comparación en caso de que no modifique nada.
        if(nuevoNombre.equals(nombreAnterior) && nuevoApellido.equals(apellidoAnterior) && nuevaCedula.equals(cedulaAnterior)  && nuevoUsaurio.equals(usuarioAnterior)){
            int iconoIndormacion = JOptionPane.INFORMATION_MESSAGE;
            int opciones = JOptionPane.YES_NO_OPTION;
            int eleccion = JOptionPane.showConfirmDialog(rootPane, "No modificaste nada"+"\n"+"  ¿Deseas continuar?", "CONFIRMACIÓN", opciones, iconoIndormacion);
            
            if(eleccion == 0){
                limpiarCampos();
            }
            
        }else{
       
        //Instancio, llamo a mi clase Jugadores y le mando como valor inicial el texto modificado!... Excepto el ID, ese no va a cambiar, si se modifica segurá ocupando la misma posicion
        Jugadores jugadorModificado = new Jugadores(jugadorSeleccionado.getId(),nuevoNombre, nuevoApellido, nuevaCedula, nuevoUsaurio);
      
        if(nuevoNombre.equals(nombreAnterior)){
            //cambiarNombre = false;
            
        }else{
            int opciones = JOptionPane.WARNING_MESSAGE;
            int iconoAdverdertencia = JOptionPane.WARNING_MESSAGE;
            int eleccion = JOptionPane.showConfirmDialog(rootPane,"Se procederá a cambiar: "+nombreAnterior+" por "+nuevoNombre+"\n"+"  ¿Desea continuar?", "CONFIRMACION", opciones, iconoAdverdertencia);
            
            
            if(eleccion == 0){
                System.out.println("Aceptó");
                cambio = true;
                jugadorSeleccionado.setNombre(nuevoNombre);
                textNombre.setText(nuevoNombre);
                
            }else{
                System.out.println("Canceló");
                textNombre.setText(nombreAnterior);
                
            }
            
            
        }
        
        if(nuevoApellido.equals(apellidoAnterior)){
          //  cambiarApellido = false;
            
            
        }else {
            int opciones = JOptionPane.WARNING_MESSAGE;
            int iconoAdverdertencia = JOptionPane.WARNING_MESSAGE;
            int eleccion = JOptionPane.showConfirmDialog(rootPane,"Se procederá a cambiar: "+apellidoAnterior+" por "+nuevoApellido+"\n"+"  ¿Desea continuar?", "CONFIRMACION", opciones, iconoAdverdertencia);
            
            if(eleccion == 0){
                System.out.println("Aceptó");
                cambio = true;
                jugadorSeleccionado.setApellido(nuevoApellido);
                textApellido.setText(nuevoApellido);
            
                
            }else{
                System.out.println("Canceló");
                textApellido.setText(apellidoAnterior);
                
            }
            
        }
        
        if(nuevaCedula.equals(cedulaAnterior)){
            //No modificó la cédula
            
        }else{
              
                int opciones = JOptionPane.WARNING_MESSAGE;
                int iconoAdverdertencia = JOptionPane.WARNING_MESSAGE;
                int eleccion = JOptionPane.showConfirmDialog(rootPane,"Se procederá a cambiar: ["+cedulaAnterior+"] por ["+nuevaCedula+"]"+"\n"+"  ¿Desea continuar?", "CONFIRMACION", opciones, iconoAdverdertencia);
                
                if(eleccion == 0){
                    System.out.println("Aceptó");
                    cambio = true;
                    //Comprobación
                    for(Object each: listaJugadores){
                        Jugadores otroJugador = (Jugadores) each;
                        
                        if(jugadorModificado.getCedula().equals(otroJugador.getCedula())){ //Juhador modificado tiene la cédula que agarró del textField actualmente (Y que no es si mismo, ya que está dentro de este if)
                            String numeroCedula = otroJugador.getCedula();
                            cambio = false;
                            existe = true;
                            int iconoError = JOptionPane.ERROR_MESSAGE;
                            JOptionPane.showMessageDialog(rootPane, "CI: ["+numeroCedula+"] ya existe."+"\n"+"Este cambio NO está permitido. ", "ERROR DE IDENTIFICACIÓN", iconoError);
                            textNombre.setText(nombreAnterior);
                            textApellido.setText(apellidoAnterior);
                            textCedula.setText(cedulaAnterior);
                          
                            jugadorSeleccionado.setNombre(nombreAnterior);
                            jugadorSeleccionado.setApellido(apellidoAnterior);
                            jugadorSeleccionado.setCedula(cedulaAnterior);
                            jugadorSeleccionado.setNick(usuarioAnterior);
                            
                            break;
                            
                        }
                    }
                    //Con este If digo que si luego de haber comparado y dicho que no es el mismo número de cedula que otro jugador
                    if(existe == false){
                        jugadorSeleccionado.setCedula(nuevaCedula);
                        textCedula.setText(nuevaCedula);
                       
                    }
                    
                    
                }else{
                    System.out.println("Canceló");
                     textCedula.setText(cedulaAnterior);
                    
                }
                
                
           
            
            
        }
        
        if(nuevoUsaurio.equals(usuarioAnterior)){
            //cambiarUsuario = false;
        }else {
            int opciones = JOptionPane.WARNING_MESSAGE;
            int iconoAdverdertencia = JOptionPane.WARNING_MESSAGE;
            int eleccion= JOptionPane.showConfirmDialog(rootPane,"Se procederá a cambiar: "+"''"+usuarioAnterior+"''"+" por "+"''"+nuevoUsaurio+"''"+"\n"+"  ¿Desea continuar?", "CONFIRMACION", opciones, iconoAdverdertencia);
            
            if(eleccion == 0){
                System.out.println("Aceptó");
                cambio = true;
                
                for(Object each: listaJugadores){
                    Jugadores otroJugador = (Jugadores) each;
                    
                    if(jugadorModificado.getNick().equals(otroJugador.getNick())){ //Juhador modificado tiene el nick que agarró del textField actualmente (Y que no es si mismo, ya que está dentro de este if)
                        cambio = false;
                        String nick = otroJugador.getNick();
                        existe = true;
                        int iconoError = JOptionPane.ERROR_MESSAGE;
                        JOptionPane.showMessageDialog(rootPane, "Nick-Name: ''"+nick+"'' ya está ocupado por otro usuario."+"\n"+"Este cambio NO está permitido. ", "ERROR DE IDENTIFICACIÓN", iconoError);
                        //Poner el los textFields
                        textNombre.setText(nombreAnterior);
                        textApellido.setText(apellidoAnterior);
                        textCedula.setText(cedulaAnterior);
                        textUsuario.setText(usuarioAnterior);
                        
                        //Poner en el filtro del comboBOx
                        jugadorSeleccionado.setNombre(nombreAnterior);
                        jugadorSeleccionado.setApellido(apellidoAnterior);
                        jugadorSeleccionado.setCedula(cedulaAnterior);
                        jugadorSeleccionado.setNick(usuarioAnterior);
                        
                        break;
                        
                    }
                }
                //Con este If digo que si luego de haber comparado y dicho que no es el mismo número de cedula que otro jugador
                if(existe == false){
                    jugadorSeleccionado.setNick(nuevoUsaurio); //Coloca el nuevo nick o nuevo usuario
                    textUsuario.setText(nuevoUsaurio);
                    
                    
                }
                
            }else{
                System.out.println("Canceló");
                textUsuario.setText(usuarioAnterior);
                
            }
        }
        
        
        if(existe == false){
            
            int posicionItem = comboBoxJugadores.getSelectedIndex(); //Me devuelve el indice del item seleccionado en el combo box
            
            //Eliminar
            modeloTablaJugadores.removeRow(posicionItem); //Eliminar de la tabla el item de la posicion "p"
            listaJugadores.remove(posicionItem); //Eliminar de la lista el item de la posicion "p"
            
            //Volver a Actualizar
            int id = jugadorSeleccionado.getId();
            String nombre = jugadorSeleccionado.getNombre();
            String apellido = jugadorSeleccionado.getApellido();
            String cedula = jugadorSeleccionado.getCedula();
            String usuario = jugadorSeleccionado.getNick();
            
            Object registroModifiacion[] = {id, nombre, apellido, cedula, usuario};
            modeloTablaJugadores  = (DefaultTableModel) tableRegistroJugadores.getModel();  //No hicimos una tabla, sino que ya le pusimos por defecto las columnas
            //Por eso debemos obtener ese modelo.
            
            modeloTablaJugadores.insertRow(posicionItem, registroModifiacion); //Colocar el modificado en la tabla (En la posicion "p") en el orden: jugadoresPro
            
            listaJugadores.add(posicionItem, jugadorSeleccionado); //Colocar el modificado en la lista, en la posicion escogida, y sobreescrbiendo al jugador
            registro.escribirObjeto("archivoJugadores.dat", listaJugadores); //Archivar el cambio
            llenarComboBox(); //Funcion Llenar combo para evidenciar el cambio en el comboBox
            
            
        }
        
       }
        
        if(cambio == true){ //Si en alguna parte cambió, al final limpiar los campos
            int iconoInformacion = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Cambios guardados exitosamente!", "INFORMACIÓN", iconoInformacion);
            limpiarCampos();
        }
        
        }
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        // TODO add your handling code here:
        //Por: Bryan Farinango
        //contador = contador-1
      
        System.out.println("Eliminando...");
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxJugadores.getSelectedItem();  //Hago esto para coger el item de mi comboBox, y "convertirlo a Jugador"
        modeloTablaJugadores = (DefaultTableModel) tableRegistroJugadores.getModel(); //Obtengo el modelo, la tabla que cree de forma estática. (Es decir no le puse yo los titulos, ni una matriz de datos, sino que yo cree desde el modelo)

        //Eliminar es tan sencillo como...
        int posicionItem = comboBoxJugadores.getSelectedIndex(); //Este tendrá la posicion del item seleccionado
        modeloTablaJugadores.removeRow(posicionItem); //Eliminará al item que esté en la posicion "x" de la tabla
        listaJugadores.remove(jugadorSeleccionado); //Elimiará al item "Jugador seleccionado" de mi lista de jugadores
      
       // verificarJugador();
        registro.escribirObjeto("archivoJugadores.dat", listaJugadores); //Guardará esos cambios en un archivo
       
        
        llenarComboBox(); //Evidenciaremos el cambio en el comboBox 
        limpiarCampos(); //Los campos del textField quedarán vacios
      //  borrarFilasCon();
        buttonRegistrar.setEnabled(true);
        buttonModificar.setEnabled(false); 
        buttonEliminar.setEnabled(false);
        
        
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void buttonSeleccionarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeleccionarPersonajeActionPerformed
        // TODO add your handling code here:
        audio.stop();
        GUISeleccion seleccionar = new GUISeleccion();
        
        if(listaJugadores.size() > 1){
            
            this.setVisible(false);
            seleccionar.setVisible(true);
        
             
        }else{
            int iconoInformacion = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Necesitas tener al menos 2 jugadores registrados!", "INFORMACIÓN", iconoInformacion);
        }
        
    
    }//GEN-LAST:event_buttonSeleccionarPersonajeActionPerformed

    private void comboBoxJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxJugadoresActionPerformed
        // TODO add your handling code here:
        //Por: Bryan Farinango
        
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxJugadores.getSelectedItem(); //Hago esto para coger el item de mi comboBox, y "convertirlo a Jugador"
         //Guardo en variables los atributos de mi item seleccionado:
        String nombre   = jugadorSeleccionado.getNombre();
        String apellido = jugadorSeleccionado.getApellido();
        String cedula   = jugadorSeleccionado.getCedula();
        String usuario  = jugadorSeleccionado.getNick();
        
        //En mis campos de texto, hago que esos atributos sean visibles (Y se puedan modificar)
        textNombre.setText(nombre);
        textApellido.setText(apellido);
        textCedula.setText(cedula);
        textUsuario.setText(usuario);
        
        //Hago que mis botones sean o no habilitados
        buttonRegistrar.setEnabled(false); 
        buttonModificar.setEnabled(true);
        buttonEliminar.setEnabled(true);
        
        //Pero igual me va a aparecer algo como ProyectoFinal.Jugadore@5123e71d ... Entonces, debo usar el método "ToString" en la clase "Jugadores"
        
    }//GEN-LAST:event_comboBoxJugadoresActionPerformed

    private void ponerFondo(){
    
        ImageIcon imagenFondo;
        ImageIcon fondo;
        
        imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondoRegistro.gif"));        
        fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(fondo);
    }
    
    private void ponerAudio(){
    
        audio = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/Opening.wav")); //El archivo "Opening.wav" no existe, lo borré
        audio.play();
    }
    
    private void limpiarCampos(){ //Esta funcion existe para cuándo queramos registrar.
        
        textNombre.setText(null);
        textApellido.setText(null);
        textCedula.setText(null);
        textUsuario.setText(null); 
        
        buttonRegistrar.setEnabled(true);
        buttonModificar.setEnabled(false);
        buttonEliminar.setEnabled(false);
    
    }
    
    private void verificarJugador(){
   
       Jugadores players = new Jugadores(); //Instancio para hacer un casting
       
       if(listaJugadores.size() >  0 ){ //Si mi lista de jugadores no está vacía
           int cantidadJugadores = listaJugadores.size(); //Define la cantidad de jugadores
           
           Jugadores ultimoJugador = new Jugadores(); //Instancio para tomar prestado una atributo de los jugadores: el id
           
           for(int i = 0; i<cantidadJugadores; i++){
               ultimoJugador = (Jugadores) listaJugadores.get(i); //En la posicion i hay un jugador y ese jugador tiene un id, nombre, apellido..
               
           }
     
           contador = ultimoJugador.getId(); //Cada vez que se preison el boton registrar, el contador se aumenta 1, por lo que cambiará el valor del contador (El que tenía +1)
           //..........................
           if(cantidadJugadores != contador){
               contador = 0;
               for(Object item: listaJugadores){
                   
                   players = (Jugadores) item;
                   contador++;
                   players.setId(contador);
                   registro.escribirObjeto("archivoJugadores.dat", listaJugadores);
                   
               }
               
           }
        
           System.out.println("Cantidad de jugadores: "+cantidadJugadores);
           System.out.println("ID del último registrado: "+contador);
         
       }
       
       listaJugadores = registro.cargarObjetos("archivoJugadores.dat");
       

   }
    
    private void llenarComboBox(){
    
        if(listaJugadores.size() > 0){ //Siempre que mi lista sea mayor a cero
            //Desbloquear
            buttonSeleccionarPersonaje.setEnabled(true); //El boton personaje está habilitado (Es decir el boton que te llevará a seleccionar personaje)
            comboBoxJugadores.setEnabled(true); //El combo Box de Jugadores (El que me permirirá filtar un jugador) está tambien habilitado
            //Cargar Archivos
            listaJugadores = registro.cargarObjetos("archivoJugadores.dat"); //Luego cargo mis archivos.... 
            //Cargar el ComboBox
            modeloComboBoxJugadores = new DefaultComboBoxModel(listaJugadores.toArray()); //Le mando a mi modelo de combo box mis jugadores...
            comboBoxJugadores.setModel(modeloComboBoxJugadores);  //Coloco ese modelo a mi combo!  
            
        }else{ //De no ser así (De no haber ni un jugador registrado)
            comboBoxJugadores.setEnabled(false); //En el combo no hay nada que filtrar, por tanto, bloqueo
            buttonSeleccionarPersonaje.setEnabled(false);  //El botón de Seleccionar Personaje muerto inactivo también
            
        }     
    }
    
    private void llenarTabla(){
        if(listaJugadores.size() > 0){ //Siempre que existan jugadores 
            modeloTablaJugadores = (DefaultTableModel) tableRegistroJugadores.getModel(); //A mi modelo de Tabla, le hago obtener el modelo, 
                                                                                           //recuerda que este modelo lo hicimos cuando creamos los titulos en el Desing (No lo hciimos mediante código)
                                                                                           //Por eso en necesario obtener el modelo
           
            Jugadores player = new Jugadores(); //Instancio (Haciendo ref. al constructor vacío...)¿Para qué?
                                                //Lo que pasa es que voy a hacer un castign de "Objetos" a "Jugadores" a cada item de mi lista de jugadores "por el momento son objetos."
                                                //Entonces, necesito un contructor que no tenga valores iniciales, sino que simplemente me ayude a saber que tengo un objeto de tipo Jugadores para poder hacer casting 
          
            for(int i=0; i<listaJugadores.size(); i++){ //Itero sobre cada item de mi lista
                player = (Jugadores) listaJugadores.get(i); //Aqui lo que pasó fue que en cada iteración, player hizo un casting de Obketo a Jugador a un objeto en la posición "i" de la iteración sobre la lista de objetos jugadores.
                
                int id = player.getId();
                String nombre = player.getNombre();
                String apellido = player.getApellido();
                String cedula = player.getCedula();
                String nick = player.getNick();
                
                Object ordenRegistro[] = {id, nombre, apellido, cedula, nick}; //Simplemente es el orden de los atributos de mi jugador "X" que aparecerán en la tabla
                modeloTablaJugadores.insertRow(i, ordenRegistro); //Inserto en la posicion "i" las filas el el orden que le di.
            }
        
        }
    
    
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
            java.util.logging.Logger.getLogger(GUIRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonSeleccionarPersonaje;
    private javax.swing.JComboBox comboBoxJugadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelApodo;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNick;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSeleccionar;
    private javax.swing.JTable tableRegistroJugadores;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
