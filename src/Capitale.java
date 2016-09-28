// premier commit aaaaaaaaaaa
public class Capitale /*extends Ville*/{

	private String nomCapitale;
	private int nbHabitants;
	private int superficie;
	
	public Capitale(String unNomCapitale, int unNbHabitant, int uneSuperficie){
	this.nomCapitale = unNomCapitale;
	this.nbHabitants = unNbHabitant;
	this.superficie = uneSuperficie;
	}
	
	//accesseurs
	//nomCapitale
	public String getNomCapitale(){
		return nomCapitale;
	}
	public void setNomCapitale ( String unNomCapitale){
		this.nomCapitale=unNomCapitale;
	}
	
	//nbHabitants
	public int getNbHabitant(){
		return nbHabitants;
	}
	
	public void setNbHabitant( int unNbHabitant){
		this.nbHabitants=unNbHabitant;
	}
	
	//superficie
	public int getSuperficie(){
		return superficie;
	}
	public void setSuperficie (int uneSuperficie){
		this.superficie=uneSuperficie;
	}
	
	//toString
	public String toString(){
		String chaine;
		chaine="\nNom de la capitale:"+ this.nomCapitale+ "\nNombre d'habitant dans la capitale:"+this.nbHabitants+ "\nSuperficie de la capitale:"+this.superficie;
	
		return chaine;
	}
	
}
