/**
 * 
 * @author Simon Heinen
 * @version 07.03.2018
 * 
 */
public class Person{
    private String name;
    private int groesse;
    private double gewicht;
    private boolean raucher;
    private Versicherung versicherung;
    
    public Person(String nameK, int groesseK){
        name=nameK;
        groesse=groesseK;
        gewicht=0;
        raucher=false;
        versicherung=null;
    }
    
    public Person(String nameK, int groesseK, double gewichtK, boolean raucherK, Versicherung versicherungK){
        name=nameK;
        groesse=groesseK;
        gewicht=gewichtK;
        raucher=raucherK;
        versicherung=versicherungK;
    }
    
    //Sondierende Methoden - @Getter
    
    private String gibName(){
        return name;
    }
    
    private int gibGroesse(){
        return groesse;
    }
    
    private double gibGewicht(){
        return gewicht;
    }
    
    private boolean gibRaucher(){
        return raucher;
    }
    
    private Versicherung gibVersicherung(){
        return versicherung;
    }
    
    
    
    //Verändernde Methoden - @Setter
    
    public void setGewicht(double newGewicht){
        gewicht = newGewicht;
    }
    
    public void setVersicherung(Versicherung newVersicherung){
        versicherung=newVersicherung;
    }
    
    public void setVersicherung(String newName, int newGroesse, double newGewicht){
        name=newName;
        groesse=newGroesse;
        gewicht=newGewicht;
    }
    
    public void setRaucher(boolean newRaucher){
        raucher=newRaucher;
    }
    
    
    
    //Funktionelle Methoden
    
    
    public double berechneBMI(){
        double bmi = gewicht / (groesse/100.0 * groesse/100.0);
        return bmi;
    }
    
    public boolean bekommtBonus(){
        boolean bonus;
        if(berechneBMI() > 18.5 && berechneBMI() < 25.0 && !raucher){
            bonus = true;
        }else{
            bonus = false;
        }
        return bonus;
    }
}
