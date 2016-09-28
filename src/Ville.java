import java.util.ArrayList;


public class Ville {
	private String nomVille;
	private int nbHabitantsVille;
	private int superficieVille;
	//private Pays sonPays;
	
	public Ville(String unNomVille, int unNbHabitantVille, int uneSuperficieVille, ArrayList<Ville>lesVilles){
	this.nomVille = unNomVille;
	this.nbHabitantsVille = unNbHabitantVille;
	this.superficieVille = uneSuperficieVille;
	lesVilles = new ArrayList <Ville> () ;
	}
	
	//accesseurs
	
	//nomCapitale
	public String getNomVille(){
		return nomVille;
	}
	public void setNomVille ( String unNomVille){
		this.nomVille=unNomVille;
	}
	
	//nbHabitants
	public int getNbHabitantVille(){
		return nbHabitantsVille;
	}
	
	public void setNbHabitant( int unNbHabitantVille){
		this.nbHabitantsVille=unNbHabitantVille;
	}
	
	//superficie
	public int getSuperficieVille(){
		return this.superficieVille;
	}
	public void setSuperficieVille (int uneSuperficieVille){
		this.superficieVille=uneSuperficieVille;
	}
	
	//toString
	public String toString(){
		String chaine;
		chaine ="\nNom de la Ville:\n"+ this.nomVille+ "Nombre d'habitant de la ville:\n"+this.nbHabitantsVille+ "Superficie de la ville:\n"+this.superficieVille;
		return chaine;
	}
}
