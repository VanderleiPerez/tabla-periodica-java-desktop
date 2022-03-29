/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.applet.AudioClip;
import ElementoR.Negocio;
import com.sun.javafx.scene.control.SizeLimitedList;
import java.applet.AudioClip;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class framePractica extends javax.swing.JFrame {
    

    
Negocio obj = new Negocio();
// Para llamar al jframeResultado
frameResultado resultado = new frameResultado();
ElementoR.ElementosQ elemento; //
int grupoSeleecionado=0; // Para seleccionar al azar el grupo
int ventana=1; // NU
int bien=0;
int mal=0;
int contadorBloque=0; // Contar cuantos bloques fueron contados
int clic=0; // Para contar el # de clic del H, y mandar a imprimir
// VARIABLE DONDE SE ALMACENARAN LAS VARIABLES
ImageIcon Imagen[] = new ImageIcon[45];
// contador para las imagenes
int contador=1;
    public framePractica() {
        
        initComponents();
        setSize(1005, 650); // Establecer tamaño inicial 630
        
        // Seleccionar Menú Practica, desactivar menu Aprende
        subpanelPractica.setBackground(new Color(44,62,80));
        subpanelAprende.setBackground(new Color(38,50,56));
        // Mover ventana inicial al centro
        setLocationRelativeTo(null); 
        // DESHABILITAR MNEMOTECNIAS
        panelNemo.setVisible(true);
        mnemoIA.setVisible(false);
        mnemoIIA.setVisible(false);
        mnemoIIIA.setVisible(false);
        mnemoIVA.setVisible(false);
        mnemoVA.setVisible(false);
        mnemoVIA.setVisible(false);
        mnemoVIIA.setVisible(false);
        mnemoVIIIA.setVisible(false);
        // Generar número aleatorio entre 1 y 8
        grupoSeleecionado = (int) (Math.random() * 8) + 1;
        switch(grupoSeleecionado){
            case 1:
                
        }
        /* PRUEBA
        grupoSeleecionado=8;*/
        System.out.println(grupoSeleecionado);
        // Del número aleatorio seleccionar un grupo de color amarillo
        switch(grupoSeleecionado){  
            case 1: 
                {
                    // Poner texto en limpio el grupo 1
                    txtH.setText("");
                    txtLi.setText("");
                    txtNa.setText("");
                    txt1K.setText("");
                    txt1Rb.setText("");
                    txt1Cs.setText("");
                    txt1Fr.setText("");
                    // Poner de color amarillo el grupo 1
                    pnl1H.setBackground(new Color(243,156,18));
                    pnlLi.setBackground(new Color(243,156,18));
                    pnl1Na.setBackground(new Color(243,156,18));
                    pnl1K.setBackground(new Color(243,156,18));
                    pnl1Rb.setBackground(new Color(243,156,18));
                    pnl1Cs.setBackground(new Color(243,156,18));
                    pnl1Fr.setBackground(new Color(243,156,18));
                    //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                    subpnl1H.setBackground(new Color(243,156,18));
                    subpnl1Li.setBackground(new Color(243,156,18));
                    subpnl1Na.setBackground(new Color(243,156,18));
                    subpnl1K.setBackground(new Color(243,156,18));
                    subpnl1Rb.setBackground(new Color(243,156,18));
                    subpnl1Cs.setBackground(new Color(243,156,18));
                    subpnl1Fr.setBackground(new Color(243,156,18));
                    // DESHABILITAR COLORES DE LOS OTROS GRUPOS
                    pnl2Be.setBackground(new Color(41,128,185));
                    pnl2Mg.setBackground(new Color(41,128,185));
                    pnl2Ca.setBackground(new Color(41,128,185));
                    pnl2Sr.setBackground(new Color(41,128,185));
                    pnl2Ba.setBackground(new Color(41,128,185));
                    pnl2Ra.setBackground(new Color(41,128,185));
                    pnl3B.setBackground(new Color(41,128,185));
                    pnl3Al.setBackground(new Color(41,128,185));
                    pnl3Ga.setBackground(new Color(41,128,185));
                    pnl3In.setBackground(new Color(41,128,185));
                    pnl3Tl.setBackground(new Color(41,128,185));
                    pnl4C.setBackground(new Color(41,128,185));
                    pnl4Si.setBackground(new Color(41,128,185));
                    pnl4Ge.setBackground(new Color(41,128,185));
                    pnl4Sn.setBackground(new Color(41,128,185));
                    pnl4Pb.setBackground(new Color(41,128,185));
                    pnl5N.setBackground(new Color(41,128,185));
                    pnl5P.setBackground(new Color(41,128,185));
                    pnl5As.setBackground(new Color(41,128,185));
                    pnl5Sb.setBackground(new Color(41,128,185));
                    pnl5Bi.setBackground(new Color(41,128,185));
                    pnl6O.setBackground(new Color(41,128,185));
                    pnl6S.setBackground(new Color(41,128,185));
                    pnl6Se.setBackground(new Color(41,128,185));
                    pnl6Te.setBackground(new Color(41,128,185));
                    pnl6Po.setBackground(new Color(41,128,185));
                    pnl7F.setBackground(new Color(41,128,185));
                    pnl7Cl.setBackground(new Color(41,128,185));
                    pnl7Br.setBackground(new Color(41,128,185));
                    pnl7I.setBackground(new Color(41,128,185));
                    pnl7At.setBackground(new Color(41,128,185));
                    pnl8He.setBackground(new Color(41,128,185));
                    pnl8Ne.setBackground(new Color(41,128,185));
                    pnl8Ar.setBackground(new Color(41,128,185));
                    pnl8Kr.setBackground(new Color(41,128,185));
                    pnl8Xe.setBackground(new Color(41,128,185));
                    pnl8Rn.setBackground(new Color(41,128,185));

                    // HABILITAR MNEMOTECNIA - GRUPO IA
                    mnemoIA.setVisible(true);
                    mnemoIIA.setVisible(false);
                    mnemoIIIA.setVisible(false);
                    mnemoIVA.setVisible(false);
                    mnemoVA.setVisible(false);
                    mnemoVIA.setVisible(false);
                    mnemoVIIA.setVisible(false);
                    mnemoVIIIA.setVisible(false);
                    break;
                }
            case 2:{
                    // Poner texto en limpio el grupo 2
                        txt2Be.setText("");
                        txt2Mg.setText("");
                        txt2Ca.setText("");
                        txt2Sr.setText("");
                        txt2Ba.setText("");
                        txt2Ra.setText("");
                    // Poner de color amarillo el grupo 2
                       pnl2Be.setBackground(new Color(243,156,18));
                        pnl2Mg.setBackground(new Color(243,156,18));
                        pnl2Ca.setBackground(new Color(243,156,18));
                        pnl2Sr.setBackground(new Color(243,156,18));
                        pnl2Ba.setBackground(new Color(243,156,18));
                        pnl2Ra.setBackground(new Color(243,156,18));
                        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                        subpnl2Be.setBackground(new Color(243,156,18));
                        subpnl2Mg.setBackground(new Color(243,156,18));
                        subpnl2Ca.setBackground(new Color(243,156,18));
                        subpnl2Sr.setBackground(new Color(243,156,18));
                        subpnl2Ba.setBackground(new Color(243,156,18));
                        subpnl2Ra.setBackground(new Color(243,156,18));
                        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
                        pnl1H.setBackground(new Color(41,128,185));
                        pnlLi.setBackground(new Color(41,128,185));
                        pnl1Na.setBackground(new Color(41,128,185));
                        pnl1K.setBackground(new Color(41,128,185));
                        pnl1Rb.setBackground(new Color(41,128,185));
                        pnl1Cs.setBackground(new Color(41,128,185));
                        pnl1Fr.setBackground(new Color(41,128,185));
                        pnl3B.setBackground(new Color(41,128,185));
                        pnl3Al.setBackground(new Color(41,128,185));
                        pnl3Ga.setBackground(new Color(41,128,185));
                        pnl3In.setBackground(new Color(41,128,185));
                        pnl3Tl.setBackground(new Color(41,128,185));
                        pnl4C.setBackground(new Color(41,128,185));
                        pnl4Si.setBackground(new Color(41,128,185));
                        pnl4Ge.setBackground(new Color(41,128,185));
                        pnl4Sn.setBackground(new Color(41,128,185));
                        pnl4Pb.setBackground(new Color(41,128,185));
                        pnl5N.setBackground(new Color(41,128,185));
                        pnl5P.setBackground(new Color(41,128,185));
                        pnl5As.setBackground(new Color(41,128,185));
                        pnl5Sb.setBackground(new Color(41,128,185));
                        pnl5Bi.setBackground(new Color(41,128,185));
                        pnl6O.setBackground(new Color(41,128,185));
                        pnl6S.setBackground(new Color(41,128,185));
                        pnl6Se.setBackground(new Color(41,128,185));
                        pnl6Te.setBackground(new Color(41,128,185));
                        pnl6Po.setBackground(new Color(41,128,185));
                        pnl7F.setBackground(new Color(41,128,185));
                        pnl7Cl.setBackground(new Color(41,128,185));
                        pnl7Br.setBackground(new Color(41,128,185));
                        pnl7I.setBackground(new Color(41,128,185));
                        pnl7At.setBackground(new Color(41,128,185));
                        pnl8He.setBackground(new Color(41,128,185));
                        pnl8Ne.setBackground(new Color(41,128,185));
                        pnl8Ar.setBackground(new Color(41,128,185));
                        pnl8Kr.setBackground(new Color(41,128,185));
                        pnl8Xe.setBackground(new Color(41,128,185));
                        pnl8Rn.setBackground(new Color(41,128,185));
                        // HABILITAR MNEMOTECNIA - GRUPO IIA
                        mnemoIA.setVisible(false);
                        mnemoIIA.setVisible(true);
                        mnemoIIIA.setVisible(false);
                        mnemoIVA.setVisible(false);
                        mnemoVA.setVisible(false);
                        mnemoVIA.setVisible(false);
                        mnemoVIIA.setVisible(false);
                        mnemoVIIIA.setVisible(false);
                        break;
            }  
            case 3:{
                    // Poner texto en limpio el grupo 3
                        txt3B.setText("");
                        txt3Al.setText("");
                        txt3Ga.setText("");
                        txt3In.setText("");
                        txt3Tl.setText("");
                    // Poner de color amarillo el grupo 3
                        //HABILITAR COLOR AL GRUPO SELECCIONADO
                        pnl3B.setBackground(new Color(243,156,18));
                        pnl3Al.setBackground(new Color(243,156,18));
                        pnl3Ga.setBackground(new Color(243,156,18));
                        pnl3In.setBackground(new Color(243,156,18));
                        pnl3Tl.setBackground(new Color(243,156,18));
                        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                        subpnl3B.setBackground(new Color(243,156,18));
                        subpnl3Al.setBackground(new Color(243,156,18));
                        subpnl3Ga.setBackground(new Color(243,156,18));
                        subpnl3In.setBackground(new Color(243,156,18));
                        subpnl3Tl.setBackground(new Color(243,156,18));
                        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                        subpnl3B.setBackground(new Color(243,156,18));
                        subpnl3Al.setBackground(new Color(243,156,18));
                        subpnl3Ga.setBackground(new Color(243,156,18));
                        subpnl3In.setBackground(new Color(243,156,18));
                        subpnl3Tl.setBackground(new Color(243,156,18));
                        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
                        pnl1H.setBackground(new Color(41,128,185));
                        pnlLi.setBackground(new Color(41,128,185));
                        pnl1Na.setBackground(new Color(41,128,185));
                        pnl1K.setBackground(new Color(41,128,185));
                        pnl1Rb.setBackground(new Color(41,128,185));
                        pnl1Cs.setBackground(new Color(41,128,185));
                        pnl1Fr.setBackground(new Color(41,128,185));
                        pnl2Be.setBackground(new Color(41,128,185));
                        pnl2Mg.setBackground(new Color(41,128,185));
                        pnl2Ca.setBackground(new Color(41,128,185));
                        pnl2Sr.setBackground(new Color(41,128,185));
                        pnl2Ba.setBackground(new Color(41,128,185));
                        pnl2Ra.setBackground(new Color(41,128,185));
                        pnl4C.setBackground(new Color(41,128,185));
                        pnl4Si.setBackground(new Color(41,128,185));
                        pnl4Ge.setBackground(new Color(41,128,185));
                        pnl4Sn.setBackground(new Color(41,128,185));
                        pnl4Pb.setBackground(new Color(41,128,185));
                        pnl5N.setBackground(new Color(41,128,185));
                        pnl5P.setBackground(new Color(41,128,185));
                        pnl5As.setBackground(new Color(41,128,185));
                        pnl5Sb.setBackground(new Color(41,128,185));
                        pnl5Bi.setBackground(new Color(41,128,185));
                        pnl6O.setBackground(new Color(41,128,185));
                        pnl6S.setBackground(new Color(41,128,185));
                        pnl6Se.setBackground(new Color(41,128,185));
                        pnl6Te.setBackground(new Color(41,128,185));
                        pnl6Po.setBackground(new Color(41,128,185));
                        pnl7F.setBackground(new Color(41,128,185));
                        pnl7Cl.setBackground(new Color(41,128,185));
                        pnl7Br.setBackground(new Color(41,128,185));
                        pnl7I.setBackground(new Color(41,128,185));
                        pnl7At.setBackground(new Color(41,128,185));
                        pnl8He.setBackground(new Color(41,128,185));
                        pnl8Ne.setBackground(new Color(41,128,185));
                        pnl8Ar.setBackground(new Color(41,128,185));
                        pnl8Kr.setBackground(new Color(41,128,185));
                        pnl8Xe.setBackground(new Color(41,128,185));
                        pnl8Rn.setBackground(new Color(41,128,185));
                        // HABILITAR MNEMOTECNIA - GRUPO IIIA
                        mnemoIA.setVisible(false);
                        mnemoIIA.setVisible(false);
                        mnemoIIIA.setVisible(true);
                        mnemoIVA.setVisible(false);
                        mnemoVA.setVisible(false);
                        mnemoVIA.setVisible(false);
                        mnemoVIIA.setVisible(false);
                        mnemoVIIIA.setVisible(false);
                        break;
            } 
            case 4:{
                    // Poner texto en limpio el grupo 4
                        txt4C.setText("");
                        txt4Si.setText("");
                        txt4Ge.setText("");
                        txt4Sn.setText("");
                        txt4Pb.setText("");
                    // Poner de color amarillo el grupo 4
                        //HABILITAR COLOR AL GRUPO SELECCIONADO
                        pnl4C.setBackground(new Color(243,156,18));
                        pnl4Si.setBackground(new Color(243,156,18));
                        pnl4Ge.setBackground(new Color(243,156,18));
                        pnl4Sn.setBackground(new Color(243,156,18));
                        pnl4Pb.setBackground(new Color(243,156,18));
                        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                        subpnl4C.setBackground(new Color(243,156,18));
                        subpnl4Ge.setBackground(new Color(243,156,18));
                        subpnl4Sn.setBackground(new Color(243,156,18));
                        subpnl4Pb.setBackground(new Color(243,156,18));
                        subpnl4sI.setBackground(new Color(243,156,18));
                        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
                        pnl1H.setBackground(new Color(41,128,185));
                        pnlLi.setBackground(new Color(41,128,185));
                        pnl1Na.setBackground(new Color(41,128,185));
                        pnl1K.setBackground(new Color(41,128,185));
                        pnl1Rb.setBackground(new Color(41,128,185));
                        pnl1Cs.setBackground(new Color(41,128,185));
                        pnl1Fr.setBackground(new Color(41,128,185));
                        pnl2Be.setBackground(new Color(41,128,185));
                        pnl2Mg.setBackground(new Color(41,128,185));
                        pnl2Ca.setBackground(new Color(41,128,185));
                        pnl2Sr.setBackground(new Color(41,128,185));
                        pnl2Ba.setBackground(new Color(41,128,185));
                        pnl2Ra.setBackground(new Color(41,128,185));
                        pnl3B.setBackground(new Color(41,128,185));
                        pnl3Al.setBackground(new Color(41,128,185));
                        pnl3Ga.setBackground(new Color(41,128,185));
                        pnl3In.setBackground(new Color(41,128,185));
                        pnl3Tl.setBackground(new Color(41,128,185));
                        pnl5N.setBackground(new Color(41,128,185));
                        pnl5P.setBackground(new Color(41,128,185));
                        pnl5As.setBackground(new Color(41,128,185));
                        pnl5Sb.setBackground(new Color(41,128,185));
                        pnl5Bi.setBackground(new Color(41,128,185));
                        pnl6O.setBackground(new Color(41,128,185));
                        pnl6S.setBackground(new Color(41,128,185));
                        pnl6Se.setBackground(new Color(41,128,185));
                        pnl6Te.setBackground(new Color(41,128,185));
                        pnl6Po.setBackground(new Color(41,128,185));
                        pnl7F.setBackground(new Color(41,128,185));
                        pnl7Cl.setBackground(new Color(41,128,185));
                        pnl7Br.setBackground(new Color(41,128,185));
                        pnl7I.setBackground(new Color(41,128,185));
                        pnl7At.setBackground(new Color(41,128,185));
                        pnl8He.setBackground(new Color(41,128,185));
                        pnl8Ne.setBackground(new Color(41,128,185));
                        pnl8Ar.setBackground(new Color(41,128,185));
                        pnl8Kr.setBackground(new Color(41,128,185));
                        pnl8Xe.setBackground(new Color(41,128,185));
                        pnl8Rn.setBackground(new Color(41,128,185));
                        // HABILITAR MNEMOTECNIA - GRUPO IVA
                        mnemoIA.setVisible(false);
                        mnemoIIA.setVisible(false);
                        mnemoIIIA.setVisible(false);
                        mnemoIVA.setVisible(true);
                        mnemoVA.setVisible(false);
                        mnemoVIA.setVisible(false);
                        mnemoVIIA.setVisible(false);
                        mnemoVIIIA.setVisible(false);
                        break;
            } 
            case 5:{
                    // Poner texto en limpio el grupo 5
                        txt5N.setText("");
                        txt5P.setText("");
                        txt5As.setText("");
                        txt5Sb.setText("");
                        txt5Bi.setText("");
                    // Poner de color amarillo el grupo 5
                        //HABILITAR COLOR AL GRUPO SELECCIONADO
                        pnl5N.setBackground(new Color(243,156,18));
                        pnl5P.setBackground(new Color(243,156,18));
                        pnl5As.setBackground(new Color(243,156,18));
                        pnl5Sb.setBackground(new Color(243,156,18));
                        pnl5Bi.setBackground(new Color(243,156,18));
                        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                        subpnl5N.setBackground(new Color(243,156,18));
                        subpnl5P.setBackground(new Color(243,156,18));
                        subpnl5As.setBackground(new Color(243,156,18));
                        subpnl5Sb.setBackground(new Color(243,156,18));
                        subpnl5Bi.setBackground(new Color(243,156,18));
                        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
                        pnl1H.setBackground(new Color(41,128,185));
                        pnlLi.setBackground(new Color(41,128,185));
                        pnl1Na.setBackground(new Color(41,128,185));
                        pnl1K.setBackground(new Color(41,128,185));
                        pnl1Rb.setBackground(new Color(41,128,185));
                        pnl1Cs.setBackground(new Color(41,128,185));
                        pnl1Fr.setBackground(new Color(41,128,185));
                        pnl2Be.setBackground(new Color(41,128,185));
                        pnl2Mg.setBackground(new Color(41,128,185));
                        pnl2Ca.setBackground(new Color(41,128,185));
                        pnl2Sr.setBackground(new Color(41,128,185));
                        pnl2Ba.setBackground(new Color(41,128,185));
                        pnl2Ra.setBackground(new Color(41,128,185));
                        pnl3B.setBackground(new Color(41,128,185));
                        pnl3Al.setBackground(new Color(41,128,185));
                        pnl3Ga.setBackground(new Color(41,128,185));
                        pnl3In.setBackground(new Color(41,128,185));
                        pnl3Tl.setBackground(new Color(41,128,185));
                        pnl4C.setBackground(new Color(41,128,185));
                        pnl4Si.setBackground(new Color(41,128,185));
                        pnl4Ge.setBackground(new Color(41,128,185));
                        pnl4Sn.setBackground(new Color(41,128,185));
                        pnl4Pb.setBackground(new Color(41,128,185));
                        pnl6O.setBackground(new Color(41,128,185));
                        pnl6S.setBackground(new Color(41,128,185));
                        pnl6Se.setBackground(new Color(41,128,185));
                        pnl6Te.setBackground(new Color(41,128,185));
                        pnl6Po.setBackground(new Color(41,128,185));
                        pnl7F.setBackground(new Color(41,128,185));
                        pnl7Cl.setBackground(new Color(41,128,185));
                        pnl7Br.setBackground(new Color(41,128,185));
                        pnl7I.setBackground(new Color(41,128,185));
                        pnl7At.setBackground(new Color(41,128,185));
                        pnl8He.setBackground(new Color(41,128,185));
                        pnl8Ne.setBackground(new Color(41,128,185));
                        pnl8Ar.setBackground(new Color(41,128,185));
                        pnl8Kr.setBackground(new Color(41,128,185));
                        pnl8Xe.setBackground(new Color(41,128,185));
                        pnl8Rn.setBackground(new Color(41,128,185));
                        // HABILITAR MNEMOTECNIA - GRUPO VA
                        mnemoIA.setVisible(false);
                        mnemoIIA.setVisible(false);
                        mnemoIIIA.setVisible(false);
                        mnemoIVA.setVisible(false);
                        mnemoVA.setVisible(true);
                        mnemoVIA.setVisible(false);
                        mnemoVIIA.setVisible(false);
                        mnemoVIIIA.setVisible(false);
                        break;
            } 
            case 6:{
                    // Poner texto en limpio el grupo 6
                        txt6O.setText("");
                        txt6S.setText("");
                        txt6Se.setText("");
                        txt6Te.setText("");
                        txt6Po.setText("");
                    // Poner de color amarillo el grupo 6
                        //HABILITAR COLOR AL GRUPO SELECCIONADO
                        pnl6O.setBackground(new Color(243,156,18));
                        pnl6S.setBackground(new Color(243,156,18));
                        pnl6Se.setBackground(new Color(243,156,18));
                        pnl6Te.setBackground(new Color(243,156,18));
                        pnl6Po.setBackground(new Color(243,156,18));
                        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                        subpnl6O.setBackground(new Color(243,156,18));
                        subpnl6S.setBackground(new Color(243,156,18));
                        subpnl6Se.setBackground(new Color(243,156,18));
                        subpnl6Te.setBackground(new Color(243,156,18));
                        subpnl6Po.setBackground(new Color(243,156,18));
                        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
                        pnl1H.setBackground(new Color(41,128,185));
                        pnlLi.setBackground(new Color(41,128,185));
                        pnl1Na.setBackground(new Color(41,128,185));
                        pnl1K.setBackground(new Color(41,128,185));
                        pnl1Rb.setBackground(new Color(41,128,185));
                        pnl1Cs.setBackground(new Color(41,128,185));
                        pnl1Fr.setBackground(new Color(41,128,185));
                        pnl2Be.setBackground(new Color(41,128,185));
                        pnl2Mg.setBackground(new Color(41,128,185));
                        pnl2Ca.setBackground(new Color(41,128,185));
                        pnl2Sr.setBackground(new Color(41,128,185));
                        pnl2Ba.setBackground(new Color(41,128,185));
                        pnl2Ra.setBackground(new Color(41,128,185));
                        pnl3B.setBackground(new Color(41,128,185));
                        pnl3Al.setBackground(new Color(41,128,185));
                        pnl3Ga.setBackground(new Color(41,128,185));
                        pnl3In.setBackground(new Color(41,128,185));
                        pnl3Tl.setBackground(new Color(41,128,185));
                        pnl4C.setBackground(new Color(41,128,185));
                        pnl4Si.setBackground(new Color(41,128,185));
                        pnl4Ge.setBackground(new Color(41,128,185));
                        pnl4Sn.setBackground(new Color(41,128,185));
                        pnl4Pb.setBackground(new Color(41,128,185));
                        pnl5N.setBackground(new Color(41,128,185));
                        pnl5P.setBackground(new Color(41,128,185));
                        pnl5As.setBackground(new Color(41,128,185));
                        pnl5Sb.setBackground(new Color(41,128,185));
                        pnl5Bi.setBackground(new Color(41,128,185));
                        pnl7F.setBackground(new Color(41,128,185));
                        pnl7Cl.setBackground(new Color(41,128,185));
                        pnl7Br.setBackground(new Color(41,128,185));
                        pnl7I.setBackground(new Color(41,128,185));
                        pnl7At.setBackground(new Color(41,128,185));
                        pnl8He.setBackground(new Color(41,128,185));
                        pnl8Ne.setBackground(new Color(41,128,185));
                        pnl8Ar.setBackground(new Color(41,128,185));
                        pnl8Kr.setBackground(new Color(41,128,185));
                        pnl8Xe.setBackground(new Color(41,128,185));
                        pnl8Rn.setBackground(new Color(41,128,185));
                        // HABILITAR MNEMOTECNIA - GRUPO VIA
                        mnemoIA.setVisible(false);
                        mnemoIIA.setVisible(false);
                        mnemoIIIA.setVisible(false);
                        mnemoIVA.setVisible(false);
                        mnemoVA.setVisible(false);
                        mnemoVIA.setVisible(true);
                        mnemoVIIA.setVisible(false);
                        mnemoVIIIA.setVisible(false);
                        break;
            } 
            case 7:{
                        // Poner texto en limpio el grupo 7
                        txt7F.setText("");
                        txt7Cl.setText("");
                        txt7Br.setText("");
                        txt7I.setText("");
                        txt7At.setText("");
                        // Poner de color amarillo el grupo 7
                        //HABILITAR COLOR AL GRUPO SELECCIONADO
                        pnl7F.setBackground(new Color(243,156,18));
                        pnl7Cl.setBackground(new Color(243,156,18));
                        pnl7Br.setBackground(new Color(243,156,18));
                        pnl7I.setBackground(new Color(243,156,18));
                        pnl7At.setBackground(new Color(243,156,18));
                        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                        subpnl7F.setBackground(new Color(243,156,18));
                        subpnl7Cl.setBackground(new Color(243,156,18));
                        subpnl7Br.setBackground(new Color(243,156,18));
                        subpnl7I.setBackground(new Color(243,156,18));
                        subpnl7At.setBackground(new Color(243,156,18));
                        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
                        pnl1H.setBackground(new Color(41,128,185));
                        pnlLi.setBackground(new Color(41,128,185));
                        pnl1Na.setBackground(new Color(41,128,185));
                        pnl1K.setBackground(new Color(41,128,185));
                        pnl1Rb.setBackground(new Color(41,128,185));
                        pnl1Cs.setBackground(new Color(41,128,185));
                        pnl1Fr.setBackground(new Color(41,128,185));
                        pnl2Be.setBackground(new Color(41,128,185));
                        pnl2Mg.setBackground(new Color(41,128,185));
                        pnl2Ca.setBackground(new Color(41,128,185));
                        pnl2Sr.setBackground(new Color(41,128,185));
                        pnl2Ba.setBackground(new Color(41,128,185));
                        pnl2Ra.setBackground(new Color(41,128,185));
                        pnl3B.setBackground(new Color(41,128,185));
                        pnl3Al.setBackground(new Color(41,128,185));
                        pnl3Ga.setBackground(new Color(41,128,185));
                        pnl3In.setBackground(new Color(41,128,185));
                        pnl3Tl.setBackground(new Color(41,128,185));
                        pnl4C.setBackground(new Color(41,128,185));
                        pnl4Si.setBackground(new Color(41,128,185));
                        pnl4Ge.setBackground(new Color(41,128,185));
                        pnl4Sn.setBackground(new Color(41,128,185));
                        pnl4Pb.setBackground(new Color(41,128,185));
                        pnl5N.setBackground(new Color(41,128,185));
                        pnl5P.setBackground(new Color(41,128,185));
                        pnl5As.setBackground(new Color(41,128,185));
                        pnl5Sb.setBackground(new Color(41,128,185));
                        pnl5Bi.setBackground(new Color(41,128,185));
                        pnl6O.setBackground(new Color(41,128,185));
                        pnl6S.setBackground(new Color(41,128,185));
                        pnl6Se.setBackground(new Color(41,128,185));
                        pnl6Te.setBackground(new Color(41,128,185));
                        pnl6Po.setBackground(new Color(41,128,185));
                        pnl8He.setBackground(new Color(41,128,185));
                        pnl8Ne.setBackground(new Color(41,128,185));
                        pnl8Ar.setBackground(new Color(41,128,185));
                        pnl8Kr.setBackground(new Color(41,128,185));
                        pnl8Xe.setBackground(new Color(41,128,185));
                        pnl8Rn.setBackground(new Color(41,128,185));
                        // HABILITAR MNEMOTECNIA - GRUPO VIIA
                        mnemoIA.setVisible(false);
                        mnemoIIA.setVisible(false);
                        mnemoIIIA.setVisible(false);
                        mnemoIVA.setVisible(false);
                        mnemoVA.setVisible(false);
                        mnemoVIA.setVisible(false);
                        mnemoVIIA.setVisible(true);
                        mnemoVIIIA.setVisible(false);
                        break;
            }
            case 8:{
                        // Poner texto en limpio el grupo 8
                        txt8He.setText("");
                        txt8Ne.setText("");
                        txt8Ar.setText("");
                        txt8Kr.setText("");
                        txt8Xe.setText("");
                        txt8Rn.setText("");
                        // Poner de color amarillo el grupo 8
                        //HABILITAR COLOR AL GRUPO SELECCIONADO
                        pnl8He.setBackground(new Color(243,156,18));
                        pnl8Ne.setBackground(new Color(243,156,18));
                        pnl8Ar.setBackground(new Color(243,156,18));
                        pnl8Kr.setBackground(new Color(243,156,18));
                        pnl8Xe.setBackground(new Color(243,156,18));
                        pnl8Rn.setBackground(new Color(243,156,18));
                        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
                        subpnl8He.setBackground(new Color(243,156,18));
                        subpnl8Ne.setBackground(new Color(243,156,18));
                        subpnl8Ar.setBackground(new Color(243,156,18));
                        subpnl8Kr.setBackground(new Color(243,156,18));
                        subpnl8Xe.setBackground(new Color(243,156,18));
                        subpnl8Rn.setBackground(new Color(243,156,18));
                        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
                        pnl1H.setBackground(new Color(41,128,185));
                        pnlLi.setBackground(new Color(41,128,185));
                        pnl1Na.setBackground(new Color(41,128,185));
                        pnl1K.setBackground(new Color(41,128,185));
                        pnl1Rb.setBackground(new Color(41,128,185));
                        pnl1Cs.setBackground(new Color(41,128,185));
                        pnl1Fr.setBackground(new Color(41,128,185));
                        pnl2Be.setBackground(new Color(41,128,185));
                        pnl2Mg.setBackground(new Color(41,128,185));
                        pnl2Ca.setBackground(new Color(41,128,185));
                        pnl2Sr.setBackground(new Color(41,128,185));
                        pnl2Ba.setBackground(new Color(41,128,185));
                        pnl2Ra.setBackground(new Color(41,128,185));
                        pnl3B.setBackground(new Color(41,128,185));
                        pnl3Al.setBackground(new Color(41,128,185));
                        pnl3Ga.setBackground(new Color(41,128,185));
                        pnl3In.setBackground(new Color(41,128,185));
                        pnl3Tl.setBackground(new Color(41,128,185));
                        pnl4C.setBackground(new Color(41,128,185));
                        pnl4Si.setBackground(new Color(41,128,185));
                        pnl4Ge.setBackground(new Color(41,128,185));
                        pnl4Sn.setBackground(new Color(41,128,185));
                        pnl4Pb.setBackground(new Color(41,128,185));
                        pnl5N.setBackground(new Color(41,128,185));
                        pnl5P.setBackground(new Color(41,128,185));
                        pnl5As.setBackground(new Color(41,128,185));
                        pnl5Sb.setBackground(new Color(41,128,185));
                        pnl5Bi.setBackground(new Color(41,128,185));
                        pnl6O.setBackground(new Color(41,128,185));
                        pnl6S.setBackground(new Color(41,128,185));
                        pnl6Se.setBackground(new Color(41,128,185));
                        pnl6Te.setBackground(new Color(41,128,185));
                        pnl6Po.setBackground(new Color(41,128,185));
                        pnl7F.setBackground(new Color(41,128,185));
                        pnl7Cl.setBackground(new Color(41,128,185));
                        pnl7Br.setBackground(new Color(41,128,185));
                        pnl7I.setBackground(new Color(41,128,185));
                        pnl7At.setBackground(new Color(41,128,185));

                        // HABILITAR MNEMOTECNIA - GRUPO VIIIA
                        mnemoIA.setVisible(false);
                        mnemoIIA.setVisible(false);
                        mnemoIIIA.setVisible(false);
                        mnemoIVA.setVisible(false);
                        mnemoVA.setVisible(false);
                        mnemoVIA.setVisible(false);
                        mnemoVIIA.setVisible(false);
                        mnemoVIIIA.setVisible(true);
                        break;
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

        PANEL = new javax.swing.JPanel();
        pnlPRINCIPAL = new javax.swing.JPanel();
        pnl1H = new javax.swing.JPanel();
        txtH = new javax.swing.JLabel();
        pnlLi = new javax.swing.JPanel();
        txtLi = new javax.swing.JLabel();
        pnl1Na = new javax.swing.JPanel();
        txtNa = new javax.swing.JLabel();
        pnl1K = new javax.swing.JPanel();
        txt1K = new javax.swing.JLabel();
        pnl1Rb = new javax.swing.JPanel();
        txt1Rb = new javax.swing.JLabel();
        pnl1Cs = new javax.swing.JPanel();
        txt1Cs = new javax.swing.JLabel();
        pnl1Fr = new javax.swing.JPanel();
        txt1Fr = new javax.swing.JLabel();
        pnl2Be = new javax.swing.JPanel();
        txt2Be = new javax.swing.JLabel();
        pnl2Mg = new javax.swing.JPanel();
        txt2Mg = new javax.swing.JLabel();
        pnl2Ca = new javax.swing.JPanel();
        txt2Ca = new javax.swing.JLabel();
        pnl2Sr = new javax.swing.JPanel();
        txt2Sr = new javax.swing.JLabel();
        pnl2Ba = new javax.swing.JPanel();
        txt2Ba = new javax.swing.JLabel();
        pnl2Ra = new javax.swing.JPanel();
        txt2Ra = new javax.swing.JLabel();
        pnl3B = new javax.swing.JPanel();
        txt3B = new javax.swing.JLabel();
        pnl3Al = new javax.swing.JPanel();
        txt3Al = new javax.swing.JLabel();
        pnl3Ga = new javax.swing.JPanel();
        txt3Ga = new javax.swing.JLabel();
        pnl3In = new javax.swing.JPanel();
        txt3In = new javax.swing.JLabel();
        pnl3Tl = new javax.swing.JPanel();
        txt3Tl = new javax.swing.JLabel();
        pnl4C = new javax.swing.JPanel();
        txt4C = new javax.swing.JLabel();
        pnl4Si = new javax.swing.JPanel();
        txt4Si = new javax.swing.JLabel();
        pnl4Ge = new javax.swing.JPanel();
        txt4Ge = new javax.swing.JLabel();
        pnl4Sn = new javax.swing.JPanel();
        txt4Sn = new javax.swing.JLabel();
        pnl4Pb = new javax.swing.JPanel();
        txt4Pb = new javax.swing.JLabel();
        pnl5N = new javax.swing.JPanel();
        txt5N = new javax.swing.JLabel();
        pnl5P = new javax.swing.JPanel();
        txt5P = new javax.swing.JLabel();
        pnl5As = new javax.swing.JPanel();
        txt5As = new javax.swing.JLabel();
        pnl5Sb = new javax.swing.JPanel();
        txt5Sb = new javax.swing.JLabel();
        pnl5Bi = new javax.swing.JPanel();
        txt5Bi = new javax.swing.JLabel();
        pnl6O = new javax.swing.JPanel();
        txt6O = new javax.swing.JLabel();
        pnl6S = new javax.swing.JPanel();
        txt6S = new javax.swing.JLabel();
        pnl6Se = new javax.swing.JPanel();
        txt6Se = new javax.swing.JLabel();
        pnl6Te = new javax.swing.JPanel();
        txt6Te = new javax.swing.JLabel();
        pnl6Po = new javax.swing.JPanel();
        txt6Po = new javax.swing.JLabel();
        pnl7F = new javax.swing.JPanel();
        txt7F = new javax.swing.JLabel();
        pnl7Cl = new javax.swing.JPanel();
        txt7Cl = new javax.swing.JLabel();
        pnl7Br = new javax.swing.JPanel();
        txt7Br = new javax.swing.JLabel();
        pnl7I = new javax.swing.JPanel();
        txt7I = new javax.swing.JLabel();
        pnl7At = new javax.swing.JPanel();
        txt7At = new javax.swing.JLabel();
        pnl8He = new javax.swing.JPanel();
        txt8He = new javax.swing.JLabel();
        pnl8Ne = new javax.swing.JPanel();
        txt8Ne = new javax.swing.JLabel();
        pnl8Ar = new javax.swing.JPanel();
        txt8Ar = new javax.swing.JLabel();
        pnl8Kr = new javax.swing.JPanel();
        txt8Kr = new javax.swing.JLabel();
        pnl8Xe = new javax.swing.JPanel();
        txt8Xe = new javax.swing.JLabel();
        pnl8Rn = new javax.swing.JPanel();
        txt8Rn = new javax.swing.JLabel();
        pnlTransicion = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        btnIA = new javax.swing.JButton();
        btnIIA = new javax.swing.JButton();
        btnIIIA = new javax.swing.JButton();
        btnIVA = new javax.swing.JButton();
        btnVA = new javax.swing.JButton();
        btnVIA = new javax.swing.JButton();
        btnVIIA = new javax.swing.JButton();
        btnVIIIA = new javax.swing.JButton();
        pnlInformacion = new javax.swing.JPanel();
        txtSimbolo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlDescripcion = new javax.swing.JPanel();
        desSimbolo = new javax.swing.JLabel();
        desPeso = new javax.swing.JLabel();
        desNombre = new javax.swing.JLabel();
        desZ = new javax.swing.JLabel();
        pnlImagen = new javax.swing.JPanel();
        imageApp = new javax.swing.JLabel();
        panelNemo = new javax.swing.JPanel();
        mnemoIA = new javax.swing.JPanel();
        subpnl1Na = new javax.swing.JPanel();
        mnemo1Na = new javax.swing.JLabel();
        subpnl1Cs = new javax.swing.JPanel();
        mnemo1Cs = new javax.swing.JLabel();
        subpnl1Li = new javax.swing.JPanel();
        mnemo1Li = new javax.swing.JLabel();
        subpnl1H = new javax.swing.JPanel();
        mnemo1H = new javax.swing.JLabel();
        subpnl1Rb = new javax.swing.JPanel();
        mnemo1Rb = new javax.swing.JLabel();
        subpnl1Fr = new javax.swing.JPanel();
        mnemo1Fr = new javax.swing.JLabel();
        subpnl1K = new javax.swing.JPanel();
        mnemo1K = new javax.swing.JLabel();
        mnemoIIA = new javax.swing.JPanel();
        subpnl2Ba = new javax.swing.JPanel();
        mnemo2Ba = new javax.swing.JLabel();
        subpnl2Mg = new javax.swing.JPanel();
        mnemo2Mg = new javax.swing.JLabel();
        subpnl2Be = new javax.swing.JPanel();
        mnemo2Be = new javax.swing.JLabel();
        subpnl2Ca = new javax.swing.JPanel();
        mnemo2Ca = new javax.swing.JLabel();
        subpnl2Ra = new javax.swing.JPanel();
        mnemo2Ra = new javax.swing.JLabel();
        subpnl2Sr = new javax.swing.JPanel();
        mnemo2Sr = new javax.swing.JLabel();
        mnemoIIIA = new javax.swing.JPanel();
        subpnl3Tl = new javax.swing.JPanel();
        mnemo3Tl = new javax.swing.JLabel();
        subpnl3Al = new javax.swing.JPanel();
        mnemo3Al = new javax.swing.JLabel();
        subpnl3In = new javax.swing.JPanel();
        mnemo3In = new javax.swing.JLabel();
        subpnl3Ga = new javax.swing.JPanel();
        mnemo3Ga = new javax.swing.JLabel();
        subpnl3B = new javax.swing.JPanel();
        mnemo3B = new javax.swing.JLabel();
        mnemoIVA = new javax.swing.JPanel();
        subpnl4Sn = new javax.swing.JPanel();
        mnemo4Sn = new javax.swing.JLabel();
        subpnl4sI = new javax.swing.JPanel();
        mnemo4sI = new javax.swing.JLabel();
        subpnl4C = new javax.swing.JPanel();
        mnemo4C = new javax.swing.JLabel();
        subpnl4Ge = new javax.swing.JPanel();
        mnemo4Ge = new javax.swing.JLabel();
        subpnl4Pb = new javax.swing.JPanel();
        mnemo4Pb = new javax.swing.JLabel();
        mnemoVA = new javax.swing.JPanel();
        subpnl5Bi = new javax.swing.JPanel();
        mnemo5Bi = new javax.swing.JLabel();
        subpnl5As = new javax.swing.JPanel();
        mnemo5As = new javax.swing.JLabel();
        subpnl5P = new javax.swing.JPanel();
        mnemo5P = new javax.swing.JLabel();
        subpnl5N = new javax.swing.JPanel();
        mnemo5N = new javax.swing.JLabel();
        subpnl5Sb = new javax.swing.JPanel();
        mnemo5Sb = new javax.swing.JLabel();
        mnemoVIA = new javax.swing.JPanel();
        subpnl6Po = new javax.swing.JPanel();
        mnemo6Po = new javax.swing.JLabel();
        subpnl6O = new javax.swing.JPanel();
        mnemo6O = new javax.swing.JLabel();
        subpnl6Se = new javax.swing.JPanel();
        mnemo6Se = new javax.swing.JLabel();
        subpnl6Te = new javax.swing.JPanel();
        mnemo6Te = new javax.swing.JLabel();
        subpnl6S = new javax.swing.JPanel();
        mnemo6S = new javax.swing.JLabel();
        mnemoVIIA = new javax.swing.JPanel();
        subpnl7At = new javax.swing.JPanel();
        mnemo7At = new javax.swing.JLabel();
        subpnl7F = new javax.swing.JPanel();
        mnemo7F = new javax.swing.JLabel();
        subpnl7I = new javax.swing.JPanel();
        mnemo7I = new javax.swing.JLabel();
        subpnl7Cl = new javax.swing.JPanel();
        mnemo7Cl = new javax.swing.JLabel();
        subpnl7Br = new javax.swing.JPanel();
        mnemo7Br = new javax.swing.JLabel();
        mnemoVIIIA = new javax.swing.JPanel();
        subpnl8Kr = new javax.swing.JPanel();
        mnemo8Kr = new javax.swing.JLabel();
        subpnl8Rn = new javax.swing.JPanel();
        mnemo8Rn = new javax.swing.JLabel();
        subpnl8Xe = new javax.swing.JPanel();
        mnemo8Xe = new javax.swing.JLabel();
        subpnl8Ar = new javax.swing.JPanel();
        mnemo8Ar = new javax.swing.JLabel();
        subpnl8Ne = new javax.swing.JPanel();
        mnemo8Ne = new javax.swing.JLabel();
        subpnl8He = new javax.swing.JPanel();
        mnemo8He = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        iconQuimica = new javax.swing.JLabel();
        txtVersion = new javax.swing.JLabel();
        subpanelAprende = new javax.swing.JPanel();
        opcionAprender = new javax.swing.JLabel();
        txtVersion1 = new javax.swing.JLabel();
        txtVersion3 = new javax.swing.JLabel();
        subpanelPractica = new javax.swing.JPanel();
        opcionPractica = new javax.swing.JLabel();
        txtVersion2 = new javax.swing.JLabel();
        txtVersion4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PANEL.setBackground(new java.awt.Color(44, 62, 80));

        pnlPRINCIPAL.setBackground(new java.awt.Color(44, 62, 80));
        pnlPRINCIPAL.setMaximumSize(new java.awt.Dimension(1069, 943));
        pnlPRINCIPAL.setMinimumSize(new java.awt.Dimension(600, 943));
        pnlPRINCIPAL.setPreferredSize(new java.awt.Dimension(780, 520));
        pnlPRINCIPAL.setRequestFocusEnabled(false);
        pnlPRINCIPAL.setVerifyInputWhenFocusTarget(false);

        pnl1H.setBackground(new java.awt.Color(41, 128, 185));
        pnl1H.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl1H.setToolTipText("");
        pnl1H.setName(""); // NOI18N
        pnl1H.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl1H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1HMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl1HMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl1HMouseExited(evt);
            }
        });

        txtH.setBackground(new java.awt.Color(41, 128, 185));
        txtH.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txtH.setForeground(new java.awt.Color(255, 255, 255));
        txtH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtH.setText("H");

        javax.swing.GroupLayout pnl1HLayout = new javax.swing.GroupLayout(pnl1H);
        pnl1H.setLayout(pnl1HLayout);
        pnl1HLayout.setHorizontalGroup(
            pnl1HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl1HLayout.setVerticalGroup(
            pnl1HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtH, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlLi.setBackground(new java.awt.Color(41, 128, 185));
        pnlLi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlLi.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlLi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLiMouseExited(evt);
            }
        });

        txtLi.setBackground(new java.awt.Color(41, 128, 185));
        txtLi.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txtLi.setForeground(new java.awt.Color(255, 255, 255));
        txtLi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLi.setText("Li");

        javax.swing.GroupLayout pnlLiLayout = new javax.swing.GroupLayout(pnlLi);
        pnlLi.setLayout(pnlLiLayout);
        pnlLiLayout.setHorizontalGroup(
            pnlLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnlLiLayout.setVerticalGroup(
            pnlLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLi, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl1Na.setBackground(new java.awt.Color(41, 128, 185));
        pnl1Na.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl1Na.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl1Na.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1NaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl1NaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl1NaMouseExited(evt);
            }
        });

        txtNa.setBackground(new java.awt.Color(41, 128, 185));
        txtNa.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txtNa.setForeground(new java.awt.Color(255, 255, 255));
        txtNa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNa.setText("Na");

        javax.swing.GroupLayout pnl1NaLayout = new javax.swing.GroupLayout(pnl1Na);
        pnl1Na.setLayout(pnl1NaLayout);
        pnl1NaLayout.setHorizontalGroup(
            pnl1NaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl1NaLayout.setVerticalGroup(
            pnl1NaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1NaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl1K.setBackground(new java.awt.Color(41, 128, 185));
        pnl1K.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl1K.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl1K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1KMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl1KMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl1KMouseExited(evt);
            }
        });

        txt1K.setBackground(new java.awt.Color(41, 128, 185));
        txt1K.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt1K.setForeground(new java.awt.Color(255, 255, 255));
        txt1K.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1K.setText("K");

        javax.swing.GroupLayout pnl1KLayout = new javax.swing.GroupLayout(pnl1K);
        pnl1K.setLayout(pnl1KLayout);
        pnl1KLayout.setHorizontalGroup(
            pnl1KLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1K, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl1KLayout.setVerticalGroup(
            pnl1KLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1K, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl1Rb.setBackground(new java.awt.Color(41, 128, 185));
        pnl1Rb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl1Rb.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl1Rb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1RbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl1RbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl1RbMouseExited(evt);
            }
        });

        txt1Rb.setBackground(new java.awt.Color(41, 128, 185));
        txt1Rb.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt1Rb.setForeground(new java.awt.Color(255, 255, 255));
        txt1Rb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1Rb.setText("Rb");

        javax.swing.GroupLayout pnl1RbLayout = new javax.swing.GroupLayout(pnl1Rb);
        pnl1Rb.setLayout(pnl1RbLayout);
        pnl1RbLayout.setHorizontalGroup(
            pnl1RbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1Rb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl1RbLayout.setVerticalGroup(
            pnl1RbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1Rb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl1Cs.setBackground(new java.awt.Color(41, 128, 185));
        pnl1Cs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl1Cs.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl1Cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1CsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl1CsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl1CsMouseExited(evt);
            }
        });

        txt1Cs.setBackground(new java.awt.Color(41, 128, 185));
        txt1Cs.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt1Cs.setForeground(new java.awt.Color(255, 255, 255));
        txt1Cs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1Cs.setText("Cs");

        javax.swing.GroupLayout pnl1CsLayout = new javax.swing.GroupLayout(pnl1Cs);
        pnl1Cs.setLayout(pnl1CsLayout);
        pnl1CsLayout.setHorizontalGroup(
            pnl1CsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1Cs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl1CsLayout.setVerticalGroup(
            pnl1CsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1Cs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl1Fr.setBackground(new java.awt.Color(41, 128, 185));
        pnl1Fr.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl1Fr.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl1Fr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1FrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl1FrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl1FrMouseExited(evt);
            }
        });

        txt1Fr.setBackground(new java.awt.Color(41, 128, 185));
        txt1Fr.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt1Fr.setForeground(new java.awt.Color(255, 255, 255));
        txt1Fr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1Fr.setText("Fr");

        javax.swing.GroupLayout pnl1FrLayout = new javax.swing.GroupLayout(pnl1Fr);
        pnl1Fr.setLayout(pnl1FrLayout);
        pnl1FrLayout.setHorizontalGroup(
            pnl1FrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1Fr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl1FrLayout.setVerticalGroup(
            pnl1FrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt1Fr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl2Be.setBackground(new java.awt.Color(41, 128, 185));
        pnl2Be.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2Be.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl2Be.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2BeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl2BeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl2BeMouseExited(evt);
            }
        });

        txt2Be.setBackground(new java.awt.Color(129, 212, 250));
        txt2Be.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt2Be.setForeground(new java.awt.Color(255, 255, 255));
        txt2Be.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2Be.setText("Be");

        javax.swing.GroupLayout pnl2BeLayout = new javax.swing.GroupLayout(pnl2Be);
        pnl2Be.setLayout(pnl2BeLayout);
        pnl2BeLayout.setHorizontalGroup(
            pnl2BeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2BeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt2Be, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl2BeLayout.setVerticalGroup(
            pnl2BeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2BeLayout.createSequentialGroup()
                .addComponent(txt2Be, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl2Mg.setBackground(new java.awt.Color(41, 128, 185));
        pnl2Mg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2Mg.setForeground(new java.awt.Color(129, 212, 250));
        pnl2Mg.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl2Mg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2MgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl2MgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl2MgMouseExited(evt);
            }
        });

        txt2Mg.setBackground(new java.awt.Color(129, 212, 250));
        txt2Mg.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt2Mg.setForeground(new java.awt.Color(255, 255, 255));
        txt2Mg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2Mg.setText("Mg");
        pnl2Mg.add(txt2Mg);

        pnl2Ca.setBackground(new java.awt.Color(41, 128, 185));
        pnl2Ca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2Ca.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl2Ca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2CaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl2CaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl2CaMouseExited(evt);
            }
        });

        txt2Ca.setBackground(new java.awt.Color(129, 212, 250));
        txt2Ca.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt2Ca.setForeground(new java.awt.Color(255, 255, 255));
        txt2Ca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2Ca.setText("Ca");

        javax.swing.GroupLayout pnl2CaLayout = new javax.swing.GroupLayout(pnl2Ca);
        pnl2Ca.setLayout(pnl2CaLayout);
        pnl2CaLayout.setHorizontalGroup(
            pnl2CaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt2Ca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl2CaLayout.setVerticalGroup(
            pnl2CaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2CaLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(txt2Ca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl2Sr.setBackground(new java.awt.Color(41, 128, 185));
        pnl2Sr.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2Sr.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl2Sr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2SrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl2SrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl2SrMouseExited(evt);
            }
        });

        txt2Sr.setBackground(new java.awt.Color(41, 128, 185));
        txt2Sr.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt2Sr.setForeground(new java.awt.Color(255, 255, 255));
        txt2Sr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2Sr.setText("Sr");

        javax.swing.GroupLayout pnl2SrLayout = new javax.swing.GroupLayout(pnl2Sr);
        pnl2Sr.setLayout(pnl2SrLayout);
        pnl2SrLayout.setHorizontalGroup(
            pnl2SrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt2Sr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl2SrLayout.setVerticalGroup(
            pnl2SrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt2Sr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl2Ba.setBackground(new java.awt.Color(41, 128, 185));
        pnl2Ba.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2Ba.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl2Ba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2BaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl2BaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl2BaMouseExited(evt);
            }
        });

        txt2Ba.setBackground(new java.awt.Color(129, 212, 250));
        txt2Ba.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt2Ba.setForeground(new java.awt.Color(255, 255, 255));
        txt2Ba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2Ba.setText("Ba");

        javax.swing.GroupLayout pnl2BaLayout = new javax.swing.GroupLayout(pnl2Ba);
        pnl2Ba.setLayout(pnl2BaLayout);
        pnl2BaLayout.setHorizontalGroup(
            pnl2BaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt2Ba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl2BaLayout.setVerticalGroup(
            pnl2BaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt2Ba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl2Ra.setBackground(new java.awt.Color(41, 128, 185));
        pnl2Ra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl2Ra.setFocusCycleRoot(true);
        pnl2Ra.setFocusTraversalPolicyProvider(true);
        pnl2Ra.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl2Ra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2RaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl2RaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl2RaMouseExited(evt);
            }
        });

        txt2Ra.setBackground(new java.awt.Color(129, 212, 250));
        txt2Ra.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt2Ra.setForeground(new java.awt.Color(255, 255, 255));
        txt2Ra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2Ra.setText("Ra");
        txt2Ra.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout pnl2RaLayout = new javax.swing.GroupLayout(pnl2Ra);
        pnl2Ra.setLayout(pnl2RaLayout);
        pnl2RaLayout.setHorizontalGroup(
            pnl2RaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt2Ra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl2RaLayout.setVerticalGroup(
            pnl2RaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt2Ra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl3B.setBackground(new java.awt.Color(41, 128, 185));
        pnl3B.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl3B.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3BMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl3BMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl3BMouseExited(evt);
            }
        });

        txt3B.setBackground(new java.awt.Color(255, 255, 255));
        txt3B.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt3B.setForeground(new java.awt.Color(255, 255, 255));
        txt3B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3B.setText("B");

        javax.swing.GroupLayout pnl3BLayout = new javax.swing.GroupLayout(pnl3B);
        pnl3B.setLayout(pnl3BLayout);
        pnl3BLayout.setHorizontalGroup(
            pnl3BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3BLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3B, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl3BLayout.setVerticalGroup(
            pnl3BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3BLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3B, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl3Al.setBackground(new java.awt.Color(41, 128, 185));
        pnl3Al.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl3Al.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl3Al.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3AlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl3AlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl3AlMouseExited(evt);
            }
        });

        txt3Al.setBackground(new java.awt.Color(255, 255, 255));
        txt3Al.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt3Al.setForeground(new java.awt.Color(255, 255, 255));
        txt3Al.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3Al.setText("Al");

        javax.swing.GroupLayout pnl3AlLayout = new javax.swing.GroupLayout(pnl3Al);
        pnl3Al.setLayout(pnl3AlLayout);
        pnl3AlLayout.setHorizontalGroup(
            pnl3AlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3AlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3Al, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl3AlLayout.setVerticalGroup(
            pnl3AlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3AlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3Al, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl3Ga.setBackground(new java.awt.Color(41, 128, 185));
        pnl3Ga.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl3Ga.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl3Ga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3GaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl3GaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl3GaMouseExited(evt);
            }
        });

        txt3Ga.setBackground(new java.awt.Color(255, 255, 255));
        txt3Ga.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt3Ga.setForeground(new java.awt.Color(255, 255, 255));
        txt3Ga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3Ga.setText("Ga");

        javax.swing.GroupLayout pnl3GaLayout = new javax.swing.GroupLayout(pnl3Ga);
        pnl3Ga.setLayout(pnl3GaLayout);
        pnl3GaLayout.setHorizontalGroup(
            pnl3GaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3GaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3Ga, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl3GaLayout.setVerticalGroup(
            pnl3GaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3GaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3Ga, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl3In.setBackground(new java.awt.Color(41, 128, 185));
        pnl3In.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl3In.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl3In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3InMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl3InMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl3InMouseExited(evt);
            }
        });

        txt3In.setBackground(new java.awt.Color(255, 255, 255));
        txt3In.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt3In.setForeground(new java.awt.Color(255, 255, 255));
        txt3In.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3In.setText("In");

        javax.swing.GroupLayout pnl3InLayout = new javax.swing.GroupLayout(pnl3In);
        pnl3In.setLayout(pnl3InLayout);
        pnl3InLayout.setHorizontalGroup(
            pnl3InLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3InLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3In, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl3InLayout.setVerticalGroup(
            pnl3InLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3InLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3In, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl3Tl.setBackground(new java.awt.Color(41, 128, 185));
        pnl3Tl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl3Tl.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl3Tl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3TlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl3TlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl3TlMouseExited(evt);
            }
        });

        txt3Tl.setBackground(new java.awt.Color(255, 255, 255));
        txt3Tl.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt3Tl.setForeground(new java.awt.Color(255, 255, 255));
        txt3Tl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3Tl.setText("Tl");

        javax.swing.GroupLayout pnl3TlLayout = new javax.swing.GroupLayout(pnl3Tl);
        pnl3Tl.setLayout(pnl3TlLayout);
        pnl3TlLayout.setHorizontalGroup(
            pnl3TlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3TlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3Tl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl3TlLayout.setVerticalGroup(
            pnl3TlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3TlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt3Tl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl4C.setBackground(new java.awt.Color(41, 128, 185));
        pnl4C.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl4C.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl4C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl4CMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl4CMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl4CMouseExited(evt);
            }
        });

        txt4C.setBackground(new java.awt.Color(129, 212, 250));
        txt4C.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt4C.setForeground(new java.awt.Color(255, 255, 255));
        txt4C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4C.setText("C");

        javax.swing.GroupLayout pnl4CLayout = new javax.swing.GroupLayout(pnl4C);
        pnl4C.setLayout(pnl4CLayout);
        pnl4CLayout.setHorizontalGroup(
            pnl4CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4C, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl4CLayout.setVerticalGroup(
            pnl4CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4C, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl4Si.setBackground(new java.awt.Color(41, 128, 185));
        pnl4Si.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl4Si.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl4Si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl4SiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl4SiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl4SiMouseExited(evt);
            }
        });

        txt4Si.setBackground(new java.awt.Color(129, 212, 250));
        txt4Si.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt4Si.setForeground(new java.awt.Color(255, 255, 255));
        txt4Si.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4Si.setText("Si");

        javax.swing.GroupLayout pnl4SiLayout = new javax.swing.GroupLayout(pnl4Si);
        pnl4Si.setLayout(pnl4SiLayout);
        pnl4SiLayout.setHorizontalGroup(
            pnl4SiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4Si, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl4SiLayout.setVerticalGroup(
            pnl4SiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4Si, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl4Ge.setBackground(new java.awt.Color(41, 128, 185));
        pnl4Ge.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl4Ge.setForeground(new java.awt.Color(255, 255, 255));
        pnl4Ge.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl4Ge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl4GeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl4GeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl4GeMouseExited(evt);
            }
        });

        txt4Ge.setBackground(new java.awt.Color(129, 212, 250));
        txt4Ge.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt4Ge.setForeground(new java.awt.Color(255, 255, 255));
        txt4Ge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4Ge.setText("Ge");

        javax.swing.GroupLayout pnl4GeLayout = new javax.swing.GroupLayout(pnl4Ge);
        pnl4Ge.setLayout(pnl4GeLayout);
        pnl4GeLayout.setHorizontalGroup(
            pnl4GeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4Ge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl4GeLayout.setVerticalGroup(
            pnl4GeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4Ge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl4Sn.setBackground(new java.awt.Color(41, 128, 185));
        pnl4Sn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl4Sn.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl4Sn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl4SnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl4SnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl4SnMouseExited(evt);
            }
        });

        txt4Sn.setBackground(new java.awt.Color(129, 212, 250));
        txt4Sn.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt4Sn.setForeground(new java.awt.Color(255, 255, 255));
        txt4Sn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4Sn.setText("Sn");

        javax.swing.GroupLayout pnl4SnLayout = new javax.swing.GroupLayout(pnl4Sn);
        pnl4Sn.setLayout(pnl4SnLayout);
        pnl4SnLayout.setHorizontalGroup(
            pnl4SnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4Sn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl4SnLayout.setVerticalGroup(
            pnl4SnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4Sn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl4Pb.setBackground(new java.awt.Color(41, 128, 185));
        pnl4Pb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl4Pb.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl4Pb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl4PbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl4PbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl4PbMouseExited(evt);
            }
        });

        txt4Pb.setBackground(new java.awt.Color(129, 212, 250));
        txt4Pb.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt4Pb.setForeground(new java.awt.Color(255, 255, 255));
        txt4Pb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4Pb.setText("Pb");

        javax.swing.GroupLayout pnl4PbLayout = new javax.swing.GroupLayout(pnl4Pb);
        pnl4Pb.setLayout(pnl4PbLayout);
        pnl4PbLayout.setHorizontalGroup(
            pnl4PbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4Pb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl4PbLayout.setVerticalGroup(
            pnl4PbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt4Pb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl5N.setBackground(new java.awt.Color(41, 128, 185));
        pnl5N.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl5N.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl5N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl5NMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl5NMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl5NMouseExited(evt);
            }
        });

        txt5N.setBackground(new java.awt.Color(129, 212, 250));
        txt5N.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt5N.setForeground(new java.awt.Color(255, 255, 255));
        txt5N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5N.setText("N");

        javax.swing.GroupLayout pnl5NLayout = new javax.swing.GroupLayout(pnl5N);
        pnl5N.setLayout(pnl5NLayout);
        pnl5NLayout.setHorizontalGroup(
            pnl5NLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl5NLayout.setVerticalGroup(
            pnl5NLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl5P.setBackground(new java.awt.Color(41, 128, 185));
        pnl5P.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl5P.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl5P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl5PMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl5PMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl5PMouseExited(evt);
            }
        });

        txt5P.setBackground(new java.awt.Color(129, 212, 250));
        txt5P.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt5P.setForeground(new java.awt.Color(255, 255, 255));
        txt5P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5P.setText("P");

        javax.swing.GroupLayout pnl5PLayout = new javax.swing.GroupLayout(pnl5P);
        pnl5P.setLayout(pnl5PLayout);
        pnl5PLayout.setHorizontalGroup(
            pnl5PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl5PLayout.setVerticalGroup(
            pnl5PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl5As.setBackground(new java.awt.Color(41, 128, 185));
        pnl5As.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl5As.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl5As.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl5AsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl5AsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl5AsMouseExited(evt);
            }
        });

        txt5As.setBackground(new java.awt.Color(129, 212, 250));
        txt5As.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt5As.setForeground(new java.awt.Color(255, 255, 255));
        txt5As.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5As.setText("As");

        javax.swing.GroupLayout pnl5AsLayout = new javax.swing.GroupLayout(pnl5As);
        pnl5As.setLayout(pnl5AsLayout);
        pnl5AsLayout.setHorizontalGroup(
            pnl5AsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5As, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl5AsLayout.setVerticalGroup(
            pnl5AsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5As, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl5Sb.setBackground(new java.awt.Color(41, 128, 185));
        pnl5Sb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl5Sb.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl5Sb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl5SbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl5SbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl5SbMouseExited(evt);
            }
        });

        txt5Sb.setBackground(new java.awt.Color(129, 212, 250));
        txt5Sb.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt5Sb.setForeground(new java.awt.Color(255, 255, 255));
        txt5Sb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5Sb.setText("Sb");

        javax.swing.GroupLayout pnl5SbLayout = new javax.swing.GroupLayout(pnl5Sb);
        pnl5Sb.setLayout(pnl5SbLayout);
        pnl5SbLayout.setHorizontalGroup(
            pnl5SbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5Sb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl5SbLayout.setVerticalGroup(
            pnl5SbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5Sb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl5Bi.setBackground(new java.awt.Color(41, 128, 185));
        pnl5Bi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl5Bi.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl5Bi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl5BiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl5BiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl5BiMouseExited(evt);
            }
        });

        txt5Bi.setBackground(new java.awt.Color(129, 212, 250));
        txt5Bi.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt5Bi.setForeground(new java.awt.Color(255, 255, 255));
        txt5Bi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5Bi.setText("Bi");

        javax.swing.GroupLayout pnl5BiLayout = new javax.swing.GroupLayout(pnl5Bi);
        pnl5Bi.setLayout(pnl5BiLayout);
        pnl5BiLayout.setHorizontalGroup(
            pnl5BiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5Bi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl5BiLayout.setVerticalGroup(
            pnl5BiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt5Bi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl6O.setBackground(new java.awt.Color(41, 128, 185));
        pnl6O.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl6O.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl6O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl6OMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl6OMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl6OMouseExited(evt);
            }
        });

        txt6O.setBackground(new java.awt.Color(41, 128, 185));
        txt6O.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt6O.setForeground(new java.awt.Color(255, 255, 255));
        txt6O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6O.setText("O");

        javax.swing.GroupLayout pnl6OLayout = new javax.swing.GroupLayout(pnl6O);
        pnl6O.setLayout(pnl6OLayout);
        pnl6OLayout.setHorizontalGroup(
            pnl6OLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6O, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl6OLayout.setVerticalGroup(
            pnl6OLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6O, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl6S.setBackground(new java.awt.Color(41, 128, 185));
        pnl6S.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl6S.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl6S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl6SMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl6SMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl6SMouseExited(evt);
            }
        });

        txt6S.setBackground(new java.awt.Color(129, 212, 250));
        txt6S.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt6S.setForeground(new java.awt.Color(255, 255, 255));
        txt6S.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6S.setText("S");

        javax.swing.GroupLayout pnl6SLayout = new javax.swing.GroupLayout(pnl6S);
        pnl6S.setLayout(pnl6SLayout);
        pnl6SLayout.setHorizontalGroup(
            pnl6SLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6S, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl6SLayout.setVerticalGroup(
            pnl6SLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6S, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl6Se.setBackground(new java.awt.Color(41, 128, 185));
        pnl6Se.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl6Se.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl6Se.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl6SeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl6SeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl6SeMouseExited(evt);
            }
        });

        txt6Se.setBackground(new java.awt.Color(129, 212, 250));
        txt6Se.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt6Se.setForeground(new java.awt.Color(255, 255, 255));
        txt6Se.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6Se.setText("Se");

        javax.swing.GroupLayout pnl6SeLayout = new javax.swing.GroupLayout(pnl6Se);
        pnl6Se.setLayout(pnl6SeLayout);
        pnl6SeLayout.setHorizontalGroup(
            pnl6SeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6Se, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl6SeLayout.setVerticalGroup(
            pnl6SeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6Se, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl6Te.setBackground(new java.awt.Color(41, 128, 185));
        pnl6Te.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl6Te.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl6Te.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl6TeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl6TeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl6TeMouseExited(evt);
            }
        });

        txt6Te.setBackground(new java.awt.Color(129, 212, 250));
        txt6Te.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt6Te.setForeground(new java.awt.Color(255, 255, 255));
        txt6Te.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6Te.setText("Te");

        javax.swing.GroupLayout pnl6TeLayout = new javax.swing.GroupLayout(pnl6Te);
        pnl6Te.setLayout(pnl6TeLayout);
        pnl6TeLayout.setHorizontalGroup(
            pnl6TeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6Te, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl6TeLayout.setVerticalGroup(
            pnl6TeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6Te, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl6Po.setBackground(new java.awt.Color(41, 128, 185));
        pnl6Po.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl6Po.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl6Po.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl6PoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl6PoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl6PoMouseExited(evt);
            }
        });

        txt6Po.setBackground(new java.awt.Color(129, 212, 250));
        txt6Po.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt6Po.setForeground(new java.awt.Color(255, 255, 255));
        txt6Po.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6Po.setText("Po");

        javax.swing.GroupLayout pnl6PoLayout = new javax.swing.GroupLayout(pnl6Po);
        pnl6Po.setLayout(pnl6PoLayout);
        pnl6PoLayout.setHorizontalGroup(
            pnl6PoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6Po, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl6PoLayout.setVerticalGroup(
            pnl6PoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt6Po, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl7F.setBackground(new java.awt.Color(41, 128, 185));
        pnl7F.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl7F.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl7F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl7FMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl7FMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl7FMouseExited(evt);
            }
        });

        txt7F.setBackground(new java.awt.Color(41, 128, 185));
        txt7F.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt7F.setForeground(new java.awt.Color(255, 255, 255));
        txt7F.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt7F.setText("F");

        javax.swing.GroupLayout pnl7FLayout = new javax.swing.GroupLayout(pnl7F);
        pnl7F.setLayout(pnl7FLayout);
        pnl7FLayout.setHorizontalGroup(
            pnl7FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl7FLayout.setVerticalGroup(
            pnl7FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl7Cl.setBackground(new java.awt.Color(41, 128, 185));
        pnl7Cl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl7Cl.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl7Cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl7ClMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl7ClMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl7ClMouseExited(evt);
            }
        });

        txt7Cl.setBackground(new java.awt.Color(129, 212, 250));
        txt7Cl.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt7Cl.setForeground(new java.awt.Color(255, 255, 255));
        txt7Cl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt7Cl.setText("Cl");

        javax.swing.GroupLayout pnl7ClLayout = new javax.swing.GroupLayout(pnl7Cl);
        pnl7Cl.setLayout(pnl7ClLayout);
        pnl7ClLayout.setHorizontalGroup(
            pnl7ClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7Cl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl7ClLayout.setVerticalGroup(
            pnl7ClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7Cl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl7Br.setBackground(new java.awt.Color(41, 128, 185));
        pnl7Br.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl7Br.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl7Br.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl7BrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl7BrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl7BrMouseExited(evt);
            }
        });

        txt7Br.setBackground(new java.awt.Color(129, 212, 250));
        txt7Br.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt7Br.setForeground(new java.awt.Color(255, 255, 255));
        txt7Br.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt7Br.setText("Br");

        javax.swing.GroupLayout pnl7BrLayout = new javax.swing.GroupLayout(pnl7Br);
        pnl7Br.setLayout(pnl7BrLayout);
        pnl7BrLayout.setHorizontalGroup(
            pnl7BrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7Br, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl7BrLayout.setVerticalGroup(
            pnl7BrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7Br, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl7I.setBackground(new java.awt.Color(41, 128, 185));
        pnl7I.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl7I.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl7I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl7IMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl7IMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl7IMouseExited(evt);
            }
        });

        txt7I.setBackground(new java.awt.Color(129, 212, 250));
        txt7I.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt7I.setForeground(new java.awt.Color(255, 255, 255));
        txt7I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt7I.setText("I");

        javax.swing.GroupLayout pnl7ILayout = new javax.swing.GroupLayout(pnl7I);
        pnl7I.setLayout(pnl7ILayout);
        pnl7ILayout.setHorizontalGroup(
            pnl7ILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7I, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl7ILayout.setVerticalGroup(
            pnl7ILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7I, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl7At.setBackground(new java.awt.Color(41, 128, 185));
        pnl7At.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl7At.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl7At.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl7AtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl7AtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl7AtMouseExited(evt);
            }
        });

        txt7At.setBackground(new java.awt.Color(129, 212, 250));
        txt7At.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt7At.setForeground(new java.awt.Color(255, 255, 255));
        txt7At.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt7At.setText("At");

        javax.swing.GroupLayout pnl7AtLayout = new javax.swing.GroupLayout(pnl7At);
        pnl7At.setLayout(pnl7AtLayout);
        pnl7AtLayout.setHorizontalGroup(
            pnl7AtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7At, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl7AtLayout.setVerticalGroup(
            pnl7AtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt7At, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl8He.setBackground(new java.awt.Color(41, 128, 185));
        pnl8He.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl8He.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl8He.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl8HeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl8HeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl8HeMouseExited(evt);
            }
        });

        txt8He.setBackground(new java.awt.Color(129, 212, 250));
        txt8He.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt8He.setForeground(new java.awt.Color(255, 255, 255));
        txt8He.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt8He.setText("He");

        javax.swing.GroupLayout pnl8HeLayout = new javax.swing.GroupLayout(pnl8He);
        pnl8He.setLayout(pnl8HeLayout);
        pnl8HeLayout.setHorizontalGroup(
            pnl8HeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl8HeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt8He, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl8HeLayout.setVerticalGroup(
            pnl8HeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8He, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl8Ne.setBackground(new java.awt.Color(41, 128, 185));
        pnl8Ne.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl8Ne.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl8Ne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl8NeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl8NeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl8NeMouseExited(evt);
            }
        });

        txt8Ne.setBackground(new java.awt.Color(129, 212, 250));
        txt8Ne.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt8Ne.setForeground(new java.awt.Color(255, 255, 255));
        txt8Ne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt8Ne.setText("Ne");

        javax.swing.GroupLayout pnl8NeLayout = new javax.swing.GroupLayout(pnl8Ne);
        pnl8Ne.setLayout(pnl8NeLayout);
        pnl8NeLayout.setHorizontalGroup(
            pnl8NeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Ne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl8NeLayout.setVerticalGroup(
            pnl8NeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Ne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl8Ar.setBackground(new java.awt.Color(41, 128, 185));
        pnl8Ar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl8Ar.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl8Ar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl8ArMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl8ArMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl8ArMouseExited(evt);
            }
        });

        txt8Ar.setBackground(new java.awt.Color(129, 212, 250));
        txt8Ar.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt8Ar.setForeground(new java.awt.Color(255, 255, 255));
        txt8Ar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt8Ar.setText("Ar");

        javax.swing.GroupLayout pnl8ArLayout = new javax.swing.GroupLayout(pnl8Ar);
        pnl8Ar.setLayout(pnl8ArLayout);
        pnl8ArLayout.setHorizontalGroup(
            pnl8ArLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Ar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl8ArLayout.setVerticalGroup(
            pnl8ArLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Ar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl8Kr.setBackground(new java.awt.Color(41, 128, 185));
        pnl8Kr.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl8Kr.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl8Kr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl8KrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl8KrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl8KrMouseExited(evt);
            }
        });

        txt8Kr.setBackground(new java.awt.Color(129, 212, 250));
        txt8Kr.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt8Kr.setForeground(new java.awt.Color(255, 255, 255));
        txt8Kr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt8Kr.setText("Kr");

        javax.swing.GroupLayout pnl8KrLayout = new javax.swing.GroupLayout(pnl8Kr);
        pnl8Kr.setLayout(pnl8KrLayout);
        pnl8KrLayout.setHorizontalGroup(
            pnl8KrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Kr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl8KrLayout.setVerticalGroup(
            pnl8KrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Kr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl8Xe.setBackground(new java.awt.Color(41, 128, 185));
        pnl8Xe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl8Xe.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl8Xe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl8XeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl8XeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl8XeMouseExited(evt);
            }
        });

        txt8Xe.setBackground(new java.awt.Color(129, 212, 250));
        txt8Xe.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt8Xe.setForeground(new java.awt.Color(255, 255, 255));
        txt8Xe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt8Xe.setText("Xe");

        javax.swing.GroupLayout pnl8XeLayout = new javax.swing.GroupLayout(pnl8Xe);
        pnl8Xe.setLayout(pnl8XeLayout);
        pnl8XeLayout.setHorizontalGroup(
            pnl8XeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Xe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl8XeLayout.setVerticalGroup(
            pnl8XeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Xe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnl8Rn.setBackground(new java.awt.Color(41, 128, 185));
        pnl8Rn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl8Rn.setPreferredSize(new java.awt.Dimension(50, 50));
        pnl8Rn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl8RnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl8RnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl8RnMouseExited(evt);
            }
        });

        txt8Rn.setBackground(new java.awt.Color(129, 212, 250));
        txt8Rn.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt8Rn.setForeground(new java.awt.Color(255, 255, 255));
        txt8Rn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt8Rn.setText("Rn");

        javax.swing.GroupLayout pnl8RnLayout = new javax.swing.GroupLayout(pnl8Rn);
        pnl8Rn.setLayout(pnl8RnLayout);
        pnl8RnLayout.setHorizontalGroup(
            pnl8RnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Rn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        pnl8RnLayout.setVerticalGroup(
            pnl8RnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt8Rn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlTransicion.setBackground(new java.awt.Color(173, 20, 87));
        pnlTransicion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlTransicion.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlTransicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTransicionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTransicionLayout = new javax.swing.GroupLayout(pnlTransicion);
        pnlTransicion.setLayout(pnlTransicionLayout);
        pnlTransicionLayout.setHorizontalGroup(
            pnlTransicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        pnlTransicionLayout.setVerticalGroup(
            pnlTransicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        txtTitulo.setFont(new java.awt.Font("Dialog", 1, 55)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("TABLA PERIODICA");

        btnIA.setBackground(new java.awt.Color(173, 20, 87));
        btnIA.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnIA.setForeground(new java.awt.Color(255, 255, 255));
        btnIA.setText("IA");
        btnIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIAActionPerformed(evt);
            }
        });

        btnIIA.setBackground(new java.awt.Color(173, 20, 87));
        btnIIA.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnIIA.setForeground(new java.awt.Color(255, 255, 255));
        btnIIA.setText("IIA");
        btnIIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIIAActionPerformed(evt);
            }
        });

        btnIIIA.setBackground(new java.awt.Color(173, 20, 87));
        btnIIIA.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnIIIA.setForeground(new java.awt.Color(255, 255, 255));
        btnIIIA.setText("IIIA");
        btnIIIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIIIAActionPerformed(evt);
            }
        });

        btnIVA.setBackground(new java.awt.Color(173, 20, 87));
        btnIVA.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnIVA.setForeground(new java.awt.Color(255, 255, 255));
        btnIVA.setText("IVA");
        btnIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIVAActionPerformed(evt);
            }
        });

        btnVA.setBackground(new java.awt.Color(173, 20, 87));
        btnVA.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnVA.setForeground(new java.awt.Color(255, 255, 255));
        btnVA.setText("VA");
        btnVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVAActionPerformed(evt);
            }
        });

        btnVIA.setBackground(new java.awt.Color(173, 20, 87));
        btnVIA.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnVIA.setForeground(new java.awt.Color(255, 255, 255));
        btnVIA.setText("VIA");
        btnVIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVIAActionPerformed(evt);
            }
        });

        btnVIIA.setBackground(new java.awt.Color(173, 20, 87));
        btnVIIA.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnVIIA.setForeground(new java.awt.Color(255, 255, 255));
        btnVIIA.setText("VIIA");
        btnVIIA.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnVIIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVIIAActionPerformed(evt);
            }
        });

        btnVIIIA.setBackground(new java.awt.Color(173, 20, 87));
        btnVIIIA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVIIIA.setForeground(new java.awt.Color(255, 255, 255));
        btnVIIIA.setText("VIIIA");
        btnVIIIA.setFocusable(false);
        btnVIIIA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVIIIA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVIIIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVIIIAActionPerformed(evt);
            }
        });

        pnlInformacion.setBackground(new java.awt.Color(204, 204, 204));
        pnlInformacion.setLayout(null);

        txtSimbolo.setBackground(new java.awt.Color(255, 255, 255));
        txtSimbolo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtSimbolo.setText("Na");
        pnlInformacion.add(txtSimbolo);
        txtSimbolo.setBounds(44, 59, 63, 34);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("11");
        pnlInformacion.add(jLabel1);
        jLabel1.setBounds(10, 14, 26, 29);

        pnlDescripcion.setBackground(new java.awt.Color(44, 62, 80));
        pnlDescripcion.setPreferredSize(new java.awt.Dimension(150, 150));

        desSimbolo.setBackground(new java.awt.Color(44, 62, 80));
        desSimbolo.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        desSimbolo.setForeground(new java.awt.Color(44, 62, 80));
        desSimbolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        desPeso.setBackground(new java.awt.Color(44, 62, 80));
        desPeso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        desPeso.setForeground(new java.awt.Color(44, 62, 80));
        desPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        desNombre.setBackground(new java.awt.Color(44, 62, 80));
        desNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        desNombre.setForeground(new java.awt.Color(44, 62, 80));
        desNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        desZ.setBackground(new java.awt.Color(44, 62, 80));
        desZ.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        desZ.setForeground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout pnlDescripcionLayout = new javax.swing.GroupLayout(pnlDescripcion);
        pnlDescripcion.setLayout(pnlDescripcionLayout);
        pnlDescripcionLayout.setHorizontalGroup(
            pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlDescripcionLayout.createSequentialGroup()
                .addGroup(pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDescripcionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(desZ))
                    .addGroup(pnlDescripcionLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(desSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnlDescripcionLayout.setVerticalGroup(
            pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desZ, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(desSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desPeso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlImagen.setBackground(new java.awt.Color(44, 62, 80));
        pnlImagen.setPreferredSize(new java.awt.Dimension(150, 150));

        imageApp.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout pnlImagenLayout = new javax.swing.GroupLayout(pnlImagen);
        pnlImagen.setLayout(pnlImagenLayout);
        pnlImagenLayout.setHorizontalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageApp, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        pnlImagenLayout.setVerticalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImagenLayout.createSequentialGroup()
                .addComponent(imageApp, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPRINCIPALLayout = new javax.swing.GroupLayout(pnlPRINCIPAL);
        pnlPRINCIPAL.setLayout(pnlPRINCIPALLayout);
        pnlPRINCIPALLayout.setHorizontalGroup(
            pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(btnIA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnVIIIA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl1K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl1Rb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl1Cs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl1Fr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl2Sr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl2Ba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl2Ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnl2Ca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(pnlTransicion, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl3Ga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl3In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl3Tl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl4Ge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl4Sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl4Pb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl5As, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl5Sb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl5Bi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl6Se, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl6Te, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl6Po, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl7Br, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl7I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl7At, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl8Kr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl8Xe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl8Rn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addComponent(pnl1Na, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnl2Mg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addComponent(pnl1H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnIIA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addComponent(pnlLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl2Be, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(pnlInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(pnlDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(pnlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(pnl3Al, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl4Si, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl5P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl6S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl7Cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl8Ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnIIIA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnVA)
                                .addGap(4, 4, 4)
                                .addComponent(btnVIA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnVIIA, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnl8He, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(pnl3B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl4C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl5N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl6O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl7F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pnl8Ne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlPRINCIPALLayout.setVerticalGroup(
            pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVIIIA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVIIA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnIIA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnIIIA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnVA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnVIA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl8He, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl1H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl3B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl4C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl5N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl6O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl7F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl8Ne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl3Al, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl4Si, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl5P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl6S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl7Cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl8Ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl2Be, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl2Mg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnl1Na, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(pnlDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(pnlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(pnl1K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl1Rb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl1Cs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl1Fr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(pnl2Ca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl2Sr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl2Ba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl2Ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlTransicion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(pnl3Ga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl3In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl3Tl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(pnl4Ge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl4Sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl4Pb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(pnl5As, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl5Sb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl5Bi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(pnl6Se, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl6Te, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl6Po, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(pnl7Br, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl7I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl7At, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPRINCIPALLayout.createSequentialGroup()
                        .addComponent(pnl8Kr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl8Xe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnl8Rn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(573, 573, 573))
        );

        pnl1H.getAccessibleContext().setAccessibleName("");

        panelNemo.setBackground(new java.awt.Color(44, 62, 80));

        mnemoIA.setBackground(new java.awt.Color(243, 156, 18));
        mnemoIA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnemoIA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpnl1Na.setBackground(new java.awt.Color(243, 156, 18));
        subpnl1Na.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl1Na.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl1NaMouseClicked(evt);
            }
        });

        mnemo1Na.setBackground(new java.awt.Color(255, 255, 255));
        mnemo1Na.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo1Na.setForeground(new java.awt.Color(255, 255, 255));
        mnemo1Na.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo1Na.setText("Na");
        mnemo1Na.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo1Na.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo1Na.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl1NaLayout = new javax.swing.GroupLayout(subpnl1Na);
        subpnl1Na.setLayout(subpnl1NaLayout);
        subpnl1NaLayout.setHorizontalGroup(
            subpnl1NaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Na, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl1NaLayout.setVerticalGroup(
            subpnl1NaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Na, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIA.add(subpnl1Na, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        subpnl1Cs.setBackground(new java.awt.Color(243, 156, 18));
        subpnl1Cs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl1Cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl1CsMouseClicked(evt);
            }
        });

        mnemo1Cs.setBackground(new java.awt.Color(255, 255, 255));
        mnemo1Cs.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo1Cs.setForeground(new java.awt.Color(255, 255, 255));
        mnemo1Cs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo1Cs.setText("Cs");
        mnemo1Cs.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo1Cs.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo1Cs.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl1CsLayout = new javax.swing.GroupLayout(subpnl1Cs);
        subpnl1Cs.setLayout(subpnl1CsLayout);
        subpnl1CsLayout.setHorizontalGroup(
            subpnl1CsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Cs, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl1CsLayout.setVerticalGroup(
            subpnl1CsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Cs, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIA.add(subpnl1Cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 70, 70));

        subpnl1Li.setBackground(new java.awt.Color(243, 156, 18));
        subpnl1Li.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl1Li.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl1LiMouseClicked(evt);
            }
        });

        mnemo1Li.setBackground(new java.awt.Color(255, 255, 255));
        mnemo1Li.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo1Li.setForeground(new java.awt.Color(255, 255, 255));
        mnemo1Li.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo1Li.setText("Li");
        mnemo1Li.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo1Li.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo1Li.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl1LiLayout = new javax.swing.GroupLayout(subpnl1Li);
        subpnl1Li.setLayout(subpnl1LiLayout);
        subpnl1LiLayout.setHorizontalGroup(
            subpnl1LiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Li, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl1LiLayout.setVerticalGroup(
            subpnl1LiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Li, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIA.add(subpnl1Li, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        subpnl1H.setBackground(new java.awt.Color(243, 156, 18));
        subpnl1H.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl1H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl1HMouseClicked(evt);
            }
        });

        mnemo1H.setBackground(new java.awt.Color(255, 255, 255));
        mnemo1H.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo1H.setForeground(new java.awt.Color(255, 255, 255));
        mnemo1H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo1H.setText("H");
        mnemo1H.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo1H.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo1H.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl1HLayout = new javax.swing.GroupLayout(subpnl1H);
        subpnl1H.setLayout(subpnl1HLayout);
        subpnl1HLayout.setHorizontalGroup(
            subpnl1HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1H, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl1HLayout.setVerticalGroup(
            subpnl1HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1H, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIA.add(subpnl1H, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        subpnl1Rb.setBackground(new java.awt.Color(243, 156, 18));
        subpnl1Rb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl1Rb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl1RbMouseClicked(evt);
            }
        });

        mnemo1Rb.setBackground(new java.awt.Color(255, 255, 255));
        mnemo1Rb.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo1Rb.setForeground(new java.awt.Color(255, 255, 255));
        mnemo1Rb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo1Rb.setText("Rb");
        mnemo1Rb.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo1Rb.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo1Rb.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl1RbLayout = new javax.swing.GroupLayout(subpnl1Rb);
        subpnl1Rb.setLayout(subpnl1RbLayout);
        subpnl1RbLayout.setHorizontalGroup(
            subpnl1RbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Rb, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl1RbLayout.setVerticalGroup(
            subpnl1RbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Rb, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIA.add(subpnl1Rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        subpnl1Fr.setBackground(new java.awt.Color(243, 156, 18));
        subpnl1Fr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl1Fr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl1FrMouseClicked(evt);
            }
        });

        mnemo1Fr.setBackground(new java.awt.Color(255, 255, 255));
        mnemo1Fr.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo1Fr.setForeground(new java.awt.Color(255, 255, 255));
        mnemo1Fr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo1Fr.setText("Fr");
        mnemo1Fr.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo1Fr.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo1Fr.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl1FrLayout = new javax.swing.GroupLayout(subpnl1Fr);
        subpnl1Fr.setLayout(subpnl1FrLayout);
        subpnl1FrLayout.setHorizontalGroup(
            subpnl1FrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Fr, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl1FrLayout.setVerticalGroup(
            subpnl1FrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1Fr, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIA.add(subpnl1Fr, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 70, 70));

        subpnl1K.setBackground(new java.awt.Color(243, 156, 18));
        subpnl1K.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl1K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl1KMouseClicked(evt);
            }
        });

        mnemo1K.setBackground(new java.awt.Color(255, 255, 255));
        mnemo1K.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo1K.setForeground(new java.awt.Color(255, 255, 255));
        mnemo1K.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo1K.setText("K");
        mnemo1K.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo1K.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo1K.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl1KLayout = new javax.swing.GroupLayout(subpnl1K);
        subpnl1K.setLayout(subpnl1KLayout);
        subpnl1KLayout.setHorizontalGroup(
            subpnl1KLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1K, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl1KLayout.setVerticalGroup(
            subpnl1KLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo1K, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIA.add(subpnl1K, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        mnemoIIA.setBackground(new java.awt.Color(243, 156, 18));
        mnemoIIA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnemoIIA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpnl2Ba.setBackground(new java.awt.Color(243, 156, 18));
        subpnl2Ba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl2Ba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl2BaMouseClicked(evt);
            }
        });

        mnemo2Ba.setBackground(new java.awt.Color(255, 255, 255));
        mnemo2Ba.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo2Ba.setForeground(new java.awt.Color(255, 255, 255));
        mnemo2Ba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo2Ba.setText("Ba");
        mnemo2Ba.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo2Ba.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo2Ba.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl2BaLayout = new javax.swing.GroupLayout(subpnl2Ba);
        subpnl2Ba.setLayout(subpnl2BaLayout);
        subpnl2BaLayout.setHorizontalGroup(
            subpnl2BaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Ba, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl2BaLayout.setVerticalGroup(
            subpnl2BaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Ba, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIA.add(subpnl2Ba, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        subpnl2Mg.setBackground(new java.awt.Color(243, 156, 18));
        subpnl2Mg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl2Mg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl2MgMouseClicked(evt);
            }
        });

        mnemo2Mg.setBackground(new java.awt.Color(255, 255, 255));
        mnemo2Mg.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo2Mg.setForeground(new java.awt.Color(255, 255, 255));
        mnemo2Mg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo2Mg.setText("Mg");
        mnemo2Mg.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo2Mg.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo2Mg.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl2MgLayout = new javax.swing.GroupLayout(subpnl2Mg);
        subpnl2Mg.setLayout(subpnl2MgLayout);
        subpnl2MgLayout.setHorizontalGroup(
            subpnl2MgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Mg, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl2MgLayout.setVerticalGroup(
            subpnl2MgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Mg, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIA.add(subpnl2Mg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        subpnl2Be.setBackground(new java.awt.Color(243, 156, 18));
        subpnl2Be.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl2Be.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl2BeMouseClicked(evt);
            }
        });

        mnemo2Be.setBackground(new java.awt.Color(255, 255, 255));
        mnemo2Be.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo2Be.setForeground(new java.awt.Color(255, 255, 255));
        mnemo2Be.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo2Be.setText("Be");
        mnemo2Be.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo2Be.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo2Be.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl2BeLayout = new javax.swing.GroupLayout(subpnl2Be);
        subpnl2Be.setLayout(subpnl2BeLayout);
        subpnl2BeLayout.setHorizontalGroup(
            subpnl2BeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Be, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl2BeLayout.setVerticalGroup(
            subpnl2BeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Be, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIA.add(subpnl2Be, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        subpnl2Ca.setBackground(new java.awt.Color(243, 156, 18));
        subpnl2Ca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl2Ca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl2CaMouseClicked(evt);
            }
        });

        mnemo2Ca.setBackground(new java.awt.Color(255, 255, 255));
        mnemo2Ca.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo2Ca.setForeground(new java.awt.Color(255, 255, 255));
        mnemo2Ca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo2Ca.setText("Ca");
        mnemo2Ca.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo2Ca.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo2Ca.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl2CaLayout = new javax.swing.GroupLayout(subpnl2Ca);
        subpnl2Ca.setLayout(subpnl2CaLayout);
        subpnl2CaLayout.setHorizontalGroup(
            subpnl2CaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Ca, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl2CaLayout.setVerticalGroup(
            subpnl2CaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Ca, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIA.add(subpnl2Ca, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 70, 70));

        subpnl2Ra.setBackground(new java.awt.Color(243, 156, 18));
        subpnl2Ra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl2Ra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl2RaMouseClicked(evt);
            }
        });

        mnemo2Ra.setBackground(new java.awt.Color(255, 255, 255));
        mnemo2Ra.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo2Ra.setForeground(new java.awt.Color(255, 255, 255));
        mnemo2Ra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo2Ra.setText("Ra");
        mnemo2Ra.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo2Ra.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo2Ra.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl2RaLayout = new javax.swing.GroupLayout(subpnl2Ra);
        subpnl2Ra.setLayout(subpnl2RaLayout);
        subpnl2RaLayout.setHorizontalGroup(
            subpnl2RaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Ra, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl2RaLayout.setVerticalGroup(
            subpnl2RaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Ra, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIA.add(subpnl2Ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        subpnl2Sr.setBackground(new java.awt.Color(243, 156, 18));
        subpnl2Sr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl2Sr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl2SrMouseClicked(evt);
            }
        });

        mnemo2Sr.setBackground(new java.awt.Color(255, 255, 255));
        mnemo2Sr.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo2Sr.setForeground(new java.awt.Color(255, 255, 255));
        mnemo2Sr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo2Sr.setText("Sr");
        mnemo2Sr.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo2Sr.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo2Sr.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl2SrLayout = new javax.swing.GroupLayout(subpnl2Sr);
        subpnl2Sr.setLayout(subpnl2SrLayout);
        subpnl2SrLayout.setHorizontalGroup(
            subpnl2SrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Sr, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl2SrLayout.setVerticalGroup(
            subpnl2SrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo2Sr, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIA.add(subpnl2Sr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        mnemoIIIA.setBackground(new java.awt.Color(243, 156, 18));
        mnemoIIIA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnemoIIIA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpnl3Tl.setBackground(new java.awt.Color(243, 156, 18));
        subpnl3Tl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl3Tl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl3TlMouseClicked(evt);
            }
        });

        mnemo3Tl.setBackground(new java.awt.Color(255, 255, 255));
        mnemo3Tl.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo3Tl.setForeground(new java.awt.Color(255, 255, 255));
        mnemo3Tl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo3Tl.setText("Tl");
        mnemo3Tl.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo3Tl.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo3Tl.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl3TlLayout = new javax.swing.GroupLayout(subpnl3Tl);
        subpnl3Tl.setLayout(subpnl3TlLayout);
        subpnl3TlLayout.setHorizontalGroup(
            subpnl3TlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3Tl, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl3TlLayout.setVerticalGroup(
            subpnl3TlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3Tl, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIIA.add(subpnl3Tl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        subpnl3Al.setBackground(new java.awt.Color(243, 156, 18));
        subpnl3Al.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl3Al.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl3AlMouseClicked(evt);
            }
        });

        mnemo3Al.setBackground(new java.awt.Color(255, 255, 255));
        mnemo3Al.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo3Al.setForeground(new java.awt.Color(255, 255, 255));
        mnemo3Al.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo3Al.setText("Al");
        mnemo3Al.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo3Al.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo3Al.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl3AlLayout = new javax.swing.GroupLayout(subpnl3Al);
        subpnl3Al.setLayout(subpnl3AlLayout);
        subpnl3AlLayout.setHorizontalGroup(
            subpnl3AlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3Al, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl3AlLayout.setVerticalGroup(
            subpnl3AlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3Al, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIIA.add(subpnl3Al, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        subpnl3In.setBackground(new java.awt.Color(243, 156, 18));
        subpnl3In.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl3In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl3InMouseClicked(evt);
            }
        });

        mnemo3In.setBackground(new java.awt.Color(255, 255, 255));
        mnemo3In.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo3In.setForeground(new java.awt.Color(255, 255, 255));
        mnemo3In.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo3In.setText("In");
        mnemo3In.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo3In.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo3In.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl3InLayout = new javax.swing.GroupLayout(subpnl3In);
        subpnl3In.setLayout(subpnl3InLayout);
        subpnl3InLayout.setHorizontalGroup(
            subpnl3InLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3In, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl3InLayout.setVerticalGroup(
            subpnl3InLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3In, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIIA.add(subpnl3In, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        subpnl3Ga.setBackground(new java.awt.Color(243, 156, 18));
        subpnl3Ga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl3Ga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl3GaMouseClicked(evt);
            }
        });

        mnemo3Ga.setBackground(new java.awt.Color(255, 255, 255));
        mnemo3Ga.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo3Ga.setForeground(new java.awt.Color(255, 255, 255));
        mnemo3Ga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo3Ga.setText("Ga");
        mnemo3Ga.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo3Ga.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo3Ga.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl3GaLayout = new javax.swing.GroupLayout(subpnl3Ga);
        subpnl3Ga.setLayout(subpnl3GaLayout);
        subpnl3GaLayout.setHorizontalGroup(
            subpnl3GaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3Ga, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl3GaLayout.setVerticalGroup(
            subpnl3GaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3Ga, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIIA.add(subpnl3Ga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        subpnl3B.setBackground(new java.awt.Color(243, 156, 18));
        subpnl3B.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl3BMouseClicked(evt);
            }
        });

        mnemo3B.setBackground(new java.awt.Color(255, 255, 255));
        mnemo3B.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo3B.setForeground(new java.awt.Color(255, 255, 255));
        mnemo3B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo3B.setText("B");
        mnemo3B.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo3B.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo3B.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl3BLayout = new javax.swing.GroupLayout(subpnl3B);
        subpnl3B.setLayout(subpnl3BLayout);
        subpnl3BLayout.setHorizontalGroup(
            subpnl3BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3B, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl3BLayout.setVerticalGroup(
            subpnl3BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo3B, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIIIA.add(subpnl3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        mnemoIVA.setBackground(new java.awt.Color(243, 156, 18));
        mnemoIVA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnemoIVA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpnl4Sn.setBackground(new java.awt.Color(243, 156, 18));
        subpnl4Sn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl4Sn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl4SnMouseClicked(evt);
            }
        });

        mnemo4Sn.setBackground(new java.awt.Color(255, 255, 255));
        mnemo4Sn.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo4Sn.setForeground(new java.awt.Color(255, 255, 255));
        mnemo4Sn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo4Sn.setText("Sn");
        mnemo4Sn.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo4Sn.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo4Sn.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl4SnLayout = new javax.swing.GroupLayout(subpnl4Sn);
        subpnl4Sn.setLayout(subpnl4SnLayout);
        subpnl4SnLayout.setHorizontalGroup(
            subpnl4SnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4Sn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl4SnLayout.setVerticalGroup(
            subpnl4SnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4Sn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIVA.add(subpnl4Sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        subpnl4sI.setBackground(new java.awt.Color(243, 156, 18));
        subpnl4sI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl4sI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl4sIMouseClicked(evt);
            }
        });

        mnemo4sI.setBackground(new java.awt.Color(255, 255, 255));
        mnemo4sI.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo4sI.setForeground(new java.awt.Color(255, 255, 255));
        mnemo4sI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo4sI.setText("Si");
        mnemo4sI.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo4sI.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo4sI.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl4sILayout = new javax.swing.GroupLayout(subpnl4sI);
        subpnl4sI.setLayout(subpnl4sILayout);
        subpnl4sILayout.setHorizontalGroup(
            subpnl4sILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4sI, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl4sILayout.setVerticalGroup(
            subpnl4sILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4sI, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIVA.add(subpnl4sI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        subpnl4C.setBackground(new java.awt.Color(243, 156, 18));
        subpnl4C.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl4C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl4CMouseClicked(evt);
            }
        });

        mnemo4C.setBackground(new java.awt.Color(255, 255, 255));
        mnemo4C.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo4C.setForeground(new java.awt.Color(255, 255, 255));
        mnemo4C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo4C.setText("C");
        mnemo4C.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo4C.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo4C.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl4CLayout = new javax.swing.GroupLayout(subpnl4C);
        subpnl4C.setLayout(subpnl4CLayout);
        subpnl4CLayout.setHorizontalGroup(
            subpnl4CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4C, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl4CLayout.setVerticalGroup(
            subpnl4CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4C, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIVA.add(subpnl4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        subpnl4Ge.setBackground(new java.awt.Color(243, 156, 18));
        subpnl4Ge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl4Ge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl4GeMouseClicked(evt);
            }
        });

        mnemo4Ge.setBackground(new java.awt.Color(255, 255, 255));
        mnemo4Ge.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo4Ge.setForeground(new java.awt.Color(255, 255, 255));
        mnemo4Ge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo4Ge.setText("Ge");
        mnemo4Ge.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo4Ge.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo4Ge.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl4GeLayout = new javax.swing.GroupLayout(subpnl4Ge);
        subpnl4Ge.setLayout(subpnl4GeLayout);
        subpnl4GeLayout.setHorizontalGroup(
            subpnl4GeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4Ge, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl4GeLayout.setVerticalGroup(
            subpnl4GeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4Ge, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIVA.add(subpnl4Ge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        subpnl4Pb.setBackground(new java.awt.Color(243, 156, 18));
        subpnl4Pb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl4Pb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl4PbMouseClicked(evt);
            }
        });

        mnemo4Pb.setBackground(new java.awt.Color(255, 255, 255));
        mnemo4Pb.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo4Pb.setForeground(new java.awt.Color(255, 255, 255));
        mnemo4Pb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo4Pb.setText("Pb");
        mnemo4Pb.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo4Pb.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo4Pb.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl4PbLayout = new javax.swing.GroupLayout(subpnl4Pb);
        subpnl4Pb.setLayout(subpnl4PbLayout);
        subpnl4PbLayout.setHorizontalGroup(
            subpnl4PbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4Pb, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl4PbLayout.setVerticalGroup(
            subpnl4PbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo4Pb, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoIVA.add(subpnl4Pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        mnemoVA.setBackground(new java.awt.Color(243, 156, 18));
        mnemoVA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnemoVA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpnl5Bi.setBackground(new java.awt.Color(243, 156, 18));
        subpnl5Bi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl5Bi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl5BiMouseClicked(evt);
            }
        });

        mnemo5Bi.setBackground(new java.awt.Color(255, 255, 255));
        mnemo5Bi.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo5Bi.setForeground(new java.awt.Color(255, 255, 255));
        mnemo5Bi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo5Bi.setText("Bi");
        mnemo5Bi.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo5Bi.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo5Bi.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl5BiLayout = new javax.swing.GroupLayout(subpnl5Bi);
        subpnl5Bi.setLayout(subpnl5BiLayout);
        subpnl5BiLayout.setHorizontalGroup(
            subpnl5BiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5Bi, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl5BiLayout.setVerticalGroup(
            subpnl5BiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5Bi, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVA.add(subpnl5Bi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        subpnl5As.setBackground(new java.awt.Color(243, 156, 18));
        subpnl5As.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl5As.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl5AsMouseClicked(evt);
            }
        });

        mnemo5As.setBackground(new java.awt.Color(255, 255, 255));
        mnemo5As.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo5As.setForeground(new java.awt.Color(255, 255, 255));
        mnemo5As.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo5As.setText("As");
        mnemo5As.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo5As.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo5As.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl5AsLayout = new javax.swing.GroupLayout(subpnl5As);
        subpnl5As.setLayout(subpnl5AsLayout);
        subpnl5AsLayout.setHorizontalGroup(
            subpnl5AsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5As, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl5AsLayout.setVerticalGroup(
            subpnl5AsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5As, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVA.add(subpnl5As, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        subpnl5P.setBackground(new java.awt.Color(243, 156, 18));
        subpnl5P.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl5P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl5PMouseClicked(evt);
            }
        });

        mnemo5P.setBackground(new java.awt.Color(255, 255, 255));
        mnemo5P.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo5P.setForeground(new java.awt.Color(255, 255, 255));
        mnemo5P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo5P.setText("P");
        mnemo5P.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo5P.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo5P.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl5PLayout = new javax.swing.GroupLayout(subpnl5P);
        subpnl5P.setLayout(subpnl5PLayout);
        subpnl5PLayout.setHorizontalGroup(
            subpnl5PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5P, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl5PLayout.setVerticalGroup(
            subpnl5PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5P, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVA.add(subpnl5P, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        subpnl5N.setBackground(new java.awt.Color(243, 156, 18));
        subpnl5N.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl5N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl5NMouseClicked(evt);
            }
        });

        mnemo5N.setBackground(new java.awt.Color(255, 255, 255));
        mnemo5N.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo5N.setForeground(new java.awt.Color(255, 255, 255));
        mnemo5N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo5N.setText("N");
        mnemo5N.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo5N.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo5N.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl5NLayout = new javax.swing.GroupLayout(subpnl5N);
        subpnl5N.setLayout(subpnl5NLayout);
        subpnl5NLayout.setHorizontalGroup(
            subpnl5NLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5N, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl5NLayout.setVerticalGroup(
            subpnl5NLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5N, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVA.add(subpnl5N, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        subpnl5Sb.setBackground(new java.awt.Color(243, 156, 18));
        subpnl5Sb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl5Sb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl5SbMouseClicked(evt);
            }
        });

        mnemo5Sb.setBackground(new java.awt.Color(255, 255, 255));
        mnemo5Sb.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo5Sb.setForeground(new java.awt.Color(255, 255, 255));
        mnemo5Sb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo5Sb.setText("Sb");
        mnemo5Sb.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo5Sb.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo5Sb.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl5SbLayout = new javax.swing.GroupLayout(subpnl5Sb);
        subpnl5Sb.setLayout(subpnl5SbLayout);
        subpnl5SbLayout.setHorizontalGroup(
            subpnl5SbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5Sb, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl5SbLayout.setVerticalGroup(
            subpnl5SbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo5Sb, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVA.add(subpnl5Sb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        mnemoVIA.setBackground(new java.awt.Color(243, 156, 18));
        mnemoVIA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnemoVIA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpnl6Po.setBackground(new java.awt.Color(243, 156, 18));
        subpnl6Po.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl6Po.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl6PoMouseClicked(evt);
            }
        });

        mnemo6Po.setBackground(new java.awt.Color(255, 255, 255));
        mnemo6Po.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo6Po.setForeground(new java.awt.Color(255, 255, 255));
        mnemo6Po.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo6Po.setText("Po");
        mnemo6Po.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo6Po.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo6Po.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl6PoLayout = new javax.swing.GroupLayout(subpnl6Po);
        subpnl6Po.setLayout(subpnl6PoLayout);
        subpnl6PoLayout.setHorizontalGroup(
            subpnl6PoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6Po, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl6PoLayout.setVerticalGroup(
            subpnl6PoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6Po, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIA.add(subpnl6Po, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 70));

        subpnl6O.setBackground(new java.awt.Color(243, 156, 18));
        subpnl6O.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl6O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl6OMouseClicked(evt);
            }
        });

        mnemo6O.setBackground(new java.awt.Color(255, 255, 255));
        mnemo6O.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo6O.setForeground(new java.awt.Color(255, 255, 255));
        mnemo6O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo6O.setText("O");
        mnemo6O.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo6O.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo6O.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl6OLayout = new javax.swing.GroupLayout(subpnl6O);
        subpnl6O.setLayout(subpnl6OLayout);
        subpnl6OLayout.setHorizontalGroup(
            subpnl6OLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6O, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl6OLayout.setVerticalGroup(
            subpnl6OLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6O, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIA.add(subpnl6O, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        subpnl6Se.setBackground(new java.awt.Color(243, 156, 18));
        subpnl6Se.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl6Se.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl6SeMouseClicked(evt);
            }
        });

        mnemo6Se.setBackground(new java.awt.Color(255, 255, 255));
        mnemo6Se.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo6Se.setForeground(new java.awt.Color(255, 255, 255));
        mnemo6Se.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo6Se.setText("Se");
        mnemo6Se.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo6Se.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo6Se.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl6SeLayout = new javax.swing.GroupLayout(subpnl6Se);
        subpnl6Se.setLayout(subpnl6SeLayout);
        subpnl6SeLayout.setHorizontalGroup(
            subpnl6SeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6Se, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl6SeLayout.setVerticalGroup(
            subpnl6SeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6Se, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIA.add(subpnl6Se, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        subpnl6Te.setBackground(new java.awt.Color(243, 156, 18));
        subpnl6Te.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl6Te.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl6TeMouseClicked(evt);
            }
        });

        mnemo6Te.setBackground(new java.awt.Color(255, 255, 255));
        mnemo6Te.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo6Te.setForeground(new java.awt.Color(255, 255, 255));
        mnemo6Te.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo6Te.setText("Te");
        mnemo6Te.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo6Te.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo6Te.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl6TeLayout = new javax.swing.GroupLayout(subpnl6Te);
        subpnl6Te.setLayout(subpnl6TeLayout);
        subpnl6TeLayout.setHorizontalGroup(
            subpnl6TeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6Te, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl6TeLayout.setVerticalGroup(
            subpnl6TeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6Te, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIA.add(subpnl6Te, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        subpnl6S.setBackground(new java.awt.Color(243, 156, 18));
        subpnl6S.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl6S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl6SMouseClicked(evt);
            }
        });

        mnemo6S.setBackground(new java.awt.Color(255, 255, 255));
        mnemo6S.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo6S.setForeground(new java.awt.Color(255, 255, 255));
        mnemo6S.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo6S.setText("S");
        mnemo6S.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo6S.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo6S.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl6SLayout = new javax.swing.GroupLayout(subpnl6S);
        subpnl6S.setLayout(subpnl6SLayout);
        subpnl6SLayout.setHorizontalGroup(
            subpnl6SLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6S, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl6SLayout.setVerticalGroup(
            subpnl6SLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo6S, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIA.add(subpnl6S, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        mnemoVIIA.setBackground(new java.awt.Color(243, 156, 18));
        mnemoVIIA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnemoVIIA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpnl7At.setBackground(new java.awt.Color(243, 156, 18));
        subpnl7At.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl7At.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl7AtMouseClicked(evt);
            }
        });

        mnemo7At.setBackground(new java.awt.Color(255, 255, 255));
        mnemo7At.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo7At.setForeground(new java.awt.Color(255, 255, 255));
        mnemo7At.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo7At.setText("At");
        mnemo7At.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo7At.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo7At.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl7AtLayout = new javax.swing.GroupLayout(subpnl7At);
        subpnl7At.setLayout(subpnl7AtLayout);
        subpnl7AtLayout.setHorizontalGroup(
            subpnl7AtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7At, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl7AtLayout.setVerticalGroup(
            subpnl7AtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7At, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIA.add(subpnl7At, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 70));

        subpnl7F.setBackground(new java.awt.Color(243, 156, 18));
        subpnl7F.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl7F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl7FMouseClicked(evt);
            }
        });

        mnemo7F.setBackground(new java.awt.Color(255, 255, 255));
        mnemo7F.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo7F.setForeground(new java.awt.Color(255, 255, 255));
        mnemo7F.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo7F.setText("F");
        mnemo7F.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo7F.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo7F.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl7FLayout = new javax.swing.GroupLayout(subpnl7F);
        subpnl7F.setLayout(subpnl7FLayout);
        subpnl7FLayout.setHorizontalGroup(
            subpnl7FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7F, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl7FLayout.setVerticalGroup(
            subpnl7FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7F, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIA.add(subpnl7F, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 70));

        subpnl7I.setBackground(new java.awt.Color(243, 156, 18));
        subpnl7I.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl7I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl7IMouseClicked(evt);
            }
        });

        mnemo7I.setBackground(new java.awt.Color(255, 255, 255));
        mnemo7I.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo7I.setForeground(new java.awt.Color(255, 255, 255));
        mnemo7I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo7I.setText("I");
        mnemo7I.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo7I.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo7I.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl7ILayout = new javax.swing.GroupLayout(subpnl7I);
        subpnl7I.setLayout(subpnl7ILayout);
        subpnl7ILayout.setHorizontalGroup(
            subpnl7ILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7I, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl7ILayout.setVerticalGroup(
            subpnl7ILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7I, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIA.add(subpnl7I, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 70));

        subpnl7Cl.setBackground(new java.awt.Color(243, 156, 18));
        subpnl7Cl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl7Cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl7ClMouseClicked(evt);
            }
        });

        mnemo7Cl.setBackground(new java.awt.Color(255, 255, 255));
        mnemo7Cl.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo7Cl.setForeground(new java.awt.Color(255, 255, 255));
        mnemo7Cl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo7Cl.setText("Cl");
        mnemo7Cl.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo7Cl.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo7Cl.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl7ClLayout = new javax.swing.GroupLayout(subpnl7Cl);
        subpnl7Cl.setLayout(subpnl7ClLayout);
        subpnl7ClLayout.setHorizontalGroup(
            subpnl7ClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7Cl, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl7ClLayout.setVerticalGroup(
            subpnl7ClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7Cl, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIA.add(subpnl7Cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        subpnl7Br.setBackground(new java.awt.Color(243, 156, 18));
        subpnl7Br.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl7Br.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl7BrMouseClicked(evt);
            }
        });

        mnemo7Br.setBackground(new java.awt.Color(255, 255, 255));
        mnemo7Br.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo7Br.setForeground(new java.awt.Color(255, 255, 255));
        mnemo7Br.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo7Br.setText("Br");
        mnemo7Br.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo7Br.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo7Br.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl7BrLayout = new javax.swing.GroupLayout(subpnl7Br);
        subpnl7Br.setLayout(subpnl7BrLayout);
        subpnl7BrLayout.setHorizontalGroup(
            subpnl7BrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7Br, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl7BrLayout.setVerticalGroup(
            subpnl7BrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo7Br, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIA.add(subpnl7Br, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 70));

        mnemoVIIIA.setBackground(new java.awt.Color(243, 156, 18));
        mnemoVIIIA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnemoVIIIA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpnl8Kr.setBackground(new java.awt.Color(243, 156, 18));
        subpnl8Kr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl8Kr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl8KrMouseClicked(evt);
            }
        });

        mnemo8Kr.setBackground(new java.awt.Color(255, 255, 255));
        mnemo8Kr.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo8Kr.setForeground(new java.awt.Color(255, 255, 255));
        mnemo8Kr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo8Kr.setText("Kr");
        mnemo8Kr.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo8Kr.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo8Kr.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl8KrLayout = new javax.swing.GroupLayout(subpnl8Kr);
        subpnl8Kr.setLayout(subpnl8KrLayout);
        subpnl8KrLayout.setHorizontalGroup(
            subpnl8KrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Kr, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl8KrLayout.setVerticalGroup(
            subpnl8KrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Kr, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIIA.add(subpnl8Kr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        subpnl8Rn.setBackground(new java.awt.Color(243, 156, 18));
        subpnl8Rn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl8Rn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl8RnMouseClicked(evt);
            }
        });

        mnemo8Rn.setBackground(new java.awt.Color(255, 255, 255));
        mnemo8Rn.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo8Rn.setForeground(new java.awt.Color(255, 255, 255));
        mnemo8Rn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo8Rn.setText("Rn");
        mnemo8Rn.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo8Rn.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo8Rn.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl8RnLayout = new javax.swing.GroupLayout(subpnl8Rn);
        subpnl8Rn.setLayout(subpnl8RnLayout);
        subpnl8RnLayout.setHorizontalGroup(
            subpnl8RnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Rn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl8RnLayout.setVerticalGroup(
            subpnl8RnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Rn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIIA.add(subpnl8Rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 70));

        subpnl8Xe.setBackground(new java.awt.Color(243, 156, 18));
        subpnl8Xe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl8Xe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl8XeMouseClicked(evt);
            }
        });

        mnemo8Xe.setBackground(new java.awt.Color(255, 255, 255));
        mnemo8Xe.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo8Xe.setForeground(new java.awt.Color(255, 255, 255));
        mnemo8Xe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo8Xe.setText("Xe");
        mnemo8Xe.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo8Xe.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo8Xe.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl8XeLayout = new javax.swing.GroupLayout(subpnl8Xe);
        subpnl8Xe.setLayout(subpnl8XeLayout);
        subpnl8XeLayout.setHorizontalGroup(
            subpnl8XeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Xe, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl8XeLayout.setVerticalGroup(
            subpnl8XeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Xe, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIIA.add(subpnl8Xe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 70));

        subpnl8Ar.setBackground(new java.awt.Color(243, 156, 18));
        subpnl8Ar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl8Ar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl8ArMouseClicked(evt);
            }
        });

        mnemo8Ar.setBackground(new java.awt.Color(255, 255, 255));
        mnemo8Ar.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo8Ar.setForeground(new java.awt.Color(255, 255, 255));
        mnemo8Ar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo8Ar.setText("Ar");
        mnemo8Ar.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo8Ar.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo8Ar.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl8ArLayout = new javax.swing.GroupLayout(subpnl8Ar);
        subpnl8Ar.setLayout(subpnl8ArLayout);
        subpnl8ArLayout.setHorizontalGroup(
            subpnl8ArLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Ar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl8ArLayout.setVerticalGroup(
            subpnl8ArLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Ar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIIA.add(subpnl8Ar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 70));

        subpnl8Ne.setBackground(new java.awt.Color(243, 156, 18));
        subpnl8Ne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl8Ne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl8NeMouseClicked(evt);
            }
        });

        mnemo8Ne.setBackground(new java.awt.Color(255, 255, 255));
        mnemo8Ne.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo8Ne.setForeground(new java.awt.Color(255, 255, 255));
        mnemo8Ne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo8Ne.setText("Ne");
        mnemo8Ne.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo8Ne.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo8Ne.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl8NeLayout = new javax.swing.GroupLayout(subpnl8Ne);
        subpnl8Ne.setLayout(subpnl8NeLayout);
        subpnl8NeLayout.setHorizontalGroup(
            subpnl8NeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Ne, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl8NeLayout.setVerticalGroup(
            subpnl8NeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8Ne, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIIA.add(subpnl8Ne, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 70));

        subpnl8He.setBackground(new java.awt.Color(243, 156, 18));
        subpnl8He.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subpnl8He.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpnl8HeMouseClicked(evt);
            }
        });

        mnemo8He.setBackground(new java.awt.Color(255, 255, 255));
        mnemo8He.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        mnemo8He.setForeground(new java.awt.Color(255, 255, 255));
        mnemo8He.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnemo8He.setText("He");
        mnemo8He.setMaximumSize(new java.awt.Dimension(47, 43));
        mnemo8He.setMinimumSize(new java.awt.Dimension(47, 43));
        mnemo8He.setPreferredSize(new java.awt.Dimension(47, 43));

        javax.swing.GroupLayout subpnl8HeLayout = new javax.swing.GroupLayout(subpnl8He);
        subpnl8He.setLayout(subpnl8HeLayout);
        subpnl8HeLayout.setHorizontalGroup(
            subpnl8HeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8He, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        subpnl8HeLayout.setVerticalGroup(
            subpnl8HeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnemo8He, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        mnemoVIIIA.add(subpnl8He, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 70));

        javax.swing.GroupLayout panelNemoLayout = new javax.swing.GroupLayout(panelNemo);
        panelNemo.setLayout(panelNemoLayout);
        panelNemoLayout.setHorizontalGroup(
            panelNemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNemoLayout.createSequentialGroup()
                .addGroup(panelNemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNemoLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(panelNemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelNemoLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panelNemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mnemoVIIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelNemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(mnemoVA, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mnemoVIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mnemoIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelNemoLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(mnemoIIIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(mnemoVIIIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mnemoIIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelNemoLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(mnemoIA, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(444, Short.MAX_VALUE))
        );
        panelNemoLayout.setVerticalGroup(
            panelNemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNemoLayout.createSequentialGroup()
                .addComponent(mnemoIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnemoIIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnemoIIIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnemoIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(mnemoVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnemoVIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnemoVIIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnemoVIIIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pnlMenu.setBackground(new java.awt.Color(38, 50, 56));
        pnlMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        iconQuimica.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        iconQuimica.setForeground(new java.awt.Color(255, 255, 255));
        iconQuimica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconQuimica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quimica2.png"))); // NOI18N

        txtVersion.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        txtVersion.setForeground(new java.awt.Color(255, 255, 255));
        txtVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVersion.setText("V2.0");

        subpanelAprende.setBackground(new java.awt.Color(38, 50, 56));
        subpanelAprende.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        subpanelAprende.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpanelAprendeMouseClicked(evt);
            }
        });

        opcionAprender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcionAprender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/read.png"))); // NOI18N

        txtVersion1.setForeground(new java.awt.Color(255, 255, 255));
        txtVersion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVersion1.setText("Modo");

        txtVersion3.setForeground(new java.awt.Color(255, 255, 255));
        txtVersion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVersion3.setText("aprendizaje");

        javax.swing.GroupLayout subpanelAprendeLayout = new javax.swing.GroupLayout(subpanelAprende);
        subpanelAprende.setLayout(subpanelAprendeLayout);
        subpanelAprendeLayout.setHorizontalGroup(
            subpanelAprendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVersion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtVersion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcionAprender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        subpanelAprendeLayout.setVerticalGroup(
            subpanelAprendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subpanelAprendeLayout.createSequentialGroup()
                .addComponent(opcionAprender, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVersion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtVersion3)
                .addContainerGap())
        );

        subpanelPractica.setBackground(new java.awt.Color(38, 50, 56));
        subpanelPractica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        subpanelPractica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpanelPracticaMouseClicked(evt);
            }
        });

        opcionPractica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcionPractica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/write.png"))); // NOI18N

        txtVersion2.setForeground(new java.awt.Color(255, 255, 255));
        txtVersion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVersion2.setText("Modo");

        txtVersion4.setForeground(new java.awt.Color(255, 255, 255));
        txtVersion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVersion4.setText("práctica");

        javax.swing.GroupLayout subpanelPracticaLayout = new javax.swing.GroupLayout(subpanelPractica);
        subpanelPractica.setLayout(subpanelPracticaLayout);
        subpanelPracticaLayout.setHorizontalGroup(
            subpanelPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVersion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcionPractica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtVersion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        subpanelPracticaLayout.setVerticalGroup(
            subpanelPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subpanelPracticaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(opcionPractica)
                .addGap(11, 11, 11)
                .addComponent(txtVersion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVersion4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu.png"))); // NOI18N

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconQuimica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subpanelPractica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subpanelAprende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(subpanelAprende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subpanelPractica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272)
                .addComponent(iconQuimica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVersion)
                .addContainerGap(595, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PANELLayout = new javax.swing.GroupLayout(PANEL);
        PANEL.setLayout(PANELLayout);
        PANELLayout.setHorizontalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNemo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPRINCIPAL, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPRINCIPAL, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNemo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVIIIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVIIIAActionPerformed
        // INDICAR QUE EL GRUPO FUE SELECCIONADO
        grupoSeleecionado=8;
        //HABILITAR COLOR AL GRUPO SELECCIONADO
        pnl8He.setBackground(new Color(243,156,18));
        pnl8Ne.setBackground(new Color(243,156,18));
        pnl8Ar.setBackground(new Color(243,156,18));
        pnl8Kr.setBackground(new Color(243,156,18));
        pnl8Xe.setBackground(new Color(243,156,18));
        pnl8Rn.setBackground(new Color(243,156,18));
        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
        subpnl8He.setBackground(new Color(243,156,18));
        subpnl8Ne.setBackground(new Color(243,156,18));
        subpnl8Ar.setBackground(new Color(243,156,18));
        subpnl8Kr.setBackground(new Color(243,156,18));
        subpnl8Xe.setBackground(new Color(243,156,18));
        subpnl8Rn.setBackground(new Color(243,156,18));
        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
        pnl1H.setBackground(new Color(41,128,185));
        pnlLi.setBackground(new Color(41,128,185));
        pnl1Na.setBackground(new Color(41,128,185));
        pnl1K.setBackground(new Color(41,128,185));
        pnl1Rb.setBackground(new Color(41,128,185));
        pnl1Cs.setBackground(new Color(41,128,185));
        pnl1Fr.setBackground(new Color(41,128,185));
        pnl2Be.setBackground(new Color(41,128,185));
        pnl2Mg.setBackground(new Color(41,128,185));
        pnl2Ca.setBackground(new Color(41,128,185));
        pnl2Sr.setBackground(new Color(41,128,185));
        pnl2Ba.setBackground(new Color(41,128,185));
        pnl2Ra.setBackground(new Color(41,128,185));
        pnl3B.setBackground(new Color(41,128,185));
        pnl3Al.setBackground(new Color(41,128,185));
        pnl3Ga.setBackground(new Color(41,128,185));
        pnl3In.setBackground(new Color(41,128,185));
        pnl3Tl.setBackground(new Color(41,128,185));
        pnl4C.setBackground(new Color(41,128,185));
        pnl4Si.setBackground(new Color(41,128,185));
        pnl4Ge.setBackground(new Color(41,128,185));
        pnl4Sn.setBackground(new Color(41,128,185));
        pnl4Pb.setBackground(new Color(41,128,185));
        pnl5N.setBackground(new Color(41,128,185));
        pnl5P.setBackground(new Color(41,128,185));
        pnl5As.setBackground(new Color(41,128,185));
        pnl5Sb.setBackground(new Color(41,128,185));
        pnl5Bi.setBackground(new Color(41,128,185));
        pnl6O.setBackground(new Color(41,128,185));
        pnl6S.setBackground(new Color(41,128,185));
        pnl6Se.setBackground(new Color(41,128,185));
        pnl6Te.setBackground(new Color(41,128,185));
        pnl6Po.setBackground(new Color(41,128,185));
        pnl7F.setBackground(new Color(41,128,185));
        pnl7Cl.setBackground(new Color(41,128,185));
        pnl7Br.setBackground(new Color(41,128,185));
        pnl7I.setBackground(new Color(41,128,185));
        pnl7At.setBackground(new Color(41,128,185));

        // HABILITAR MNEMOTECNIA - GRUPO VIIIA
        mnemoIA.setVisible(false);
        mnemoIIA.setVisible(false);
        mnemoIIIA.setVisible(false);
        mnemoIVA.setVisible(false);
        mnemoVA.setVisible(false);
        mnemoVIA.setVisible(false);
        mnemoVIIA.setVisible(false);
        mnemoVIIIA.setVisible(true);
    }//GEN-LAST:event_btnVIIIAActionPerformed

    private void btnVIIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVIIAActionPerformed
        // INDICAR QUE EL GRUPO FUE SELECCIONADO
        grupoSeleecionado=7;
        //HABILITAR COLOR AL GRUPO SELECCIONADO
        pnl7F.setBackground(new Color(243,156,18));
        pnl7Cl.setBackground(new Color(243,156,18));
        pnl7Br.setBackground(new Color(243,156,18));
        pnl7I.setBackground(new Color(243,156,18));
        pnl7At.setBackground(new Color(243,156,18));
        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
        subpnl7F.setBackground(new Color(243,156,18));
        subpnl7Cl.setBackground(new Color(243,156,18));
        subpnl7Br.setBackground(new Color(243,156,18));
        subpnl7I.setBackground(new Color(243,156,18));
        subpnl7At.setBackground(new Color(243,156,18));
        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
        pnl1H.setBackground(new Color(41,128,185));
        pnlLi.setBackground(new Color(41,128,185));
        pnl1Na.setBackground(new Color(41,128,185));
        pnl1K.setBackground(new Color(41,128,185));
        pnl1Rb.setBackground(new Color(41,128,185));
        pnl1Cs.setBackground(new Color(41,128,185));
        pnl1Fr.setBackground(new Color(41,128,185));
        pnl2Be.setBackground(new Color(41,128,185));
        pnl2Mg.setBackground(new Color(41,128,185));
        pnl2Ca.setBackground(new Color(41,128,185));
        pnl2Sr.setBackground(new Color(41,128,185));
        pnl2Ba.setBackground(new Color(41,128,185));
        pnl2Ra.setBackground(new Color(41,128,185));
        pnl3B.setBackground(new Color(41,128,185));
        pnl3Al.setBackground(new Color(41,128,185));
        pnl3Ga.setBackground(new Color(41,128,185));
        pnl3In.setBackground(new Color(41,128,185));
        pnl3Tl.setBackground(new Color(41,128,185));
        pnl4C.setBackground(new Color(41,128,185));
        pnl4Si.setBackground(new Color(41,128,185));
        pnl4Ge.setBackground(new Color(41,128,185));
        pnl4Sn.setBackground(new Color(41,128,185));
        pnl4Pb.setBackground(new Color(41,128,185));
        pnl5N.setBackground(new Color(41,128,185));
        pnl5P.setBackground(new Color(41,128,185));
        pnl5As.setBackground(new Color(41,128,185));
        pnl5Sb.setBackground(new Color(41,128,185));
        pnl5Bi.setBackground(new Color(41,128,185));
        pnl6O.setBackground(new Color(41,128,185));
        pnl6S.setBackground(new Color(41,128,185));
        pnl6Se.setBackground(new Color(41,128,185));
        pnl6Te.setBackground(new Color(41,128,185));
        pnl6Po.setBackground(new Color(41,128,185));
        pnl8He.setBackground(new Color(41,128,185));
        pnl8Ne.setBackground(new Color(41,128,185));
        pnl8Ar.setBackground(new Color(41,128,185));
        pnl8Kr.setBackground(new Color(41,128,185));
        pnl8Xe.setBackground(new Color(41,128,185));
        pnl8Rn.setBackground(new Color(41,128,185));
        // HABILITAR MNEMOTECNIA - GRUPO VIIA
        mnemoIA.setVisible(false);
        mnemoIIA.setVisible(false);
        mnemoIIIA.setVisible(false);
        mnemoIVA.setVisible(false);
        mnemoVA.setVisible(false);
        mnemoVIA.setVisible(false);
        mnemoVIIA.setVisible(true);
        mnemoVIIIA.setVisible(false);
    }//GEN-LAST:event_btnVIIAActionPerformed

    private void btnVIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVIAActionPerformed
        // INDICAR QUE EL GRUPO FUE SELECCIONADO
        grupoSeleecionado=6;
        //HABILITAR COLOR AL GRUPO SELECCIONADO
        pnl6O.setBackground(new Color(243,156,18));
        pnl6S.setBackground(new Color(243,156,18));
        pnl6Se.setBackground(new Color(243,156,18));
        pnl6Te.setBackground(new Color(243,156,18));
        pnl6Po.setBackground(new Color(243,156,18));
        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
        subpnl6O.setBackground(new Color(243,156,18));
        subpnl6S.setBackground(new Color(243,156,18));
        subpnl6Se.setBackground(new Color(243,156,18));
        subpnl6Te.setBackground(new Color(243,156,18));
        subpnl6Po.setBackground(new Color(243,156,18));
        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
        pnl1H.setBackground(new Color(41,128,185));
        pnlLi.setBackground(new Color(41,128,185));
        pnl1Na.setBackground(new Color(41,128,185));
        pnl1K.setBackground(new Color(41,128,185));
        pnl1Rb.setBackground(new Color(41,128,185));
        pnl1Cs.setBackground(new Color(41,128,185));
        pnl1Fr.setBackground(new Color(41,128,185));
        pnl2Be.setBackground(new Color(41,128,185));
        pnl2Mg.setBackground(new Color(41,128,185));
        pnl2Ca.setBackground(new Color(41,128,185));
        pnl2Sr.setBackground(new Color(41,128,185));
        pnl2Ba.setBackground(new Color(41,128,185));
        pnl2Ra.setBackground(new Color(41,128,185));
        pnl3B.setBackground(new Color(41,128,185));
        pnl3Al.setBackground(new Color(41,128,185));
        pnl3Ga.setBackground(new Color(41,128,185));
        pnl3In.setBackground(new Color(41,128,185));
        pnl3Tl.setBackground(new Color(41,128,185));
        pnl4C.setBackground(new Color(41,128,185));
        pnl4Si.setBackground(new Color(41,128,185));
        pnl4Ge.setBackground(new Color(41,128,185));
        pnl4Sn.setBackground(new Color(41,128,185));
        pnl4Pb.setBackground(new Color(41,128,185));
        pnl5N.setBackground(new Color(41,128,185));
        pnl5P.setBackground(new Color(41,128,185));
        pnl5As.setBackground(new Color(41,128,185));
        pnl5Sb.setBackground(new Color(41,128,185));
        pnl5Bi.setBackground(new Color(41,128,185));
        pnl7F.setBackground(new Color(41,128,185));
        pnl7Cl.setBackground(new Color(41,128,185));
        pnl7Br.setBackground(new Color(41,128,185));
        pnl7I.setBackground(new Color(41,128,185));
        pnl7At.setBackground(new Color(41,128,185));
        pnl8He.setBackground(new Color(41,128,185));
        pnl8Ne.setBackground(new Color(41,128,185));
        pnl8Ar.setBackground(new Color(41,128,185));
        pnl8Kr.setBackground(new Color(41,128,185));
        pnl8Xe.setBackground(new Color(41,128,185));
        pnl8Rn.setBackground(new Color(41,128,185));
        // HABILITAR MNEMOTECNIA - GRUPO VIA
        mnemoIA.setVisible(false);
        mnemoIIA.setVisible(false);
        mnemoIIIA.setVisible(false);
        mnemoIVA.setVisible(false);
        mnemoVA.setVisible(false);
        mnemoVIA.setVisible(true);
        mnemoVIIA.setVisible(false);
        mnemoVIIIA.setVisible(false);
    }//GEN-LAST:event_btnVIAActionPerformed

    private void btnVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVAActionPerformed
        // INDICAR QUE EL GRUPO FUE SELECCIONADO
        grupoSeleecionado=5;
        //HABILITAR COLOR AL GRUPO SELECCIONADO
        pnl5N.setBackground(new Color(243,156,18));
        pnl5P.setBackground(new Color(243,156,18));
        pnl5As.setBackground(new Color(243,156,18));
        pnl5Sb.setBackground(new Color(243,156,18));
        pnl5Bi.setBackground(new Color(243,156,18));
        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
        subpnl5N.setBackground(new Color(243,156,18));
        subpnl5P.setBackground(new Color(243,156,18));
        subpnl5As.setBackground(new Color(243,156,18));
        subpnl5Sb.setBackground(new Color(243,156,18));
        subpnl5Bi.setBackground(new Color(243,156,18));
        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
        pnl1H.setBackground(new Color(41,128,185));
        pnlLi.setBackground(new Color(41,128,185));
        pnl1Na.setBackground(new Color(41,128,185));
        pnl1K.setBackground(new Color(41,128,185));
        pnl1Rb.setBackground(new Color(41,128,185));
        pnl1Cs.setBackground(new Color(41,128,185));
        pnl1Fr.setBackground(new Color(41,128,185));
        pnl2Be.setBackground(new Color(41,128,185));
        pnl2Mg.setBackground(new Color(41,128,185));
        pnl2Ca.setBackground(new Color(41,128,185));
        pnl2Sr.setBackground(new Color(41,128,185));
        pnl2Ba.setBackground(new Color(41,128,185));
        pnl2Ra.setBackground(new Color(41,128,185));
        pnl3B.setBackground(new Color(41,128,185));
        pnl3Al.setBackground(new Color(41,128,185));
        pnl3Ga.setBackground(new Color(41,128,185));
        pnl3In.setBackground(new Color(41,128,185));
        pnl3Tl.setBackground(new Color(41,128,185));
        pnl4C.setBackground(new Color(41,128,185));
        pnl4Si.setBackground(new Color(41,128,185));
        pnl4Ge.setBackground(new Color(41,128,185));
        pnl4Sn.setBackground(new Color(41,128,185));
        pnl4Pb.setBackground(new Color(41,128,185));
        pnl6O.setBackground(new Color(41,128,185));
        pnl6S.setBackground(new Color(41,128,185));
        pnl6Se.setBackground(new Color(41,128,185));
        pnl6Te.setBackground(new Color(41,128,185));
        pnl6Po.setBackground(new Color(41,128,185));
        pnl7F.setBackground(new Color(41,128,185));
        pnl7Cl.setBackground(new Color(41,128,185));
        pnl7Br.setBackground(new Color(41,128,185));
        pnl7I.setBackground(new Color(41,128,185));
        pnl7At.setBackground(new Color(41,128,185));
        pnl8He.setBackground(new Color(41,128,185));
        pnl8Ne.setBackground(new Color(41,128,185));
        pnl8Ar.setBackground(new Color(41,128,185));
        pnl8Kr.setBackground(new Color(41,128,185));
        pnl8Xe.setBackground(new Color(41,128,185));
        pnl8Rn.setBackground(new Color(41,128,185));
        // HABILITAR MNEMOTECNIA - GRUPO VA
        mnemoIA.setVisible(false);
        mnemoIIA.setVisible(false);
        mnemoIIIA.setVisible(false);
        mnemoIVA.setVisible(false);
        mnemoVA.setVisible(true);
        mnemoVIA.setVisible(false);
        mnemoVIIA.setVisible(false);
        mnemoVIIIA.setVisible(false);
    }//GEN-LAST:event_btnVAActionPerformed

    private void btnIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIVAActionPerformed
        // INDICAR QUE EL GRUPO FUE SELECCIONADO
        grupoSeleecionado=4;
        //HABILITAR COLOR AL GRUPO SELECCIONADO
        pnl4C.setBackground(new Color(243,156,18));
        pnl4Si.setBackground(new Color(243,156,18));
        pnl4Ge.setBackground(new Color(243,156,18));
        pnl4Sn.setBackground(new Color(243,156,18));
        pnl4Pb.setBackground(new Color(243,156,18));
        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
        subpnl4C.setBackground(new Color(243,156,18));
        subpnl4Ge.setBackground(new Color(243,156,18));
        subpnl4Sn.setBackground(new Color(243,156,18));
        subpnl4Pb.setBackground(new Color(243,156,18));
        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
        pnl1H.setBackground(new Color(41,128,185));
        pnlLi.setBackground(new Color(41,128,185));
        pnl1Na.setBackground(new Color(41,128,185));
        pnl1K.setBackground(new Color(41,128,185));
        pnl1Rb.setBackground(new Color(41,128,185));
        pnl1Cs.setBackground(new Color(41,128,185));
        pnl1Fr.setBackground(new Color(41,128,185));
        pnl2Be.setBackground(new Color(41,128,185));
        pnl2Mg.setBackground(new Color(41,128,185));
        pnl2Ca.setBackground(new Color(41,128,185));
        pnl2Sr.setBackground(new Color(41,128,185));
        pnl2Ba.setBackground(new Color(41,128,185));
        pnl2Ra.setBackground(new Color(41,128,185));
        pnl3B.setBackground(new Color(41,128,185));
        pnl3Al.setBackground(new Color(41,128,185));
        pnl3Ga.setBackground(new Color(41,128,185));
        pnl3In.setBackground(new Color(41,128,185));
        pnl3Tl.setBackground(new Color(41,128,185));
        pnl5N.setBackground(new Color(41,128,185));
        pnl5P.setBackground(new Color(41,128,185));
        pnl5As.setBackground(new Color(41,128,185));
        pnl5Sb.setBackground(new Color(41,128,185));
        pnl5Bi.setBackground(new Color(41,128,185));
        pnl6O.setBackground(new Color(41,128,185));
        pnl6S.setBackground(new Color(41,128,185));
        pnl6Se.setBackground(new Color(41,128,185));
        pnl6Te.setBackground(new Color(41,128,185));
        pnl6Po.setBackground(new Color(41,128,185));
        pnl7F.setBackground(new Color(41,128,185));
        pnl7Cl.setBackground(new Color(41,128,185));
        pnl7Br.setBackground(new Color(41,128,185));
        pnl7I.setBackground(new Color(41,128,185));
        pnl7At.setBackground(new Color(41,128,185));
        pnl8He.setBackground(new Color(41,128,185));
        pnl8Ne.setBackground(new Color(41,128,185));
        pnl8Ar.setBackground(new Color(41,128,185));
        pnl8Kr.setBackground(new Color(41,128,185));
        pnl8Xe.setBackground(new Color(41,128,185));
        pnl8Rn.setBackground(new Color(41,128,185));
        // HABILITAR MNEMOTECNIA - GRUPO IVA
        mnemoIA.setVisible(false);
        mnemoIIA.setVisible(false);
        mnemoIIIA.setVisible(false);
        mnemoIVA.setVisible(true);
        mnemoVA.setVisible(false);
        mnemoVIA.setVisible(false);
        mnemoVIIA.setVisible(false);
        mnemoVIIIA.setVisible(false);
    }//GEN-LAST:event_btnIVAActionPerformed

    private void btnIIIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIIIAActionPerformed
        // INDICAR QUE EL GRUPO FUE SELECCIONADO
        grupoSeleecionado=3;
        //HABILITAR COLOR AL GRUPO SELECCIONADO
        pnl3B.setBackground(new Color(243,156,18));
        pnl3Al.setBackground(new Color(243,156,18));
        pnl3Ga.setBackground(new Color(243,156,18));
        pnl3In.setBackground(new Color(243,156,18));
        pnl3Tl.setBackground(new Color(243,156,18));
        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
        subpnl3B.setBackground(new Color(243,156,18));
        subpnl3Al.setBackground(new Color(243,156,18));
        subpnl3Ga.setBackground(new Color(243,156,18));
        subpnl3In.setBackground(new Color(243,156,18));
        subpnl3Tl.setBackground(new Color(243,156,18));
        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
        pnl1H.setBackground(new Color(41,128,185));
        pnlLi.setBackground(new Color(41,128,185));
        pnl1Na.setBackground(new Color(41,128,185));
        pnl1K.setBackground(new Color(41,128,185));
        pnl1Rb.setBackground(new Color(41,128,185));
        pnl1Cs.setBackground(new Color(41,128,185));
        pnl1Fr.setBackground(new Color(41,128,185));
        pnl2Be.setBackground(new Color(41,128,185));
        pnl2Mg.setBackground(new Color(41,128,185));
        pnl2Ca.setBackground(new Color(41,128,185));
        pnl2Sr.setBackground(new Color(41,128,185));
        pnl2Ba.setBackground(new Color(41,128,185));
        pnl2Ra.setBackground(new Color(41,128,185));
        pnl4C.setBackground(new Color(41,128,185));
        pnl4Si.setBackground(new Color(41,128,185));
        pnl4Ge.setBackground(new Color(41,128,185));
        pnl4Sn.setBackground(new Color(41,128,185));
        pnl4Pb.setBackground(new Color(41,128,185));
        pnl5N.setBackground(new Color(41,128,185));
        pnl5P.setBackground(new Color(41,128,185));
        pnl5As.setBackground(new Color(41,128,185));
        pnl5Sb.setBackground(new Color(41,128,185));
        pnl5Bi.setBackground(new Color(41,128,185));
        pnl6O.setBackground(new Color(41,128,185));
        pnl6S.setBackground(new Color(41,128,185));
        pnl6Se.setBackground(new Color(41,128,185));
        pnl6Te.setBackground(new Color(41,128,185));
        pnl6Po.setBackground(new Color(41,128,185));
        pnl7F.setBackground(new Color(41,128,185));
        pnl7Cl.setBackground(new Color(41,128,185));
        pnl7Br.setBackground(new Color(41,128,185));
        pnl7I.setBackground(new Color(41,128,185));
        pnl7At.setBackground(new Color(41,128,185));
        pnl8He.setBackground(new Color(41,128,185));
        pnl8Ne.setBackground(new Color(41,128,185));
        pnl8Ar.setBackground(new Color(41,128,185));
        pnl8Kr.setBackground(new Color(41,128,185));
        pnl8Xe.setBackground(new Color(41,128,185));
        pnl8Rn.setBackground(new Color(41,128,185));
        // HABILITAR MNEMOTECNIA - GRUPO IIIA
        mnemoIA.setVisible(false);
        mnemoIIA.setVisible(false);
        mnemoIIIA.setVisible(true);
        mnemoIVA.setVisible(false);
        mnemoVA.setVisible(false);
        mnemoVIA.setVisible(false);
        mnemoVIIA.setVisible(false);
        mnemoVIIIA.setVisible(false);
    }//GEN-LAST:event_btnIIIAActionPerformed

    private void btnIIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIIAActionPerformed
        // INDICAR QUE EL GRUPO FUE SELECCIONADO
        grupoSeleecionado=2;
        pnl2Be.setBackground(new Color(243,156,18));
        pnl2Mg.setBackground(new Color(243,156,18));
        pnl2Ca.setBackground(new Color(243,156,18));
        pnl2Sr.setBackground(new Color(243,156,18));
        pnl2Ba.setBackground(new Color(243,156,18));
        pnl2Ra.setBackground(new Color(243,156,18));
        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
        pnl1H.setBackground(new Color(41,128,185));
        pnlLi.setBackground(new Color(41,128,185));
        pnl1Na.setBackground(new Color(41,128,185));
        pnl1K.setBackground(new Color(41,128,185));
        pnl1Rb.setBackground(new Color(41,128,185));
        pnl1Cs.setBackground(new Color(41,128,185));
        pnl1Fr.setBackground(new Color(41,128,185));
        pnl3B.setBackground(new Color(41,128,185));
        pnl3Al.setBackground(new Color(41,128,185));
        pnl3Ga.setBackground(new Color(41,128,185));
        pnl3In.setBackground(new Color(41,128,185));
        pnl3Tl.setBackground(new Color(41,128,185));
        pnl4C.setBackground(new Color(41,128,185));
        pnl4Si.setBackground(new Color(41,128,185));
        pnl4Ge.setBackground(new Color(41,128,185));
        pnl4Sn.setBackground(new Color(41,128,185));
        pnl4Pb.setBackground(new Color(41,128,185));
        pnl5N.setBackground(new Color(41,128,185));
        pnl5P.setBackground(new Color(41,128,185));
        pnl5As.setBackground(new Color(41,128,185));
        pnl5Sb.setBackground(new Color(41,128,185));
        pnl5Bi.setBackground(new Color(41,128,185));
        pnl6O.setBackground(new Color(41,128,185));
        pnl6S.setBackground(new Color(41,128,185));
        pnl6Se.setBackground(new Color(41,128,185));
        pnl6Te.setBackground(new Color(41,128,185));
        pnl6Po.setBackground(new Color(41,128,185));
        pnl7F.setBackground(new Color(41,128,185));
        pnl7Cl.setBackground(new Color(41,128,185));
        pnl7Br.setBackground(new Color(41,128,185));
        pnl7I.setBackground(new Color(41,128,185));
        pnl7At.setBackground(new Color(41,128,185));
        pnl8He.setBackground(new Color(41,128,185));
        pnl8Ne.setBackground(new Color(41,128,185));
        pnl8Ar.setBackground(new Color(41,128,185));
        pnl8Kr.setBackground(new Color(41,128,185));
        pnl8Xe.setBackground(new Color(41,128,185));
        pnl8Rn.setBackground(new Color(41,128,185));
        // HABILITAR MNEMOTECNIA - GRUPO IIA
        mnemoIA.setVisible(false);
        mnemoIIA.setVisible(true);
        mnemoIIIA.setVisible(false);
        mnemoIVA.setVisible(false);
        mnemoVA.setVisible(false);
        mnemoVIA.setVisible(false);
        mnemoVIIA.setVisible(false);
        mnemoVIIIA.setVisible(false);
    }//GEN-LAST:event_btnIIAActionPerformed

    private void btnIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIAActionPerformed
        // INDICAR QUE EL GRUPO FUE SELECCIONADO
        grupoSeleecionado=1;
        //HABILITAR COLOR AL GRUPO SELECCIONADO
        pnl1H.setBackground(new Color(243,156,18));
        pnlLi.setBackground(new Color(243,156,18));
        pnl1Na.setBackground(new Color(243,156,18));
        pnl1K.setBackground(new Color(243,156,18));
        pnl1Rb.setBackground(new Color(243,156,18));
        pnl1Cs.setBackground(new Color(243,156,18));
        pnl1Fr.setBackground(new Color(243,156,18));
        //HABILITAR COLOR AL SUBPANEL (EN BASE AL GRUPO SELECCIONADO)
        /*subpnl1H.setBackground(new Color(243,156,18));
        subpnl1Li.setBackground(new Color(243,156,18));
        subpnl1Na.setBackground(new Color(243,156,18));
        subpnl1K.setBackground(new Color(243,156,18));
        subpnl1Rb.setBackground(new Color(243,156,18));
        subpnl1Cs.setBackground(new Color(243,156,18));
        subpnl1Fr.setBackground(new Color(243,156,18));*/
        // DESHABILITAR COLORES DE LOS OTROS GRUPOS
        pnl2Be.setBackground(new Color(41,128,185));
        pnl2Mg.setBackground(new Color(41,128,185));
        pnl2Ca.setBackground(new Color(41,128,185));
        pnl2Sr.setBackground(new Color(41,128,185));
        pnl2Ba.setBackground(new Color(41,128,185));
        pnl2Ra.setBackground(new Color(41,128,185));
        pnl3B.setBackground(new Color(41,128,185));
        pnl3Al.setBackground(new Color(41,128,185));
        pnl3Ga.setBackground(new Color(41,128,185));
        pnl3In.setBackground(new Color(41,128,185));
        pnl3Tl.setBackground(new Color(41,128,185));
        pnl4C.setBackground(new Color(41,128,185));
        pnl4Si.setBackground(new Color(41,128,185));
        pnl4Ge.setBackground(new Color(41,128,185));
        pnl4Sn.setBackground(new Color(41,128,185));
        pnl4Pb.setBackground(new Color(41,128,185));
        pnl5N.setBackground(new Color(41,128,185));
        pnl5P.setBackground(new Color(41,128,185));
        pnl5As.setBackground(new Color(41,128,185));
        pnl5Sb.setBackground(new Color(41,128,185));
        pnl5Bi.setBackground(new Color(41,128,185));
        pnl6O.setBackground(new Color(41,128,185));
        pnl6S.setBackground(new Color(41,128,185));
        pnl6Se.setBackground(new Color(41,128,185));
        pnl6Te.setBackground(new Color(41,128,185));
        pnl6Po.setBackground(new Color(41,128,185));
        pnl7F.setBackground(new Color(41,128,185));
        pnl7Cl.setBackground(new Color(41,128,185));
        pnl7Br.setBackground(new Color(41,128,185));
        pnl7I.setBackground(new Color(41,128,185));
        pnl7At.setBackground(new Color(41,128,185));
        pnl8He.setBackground(new Color(41,128,185));
        pnl8Ne.setBackground(new Color(41,128,185));
        pnl8Ar.setBackground(new Color(41,128,185));
        pnl8Kr.setBackground(new Color(41,128,185));
        pnl8Xe.setBackground(new Color(41,128,185));
        pnl8Rn.setBackground(new Color(41,128,185));

        // HABILITAR MNEMOTECNIA - GRUPO IA
        mnemoIA.setVisible(true);
        mnemoIIA.setVisible(false);
        mnemoIIIA.setVisible(false);
        mnemoIVA.setVisible(false);
        mnemoVA.setVisible(false);
        mnemoVIA.setVisible(false);
        mnemoVIIA.setVisible(false);
        mnemoVIIIA.setVisible(false);
    }//GEN-LAST:event_btnIAActionPerformed

    private void pnlTransicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTransicionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTransicionMouseClicked

    private void pnl8RnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8RnMouseExited
        if(grupoSeleecionado==8){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl8Rn.setBackground(new Color(243,156,18));
            subpnl8Rn.setBackground(new Color(243,156,18));
        }else{
            pnl8Rn.setBackground(new Color(41,128,185));
            subpnl8Rn.setBackground(new Color(0, 188, 212));
        }
    }//GEN-LAST:event_pnl8RnMouseExited

    private void pnl8RnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8RnMouseEntered
        pnl8Rn.setBackground(new Color(0, 188, 212));
        subpnl8Rn.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl8RnMouseEntered

    private void pnl8RnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8RnMouseClicked
        imageApp.setIcon(Imagen[44]);
        elemento = obj.dElemento(86);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl8RnMouseClicked

    private void pnl8XeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8XeMouseExited
        if(grupoSeleecionado==8){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl8Xe.setBackground(new Color(243,156,18));
            subpnl8Xe.setBackground(new Color(243,156,18));
        }else{
            pnl8Xe.setBackground(new Color(41,128,185));
            subpnl8Xe.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl8XeMouseExited

    private void pnl8XeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8XeMouseEntered
        pnl8Xe.setBackground(new Color(0, 188, 212));
        subpnl8Xe.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl8XeMouseEntered

    private void pnl8XeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8XeMouseClicked
        imageApp.setIcon(Imagen[43]);
        elemento = obj.dElemento(54);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl8XeMouseClicked

    private void pnl8KrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8KrMouseExited
        if(grupoSeleecionado==8){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl8Kr.setBackground(new Color(243,156,18));
            subpnl8Kr.setBackground(new Color(243,156,18));
        }else{
            pnl8Kr.setBackground(new Color(41,128,185));
            subpnl8Kr.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl8KrMouseExited

    private void pnl8KrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8KrMouseEntered
        pnl8Kr.setBackground(new Color(0, 188, 212));
        subpnl8Kr.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl8KrMouseEntered

    private void pnl8KrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8KrMouseClicked
        imageApp.setIcon(Imagen[42]);
        elemento = obj.dElemento(36);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl8KrMouseClicked

    private void pnl8ArMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8ArMouseExited
        if(grupoSeleecionado==8){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl8Ar.setBackground(new Color(243,156,18));
            subpnl8Ar.setBackground(new Color(243,156,18));
        }else{
            pnl8Ar.setBackground(new Color(41,128,185));
            subpnl8Ar.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl8ArMouseExited

    private void pnl8ArMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8ArMouseEntered
        pnl8Ar.setBackground(new Color(0, 188, 212));
        subpnl8Ar.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl8ArMouseEntered

    private void pnl8ArMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8ArMouseClicked
        imageApp.setIcon(Imagen[41]);
        elemento = obj.dElemento(18);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());

    }//GEN-LAST:event_pnl8ArMouseClicked

    private void pnl8NeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8NeMouseExited
        if(grupoSeleecionado==8){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl8Ne.setBackground(new Color(243,156,18));
            subpnl8Ne.setBackground(new Color(243,156,18));
        }else{
            pnl8Ne.setBackground(new Color(41,128,185));
            subpnl8Ne.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl8NeMouseExited

    private void pnl8NeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8NeMouseEntered
        pnl8Ne.setBackground(new Color(0, 188, 212));
        subpnl8Ne.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl8NeMouseEntered

    private void pnl8NeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8NeMouseClicked
        imageApp.setIcon(Imagen[40]);
        elemento = obj.dElemento(10);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl8NeMouseClicked

    private void pnl8HeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8HeMouseExited
        if(grupoSeleecionado==8){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl8He.setBackground(new Color(243,156,18));
            subpnl8He.setBackground(new Color(243,156,18));
        }else{
            pnl8He.setBackground(new Color(41,128,185));
            subpnl8He.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl8HeMouseExited

    private void pnl8HeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8HeMouseEntered
        pnl8He.setBackground(new Color(0, 188, 212));
        subpnl8He.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl8HeMouseEntered

    private void pnl8HeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8HeMouseClicked
        imageApp.setIcon(Imagen[39]);
        elemento = obj.dElemento(2);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl8HeMouseClicked

    private void pnl7AtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7AtMouseExited
        if(grupoSeleecionado==7){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl7At.setBackground(new Color(243,156,18));
            subpnl7At.setBackground(new Color(243,156,18));
        }else{
            pnl7At.setBackground(new Color(41,128,185));
            subpnl7At.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl7AtMouseExited

    private void pnl7AtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7AtMouseEntered
        pnl7At.setBackground(new Color(0, 188, 212));
        subpnl7At.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl7AtMouseEntered

    private void pnl7AtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7AtMouseClicked
        imageApp.setIcon(Imagen[38]);
        elemento = obj.dElemento(85);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl7AtMouseClicked

    private void pnl7IMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7IMouseExited
        if(grupoSeleecionado==7){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl7I.setBackground(new Color(243,156,18));
            subpnl7I.setBackground(new Color(243,156,18));
        }else{
            pnl7I.setBackground(new Color(41,128,185));
            subpnl7I.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl7IMouseExited

    private void pnl7IMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7IMouseEntered
        pnl7I.setBackground(new Color(0, 188, 212));
        subpnl7I.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl7IMouseEntered

    private void pnl7IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7IMouseClicked
        imageApp.setIcon(Imagen[37]);
        elemento = obj.dElemento(53);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl7IMouseClicked

    private void pnl7BrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7BrMouseExited
        if(grupoSeleecionado==7){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl7Br.setBackground(new Color(243,156,18));
            subpnl7Br.setBackground(new Color(243,156,18));
        }else{
            pnl7Br.setBackground(new Color(41,128,185));
            subpnl7Br.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl7BrMouseExited

    private void pnl7BrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7BrMouseEntered
        pnl7Br.setBackground(new Color(0, 188, 212));
        subpnl7Br.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl7BrMouseEntered

    private void pnl7BrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7BrMouseClicked
        imageApp.setIcon(Imagen[36]);
        elemento = obj.dElemento(35);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl7BrMouseClicked

    private void pnl7ClMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7ClMouseExited
        if(grupoSeleecionado==7){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl7Cl.setBackground(new Color(243,156,18));
            subpnl7Cl.setBackground(new Color(243,156,18));
        }else{
            pnl7Cl.setBackground(new Color(41,128,185));
            subpnl7Cl.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl7ClMouseExited

    private void pnl7ClMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7ClMouseEntered
        pnl7Cl.setBackground(new Color(0, 188, 212));
        subpnl7Cl.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl7ClMouseEntered

    private void pnl7ClMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7ClMouseClicked
        imageApp.setIcon(Imagen[35]);
        elemento = obj.dElemento(17);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl7ClMouseClicked

    private void pnl7FMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7FMouseExited
        if(grupoSeleecionado==7){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl7F.setBackground(new Color(243,156,18));
            subpnl7F.setBackground(new Color(243,156,18));
        }else{
            pnl7F.setBackground(new Color(41,128,185));
            subpnl7F.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl7FMouseExited

    private void pnl7FMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7FMouseEntered
        pnl7F.setBackground(new Color(0, 188, 212));
        subpnl7F.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl7FMouseEntered

    private void pnl7FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7FMouseClicked
        imageApp.setIcon(Imagen[34]);
        elemento = obj.dElemento(9);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl7FMouseClicked

    private void pnl6PoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6PoMouseExited
        if(grupoSeleecionado==6){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl6Po.setBackground(new Color(243,156,18));
            subpnl6Po.setBackground(new Color(243,156,18));
        }else{
            pnl6Po.setBackground(new Color(41,128,185));
            subpnl6Po.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl6PoMouseExited

    private void pnl6PoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6PoMouseEntered
        pnl6Po.setBackground(new Color(0, 188, 212));
        subpnl6Po.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl6PoMouseEntered

    private void pnl6PoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6PoMouseClicked
        imageApp.setIcon(Imagen[33]);
        elemento = obj.dElemento(84);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl6PoMouseClicked

    private void pnl6TeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6TeMouseExited
        if(grupoSeleecionado==6){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl6Te.setBackground(new Color(243,156,18));
            subpnl6Te.setBackground(new Color(243,156,18));
        }else{
            pnl6Te.setBackground(new Color(41,128,185));
            subpnl6Te.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl6TeMouseExited

    private void pnl6TeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6TeMouseEntered
        pnl6Te.setBackground(new Color(0, 188, 212));
        subpnl6Te.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl6TeMouseEntered

    private void pnl6TeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6TeMouseClicked
        imageApp.setIcon(Imagen[32]);
        elemento = obj.dElemento(52);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl6TeMouseClicked

    private void pnl6SeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6SeMouseExited
        if(grupoSeleecionado==6){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl6Se.setBackground(new Color(243,156,18));
            subpnl6Se.setBackground(new Color(243,156,18));
        }else{
            pnl6Se.setBackground(new Color(41,128,185));
            subpnl6Se.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl6SeMouseExited

    private void pnl6SeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6SeMouseEntered
        pnl6Se.setBackground(new Color(0, 188, 212));
        subpnl6Se.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl6SeMouseEntered

    private void pnl6SeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6SeMouseClicked
        imageApp.setIcon(Imagen[31]);
        elemento = obj.dElemento(34);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl6SeMouseClicked

    private void pnl6SMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6SMouseExited
        if(grupoSeleecionado==6){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl6S.setBackground(new Color(243,156,18));
            subpnl6S.setBackground(new Color(243,156,18));
        }else{
            pnl6S.setBackground(new Color(41,128,185));
            subpnl6S.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl6SMouseExited

    private void pnl6SMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6SMouseEntered
        pnl6S.setBackground(new Color(0, 188, 212));
        subpnl6S.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl6SMouseEntered

    private void pnl6SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6SMouseClicked
        imageApp.setIcon(Imagen[30]);
        elemento = obj.dElemento(16);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl6SMouseClicked

    private void pnl6OMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6OMouseExited
        if(grupoSeleecionado==6){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl6O.setBackground(new Color(243,156,18));
            subpnl6O.setBackground(new Color(243,156,18));
        }else{
            pnl6O.setBackground(new Color(41,128,185));
            subpnl6O.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl6OMouseExited

    private void pnl6OMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6OMouseEntered
        pnl6O.setBackground(new Color(0, 188, 212));
        subpnl6O.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl6OMouseEntered

    private void pnl6OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6OMouseClicked
        imageApp.setIcon(Imagen[29]);
        elemento = obj.dElemento(8);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl6OMouseClicked

    private void pnl5BiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5BiMouseExited
        if(grupoSeleecionado==5){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl5Bi.setBackground(new Color(243,156,18));
            subpnl5Bi.setBackground(new Color(243,156,18));
        }else{
            pnl5Bi.setBackground(new Color(41,128,185));
            subpnl5Bi.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl5BiMouseExited

    private void pnl5BiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5BiMouseEntered
        pnl5Bi.setBackground(new Color(0, 188, 212));
        subpnl5Bi.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl5BiMouseEntered

    private void pnl5BiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5BiMouseClicked
        imageApp.setIcon(Imagen[28]);
        elemento = obj.dElemento(83);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl5BiMouseClicked

    private void pnl5SbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5SbMouseExited
        if(grupoSeleecionado==5){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl5Sb.setBackground(new Color(243,156,18));
            subpnl5Sb.setBackground(new Color(243,156,18));
        }else{
            pnl5Sb.setBackground(new Color(41,128,185));
            subpnl5Sb.setBackground(new Color(41,128,185));
        }

    }//GEN-LAST:event_pnl5SbMouseExited

    private void pnl5SbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5SbMouseEntered
        pnl5Sb.setBackground(new Color(0, 188, 212));
        subpnl5Sb.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl5SbMouseEntered

    private void pnl5SbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5SbMouseClicked
        imageApp.setIcon(Imagen[27]);
        elemento = obj.dElemento(51);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl5SbMouseClicked

    private void pnl5AsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5AsMouseExited
        if(grupoSeleecionado==5){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl5As.setBackground(new Color(243,156,18));
            subpnl5As.setBackground(new Color(243,156,18));
        }else{
            pnl5As.setBackground(new Color(41,128,185));
            subpnl5As.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl5AsMouseExited

    private void pnl5AsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5AsMouseEntered
        pnl5As.setBackground(new Color(0, 188, 212));
        subpnl5As.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl5AsMouseEntered

    private void pnl5AsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5AsMouseClicked
        imageApp.setIcon(Imagen[26]);
        elemento = obj.dElemento(33);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl5AsMouseClicked

    private void pnl5PMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5PMouseExited
        if(grupoSeleecionado==5){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl5P.setBackground(new Color(243,156,18));
            subpnl5P.setBackground(new Color(243,156,18));
        }else{
            pnl5P.setBackground(new Color(41,128,185));
            subpnl5P.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl5PMouseExited

    private void pnl5PMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5PMouseEntered
        pnl5P.setBackground(new Color(0, 188, 212));
        subpnl5P.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl5PMouseEntered

    private void pnl5PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5PMouseClicked
        imageApp.setIcon(Imagen[25]);
        elemento = obj.dElemento(15);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl5PMouseClicked

    private void pnl5NMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5NMouseExited
        if(grupoSeleecionado==5){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl5N.setBackground(new Color(243,156,18));
            subpnl5N.setBackground(new Color(243,156,18));
        }else{
            pnl5N.setBackground(new Color(41,128,185));
            subpnl5N.setBackground(new Color(41,128,185));
        }

    }//GEN-LAST:event_pnl5NMouseExited

    private void pnl5NMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5NMouseEntered
        pnl5N.setBackground(new Color(0, 188, 212));
        subpnl5N.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl5NMouseEntered

    private void pnl5NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5NMouseClicked
        imageApp.setIcon(Imagen[24]);
        elemento = obj.dElemento(7);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl5NMouseClicked

    private void pnl4PbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4PbMouseExited
        if(grupoSeleecionado==4){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl4Pb.setBackground(new Color(243,156,18));
            subpnl4Pb.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl4Pb.setBackground(new Color(41,128,185));
            subpnl4Pb.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl4PbMouseExited

    private void pnl4PbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4PbMouseEntered
        pnl4Pb.setBackground(new Color(0, 188, 212));
        subpnl4Pb.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl4PbMouseEntered

    private void pnl4PbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4PbMouseClicked
        imageApp.setIcon(Imagen[23]);
        elemento = obj.dElemento(82);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl4PbMouseClicked

    private void pnl4SnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4SnMouseExited
        if(grupoSeleecionado==4){ // Volver al color ROJO al sacar el mouse
            pnl4Sn.setBackground(new Color(243,156,18));
            subpnl4Sn.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl4Sn.setBackground(new Color(41,128,185));
            subpnl4Sn.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl4SnMouseExited

    private void pnl4SnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4SnMouseEntered
        pnl4Sn.setBackground(new Color(0, 188, 212));
        subpnl4Sn.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl4SnMouseEntered

    private void pnl4SnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4SnMouseClicked
        imageApp.setIcon(Imagen[22]);
        elemento = obj.dElemento(50);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl4SnMouseClicked

    private void pnl4GeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4GeMouseExited
        if(grupoSeleecionado==4){  // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl4Ge.setBackground(new Color(243,156,18));
            subpnl4Ge.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl4Ge.setBackground(new Color(41,128,185));
            subpnl4Ge.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl4GeMouseExited

    private void pnl4GeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4GeMouseEntered
        pnl4Ge.setBackground(new Color(0, 188, 212));
        subpnl4Ge.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl4GeMouseEntered

    private void pnl4GeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4GeMouseClicked
        imageApp.setIcon(Imagen[21]);
        elemento = obj.dElemento(32);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl4GeMouseClicked

    private void pnl4SiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4SiMouseExited
        if(grupoSeleecionado==4){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl4Si.setBackground(new Color(243,156,18));
            subpnl4sI.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl4Si.setBackground(new Color(41,128,185));
            subpnl4sI.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl4SiMouseExited

    private void pnl4SiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4SiMouseEntered
        pnl4Si.setBackground(new Color(0, 188, 212));
        subpnl4sI.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl4SiMouseEntered

    private void pnl4SiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4SiMouseClicked
        imageApp.setIcon(Imagen[20]);
        elemento = obj.dElemento(14);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl4SiMouseClicked

    private void pnl4CMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4CMouseExited
        if(grupoSeleecionado==4){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl4C.setBackground(new Color(243,156,18));
            subpnl4C.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl4C.setBackground(new Color(41,128,185));
            subpnl4C.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl4CMouseExited

    private void pnl4CMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4CMouseEntered
        pnl4C.setBackground(new Color(0, 188, 212));
        subpnl4C.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl4CMouseEntered

    private void pnl4CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4CMouseClicked
        imageApp.setIcon(Imagen[19]);
        elemento = obj.dElemento(6);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl4CMouseClicked

    private void pnl3TlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3TlMouseExited
        if(grupoSeleecionado==3){ // Si el grupo 3 está seleccionado, volver a colo amarillo al sacar mouse
            pnl3Tl.setBackground(new Color(243,156,18));
            subpnl3Tl.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl3Tl.setBackground(new Color(41,128,185));
            subpnl3Tl.setBackground(new Color(41,128,185));
        }

    }//GEN-LAST:event_pnl3TlMouseExited

    private void pnl3TlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3TlMouseEntered
        pnl3Tl.setBackground(new Color(0, 188, 212));
        subpnl3Tl.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl3TlMouseEntered

    private void pnl3TlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3TlMouseClicked
        imageApp.setIcon(Imagen[18]);
        elemento = obj.dElemento(81);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl3TlMouseClicked

    private void pnl3InMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3InMouseExited
        if(grupoSeleecionado==3){ // Si el grupo 3 está seleccionado, volver a colo amarillo al sacar mouse
            pnl3In.setBackground(new Color(243,156,18));
            subpnl3In.setBackground(new Color(243,156,18));
        }else{
            pnl3In.setBackground(new Color(41,128,185));
            subpnl3In.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl3InMouseExited

    private void pnl3InMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3InMouseEntered
        pnl3In.setBackground(new Color(0, 188, 212));        // TODO add your handling code here:
        subpnl3In.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl3InMouseEntered

    private void pnl3InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3InMouseClicked
        imageApp.setIcon(Imagen[17]);
        elemento = obj.dElemento(49);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl3InMouseClicked

    private void pnl3GaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3GaMouseExited
        if(grupoSeleecionado==3){ // Si el grupo 3 está seleccionado, volver a colo amarillo al sacar mouse
            pnl3Ga.setBackground(new Color(243,156,18));
            subpnl3Ga.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl3Ga.setBackground(new Color(41,128,185));
            subpnl3Ga.setBackground(new Color(41,128,185));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_pnl3GaMouseExited

    private void pnl3GaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3GaMouseEntered
        pnl3Ga.setBackground(new Color(0, 188, 212));
        subpnl3Ga.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl3GaMouseEntered

    private void pnl3GaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3GaMouseClicked
        imageApp.setIcon(Imagen[16]);
        elemento = obj.dElemento(31);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl3GaMouseClicked

    private void pnl3AlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3AlMouseExited
        if(grupoSeleecionado==3){ // Si el grupo 3 está seleccionado, volver a colo amarillo al sacar mouse
            pnl3Al.setBackground(new Color(243,156,18));
            subpnl3Al.setBackground(new Color(243,156,18));
        }else{ //Sino, volver al color azul al sacar mouse
            pnl3Al.setBackground(new Color(41,128,185));
            subpnl3Al.setBackground(new Color(41,128,185));
        }       // TODO add your handling code here:
    }//GEN-LAST:event_pnl3AlMouseExited

    private void pnl3AlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3AlMouseEntered
        pnl3Al.setBackground(new Color(0, 188, 212));
        subpnl3Al.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl3AlMouseEntered

    private void pnl3AlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3AlMouseClicked
        imageApp.setIcon(Imagen[15]);
        elemento = obj.dElemento(13);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl3AlMouseClicked

    private void pnl3BMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3BMouseExited
        if(grupoSeleecionado==3){ // Si el grupo 3 está seleccionado, volver a colo amarillo al sacar mouse
            pnl3B.setBackground(new Color(243,156,18));
            subpnl3B.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl3B.setBackground(new Color(41,128,185));
            subpnl3B.setBackground(new Color(41,128,185));
        }  // TODO add your handling code here:
    }//GEN-LAST:event_pnl3BMouseExited

    private void pnl3BMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3BMouseEntered
        pnl3B.setBackground(new Color(0, 188, 212));        // TODO add your handling code here:
        subpnl3B.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl3BMouseEntered

    private void pnl3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3BMouseClicked
        imageApp.setIcon(Imagen[14]);
        elemento = obj.dElemento(5);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl3BMouseClicked

    private void pnl2RaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2RaMouseExited
        if(grupoSeleecionado==2){ // Si el grupo 2 está seleccionado, volver a colo amarillo al sacar mouse
            pnl2Ra.setBackground(new Color(243,156,18));
            subpnl2Ra.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl2Ra.setBackground(new Color(41,128,185));
            subpnl2Ra.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl2RaMouseExited

    private void pnl2RaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2RaMouseEntered
        pnl2Ra.setBackground(new Color(0, 188, 212));
        subpnl2Ra.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl2RaMouseEntered

    private void pnl2RaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2RaMouseClicked
        imageApp.setIcon(Imagen[13]);
        elemento = obj.dElemento(88);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl2RaMouseClicked

    private void pnl2BaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2BaMouseExited
        if(grupoSeleecionado==2){ /// Si el grupo 2 está seleccionado, volver a colo amarillo al sacar mouse
            pnl2Ba.setBackground(new Color(243,156,18));
            subpnl2Ba.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl2Ba.setBackground(new Color(41,128,185));
            subpnl2Ba.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl2BaMouseExited

    private void pnl2BaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2BaMouseEntered
        pnl2Ba.setBackground(new Color(0, 188, 212));
        subpnl2Ba.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl2BaMouseEntered

    private void pnl2BaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2BaMouseClicked
        imageApp.setIcon(Imagen[12]);
        elemento = obj.dElemento(56);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl2BaMouseClicked

    private void pnl2SrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2SrMouseExited
        if(grupoSeleecionado==2){ // Si el grupo 2 está seleccionado, volver a colo amarillo al sacar mouse
            pnl2Sr.setBackground(new Color(243,156,18));
            subpnl2Sr.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl2Sr.setBackground(new Color(41,128,185));
            subpnl2Sr.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl2SrMouseExited

    private void pnl2SrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2SrMouseEntered
        pnl2Sr.setBackground(new Color(0, 188, 212));
        subpnl2Sr.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl2SrMouseEntered

    private void pnl2SrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2SrMouseClicked
        imageApp.setIcon(Imagen[11]);
        elemento = obj.dElemento(38);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl2SrMouseClicked

    private void pnl2CaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2CaMouseExited
        if(grupoSeleecionado==2){// Si el grupo 2 está seleccionado, volver a colo amarillo al sacar mouse
            pnl2Ca.setBackground(new Color(243,156,18));
            subpnl2Ca.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl2Ca.setBackground(new Color(41,128,185));
            subpnl2Ca.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl2CaMouseExited

    private void pnl2CaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2CaMouseEntered
        pnl2Ca.setBackground(new Color(0, 188, 212));
        subpnl2Ca.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl2CaMouseEntered

    private void pnl2CaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2CaMouseClicked
        imageApp.setIcon(Imagen[10]);
        elemento = obj.dElemento(20);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl2CaMouseClicked

    private void pnl2MgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2MgMouseExited
        if(grupoSeleecionado==2){ // Si el grupo 2 está seleccionado, volver a colo amarillo al sacar mouse
            pnl2Mg.setBackground(new Color(243,156,18));
            subpnl2Mg.setBackground(new Color(243,156,18));
        }else{ //Sino, volver al color azul al sacar mouse
            pnl2Mg.setBackground(new Color(41,128,185));
            subpnl2Mg.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl2MgMouseExited

    private void pnl2MgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2MgMouseEntered
        pnl2Mg.setBackground(new Color(0, 188, 212));
        subpnl2Mg.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl2MgMouseEntered

    private void pnl2MgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2MgMouseClicked
        imageApp.setIcon(Imagen[9]);
        elemento = obj.dElemento(12);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl2MgMouseClicked

    private void pnl2BeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2BeMouseExited
        if(grupoSeleecionado==2){ // Si el grupo 2 está seleccionado, volver a colo amarillo al sacar mouse
            pnl2Be.setBackground(new Color(243,156,18));
            subpnl2Be.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl2Be.setBackground(new Color(41,128,185));
            subpnl2Be.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl2BeMouseExited

    private void pnl2BeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2BeMouseEntered
        pnl2Be.setBackground(new Color(0, 188, 212));
        subpnl2Be.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl2BeMouseEntered

    private void pnl2BeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2BeMouseClicked
        imageApp.setIcon(Imagen[8]);
        elemento = obj.dElemento(4);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl2BeMouseClicked

    private void pnl1FrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1FrMouseExited
        if(grupoSeleecionado==1){ // Si el grupo 1 está seleccionado, volver a colo amarillo al sacar mouse
            pnl1Fr.setBackground(new Color(243,156,18));
            subpnl1Fr.setBackground(new Color(243,156,18));
        }else{  //Sino, volver al color azul al sacar mouse
            pnl1Fr.setBackground(new Color(41,128,185)); // panel donde se ubica el simbolo químico
            subpnl1Fr.setBackground(new Color(41,128,185)); 
        }
    }//GEN-LAST:event_pnl1FrMouseExited

    private void pnl1FrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1FrMouseEntered
        pnl1Fr.setBackground(new Color(0, 188, 212));
        subpnl1Fr.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl1FrMouseEntered

    private void pnl1FrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1FrMouseClicked
        imageApp.setIcon(Imagen[7]);
        elemento = obj.dElemento(87);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl1FrMouseClicked

    private void pnl1CsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1CsMouseExited
        if(grupoSeleecionado==1){ // Si el grupo 1 está seleccionado, volver a colo amarillo al sacar mouse
            pnl1Cs.setBackground(new Color(243,156,18));
            subpnl1Cs.setBackground(new Color(243,156,18));
        }else{ //Sino, volver al color azul al sacar mouse
            pnl1Cs.setBackground(new Color(41,128,185));  // panel donde se ubica el simbolo químico
            subpnl1Cs.setBackground(new Color(41,128,185));
        }

    }//GEN-LAST:event_pnl1CsMouseExited

    private void pnl1CsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1CsMouseEntered
        pnl1Cs.setBackground(new Color(0, 188, 212));
        subpnl1Cs.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl1CsMouseEntered

    private void pnl1CsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1CsMouseClicked
        imageApp.setIcon(Imagen[6]);
        elemento = obj.dElemento(55);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl1CsMouseClicked

    private void pnl1RbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1RbMouseExited
        if(grupoSeleecionado==1){  // Si el grupo 1 está seleccionado, volver a colo amarillo al sacar mouse
            pnl1Rb.setBackground(new Color(243,156,18));
            subpnl1Rb.setBackground(new Color(243,156,18));
        }else{ //Sino, volver al color azul al sacar mouse
            pnl1Rb.setBackground(new Color(41,128,185));
            subpnl1Rb.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl1RbMouseExited

    private void pnl1RbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1RbMouseEntered
        pnl1Rb.setBackground(new Color(0, 188, 212));
        subpnl1Rb.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl1RbMouseEntered

    private void pnl1RbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1RbMouseClicked
        imageApp.setIcon(Imagen[5]);
        elemento = obj.dElemento(37);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl1RbMouseClicked

    private void pnl1KMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1KMouseExited
        if(grupoSeleecionado==1){  // Si el grupo 1 está seleccionado, volver a colo amarillo al sacar mouse
            pnl1K.setBackground(new Color(243,156,18));
            subpnl1K.setBackground(new Color(243,156,18));
        }else{ //Sino, volver al color azul al sacar mouse
            pnl1K.setBackground(new Color(41,128,185));
            subpnl1K.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl1KMouseExited

    private void pnl1KMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1KMouseEntered
        pnl1K.setBackground(new Color(0, 188, 212));
        subpnl1K.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl1KMouseEntered

    private void pnl1KMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1KMouseClicked
        imageApp.setIcon(Imagen[4]);
        elemento = obj.dElemento(19);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl1KMouseClicked

    private void pnl1NaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1NaMouseExited
        if(grupoSeleecionado==1){ // Si el grupo 4 está seleccionado, volver a colo amarillo al sacar mouse
            pnl1Na.setBackground(new Color(243,156,18));
            subpnl1Na.setBackground(new Color(243,156,18));
        }else{
            pnl1Na.setBackground(new Color(41,128,185));
            subpnl1Na.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl1NaMouseExited

    private void pnl1NaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1NaMouseEntered
        pnl1Na.setBackground(new Color(0, 188, 212));
        subpnl1Na.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl1NaMouseEntered

    private void pnl1NaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1NaMouseClicked
        imageApp.setIcon(Imagen[3]);
        elemento = obj.dElemento(11);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl1NaMouseClicked

    private void pnlLiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLiMouseExited
        if(grupoSeleecionado==1){ // Si el grupo 1 está seleccionado, volver a colo amarillo al sacar mouse
            pnlLi.setBackground(new Color(243,156,18));
            subpnl1Li.setBackground(new Color(243,156,18));
        }else{ //Sino, volver al color azul al sacar mouse
            pnlLi.setBackground(new Color(41,128,185));
            subpnl1Li.setBackground(new Color(41,128,185)); 
        }
    }//GEN-LAST:event_pnlLiMouseExited

    private void pnlLiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLiMouseEntered

        pnlLi.setBackground(new Color(0, 188, 212));
        subpnl1Li.setBackground(new Color(0, 188, 212));

    }//GEN-LAST:event_pnlLiMouseEntered

    private void pnlLiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLiMouseClicked
        imageApp.setIcon(Imagen[2]);
        elemento = obj.dElemento(3);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnlLiMouseClicked

    private void pnl1HMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1HMouseExited
        if(grupoSeleecionado==1){ // Si el grupo 1 está seleccionado, volver a colo amarillo al sacar mouse
            pnl1H.setBackground(new Color(243,156,18));
            subpnl1H.setBackground(new Color(243,156,18));
        }else{ //Sino, volver al color azul al sacar mouse
            pnl1H.setBackground(new Color(41,128,185));
            subpnl1H.setBackground(new Color(41,128,185));
        }
    }//GEN-LAST:event_pnl1HMouseExited

    private void pnl1HMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1HMouseEntered
        pnl1H.setBackground(new Color(0, 188, 212));
        subpnl1H.setBackground(new Color(0, 188, 212));
    }//GEN-LAST:event_pnl1HMouseEntered

    private void pnl1HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1HMouseClicked
        imageApp.setIcon(Imagen[1]);
        elemento = obj.dElemento(1);
        desZ.setText(""+elemento.getZ());
        desNombre.setText(elemento.getNombreE());
        desSimbolo.setText(elemento.getSimbolo());
        desPeso.setText(""+elemento.getPeso());
    }//GEN-LAST:event_pnl1HMouseClicked

    private void subpnl1HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl1HMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txtH.setText("H");
                mnemo1H.setText("");
                bien++;
                break;
            }
            case 2:{
                txtLi.setText("H");
                mnemo1H.setText("");
                mal++;
                break;
            }
            case 3:{
                txtNa.setText("H");
                mnemo1H.setText("");
                mal++;
                break;
            }
            case 4:{
                txt1K.setText("H");
                mnemo1H.setText("");
                mal++;
                break;
            }
            case 5:{
                txt1Rb.setText("H");
                mnemo1H.setText("");
                mal++;
                break;
            }
            case 6:{
                txt1Cs.setText("H");
                mnemo1H.setText("");
                mal++;
                break;
            }
            case 7:{
                txt1Fr.setText("H");
                mnemo1H.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
       
    }//GEN-LAST:event_subpnl1HMouseClicked

    private void subpnl1NaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl1NaMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txtH.setText("Na");
                mnemo1Na.setText("");
                mal++;
                break;
            }
            case 2:{
                txtLi.setText("Na");
                mnemo1Na.setText("");
                mal++;
                break;
            }
            case 3:{
                txtNa.setText("Na");
                mnemo1Na.setText("");
                bien++;
                break;
            }
            case 4:{
                txt1K.setText("Na");
                mnemo1Na.setText("");
                mal++;
                break;
            }
            case 5:{
                txt1Rb.setText("Na");
                mnemo1Na.setText("");
                mal++;
                break;
            }
            case 6:{
                txt1Cs.setText("Na");
                mnemo1Na.setText("");
                mal++;
                break;
            }
            case 7:{
                txt1Fr.setText("Na");
                mnemo1Na.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl1NaMouseClicked

    private void subpnl1LiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl1LiMouseClicked
       clic++;
        switch(clic){
            case 1:{
                txtH.setText("Li");
                mnemo1Li.setText("");
                mal++;
                break;
            }
            case 2:{
                txtLi.setText("Li");
                mnemo1Li.setText("");
                bien++;
                break;
            }
            case 3:{
                txtNa.setText("Li");
                mnemo1Li.setText("");
                mal++;
                break;
            }
            case 4:{
                txt1K.setText("Li");
                mnemo1Li.setText("");
                mal++;
                break;
            }
            case 5:{
                txt1Rb.setText("Li");
                mnemo1Li.setText("");
                mal++;
                break;
            }
            case 6:{
                txt1Cs.setText("Li");
                mnemo1Li.setText("");
                mal++;
                break;
            }
            case 7:{
                txt1Fr.setText("Li");
                mnemo1Li.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl1LiMouseClicked

    private void subpnl1KMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl1KMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txtH.setText("K");
                mnemo1K.setText("");
                mal++;
                break;
            }
            case 2:{
                txtLi.setText("K");
                mnemo1K.setText("");
                mal++;
                break;
            }
            case 3:{
                txtNa.setText("K");
                mnemo1K.setText("");
                mal++;
                break;
            }
            case 4:{
                txt1K.setText("K");
                mnemo1K.setText("");
                bien++;
                break;
            }
            case 5:{
                txt1Rb.setText("K");
                mnemo1K.setText("");
                mal++;
                break;
            }
            case 6:{
                txt1Cs.setText("K");
                mnemo1K.setText("");
                mal++;
                break;
            }
            case 7:{
                txt1Fr.setText("K");
                mnemo1K.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl1KMouseClicked

    private void subpnl1RbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl1RbMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txtH.setText("Rb");
                mnemo1Rb.setText("");
                mal++;
                break;
            }
            case 2:{
                txtLi.setText("Rb");
                mnemo1Rb.setText("");
                mal++;
                break;
            }
            case 3:{
                txtNa.setText("Rb");
                mnemo1Rb.setText("");
                mal++;
                break;
            }
            case 4:{
                txt1K.setText("Rb");
                mnemo1Rb.setText("");
                mal++;
                break;
            }
            case 5:{
                txt1Rb.setText("Rb");
                mnemo1Rb.setText("");
                bien++;
                break;
            }
            case 6:{
                txt1Cs.setText("Rb");
                mnemo1Rb.setText("");
                mal++;
                break;
            }
            case 7:{
                txt1Fr.setText("Rb");
                mnemo1Rb.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl1RbMouseClicked

    private void subpnl1CsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl1CsMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txtH.setText("Cs");
                mnemo1Cs.setText("");
                mal++;
                break;
            }
            case 2:{
                txtLi.setText("Cs");
                mnemo1Cs.setText("");
                mal++;
                break;
            }
            case 3:{
                txtNa.setText("Cs");
                mnemo1Cs.setText("");
                mal++;
                break;
            }
            case 4:{
                txt1K.setText("Cs");
                mnemo1Cs.setText("");
                mal++;
                break;
            }
            case 5:{
                txt1Rb.setText("Cs");
                mnemo1Cs.setText("");
                mal++;
                break;
            }
            case 6:{
                txt1Cs.setText("Cs");
                mnemo1Cs.setText("");
                bien++;
                break;
            }
            case 7:{
                txt1Fr.setText("Cs");
                mnemo1Cs.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl1CsMouseClicked

    private void subpnl1FrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl1FrMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txtH.setText("Fr");
                mnemo1Fr.setText("");
                mal++;
                break;
            }
            case 2:{
                txtLi.setText("Fr");
                 mnemo1Fr.setText("");
                mal++;
                break;
            }
            case 3:{
                txtNa.setText("Fr");
                 mnemo1Fr.setText("");
                mal++;
                break;
            }
            case 4:{
                txt1K.setText("Fr");
                 mnemo1Fr.setText("");
                mal++;
                break;
            }
            case 5:{
                txt1Rb.setText("Fr");
                mnemo1Fr.setText("");
                mal++;
                break;
            }
            case 6:{
                txt1Cs.setText("Fr");
                mnemo1Fr.setText("");
                mal++;
                break;
            }
            case 7:{
                txt1Fr.setText("Fr");
                mnemo1Fr.setText("");
                bien++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl1FrMouseClicked

    private void subpnl2BeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl2BeMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt2Be.setText("Be");
                mnemo2Be.setText("");
                bien++;
                break;
            }
            case 2:{
                txt2Mg.setText("Be");
                mnemo2Be.setText("");
                mal++;
                break;
            }
            case 3:{
                txt2Ca.setText("Be");
                mnemo2Be.setText("");
                mal++;
                break;
            }
            case 4:{
                txt2Sr.setText("Be");
                mnemo2Be.setText("");
                mal++;
                break;
            }
            case 5:{
                txt2Ba.setText("Be");
                mnemo2Be.setText("");
                mal++;
                break;
            }
            case 6:{
                txt2Ra.setText("Be");
                mnemo2Be.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl2BeMouseClicked

    private void subpnl2MgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl2MgMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt2Be.setText("Mg");
                mnemo2Mg.setText("");
                mal++;
                break;
            }
            case 2:{
                txt2Mg.setText("Mg");
                mnemo2Mg.setText("");
                bien++;
                break;
            }
            case 3:{
                txt2Ca.setText("Mg");
                mnemo2Mg.setText("");
                mal++;
                break;
            }
            case 4:{
                txt2Sr.setText("Mg");
                mnemo2Mg.setText("");
                mal++;
                break;
            }
            case 5:{
                txt2Ba.setText("Mg");
                mnemo2Mg.setText("");
                mal++;
                break;
            }
            case 6:{
                txt2Ra.setText("Mg");
                mnemo2Mg.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl2MgMouseClicked

    private void subpnl2CaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl2CaMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt2Be.setText("Ca");
                mnemo2Ca.setText("");
                mal++;
                break;
            }
            case 2:{
                txt2Mg.setText("Ca");
                mnemo2Ca.setText("");
                mal++;
                break;
            }
            case 3:{
                txt2Ca.setText("Ca");
                mnemo2Ca.setText("");
                bien++;
                break;
            }
            case 4:{
                txt2Sr.setText("Ca");
                mnemo2Ca.setText("");
                mal++;
                break;
            }
            case 5:{
                txt2Ba.setText("Ca");
                mnemo2Ca.setText("");
                mal++;
                break;
            }
            case 6:{
                txt2Ra.setText("Ca");
                mnemo2Ca.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl2CaMouseClicked

    private void subpnl2SrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl2SrMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt2Be.setText("Sr");
                mnemo2Sr.setText("");
                mal++;
                break;
            }
            case 2:{
                txt2Mg.setText("Sr");
                mnemo2Sr.setText("");
                mal++;
                break;
            }
            case 3:{
                txt2Ca.setText("Sr");
                mnemo2Sr.setText("");
                mal++;
                break;
            }
            case 4:{
                txt2Sr.setText("Sr");
                mnemo2Sr.setText("");
                bien++;
                break;
            }
            case 5:{
                txt2Ba.setText("Sr");
                mnemo2Sr.setText("");
                mal++;
                break;
            }
            case 6:{
                txt2Ra.setText("Sr");
                mnemo2Sr.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl2SrMouseClicked

    private void subpnl2BaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl2BaMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt2Be.setText("Ba");
                mnemo2Ba.setText("");
                mal++;
                break;
            }
            case 2:{
                txt2Mg.setText("Ba");
                mnemo2Ba.setText("");
                mal++;
                break;
            }
            case 3:{
                txt2Ca.setText("Ba");
                mnemo2Ba.setText("");
                mal++;
                break;
            }
            case 4:{
                txt2Sr.setText("Ba");
                mnemo2Ba.setText("");
                mal++;
                break;
            }
            case 5:{
                txt2Ba.setText("Ba");
                mnemo2Ba.setText("");
                bien++;
                break;
            }
            case 6:{
                txt2Ra.setText("Ba");
                mnemo2Ba.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl2BaMouseClicked

    private void subpnl2RaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl2RaMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt2Be.setText("Ra");
                mnemo2Ra.setText("");
                mal++;
                break;
            }
            case 2:{
                txt2Mg.setText("Ra");
                mnemo2Ra.setText("");
                mal++;
                break;
            }
            case 3:{
                txt2Ca.setText("Ra");
                mnemo2Ra.setText("");
                mal++;
                break;
            }
            case 4:{
                txt2Sr.setText("Ra");
                mnemo2Ra.setText("");
                mal++;
                break;
            }
            case 5:{
                txt2Ba.setText("Ra");
                mnemo2Ra.setText("");
                mal++;
                break;
            }
            case 6:{
                txt2Ra.setText("Ra");
                mnemo2Ra.setText("");
                bien++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl2RaMouseClicked

    private void subpnl3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl3BMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt3B.setText("B");
                mnemo3B.setText("");
                bien++;
                break;
            }
            case 2:{
                txt3Al.setText("B");
                mnemo3B.setText("");
                mal++;
                break;
            }
            case 3:{
                txt3Ga.setText("B");
                mnemo3B.setText("");
                mal++;
                break;
            }
            case 4:{
                txt3In.setText("B");
                mnemo3B.setText("");
                mal++;
                break;
            }
            case 5:{
                txt3Tl.setText("B");
                mnemo3B.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl3BMouseClicked

    private void subpnl3AlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl3AlMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt3B.setText("Al");
                mnemo3Al.setText("");
                mal++;
                break;
            }
            case 2:{
                txt3Al.setText("Al");
                mnemo3Al.setText("");
                bien++;
                break;
            }
            case 3:{
                txt3Ga.setText("Al");
                mnemo3Al.setText("");
                mal++;
                break;
            }
            case 4:{
                txt3In.setText("Al");
                mnemo3Al.setText("");
                mal++;
                break;
            }
            case 5:{
                txt3Tl.setText("Al");
                mnemo3Al.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl3AlMouseClicked

    private void subpnl3GaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl3GaMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt3B.setText("Ga");
                mnemo3Ga.setText("");
                mal++;
                break;
            }
            case 2:{
                txt3Al.setText("Ga");
                mnemo3Ga.setText("");
                mal++;
                break;
            }
            case 3:{
                txt3Ga.setText("Ga");
                mnemo3Ga.setText("");
                bien++;
                break;
            }
            case 4:{
                txt3In.setText("Ga");
                mnemo3Ga.setText("");
                mal++;
                break;
            }
            case 5:{
                txt3Tl.setText("Ga");
                mnemo3Ga.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl3GaMouseClicked

    private void subpnl3InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl3InMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt3B.setText("In");
                mnemo3In.setText("");
                mal++;
                break;
            }
            case 2:{
                txt3Al.setText("In");
                mnemo3In.setText("");
                mal++;
                break;
            }
            case 3:{
                txt3Ga.setText("In");
                mnemo3In.setText("");
                mal++;
                break;
            }
            case 4:{
                txt3In.setText("In");
                mnemo3In.setText("");
                bien++;
                break;
            }
            case 5:{
                txt3Tl.setText("In");
                mnemo3In.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl3InMouseClicked

    private void subpnl3TlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl3TlMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt3B.setText("Tl");
                mnemo3Tl.setText("");
                mal++;
                break;
            }
            case 2:{
                txt3Al.setText("Tl");
                mnemo3Tl.setText("");
                mal++;
                break;
            }
            case 3:{
                txt3Ga.setText("Tl");
                mnemo3Tl.setText("");
                mal++;
                break;
            }
            case 4:{
                txt3In.setText("Tl");
                mnemo3Tl.setText("");
                mal++;
                break;
            }
            case 5:{
                txt3Tl.setText("Tl");
                mnemo3Tl.setText("");
                bien++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl3TlMouseClicked

    private void subpnl4CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl4CMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt4C.setText("C");
                mnemo4C.setText("");
                bien++;
                break;
            }
            case 2:{
                txt4Si.setText("C");
                mnemo4C.setText("");
                mal++;
                break;
            }
            case 3:{
                txt4Ge.setText("C");
                mnemo4C.setText("");
                mal++;
                break;
            }
            case 4:{
                txt4Sn.setText("C");
                mnemo4C.setText("");
                mal++;
                break;
            }
            case 5:{
                txt4Pb.setText("C");
                mnemo4C.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl4CMouseClicked

    private void subpnl4sIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl4sIMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt4C.setText("Si");
                mnemo4sI.setText("");
                mal++;
                break;
            }
            case 2:{
                txt4Si.setText("Si");
                mnemo4sI.setText("");
                bien++;
                break;
            }
            case 3:{
                txt4Ge.setText("Si");
                mnemo4sI.setText("");
                mal++;
                break;
            }
            case 4:{
                txt4Sn.setText("Si");
                mnemo4sI.setText("");
                mal++;
                break;
            }
            case 5:{
                txt4Pb.setText("Si");
                mnemo4sI.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl4sIMouseClicked

    private void subpnl4GeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl4GeMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt4C.setText("Ge");
                mnemo4Ge.setText("");
                mal++;
                break;
            }
            case 2:{
                txt4Si.setText("Ge");
                mnemo4Ge.setText("");
                mal++;
                break;
            }
            case 3:{
                txt4Ge.setText("Ge");
                mnemo4Ge.setText("");
                bien++;
                break;
            }
            case 4:{
                txt4Sn.setText("Ge");
                mnemo4Ge.setText("");
                mal++;
                break;
            }
            case 5:{
                txt4Pb.setText("Ge");
                mnemo4Ge.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl4GeMouseClicked

    private void subpnl4SnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl4SnMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt4C.setText("Sn");
                mnemo4Sn.setText("");
                mal++;
                break;
            }
            case 2:{
                txt4Si.setText("Sn");
                mnemo4Sn.setText("");
                mal++;
                break;
            }
            case 3:{
                txt4Ge.setText("Sn");
                mnemo4Sn.setText("");
                mal++;
                break;
            }
            case 4:{
                txt4Sn.setText("Sn");
                mnemo4Sn.setText("");
                bien++;
                break;
            }
            case 5:{
                txt4Pb.setText("Sn");
                mnemo4Sn.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl4SnMouseClicked

    private void subpnl4PbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl4PbMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt4C.setText("Pb");
                mnemo4Pb.setText("");
                mal++;
                break;
            }
            case 2:{
                txt4Si.setText("Pb");
                mnemo4Pb.setText("");
                mal++;
                break;
            }
            case 3:{
                txt4Ge.setText("Pb");
                mnemo4Pb.setText("");
                mal++;
                break;
            }
            case 4:{
                txt4Sn.setText("Pb");
                mnemo4Pb.setText("");
                mal++;
                break;
            }
            case 5:{
                txt4Pb.setText("Pb");
                mnemo4Pb.setText("");
                bien++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl4PbMouseClicked

    private void subpnl5NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl5NMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt5N.setText("N");
                mnemo5N.setText("");
                bien++;
                break;
            }
            case 2:{
                txt5P.setText("N");
                mnemo5N.setText("");
                mal++;
                break;
            }
            case 3:{
                txt5As.setText("N");
                mnemo5N.setText("");
                mal++;
                break;
            }
            case 4:{
                txt5Sb.setText("N");
                mnemo5N.setText("");
                mal++;
                break;
            }
            case 5:{
                txt5Bi.setText("N");
                mnemo5N.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl5NMouseClicked

    private void subpnl5PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl5PMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt5N.setText("P");
                mnemo5P.setText("");
                mal++;
                break;
            }
            case 2:{
                txt5P.setText("P");
                mnemo5P.setText("");
                bien++;
                break;
            }
            case 3:{
                txt5As.setText("P");
                mnemo5P.setText("");
                mal++;
                break;
            }
            case 4:{
                txt5Sb.setText("P");
                mnemo5P.setText("");
                mal++;
                break;
            }
            case 5:{
                txt5Bi.setText("P");
                mnemo5P.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl5PMouseClicked

    private void subpnl5AsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl5AsMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt5N.setText("As");
                mnemo5As.setText("");
                mal++;
                break;
            }
            case 2:{
                txt5P.setText("As");
                mnemo5As.setText("");
                mal++;
                break;
            }
            case 3:{
                txt5As.setText("As");
                mnemo5As.setText("");
                bien++;
                break;
            }
            case 4:{
                txt5Sb.setText("As");
                mnemo5As.setText("");
                mal++;
                break;
            }
            case 5:{
                txt5Bi.setText("As");
                mnemo5As.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl5AsMouseClicked

    private void subpnl5SbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl5SbMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt5N.setText("Sb");
                mnemo5Sb.setText("");
                mal++;
                break;
            }
            case 2:{
                txt5P.setText("Sb");
                mnemo5Sb.setText("");
                mal++;
                break;
            }
            case 3:{
                txt5As.setText("Sb");
                mnemo5Sb.setText("");
                mal++;
                break;
            }
            case 4:{
                txt5Sb.setText("Sb");
                mnemo5Sb.setText("");
                bien++;
                break;
            }
            case 5:{
                txt5Bi.setText("Sb");
                mnemo5Sb.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl5SbMouseClicked

    private void subpnl5BiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl5BiMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt5N.setText("Bi");
                mnemo5Bi.setText("");
                mal++;
                break;
            }
            case 2:{
                txt5P.setText("Bi");
                mnemo5Bi.setText("");
                mal++;
                break;
            }
            case 3:{
                txt5As.setText("Bi");
                mnemo5Bi.setText("");
                mal++;
                break;
            }
            case 4:{
                txt5Sb.setText("Bi");
                mnemo5Bi.setText("");
                mal++;
                break;
            }
            case 5:{
                txt5Bi.setText("Bi");
                mnemo5Bi.setText("");
                bien++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl5BiMouseClicked

    private void subpnl6OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl6OMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt6O.setText("O");
                mnemo6O.setText("");
                bien++;
                break;
            }
            case 2:{
                txt6S.setText("O");
                mnemo6O.setText("");
                mal++;
                break;
            }
            case 3:{
                txt6Se.setText("O");
                mnemo6O.setText("");
                mal++;
                break;
            }
            case 4:{
                txt6Te.setText("O");
                mnemo6O.setText("");
                mal++;
                break;
            }
            case 5:{
                txt6Po.setText("O");
                mnemo6O.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl6OMouseClicked

    private void subpnl6SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl6SMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt6O.setText("S");
                mnemo6S.setText("");
                mal++;
                break;
            }
            case 2:{
                txt6S.setText("S");
                mnemo6S.setText("");
                bien++;
                break;
            }
            case 3:{
                txt6Se.setText("S");
                mnemo6S.setText("");
                mal++;
                break;
            }
            case 4:{
                txt6Te.setText("S");
                mnemo6S.setText("");
                mal++;
                break;
            }
            case 5:{
                txt6Po.setText("S");
                mnemo6S.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl6SMouseClicked

    private void subpnl6SeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl6SeMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt6O.setText("Se");
                mnemo6Se.setText("");
                mal++;
                break;
            }
            case 2:{
                txt6S.setText("Se");
                mnemo6Se.setText("");
                mal++;
                break;
            }
            case 3:{
                txt6Se.setText("Se");
                mnemo6Se.setText("");
                bien++;
                break;
            }
            case 4:{
                txt6Te.setText("Se");
                mnemo6Se.setText("");
                mal++;
                break;
            }
            case 5:{
                txt6Po.setText("Se");
                mnemo6Se.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl6SeMouseClicked

    private void subpnl6TeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl6TeMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt6O.setText("Te");
                mnemo6Te.setText("");
                mal++;
                break;
            }
            case 2:{
                txt6S.setText("Te");
                mnemo6Te.setText("");
                mal++;
                break;
            }
            case 3:{
                txt6Se.setText("Te");
                mnemo6Te.setText("");
                mal++;
                break;
            }
            case 4:{
                txt6Te.setText("Te");
                mnemo6Te.setText("");
                bien++;
                break;
            }
            case 5:{
                txt6Po.setText("Te");
                mnemo6Te.setText("");
                mal++;
               frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl6TeMouseClicked

    private void subpnl6PoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl6PoMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt6O.setText("Po");
                mnemo6Po.setText("");
                mal++;
                break;
            }
            case 2:{
                txt6S.setText("Po");
                mnemo6Po.setText("");
                mal++;
                break;
            }
            case 3:{
                txt6Se.setText("Po");
                mnemo6Po.setText("");
                mal++;
                break;
            }
            case 4:{
                txt6Te.setText("Po");
                mnemo6Po.setText("");
                mal++;
                break;
            }
            case 5:{
                txt6Po.setText("Po");
                mnemo6Po.setText("");
                bien++;
               
                break;
            }
                 
        }
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
    }//GEN-LAST:event_subpnl6PoMouseClicked

    private void subpnl7FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl7FMouseClicked
       clic++;
        switch(clic){
            case 1:{
                txt7F.setText("F");
                mnemo7F.setText("");
                bien++;
                break;
            }
            case 2:{
                txt7Cl.setText("F");
                mnemo7F.setText("");
                mal++;
                break;
            }
            case 3:{
                txt7Br.setText("F");
                mnemo7F.setText("");
                mal++;
                break;
            }
            case 4:{
                txt7I.setText("F");
                mnemo7F.setText("");
                mal++;
                break;
            }
            case 5:{
                txt7At.setText("F");
                mnemo7F.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl7FMouseClicked

    private void subpnl7ClMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl7ClMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt7F.setText("Cl");
                mnemo7Cl.setText("");
                mal++;
                break;
            }
            case 2:{
                txt7Cl.setText("Cl");
                mnemo7Cl.setText("");
                bien++;
                break;
            }
            case 3:{
                txt7Br.setText("Cl");
                mnemo7Cl.setText("");
                mal++;
                break;
            }
            case 4:{
                txt7I.setText("Cl");
                mnemo7Cl.setText("");
                mal++;
                break;
            }
            case 5:{
                txt7At.setText("Cl");
                mnemo7Cl.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl7ClMouseClicked

    private void subpnl7BrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl7BrMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt7F.setText("Br");
                mnemo7Br.setText("");
                mal++;
                break;
            }
            case 2:{
                txt7Cl.setText("Br");
                mnemo7Br.setText("");
                mal++;
                break;
            }
            case 3:{
                txt7Br.setText("Br");
                mnemo7Br.setText("");
                bien++;
                break;
            }
            case 4:{
                txt7I.setText("Br");
                mnemo7Br.setText("");
                mal++;
                break;
            }
            case 5:{
                txt7At.setText("Br");
                mnemo7Br.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl7BrMouseClicked

    private void subpnl7IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl7IMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt7F.setText("I");
                mnemo7I.setText("");
                mal++;
                break;
            }
            case 2:{
                txt7Cl.setText("I");
                mnemo7I.setText("");
                mal++;
                break;
            }
            case 3:{
                txt7Br.setText("I");
                mnemo7I.setText("");
                mal++;
                break;
            }
            case 4:{
                txt7I.setText("I");
                mnemo7I.setText("");
                bien++;
                break;
            }
            case 5:{
                txt7At.setText("I");
                mnemo7I.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl7IMouseClicked

    private void subpnl7AtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl7AtMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt7F.setText("At");
                mnemo7At.setText("");
                mal++;
                break;
            }
            case 2:{
                txt7Cl.setText("At");
                mnemo7At.setText("");
                mal++;
                break;
            }
            case 3:{
                txt7Br.setText("At");
                mnemo7At.setText("");
                mal++;
                break;
            }
            case 4:{
                txt7I.setText("At");
                mnemo7At.setText("");
                mal++;
                break;
            }
            case 5:{
                txt7At.setText("At");
                mnemo7At.setText("");
                bien++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl7AtMouseClicked

    private void subpanelPracticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpanelPracticaMouseClicked
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/ElementoR/modo2.wav"));
        Sound.play();
        subpanelPractica.setBackground(new Color(44,62,80));
        subpanelAprende.setBackground(new Color(38,50,56));

        framePractica practica = new framePractica();
        practica.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subpanelPracticaMouseClicked

    private void subpanelAprendeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpanelAprendeMouseClicked
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/ElementoR/A.wav"));
        Sound.play();
        subpanelAprende.setBackground(new Color(44,62,80));
        subpanelPractica.setBackground(new Color(38,50,56));
        frameAprende aprende = new frameAprende();
        aprende.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subpanelAprendeMouseClicked

    private void subpnl8HeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl8HeMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt8He.setText("He");
                mnemo8He.setText("");
                bien++;
                break;
            }
            case 2:{
                txt8Ne.setText("He");
                mnemo8He.setText("");
                mal++;
                break;
            }
            case 3:{
                txt8Ar.setText("He");
                mnemo8He.setText("");
                mal++;
                break;
            }
            case 4:{
                txt8Kr.setText("He");
                mnemo8He.setText("");
                mal++;
                break;
            }
            case 5:{
                txt8Xe.setText("He");
                mnemo8He.setText("");
                mal++;
                break;
            }
            case 6:{
                txt8Rn.setText("He");
                mnemo8He.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl8HeMouseClicked

    private void subpnl8NeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl8NeMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt8He.setText("Ne");
                mnemo8Ne.setText("");
                mal++;
                break;
            }
            case 2:{
                txt8Ne.setText("Ne");
                mnemo8Ne.setText("");
                bien++;
                break;
            }
            case 3:{
                txt8Ar.setText("Ne");
                mnemo8Ne.setText("");
                mal++;
                break;
            }
            case 4:{
                txt8Kr.setText("Ne");
                mnemo8Ne.setText("");
                mal++;
                break;
            }
            case 5:{
                txt8Xe.setText("Ne");
                mnemo8Ne.setText("");
                mal++;
                break;
            }
            case 6:{
                txt8Rn.setText("Ne");
                mnemo8Ne.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl8NeMouseClicked

    private void subpnl8ArMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl8ArMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt8He.setText("Ar");
                mnemo8Ar.setText("");
                mal++;
                break;
            }
            case 2:{
                txt8Ne.setText("Ar");
                mnemo8Ar.setText("");
                mal++;
                break;
            }
            case 3:{
                txt8Ar.setText("Ar");
                mnemo8Ar.setText("");
                bien++;
                break;
            }
            case 4:{
                txt8Kr.setText("Ar");
                mnemo8Ar.setText("");
                mal++;
                break;
            }
            case 5:{
                txt8Xe.setText("Ar");
                mnemo8Ar.setText("");
                mal++;
                break;
            }
            case 6:{
                txt8Rn.setText("Ar");
                mnemo8Ar.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl8ArMouseClicked

    private void subpnl8KrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl8KrMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt8He.setText("Kr");
                mnemo8Kr.setText("");
                mal++;
                break;
            }
            case 2:{
                txt8Ne.setText("Kr");
                mnemo8Kr.setText("");
                mal++;
                break;
            }
            case 3:{
                txt8Ar.setText("Kr");
                mnemo8Kr.setText("");
                mal++;
                break;
            }
            case 4:{
                txt8Kr.setText("Kr");
                mnemo8Kr.setText("");
                bien++;
                break;
            }
            case 5:{
                txt8Xe.setText("Kr");
                mnemo8Kr.setText("");
                mal++;
                break;
            }
            case 6:{
                txt8Rn.setText("Kr");
                mnemo8Kr.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl8KrMouseClicked

    private void subpnl8XeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl8XeMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt8He.setText("Xe");
                mnemo8Xe.setText("");
                mal++;
                break;
            }
            case 2:{
                txt8Ne.setText("Xe");
                mnemo8Xe.setText("");
                mal++;
                break;
            }
            case 3:{
                txt8Ar.setText("Xe");
                mnemo8Xe.setText("");
                mal++;
                break;
            }
            case 4:{
                txt8Kr.setText("Xe");
                mnemo8Xe.setText("");
                mal++;
                break;
            }
            case 5:{
                txt8Xe.setText("Xe");
                mnemo8Xe.setText("");
                bien++;
                break;
            }
            case 6:{
                txt8Rn.setText("Xe");
                mnemo8Xe.setText("");
                mal++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_subpnl8XeMouseClicked

    private void subpnl8RnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpnl8RnMouseClicked
        clic++;
        switch(clic){
            case 1:{
                txt8He.setText("Rn");
                mnemo8Rn.setText("");
                mal++;
                break;
            }
            case 2:{
                txt8Ne.setText("Rn");
                mnemo8Rn.setText("");
                mal++;
                break;
            }
            case 3:{
                txt8Ar.setText("Rn");
                mnemo8Rn.setText("");
                mal++;
                break;
            }
            case 4:{
                txt8Kr.setText("Rn");
                mnemo8Rn.setText("");
                mal++;
                break;
            }
            case 5:{
                txt8Xe.setText("Rn");
                mnemo8Rn.setText("");
                mal++;
                break;
            }
            case 6:{
                txt8Rn.setText("Rn");
                mnemo8Rn.setText("");
                bien++;
                frameResultado.Rbien = bien;
                frameResultado.Rmal = mal;
                frameResultado result=new frameResultado();
                result.setVisible(true);
            }
        }
    }//GEN-LAST:event_subpnl8RnMouseClicked

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
            java.util.logging.Logger.getLogger(framePractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePractica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANEL;
    private javax.swing.JButton btnIA;
    private javax.swing.JButton btnIIA;
    private javax.swing.JButton btnIIIA;
    private javax.swing.JButton btnIVA;
    private javax.swing.JButton btnVA;
    private javax.swing.JButton btnVIA;
    private javax.swing.JButton btnVIIA;
    private javax.swing.JButton btnVIIIA;
    private javax.swing.JLabel desNombre;
    private javax.swing.JLabel desPeso;
    private javax.swing.JLabel desSimbolo;
    private javax.swing.JLabel desZ;
    private javax.swing.JLabel iconQuimica;
    private javax.swing.JLabel imageApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mnemo1Cs;
    private javax.swing.JLabel mnemo1Fr;
    private javax.swing.JLabel mnemo1H;
    private javax.swing.JLabel mnemo1K;
    private javax.swing.JLabel mnemo1Li;
    private javax.swing.JLabel mnemo1Na;
    private javax.swing.JLabel mnemo1Rb;
    private javax.swing.JLabel mnemo2Ba;
    private javax.swing.JLabel mnemo2Be;
    private javax.swing.JLabel mnemo2Ca;
    private javax.swing.JLabel mnemo2Mg;
    private javax.swing.JLabel mnemo2Ra;
    private javax.swing.JLabel mnemo2Sr;
    private javax.swing.JLabel mnemo3Al;
    private javax.swing.JLabel mnemo3B;
    private javax.swing.JLabel mnemo3Ga;
    private javax.swing.JLabel mnemo3In;
    private javax.swing.JLabel mnemo3Tl;
    private javax.swing.JLabel mnemo4C;
    private javax.swing.JLabel mnemo4Ge;
    private javax.swing.JLabel mnemo4Pb;
    private javax.swing.JLabel mnemo4Sn;
    private javax.swing.JLabel mnemo4sI;
    private javax.swing.JLabel mnemo5As;
    private javax.swing.JLabel mnemo5Bi;
    private javax.swing.JLabel mnemo5N;
    private javax.swing.JLabel mnemo5P;
    private javax.swing.JLabel mnemo5Sb;
    private javax.swing.JLabel mnemo6O;
    private javax.swing.JLabel mnemo6Po;
    private javax.swing.JLabel mnemo6S;
    private javax.swing.JLabel mnemo6Se;
    private javax.swing.JLabel mnemo6Te;
    private javax.swing.JLabel mnemo7At;
    private javax.swing.JLabel mnemo7Br;
    private javax.swing.JLabel mnemo7Cl;
    private javax.swing.JLabel mnemo7F;
    private javax.swing.JLabel mnemo7I;
    private javax.swing.JLabel mnemo8Ar;
    private javax.swing.JLabel mnemo8He;
    private javax.swing.JLabel mnemo8Kr;
    private javax.swing.JLabel mnemo8Ne;
    private javax.swing.JLabel mnemo8Rn;
    private javax.swing.JLabel mnemo8Xe;
    private javax.swing.JPanel mnemoIA;
    private javax.swing.JPanel mnemoIIA;
    private javax.swing.JPanel mnemoIIIA;
    private javax.swing.JPanel mnemoIVA;
    private javax.swing.JPanel mnemoVA;
    private javax.swing.JPanel mnemoVIA;
    private javax.swing.JPanel mnemoVIIA;
    private javax.swing.JPanel mnemoVIIIA;
    private javax.swing.JLabel opcionAprender;
    private javax.swing.JLabel opcionPractica;
    private javax.swing.JPanel panelNemo;
    private javax.swing.JPanel pnl1Cs;
    private javax.swing.JPanel pnl1Fr;
    private javax.swing.JPanel pnl1H;
    private javax.swing.JPanel pnl1K;
    private javax.swing.JPanel pnl1Na;
    private javax.swing.JPanel pnl1Rb;
    private javax.swing.JPanel pnl2Ba;
    private javax.swing.JPanel pnl2Be;
    private javax.swing.JPanel pnl2Ca;
    private javax.swing.JPanel pnl2Mg;
    private javax.swing.JPanel pnl2Ra;
    private javax.swing.JPanel pnl2Sr;
    private javax.swing.JPanel pnl3Al;
    private javax.swing.JPanel pnl3B;
    private javax.swing.JPanel pnl3Ga;
    private javax.swing.JPanel pnl3In;
    private javax.swing.JPanel pnl3Tl;
    private javax.swing.JPanel pnl4C;
    private javax.swing.JPanel pnl4Ge;
    private javax.swing.JPanel pnl4Pb;
    private javax.swing.JPanel pnl4Si;
    private javax.swing.JPanel pnl4Sn;
    private javax.swing.JPanel pnl5As;
    private javax.swing.JPanel pnl5Bi;
    private javax.swing.JPanel pnl5N;
    private javax.swing.JPanel pnl5P;
    private javax.swing.JPanel pnl5Sb;
    private javax.swing.JPanel pnl6O;
    private javax.swing.JPanel pnl6Po;
    private javax.swing.JPanel pnl6S;
    private javax.swing.JPanel pnl6Se;
    private javax.swing.JPanel pnl6Te;
    private javax.swing.JPanel pnl7At;
    private javax.swing.JPanel pnl7Br;
    private javax.swing.JPanel pnl7Cl;
    private javax.swing.JPanel pnl7F;
    private javax.swing.JPanel pnl7I;
    private javax.swing.JPanel pnl8Ar;
    private javax.swing.JPanel pnl8He;
    private javax.swing.JPanel pnl8Kr;
    private javax.swing.JPanel pnl8Ne;
    private javax.swing.JPanel pnl8Rn;
    private javax.swing.JPanel pnl8Xe;
    private javax.swing.JPanel pnlDescripcion;
    private javax.swing.JPanel pnlImagen;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlLi;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPRINCIPAL;
    private javax.swing.JPanel pnlTransicion;
    private javax.swing.JPanel subpanelAprende;
    private javax.swing.JPanel subpanelPractica;
    private javax.swing.JPanel subpnl1Cs;
    private javax.swing.JPanel subpnl1Fr;
    private javax.swing.JPanel subpnl1H;
    private javax.swing.JPanel subpnl1K;
    private javax.swing.JPanel subpnl1Li;
    private javax.swing.JPanel subpnl1Na;
    private javax.swing.JPanel subpnl1Rb;
    private javax.swing.JPanel subpnl2Ba;
    private javax.swing.JPanel subpnl2Be;
    private javax.swing.JPanel subpnl2Ca;
    private javax.swing.JPanel subpnl2Mg;
    private javax.swing.JPanel subpnl2Ra;
    private javax.swing.JPanel subpnl2Sr;
    private javax.swing.JPanel subpnl3Al;
    private javax.swing.JPanel subpnl3B;
    private javax.swing.JPanel subpnl3Ga;
    private javax.swing.JPanel subpnl3In;
    private javax.swing.JPanel subpnl3Tl;
    private javax.swing.JPanel subpnl4C;
    private javax.swing.JPanel subpnl4Ge;
    private javax.swing.JPanel subpnl4Pb;
    private javax.swing.JPanel subpnl4Sn;
    private javax.swing.JPanel subpnl4sI;
    private javax.swing.JPanel subpnl5As;
    private javax.swing.JPanel subpnl5Bi;
    private javax.swing.JPanel subpnl5N;
    private javax.swing.JPanel subpnl5P;
    private javax.swing.JPanel subpnl5Sb;
    private javax.swing.JPanel subpnl6O;
    private javax.swing.JPanel subpnl6Po;
    private javax.swing.JPanel subpnl6S;
    private javax.swing.JPanel subpnl6Se;
    private javax.swing.JPanel subpnl6Te;
    private javax.swing.JPanel subpnl7At;
    private javax.swing.JPanel subpnl7Br;
    private javax.swing.JPanel subpnl7Cl;
    private javax.swing.JPanel subpnl7F;
    private javax.swing.JPanel subpnl7I;
    private javax.swing.JPanel subpnl8Ar;
    private javax.swing.JPanel subpnl8He;
    private javax.swing.JPanel subpnl8Kr;
    private javax.swing.JPanel subpnl8Ne;
    private javax.swing.JPanel subpnl8Rn;
    private javax.swing.JPanel subpnl8Xe;
    private javax.swing.JLabel txt1Cs;
    private javax.swing.JLabel txt1Fr;
    private javax.swing.JLabel txt1K;
    private javax.swing.JLabel txt1Rb;
    private javax.swing.JLabel txt2Ba;
    private javax.swing.JLabel txt2Be;
    private javax.swing.JLabel txt2Ca;
    private javax.swing.JLabel txt2Mg;
    private javax.swing.JLabel txt2Ra;
    private javax.swing.JLabel txt2Sr;
    private javax.swing.JLabel txt3Al;
    private javax.swing.JLabel txt3B;
    private javax.swing.JLabel txt3Ga;
    private javax.swing.JLabel txt3In;
    private javax.swing.JLabel txt3Tl;
    private javax.swing.JLabel txt4C;
    private javax.swing.JLabel txt4Ge;
    private javax.swing.JLabel txt4Pb;
    private javax.swing.JLabel txt4Si;
    private javax.swing.JLabel txt4Sn;
    private javax.swing.JLabel txt5As;
    private javax.swing.JLabel txt5Bi;
    private javax.swing.JLabel txt5N;
    private javax.swing.JLabel txt5P;
    private javax.swing.JLabel txt5Sb;
    private javax.swing.JLabel txt6O;
    private javax.swing.JLabel txt6Po;
    private javax.swing.JLabel txt6S;
    private javax.swing.JLabel txt6Se;
    private javax.swing.JLabel txt6Te;
    private javax.swing.JLabel txt7At;
    private javax.swing.JLabel txt7Br;
    private javax.swing.JLabel txt7Cl;
    private javax.swing.JLabel txt7F;
    private javax.swing.JLabel txt7I;
    private javax.swing.JLabel txt8Ar;
    private javax.swing.JLabel txt8He;
    private javax.swing.JLabel txt8Kr;
    private javax.swing.JLabel txt8Ne;
    private javax.swing.JLabel txt8Rn;
    private javax.swing.JLabel txt8Xe;
    private javax.swing.JLabel txtH;
    private javax.swing.JLabel txtLi;
    private javax.swing.JLabel txtNa;
    private javax.swing.JLabel txtSimbolo;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtVersion;
    private javax.swing.JLabel txtVersion1;
    private javax.swing.JLabel txtVersion2;
    private javax.swing.JLabel txtVersion3;
    private javax.swing.JLabel txtVersion4;
    // End of variables declaration//GEN-END:variables
}
