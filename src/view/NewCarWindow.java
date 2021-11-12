package view;
import javax.swing.*;

import controller.NewCarController;

public class NewCarWindow {
    
    JFrame _mainFrame;
    JPanel _mainPanel;

    NewCarController _mc;

    public NewCarWindow(NewCarController newCarController){
        setNewCarController(newCarController);
        // Neues Hauptfenster erstellen
        _mainFrame = new JFrame();
        _mainFrame.setTitle("Neues Auto erstellen");

        // Breite und Höhe des Fensters setzen
        _mainFrame.setSize(300,200);

        // Fenster anzeigen
        _mainFrame.setVisible(true);
        
        // Standard-Operation, wenn das Fenster geschlossen wird
        _mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

     /**
     * 
     * SETTER UND GETTER
     */
    public JFrame getMainFrame() {
        return _mainFrame;
    }

    public void setMainFrame(JFrame _mainFrame) {
        this._mainFrame = _mainFrame;
    }

    public void setMainPanel(JPanel _mainPanel) {
        this._mainPanel = _mainPanel;
    }

    public JPanel getMainPanel() {
        return _mainPanel;
    }

    public void setNewCarController(NewCarController _mc) {
        this._mc = _mc;
    }

    public NewCarController getNewCarController() {
        return _mc;
    }
}
