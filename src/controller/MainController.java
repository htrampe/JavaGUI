package controller;

import java.util.ArrayList;

import model.Auto;
import model.Fahrzeug;
import view.MainWindow;

public class MainController {

    MainWindow _mainWindow;
    ArrayList<Fahrzeug> _fahrzeuge;


    public MainController(){
        setFahrzeuge(new ArrayList<Fahrzeug>());

        setMainWindow(new MainWindow(this));

        getMainWindow().toggleMainWindow();
    }

    public void changeView(String target){
        System.out.println("Ansicht wechseln auf: " + target);

        getMainWindow().getMainFrame().setVisible(false);

        if(target == "newcarwindow"){
            new NewCarController(this);
        }
        else if(target == "newlkwwindow"){
            new NewLKWController(this);
        }
        else if(target == "mainwindow"){
            getMainWindow().getMainFrame().setVisible(true);
            getMainWindow().updateTable();
        }
    }

    public void addNewFahrzeug(Fahrzeug a){
        getFahrzeuge().add(a);
        System.out.println("Neues Auto erstellt!");
    }

     
    /**
     * 
     * SETTER UND GETTER
     */
    public void setMainWindow(MainWindow mainWindow) {
        this._mainWindow = mainWindow;
    }

    public MainWindow getMainWindow() {
        return _mainWindow;
    }

    public ArrayList<Fahrzeug> getFahrzeuge() {
        return _fahrzeuge;
    }

    public void setFahrzeuge(ArrayList<Fahrzeug> _fahrzeuge) {
        this._fahrzeuge = _fahrzeuge;
    }



}
