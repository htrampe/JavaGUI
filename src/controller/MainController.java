package controller;

import view.MainWindow;

public class MainController {

    MainWindow _mainWindow;

    public MainController(){
        setMainWindow(new MainWindow(this));
        getMainWindow().toggleMainWindow();
    }

    public void changeView(String target){
        System.out.println(target);

        getMainWindow().toggleMainWindow();

        if(target == "newcarwindow"){
            new NewCarController(this);
        }
        else if(target == "mainwindow"){
            getMainWindow().toggleMainWindow();
        }
    }

    public void setMainWindow(MainWindow mainWindow) {
        this._mainWindow = mainWindow;
    }

    public MainWindow getMainWindow() {
        return _mainWindow;
    }


}
