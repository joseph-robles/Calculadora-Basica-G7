/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Christian Ramirez
 */
public class Calculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    public Calculadora() {
        initComponents();
        this.setTitle("Calculadora");
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

        panel = new javax.swing.JPanel();
        botonCuadrado = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonExtra = new javax.swing.JButton();
        botonC = new javax.swing.JButton();
        botonCubo = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonN = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        botonPorcentaje = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonInversa = new javax.swing.JButton();
        botonMasMenos = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        etiquetaNumeros = new javax.swing.JLabel();
        etiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(null);

        botonCuadrado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCuadrado.setText("^2");
        panel.add(botonCuadrado);
        botonCuadrado.setBounds(0, 1, 81, 64);

        botonCE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCE.setText("CE");
        botonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCEActionPerformed(evt);
            }
        });
        panel.add(botonCE);
        botonCE.setBounds(81, 1, 81, 64);

        botonRaiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRaiz.setText("√");
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });
        panel.add(botonRaiz);
        botonRaiz.setBounds(162, 1, 81, 64);

        botonExtra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonExtra.setText("Raiz(3)");
        botonExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExtraActionPerformed(evt);
            }
        });
        panel.add(botonExtra);
        botonExtra.setBounds(243, 1, 81, 64);

        botonC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        panel.add(botonC);
        botonC.setBounds(324, 1, 162, 64);

        botonCubo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCubo.setText("^3");
        botonCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuboActionPerformed(evt);
            }
        });
        panel.add(botonCubo);
        botonCubo.setBounds(0, 65, 81, 64);

        boton7.setBackground(new java.awt.Color(204, 204, 204));
        boton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        panel.add(boton7);
        boton7.setBounds(81, 65, 81, 64);

        boton8.setBackground(new java.awt.Color(204, 204, 204));
        boton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        panel.add(boton8);
        boton8.setBounds(162, 65, 81, 64);

        boton9.setBackground(new java.awt.Color(204, 204, 204));
        boton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        panel.add(boton9);
        boton9.setBounds(243, 65, 81, 64);

        botonDivision.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        panel.add(botonDivision);
        botonDivision.setBounds(324, 65, 81, 96);

        botonMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonMultiplicar.setText("X");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });
        panel.add(botonMultiplicar);
        botonMultiplicar.setBounds(405, 65, 81, 96);

        botonN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonN.setText("^n");
        panel.add(botonN);
        botonN.setBounds(0, 129, 81, 64);

        boton4.setBackground(new java.awt.Color(204, 204, 204));
        boton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        panel.add(boton4);
        boton4.setBounds(81, 129, 81, 64);

        boton5.setBackground(new java.awt.Color(204, 204, 204));
        boton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        panel.add(boton5);
        boton5.setBounds(162, 129, 81, 64);

        boton6.setBackground(new java.awt.Color(204, 204, 204));
        boton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        panel.add(boton6);
        boton6.setBounds(243, 129, 81, 64);

        botonSumar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        panel.add(botonSumar);
        botonSumar.setBounds(324, 161, 81, 96);

        botonRestar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        panel.add(botonRestar);
        botonRestar.setBounds(405, 161, 81, 96);

        botonPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPorcentaje.setText("%");
        botonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorcentajeActionPerformed(evt);
            }
        });
        panel.add(botonPorcentaje);
        botonPorcentaje.setBounds(0, 193, 81, 64);

        boton1.setBackground(new java.awt.Color(204, 204, 204));
        boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        panel.add(boton1);
        boton1.setBounds(81, 193, 81, 64);

        boton2.setBackground(new java.awt.Color(204, 204, 204));
        boton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        panel.add(boton2);
        boton2.setBounds(162, 193, 81, 64);

        boton3.setBackground(new java.awt.Color(204, 204, 204));
        boton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        panel.add(boton3);
        boton3.setBounds(243, 193, 81, 64);

        botonInversa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonInversa.setText("1/x");
        botonInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInversaActionPerformed(evt);
            }
        });
        panel.add(botonInversa);
        botonInversa.setBounds(0, 257, 81, 64);

        botonMasMenos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonMasMenos.setText("+/-");
        botonMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasMenosActionPerformed(evt);
            }
        });
        panel.add(botonMasMenos);
        botonMasMenos.setBounds(81, 257, 81, 64);

        boton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        panel.add(boton0);
        boton0.setBounds(162, 257, 81, 64);

        botonPunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        panel.add(botonPunto);
        botonPunto.setBounds(243, 257, 81, 64);

        botonIgual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        panel.add(botonIgual);
        botonIgual.setBounds(324, 257, 162, 64);

        etiquetaNumeros.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");

        etiquetaMuestra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "7";
        }else{
            cadenaNumeros += "7";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "8";
        }else{
            cadenaNumeros += "8";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "9";
        }else{
            cadenaNumeros += "9";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "4";
        }else{
            cadenaNumeros += "4";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "5";
        }else{
            cadenaNumeros += "5";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "6";
        }else{
            cadenaNumeros += "6";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "1";
        }else{
            cadenaNumeros += "1";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "2";
        }else{
            cadenaNumeros += "2";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "3";
        }else{
            cadenaNumeros += "3";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "0";
        }else{
            cadenaNumeros += "0";
        }     
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            
            activado = false;
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double segundoNumero;
        if(operacion.equals("nula")){
            etiquetaNumeros.setText(cadenaNumeros);
        }
        
        else if(operacion.equals("sumar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if(operacion.equals("restar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        
        else if(operacion.equals("multiplicar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                etiquetaNumeros.setText("NoSeDividePor0");
            } else {
                resultado = primerNumero / segundoNumero;
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
        }
        else if(operacion.equals("inversa")){
            resultado = 1/primerNumero;
            etiquetaNumeros.setText(String.format("% .6f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        
        else if(operacion.equals("PotenciaCuadrado")){
            resultado = Math.pow(primerNumero,2);
            etiquetaNumeros.setText(String.format("% .6f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
          else if(operacion.equals("^n")) {
            segundoNumero = Double.parseDouble(etiquetaNumeros.getText());
            double resultado = Math.pow(primerNumero, segundoNumero);
            etiquetaNumeros.setText(String.valueOf(resultado));
            etiquetaMuestra.setText("");
        } else {
            // Resto del código para las otras operaciones
        }
        
        etiquetaMuestra.setText("");
        activado = true;
        punto = false;
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            
            activado = false;
        }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";
            
            activado = false;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            
            activado = false;
        }
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("sqrt("+cadenaNumeros+")");
        resultado = Math.sqrt(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonRaizActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if(punto == true){
            if(cadenaNumeros.equals("")){
                cadenaNumeros = "0.";
            }else{
                cadenaNumeros += ".";
            }
            etiquetaNumeros.setText(cadenaNumeros);
            punto = false;
        }              
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasMenosActionPerformed
        if(cadenaNumeros.charAt(0) != '-'){ 
            cadenaNumeros = "-" + cadenaNumeros;
        }else{
            cadenaNumeros = cadenaNumeros.substring(1,cadenaNumeros.length());
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_botonMasMenosActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;
    }//GEN-LAST:event_botonCActionPerformed

    private void botonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCEActionPerformed
        int tamaño = cadenaNumeros.length(); 
        if(tamaño > 0){
            if(tamaño == 1){
                cadenaNumeros = "0";
            }else{
                cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length() - 1);
            }
            etiquetaNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_botonCEActionPerformed

    private void botonInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInversaActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText("1/" + cadenaNumeros + " ");
            cadenaNumeros = "";
            etiquetaNumeros.setText("");
            operacion = "inversa";

            activado = false;
        }
    }//GEN-LAST:event_botonInversaActionPerformed
    
    private void botonCuadradoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
       if (activado == true) {
           primerNumero = Double.parseDouble(cadenaNumeros);
           etiquetaMuestra.setText(cadenaNumeros + "^2" );
           resultado = Math.pow(primerNumero,2);
           cadenaNumeros = String.valueOf(resultado);
       }
    }

    

    private void botonCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuboActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("("+cadenaNumeros+")^3");
        resultado = Math.pow(primerNumero,3);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena// TODO add your handling code here:
    }//GEN-LAST:event_botonCuboActionPerformed

    private void botonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorcentajeActionPerformed
        // TODO add your handling code here:
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText(cadenaNumeros+"%");
        resultado = primerNumero/100;
        etiquetaNumeros.setText(String.valueOf(resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonPorcentajeActionPerformed

    private void botonExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExtraActionPerformed
        // Raiz cubica: wilker atalaya
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("Raiz(3)("+cadenaNumeros+")");
        resultado = Math.pow(primerNumero,(0.3333));
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonExtraActionPerformed

       private void botonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNActionPerformed
        // TODO add your handling code here:
   if (activado == true) {
        double base = Double.parseDouble(etiquetaNumeros.getText());
        etiquetaMuestra.setText(base + "^");
        primerNumero = base; // Guardar el primer número en la variable primerNumero
        operacion = "^n";
        cadenaNumeros = ""; // Reiniciar la cadena de números
        activado = false;
    }


    }//GEN-LAST:event_botonNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonCuadrado;
    private javax.swing.JButton botonCubo;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonExtra;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonInversa;
    private javax.swing.JButton botonMasMenos;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonN;
    private javax.swing.JButton botonPorcentaje;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
