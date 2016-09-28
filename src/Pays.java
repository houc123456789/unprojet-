import java.util.ArrayList;
public class Pays {
	private String nom; 
	private String langue;
	private String monnaie;
	private Capitale saCapitale;
	private static int compteurPays = 0;
	private ArrayList<Ville>lesVilles;
    /*private Ville lesVille[] = new Ville[10];*/
    
    //CONSTRUCTEUR
	public Pays(){
	    compteurPays=compteurPays+1 ;
	}	
	
	public Pays (String unNom, String uneLangue, String uneMonnaie ){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		compteurPays = compteurPays + 1;
	}
	
	public Pays(String unNom, String uneLangue, String uneMonnaie, Capitale saCapitale){
		this.nom=unNom;
		this.langue=uneLangue;
		this.monnaie=uneMonnaie;
		this.saCapitale=saCapitale;
		compteurPays=compteurPays+1;
	}
	
	public Pays (String unNom, String uneLangue, String uneMonnaie, Capitale saCapitale, ArrayList<Ville>lesVilles){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		compteurPays = compteurPays + 1;
		this.saCapitale = saCapitale;
		lesVilles = new ArrayList<Ville>();
		
	}
	//accesseur
	
	//Nom
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String unNom){ 
		this.nom=unNom;
	}
	
	//langue
	public String getLangue(){
		return this.langue;
	}
	
	public void setLangue(String uneLangue){
		this.nom=uneLangue;
	}
	
	//Monnaie
	public String  getMonnaie(){
		return this.monnaie;
	}
	public  void setMonnaie(String uneMonnaie){
		this.monnaie=uneMonnaie;
	}
	
	//compteurPays
	public static int getCompteurPays(){
		return compteurPays;
	}
	//saCaptitale
	public Capitale getSaCapitale(){
		return this.saCapitale;
	}
	public void setSaCapitale(Capitale uneCapitale){
		this.saCapitale = uneCapitale;
	}
	
	
	
	//Methode toString de la classe Pays
	public String toString(){
		String chaine;
		chaine= "PAYS: ";
		chaine += "\ncompteur:   "+this.compteurPays+"\nNom:  " +nom()+  " \nLangue:  " +this.langue+ "  \nMonnaie: " +this.monnaie ;
		chaine += "\nCapitale: "+this.saCapitale.toString();
		chaine += "\nVilles: "+this.lesVilles ;
		chaine += "\n********************************************************************";
		return chaine;
	}

	public String  nomMajuscule(){
		
		return this.nom.toUpperCase();
	}
	public String nom(){
		return nom.toUpperCase().charAt(0)+nom.substring(1, nom.length()).toLowerCase();
	}
	
	
	// Methode: ajouter une ville
	public void ajouterUneVille (Ville uneVille){
		this.lesVilles.add(uneVille);
	}
	
	//Methode: rechercher une ville
	public boolean rechercherUneVille(String unNom){
	    int i=0;
	    boolean trouver;
	    
	    while (i<this.lesVilles.size() && unNom != (lesVilles.get(i).getNomVille())){
	    	i = i + 1;
	    }
	    if(i<this.lesVilles.size()){
	    	trouver = true;
	    	System.out.println("Cette ville existe:" + this.nom);
	    }
	    else{
	    	trouver = false;
	    	System.out.println("Cette ville n'existe pas");
	    }
	    return trouver;

		}
	
    //Methode: Supprimer une ville
	public void supprimerUneVille(String unNomVille){
		
		this.lesVilles.remove(unNomVille);
	}
	 
	public void supprimerUneVille( int position){
		this.lesVilles.remove(position);
	}
	
	// getLesVilles
		public ArrayList <Ville> getLesVilles(){
			return this.lesVilles;
		}
}
