package model;

public class Auto extends Fahrzeug {
    
    int _sitze;
    
    public Auto(String marke, int ps, String typ, int sitze){
        super(marke, ps, typ);
        setSitze(sitze);
    }

    /**
     * 
     * SETTER UND GETTER
     */

    public int getSitze() {
        return _sitze;
    }

    public void setSitze(int sitze) {
        this._sitze = sitze;
    }
}
