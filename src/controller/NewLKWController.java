package controller;

import model.Auto;
import model.LKW;
import view.NewLKWWindow;

public class NewLKWController {

    NewLKWWindow _newLKWWindow;
    MainController _mc;

    public NewLKWController(MainController mc){
        setNewLKWWindow(new NewLKWWindow(this));
        setMainController(mc);
    }


    public void addNewLKW(String marke, String ps, String typ, String maxzuladung){
        // Neues Objekt vom Typ LKW erstellen und dieses dem Maincontroller mitgeben
        LKW a = new LKW(marke, Integer.parseInt(ps), typ, Integer.parseInt(maxzuladung));
        getMainController().addNewFahrzeug(a);
        // Nachdem der LKW erstellt wurde kümmert sich der Controller um den Wechsel der Ansicht.
        getMainController().changeView("mainwindow");
    }

    /**
     * 
     * SETTER UND GETTER
     */
    public void setNewLKWWindow(NewLKWWindow mainWindow) {
        this._newLKWWindow = mainWindow;
    }

    public NewLKWWindow getNewLKWWindow() {
        return _newLKWWindow;
    }

    public MainController getMainController() {
        return _mc;
    }

    public void setMainController(MainController _mc) {
        this._mc = _mc;
    }
    
}
