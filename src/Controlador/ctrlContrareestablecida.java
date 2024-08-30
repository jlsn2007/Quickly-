package Controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Modelo.Contrasenareestablecida;
import Vista.frmLogin;
import Vista.frmcontrasenaestablecida;


public class ctrlContrareestablecida implements MouseListener, KeyListener{
    
    private Contrasenareestablecida modeloContrasenareestablecida;
    private frmcontrasenaestablecida Vistacontrares;

    public ctrlContrareestablecida(Contrasenareestablecida contrasenareestablecida, frmcontrasenaestablecida frmcontrares) {
        
        this.modeloContrasenareestablecida = contrasenareestablecida;
        this.Vistacontrares = frmcontrares;
        
        frmcontrares.btnempezar.addMouseListener(this);
        
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == Vistacontrares.btnempezar) {
            Vistacontrares.setVisible(false);

            frmLogin VistaLogin = new frmLogin();

            Vistacontrares.setVisible(true);
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

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
