package listadoMedidas;

import listadoModulos.MController;
import listadoModulos.MPanel;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ListadoMedidas {
    public static void CreateGUI(JFrame window){
        MedidasPanel panel =  new MedidasPanel();
        MedidasController ctr = new MedidasController(panel);
        panel.setController(ctr);
        window.setContentPane(panel);
        window.setVisible(true);
        window.pack();
        window.setSize(500,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}