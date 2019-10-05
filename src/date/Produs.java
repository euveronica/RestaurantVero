package date;

public class Produs {
	
	public String categorie;
	public String numeProdus;
	public String descriereProdus;
	public String pretUnitar;
	public String stoc;
	public String poza;
	public String nrPortii;
	
	
	public Produs(String categorie, String numeProdus, String descriereProdus, String pretUnitar,
			String poza, String nrPortii,  String stoc) {
		super();
		this.categorie = categorie;
		this.numeProdus = numeProdus;
		this.descriereProdus = descriereProdus;
		this.pretUnitar = pretUnitar;
		this.stoc = stoc;
		this.poza = poza;
		this.nrPortii = nrPortii;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getNumeProdus() {
		return numeProdus;
	}
	public void setNumeProdus(String numeProdus) {
		this.numeProdus = numeProdus;
	}
	public String getDescriereProdus() {
		return descriereProdus;
	}
	public void setDescriereProdus(String descriereProdus) {
		this.descriereProdus = descriereProdus;
	}
	public String getPretUnitar() {
		return pretUnitar;
	}
	public void setPretUnitar(String pretUnitar) {
		this.pretUnitar = pretUnitar;
	}
	public String getStoc() {
		return stoc;
	}
	public void setStoc(String stoc) {
		this.stoc = stoc;
	}
	public String getPoza() {
		return poza;
	}
	public void setPoza(String poza) {
		this.poza = poza;
	}
	public String getNrPortii() {
		return nrPortii;
	}
	public void setNrPortii(String nrPortii) {
		this.nrPortii = nrPortii;
	}
	
	
	
	
}
