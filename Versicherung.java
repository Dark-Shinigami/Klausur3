/**
 *
 * @author Simon Heinen
 * @version 07.03.2018
 * 
 */
public class Versicherung{
    private String name;
    private int nummer;
    private double preis;

    /**
     * Constructor for objects of class Versicherung
     */
    public Versicherung(String vollerName){
        name=vollerName;
        nummer=0;
        preis=0.0;
        //
    }
    
    public String gibName(){
        return name;
    }
    
    public int gibNummer(){
        return nummer;
    }
    
    public double gibPreis(){
        return preis;
    }
    
    public void setPreis(double neuerPreis){
        preis = neuerPreis;
    }
}
