package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.MainController;
import model.Auto;
import model.Fahrzeug;
import model.LKW;

public class MainWindow {
    
    JFrame _mainFrame;
    JPanel _mainPanel;
    JTable _carTable;
    JButton _createCar;
    JButton _createLKW;

    MainController _mc;

    public MainWindow(MainController mc){
        setMainController(mc);
        // Neues Hauptfenster erstellen
        _mainFrame = new JFrame();
        
        // Breite und Höhe des Fensters setzen
        _mainFrame.setSize(600,400);
        
        createMainOverview();

        // Standard-Operation, wenn das Fenster geschlossen wird
        _mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createMainOverview(){        
        // Hauptpanel erstellen und Elemente für das MainWindow hinzufügen
        setMainPanel(new JPanel());
        getMainPanel().setLayout(new FlowLayout());

        _createCar = new JButton("Neues Auto");
        _createCar.setBounds(0,0,0,0);
        _createCar.addActionListener(new createCarListener());

        _createLKW = new JButton("Neuer LKW");
        _createLKW.setBounds(0,0,0,0);
        _createLKW.addActionListener(new createLKWListener());

        DefaultTableModel model = new DefaultTableModel(); 
        setCarTable(new JTable(model));

        // Create a couple of columns 
        model.addColumn("Marke"); 
        model.addColumn("PS"); 
        model.addColumn("Typ"); 
        model.addColumn("Spezial"); 

        getMainPanel().add(getCarTable());
        getMainPanel().add(_createCar);
        getMainPanel().add(_createLKW);
        getMainFrame().add(getMainPanel());
    }

    public void updateTable(){
        // Autos laden
        DefaultTableModel model = (DefaultTableModel) getCarTable().getModel();

        // Entferne alle aktuellen Elemente
        for(int i = model.getRowCount()-1; i >= 0; i--){
            model.removeRow(i);
        }

        for(Fahrzeug a : getMainController().getFahrzeuge()){
            if(a instanceof Auto){
                Auto a_temp = (Auto) a;
                model.addRow(new Object[]{a_temp.getMarke(), a_temp.getPs(), a_temp.getTyp(), a_temp.getSitze()});
            }
            else if(a instanceof LKW){
                LKW a_temp = (LKW) a;
                model.addRow(new Object[]{a_temp.getMarke(), a_temp.getPs(), a_temp.getTyp(), a_temp.getMaxZuladung()});
            }
        }
    }

    // Zeigt oder versteckt (toggle) das Hauptfenster
    public void toggleMainWindow(){
        if(getMainFrame().isVisible()){
            getMainFrame().setVisible(false);
        }
        else{
            getMainFrame().setVisible(true);
        }
    }

    /**
     * 
     * Action Listener
     */
    class createCarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == _createCar){
                System.out.println("Auto erstellen - wechsle Ansicht zu newCarWindow");
                getMainController().changeView("newcarwindow");
            }
        }
    }

    class createLKWListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == _createLKW){
                System.out.println("LKW erstellen - wechsle Ansicht zu newLKWWindow");
                getMainController().changeView("newlkwwindow");
            }
        }
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

    public JTable getCarTable() {
        return _carTable;
    }

    public void setCarTable(JTable _carTable) {
        this._carTable = _carTable;
    }

    public void setMainPanel(JPanel _mainPanel) {
        this._mainPanel = _mainPanel;
    }

    public JPanel getMainPanel() {
        return _mainPanel;
    }

    public void setMainController(MainController _mc) {
        this._mc = _mc;
    }

    public MainController getMainController() {
        return _mc;
    }

}
