package controller;

import view.NewCarWindow;

public class NewCarController {

    NewCarWindow _newCarWindow;
    MainController _mc;

    public NewCarController(MainController mc){
        setNewCarWindow(new NewCarWindow(this));
        setMainController(mc);
    }

    /**
     * 
     * SETTER UND GETTER
     */
    public void setNewCarWindow(NewCarWindow mainWindow) {
        this._newCarWindow = mainWindow;
    }

    public NewCarWindow getNewCarWindow() {
        return _newCarWindow;
    }

    public MainController getMainController() {
        return _mc;
    }

    public void setMainController(MainController _mc) {
        this._mc = _mc;
    }
    
}
