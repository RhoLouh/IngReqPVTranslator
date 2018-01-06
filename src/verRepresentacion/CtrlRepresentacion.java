package verRepresentacion;

import Modelo.Medida;
import Modelo.PVBD;
import Modelo.Punto;
import verCorregida.ViewCorregida;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class CtrlRepresentacion implements ActionListener {
    private ViewRepresentacion panel;
    private int idm;

    public CtrlRepresentacion(ViewRepresentacion panel, int medidaID) throws ParseException {
        this.panel = panel;
        idm = medidaID;
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals(ViewRepresentacion.MOSTRARCURVA)) {
            panel.muestraPuntos(PVBD.leerListaPuntos(Integer.toString(idm)));
        }
        if (event.getActionCommand().equals(ViewRepresentacion.CORREGIR)) {
            if (panel.getSelectC().equals("Metodo2")) {
                final JFrame window = new JFrame("Correccion");
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        ViewCorregida.createGUI(window, panel.getID());
                    }
                });
            }
        }
        if (event.getActionCommand().equals(ViewRepresentacion.MOSTRARIV)) {
            panel.mostrarIV();
        }
        if (event.getActionCommand().equals(ViewRepresentacion.MOSTRARPV)) {
            panel.mostrarPV();
        }
    }

}
