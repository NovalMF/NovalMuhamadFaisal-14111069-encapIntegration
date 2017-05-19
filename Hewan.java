public abstract class Hewan {
    protected String JenisHewan  = "Mamalia";
    protected String Nama = "Sapi";

    protected String getJenisHewan(){
        return JenisHewan;
    }
    protected String getNama(){
        return Nama;
    }    
    protected abstract void printJenisHewan();
	
    protected abstract void printNama();
}