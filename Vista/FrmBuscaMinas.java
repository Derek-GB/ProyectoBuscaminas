/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.BuscaMinasController;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/**
 *
 * @author d2tod
 */
public class FrmBuscaMinas extends javax.swing.JFrame implements MouseListener {

    JLabel[][] casillas;
    BuscaMinasController controlador;

    /**
     * Creates new form FrmBuscaMinas
     */
    public FrmBuscaMinas() {
        initComponents();
        casillas = new JLabel[12][12];
        inicializarCasillas();
        añadirEscuchador();
    }

    private void añadirEscuchador() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                casillas[i][j].addMouseListener(this);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        tablero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 30, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 30, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 40, 30));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 30, 30));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 30, 30));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 30, 30));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 30, 30));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 30, 30));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 30, 30));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 30, 30));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 30, 30));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 30, 30));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 30, 30));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 30, 30));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 30, 30));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 30, 30));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, 30));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 30, 30));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 30, 30));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 30, 30));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 30, 30));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 30, 30));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 30, 30));
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 30, 30));
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 30, 30));
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 30, 30));
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 30, 30));
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 30, 30));
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 30, 30));
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 30, 30));
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 30, 30));
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 30, 30));
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 30, 30));
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 30, 30));
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 30, 30));
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 30, 30));
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 30, 30));
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 30));
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 30, 30));
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, 30));
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 30, 30));
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 30, 30));
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 30, 30));
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 30, 30));
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 30, 30));
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 30, 30));
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 30, 30));
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 30, 30));
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 30, 30));
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 30, 30));
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 30, 30));
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 30, 30));
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 30, 30));
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 30, 30));
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 30, 30));
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 30, 30));
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 30, 30));
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 30, 30));
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 30, 30));
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 30, 30));
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 30, 30));
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 30, 30));
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 30, 30));
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 30, 30));
        jPanel1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 30, 30));
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 30, 30));
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 30, 30));
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 30, 30));
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 30, 30));
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 30, 30));
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 30, 30));
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 30, 30));
        jPanel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 30, 30));
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 30, 30));
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 30, 30));
        jPanel1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 30, 30));
        jPanel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 30, 30));
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 30, 30));
        jPanel1.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 30, 30));
        jPanel1.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 30, 30));
        jPanel1.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 30, 30));
        jPanel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 30, 30));
        jPanel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 30, 30));
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 30, 30));
        jPanel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 30, 30));
        jPanel1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 30, 30));
        jPanel1.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 30, 30));
        jPanel1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 30, 30));
        jPanel1.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 30, 30));
        jPanel1.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 30, 30));
        jPanel1.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 30, 30));
        jPanel1.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 30, 30));
        jPanel1.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 30, 30));
        jPanel1.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 30, 30));
        jPanel1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 30, 30));
        jPanel1.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 30, 30));
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 30, 30));
        jPanel1.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 30, 30));
        jPanel1.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 30, 30));
        jPanel1.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 30, 30));
        jPanel1.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 30, 30));
        jPanel1.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 30, 30));
        jPanel1.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 30, 30));
        jPanel1.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 30, 30));
        jPanel1.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 30, 30));
        jPanel1.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 30, 30));
        jPanel1.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 30, 30));
        jPanel1.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 30, 30));
        jPanel1.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 30, 30));
        jPanel1.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 30, 30));
        jPanel1.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 30, 30));
        jPanel1.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 30, 30));
        jPanel1.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 30, 30));
        jPanel1.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 30, 30));
        jPanel1.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 30, 30));
        jPanel1.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 30, 30));
        jPanel1.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 30, 30));
        jPanel1.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 30, 30));
        jPanel1.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 30, 30));
        jPanel1.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 30, 30));
        jPanel1.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 30, 30));
        jPanel1.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 30, 30));
        jPanel1.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 30, 30));
        jPanel1.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 30, 30));
        jPanel1.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 30, 30));
        jPanel1.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 30, 30));
        jPanel1.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 30, 30));
        jPanel1.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 30, 30));
        jPanel1.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 30, 30));
        jPanel1.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 30, 30));
        jPanel1.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 30, 30));
        jPanel1.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 30, 30));
        jPanel1.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 30, 30));
        jPanel1.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 30, 30));
        jPanel1.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 30, 30));
        jPanel1.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 30, 30));
        jPanel1.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 30, 30));
        jPanel1.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 30, 30));
        jPanel1.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 30, 30));
        jPanel1.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 30, 30));
        jPanel1.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 30, 30));
        jPanel1.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 30, 30));
        jPanel1.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 30, 30));

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/tablero.png"))); // NOI18N
        jPanel1.add(tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 56, 482, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmBuscaMinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmBuscaMinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmBuscaMinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmBuscaMinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmBuscaMinas().setVisible(true);
//            }
//        });
//    }
    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        int[] posicion = obtenerPosicion(label);
        if (posicion[0] == -1 || posicion[1] == -1) {
            throw new UnsupportedOperationException("Wey, tenemos problemas");
        }
        /*Estos eventos de mouse es por el MouseListener, pero solo se necesita
        el mouse Clicked, este revisa cual de los dos clics se hizo y en base a eso actua*/
        switch (e.getButton()) {
            case (MouseEvent.BUTTON1) -> {
                controlador.manejarDestapadoCasilla(posicion[0], posicion[1]);

            }
            case (MouseEvent.BUTTON3) -> {
                controlador.manejarMarcadoCasilla(posicion[0], posicion[1]);

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public boolean trySetControlador(BuscaMinasController controlador) {
        if (this.controlador == null) {
            this.controlador = controlador;
            return true;
        }
        return false;
    }

    private int[] obtenerPosicion(JLabel label) {
        int fila = -1, columna = -1;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (casillas[i][j].equals(label)) {
                    fila = i;
                    columna = j;
                }
            }
        }
        return new int[]{fila, columna};
    }

    private void inicializarCasillas() {
        int labelCount = 1;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                try {
                    casillas[i][j] = (JLabel) this.getClass().getDeclaredField("jLabel" + labelCount).get(this);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                labelCount++;
            }
        }

    }

    public void mostrarFinDeJuego(String resultado) {
        boolean victoria = resultado.equals("Ganaste");
        FrmFinal frmFinal = new FrmFinal(this, true);
        frmFinal.setVictoria(victoria); 
        frmFinal.setVisible(true);
    }
    //Metodo para que se revisar csi termino el juego (según yo)
    public void verificarFinDeJuego() {
        controlador.verificarFinDeJuego();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tablero;
    // End of variables declaration//GEN-END:variables
}
