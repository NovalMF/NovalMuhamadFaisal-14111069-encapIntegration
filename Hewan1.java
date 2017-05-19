public class Hewan1 {
    private int Kaki;
    private String Suara;
    
    //konstruktor
    public Hewan1(){
        this.Kaki=0;
        this.Suara="Suara Hewan";
    }
    public Hewan1(int Kaki, String Suara){
        this.Kaki = Kaki;
        this.Suara = Suara;
    }    
    public void setKaki(int Kaki){
        this.Kaki=Kaki;
    }
    public void setSuara(String Suara){
        this.Suara = Suara;        
    }
    public int getKaki(){
        return this.Kaki;
    }
    public String getSuara(){
        return this.Suara;
    }    
}