package com.ale.system.ui.panels;

import com.ale.system.data.EntornoDesarrolloIntegrado;
import com.ale.system.data.LadoDesarrollo;
import com.ale.system.data.NombreLenguajeProgramacion;
import com.ale.system.data.Paradigma;
import com.ale.system.data.Plataforma;
import com.ale.system.data.SistemaOperativo;
import com.ale.system.data.Tipado;
import javax.swing.JPanel;

public class FiltrosPanel extends JPanel
{
    public FiltrosPanel()
    {
        initComponents();
        
        fillData();
        setListeners();
    }
    
    private void fillData()
    {
        this.jcbPlataforma.addItem("Todos");
        for (Plataforma i : Plataforma.values())
            this.jcbPlataforma.addItem(i.toString());
        
        this.jcbSistemaOperativo.addItem("Todos");
        for (SistemaOperativo i : SistemaOperativo.values())
            this.jcbSistemaOperativo.addItem(i.toString());
        
        this.jcbLenguaje.addItem("Todos");
        for (NombreLenguajeProgramacion i : NombreLenguajeProgramacion.values())
            this.jcbLenguaje.addItem(i.toString());
        
        this.jcbTipado1.addItem("Todos");
        for (Tipado i : Tipado.values())
            this.jcbTipado1.addItem(i.toString());
        
        this.jcbTipado2.addItem("Todos");
        for (Tipado i : Tipado.values())
            this.jcbTipado2.addItem(i.toString());
        
        this.jcbParadigma.addItem("Todos");
        for (Paradigma i : Paradigma.values())
            this.jcbParadigma.addItem(i.toString());
        
        this.jcbLadoDesarrollo.addItem("Todos");
        for (LadoDesarrollo i : LadoDesarrollo.values())
            this.jcbLadoDesarrollo.addItem(i.toString());
        
        this.jcbIDE.addItem("Todos");
        for (EntornoDesarrolloIntegrado i : EntornoDesarrolloIntegrado.values())
            this.jcbIDE.addItem(i.toString());
    }
    
    private void setListeners()
    {
        // Filtrar por plataforma
        this.jcbPlataforma.addActionListener((e) ->
        {
            String plataforma = this.jcbPlataforma.getSelectedItem().toString();
            
            // Si la plataforma eleigda es Todos
            if (plataforma.equals("Todos"))
            {
                this.jcbSistemaOperativo.setEnabled(true);
                this.jcbLadoDesarrollo.setEnabled(true);
            }
            // Si la plataforma elegida es web
            else if (plataforma.equals(Plataforma.Web.toString()))
            {
                this.jcbSistemaOperativo.setEnabled(false);
                this.jcbLadoDesarrollo.setEnabled(true);
            }
            // Si la plataforma elegida no es web
            else
            {
                this.jcbSistemaOperativo.setEnabled(true);
                this.jcbLadoDesarrollo.setEnabled(false);
            }
        });
        
        // Requisitos de hardware
        this.jcbRequisitos.addActionListener((e) ->
        {
            this.jtfRamMin.setEnabled(!this.jtfRamMin.isEnabled());
            this.jtfRamMax.setEnabled(!this.jtfRamMax.isEnabled());
            this.jtfEspacio.setEnabled(!this.jtfEspacio.isEnabled());
            this.jcbProcesador.setEnabled(!this.jcbProcesador.isEnabled());
        });
        
        // Aplicar filtros
        this.jbAplicar.addActionListener((e) -> aplicarFiltros());
    }
    
    private void aplicarFiltros()
    {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbPlataforma = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbSistemaOperativo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbLenguaje = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbTipado1 = new javax.swing.JComboBox<>();
        jcbTipado2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcbParadigma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbLadoDesarrollo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbIDE = new javax.swing.JComboBox<>();
        jcbRequisitos = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jtfRamMin = new javax.swing.JTextField();
        jtfRamMax = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfEspacio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcbProcesador = new javax.swing.JComboBox<>();
        jbAplicar = new javax.swing.JButton();

        jLabel1.setText("Plataforma");

        jLabel2.setText("Sistema Operativo");

        jLabel3.setText("Lenguaje de programación");

        jLabel4.setText("Tipado");

        jLabel5.setText("Paradigma");

        jLabel6.setText("Lado de desarrollo");

        jLabel7.setText("Entorno de Desarrollo Integrado (IDE)");

        jcbRequisitos.setText("Requisitos de Hardware");

        jLabel8.setText("RAM");

        jtfRamMin.setEnabled(false);

        jtfRamMax.setEnabled(false);

        jLabel9.setText("Minimo");

        jLabel10.setText("Maximo");

        jLabel11.setText("Espacio en disco");

        jtfEspacio.setEnabled(false);

        jLabel12.setText("Procesador");

        jcbProcesador.setEnabled(false);

        jbAplicar.setText("Aplicar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbParadigma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbPlataforma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbSistemaOperativo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbLenguaje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbTipado1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbTipado2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbLadoDesarrollo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbIDE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(jtfRamMin))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtfRamMax)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbProcesador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbRequisitos)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSistemaOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbParadigma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbLadoDesarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbRequisitos)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRamMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRamMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jbAplicar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbAplicar;
    private javax.swing.JComboBox<String> jcbIDE;
    private javax.swing.JComboBox<String> jcbLadoDesarrollo;
    private javax.swing.JComboBox<String> jcbLenguaje;
    private javax.swing.JComboBox<String> jcbParadigma;
    private javax.swing.JComboBox<String> jcbPlataforma;
    private javax.swing.JComboBox<String> jcbProcesador;
    private javax.swing.JCheckBox jcbRequisitos;
    private javax.swing.JComboBox<String> jcbSistemaOperativo;
    private javax.swing.JComboBox<String> jcbTipado1;
    private javax.swing.JComboBox<String> jcbTipado2;
    private javax.swing.JTextField jtfEspacio;
    private javax.swing.JTextField jtfRamMax;
    private javax.swing.JTextField jtfRamMin;
    // End of variables declaration//GEN-END:variables

}
