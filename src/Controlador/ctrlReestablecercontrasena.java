package Controlador;

import Modelo.Reestablecercontrasena;
import Vista.frmreestablecercontraseña;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrlReestablecercontrasena implements MouseListener, KeyListener{
    
    private Reestablecercontrasena Modelorescontra;
    private frmreestablecercontraseña Vistafrmrescontra;
    
    public ctrlReestablecercontrasena(Reestablecercontrasena ModeReestablecercontrasena, frmreestablecercontraseña Visfrmrescontra){
        
        this.Modelorescontra = ModeReestablecercontrasena;
        this.Vistafrmrescontra = Visfrmrescontra;
        
        Visfrmrescontra.txtNewcontra.addMouseListener(this);
        Visfrmrescontra.txtNewcontradnv.addMouseListener(this);
        Visfrmrescontra.btnSiguiente.addMouseListener(this);
        
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {

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
