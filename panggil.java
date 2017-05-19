public class panggil{
	public static void main(String []args){
	TurunanHewan TH = new TurunanHewan();
	System.out.println("ABSTARCTION");
	System.out.println("=======================");
	TH.printJenisHewan();
	TH.printNama();
	
	Hewan1 pgl = new Hewan1();
    pgl.setKaki(4);
    pgl.setSuara("Mouuuuuuu");     
	System.out.println();
	System.out.println("ENCAPSULATION");
	System.out.println("=======================");
    System.out.println("Kaki Hewan  = "+pgl.getKaki());
    System.out.println("Suara Hewan  = "+pgl.getSuara());
	}
}