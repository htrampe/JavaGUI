package model;

public class LKW extends Fahrzeug {
    
    int _maxZuladung;
    
    public LKW(String marke, int ps, String typ, int maxZuladung){
        super(marke, ps, typ);
        setMaxZuladung(maxZuladung);
    }

    /**
     * 
     * SETTER UND GETTER
     */
    public int getMaxZuladung() {
        return _maxZuladung;
    }

    public void setMaxZuladung(int maxZuladung) {
        this._maxZuladung = maxZuladung;
    }

    public String getSpezial() {
        return "" + _maxZuladung;
    }
}
