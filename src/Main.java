
public class Main {

		public static void main(String[] args) {
		
	
			Capitale capitaleFrance = new Capitale ("Paris", 2000,5000);
			Capitale capitaleAustralie = new Capitale ("Canberra",6000,100000);
			Capitale capitaleEspagne = new Capitale ("Madrid",3000,5000);
			Pays pays1 = new Pays ("france.","Français","euro",capitaleFrance);
			System.out.println(pays1);
			System.out.println("");
			
			Pays pays2 = new Pays ("australie","Anglais","euro",capitaleAustralie);
			System.out.println(pays2);
			System.out.println("");
			
			Pays pays3 = new Pays ("Esapgne","Espagnol","euro",capitaleEspagne);
			System.out.println(pays3);
			System.out.println("");
			
			System.out.println("Nombre de pays:"+ Pays.getCompteurPays());
			System.out.println("");
			
		
	}

}
