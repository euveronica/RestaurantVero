package date;
import javax.persistence.*;

@Entity
@Table(name = "produse")
public class Produs {
	    private long id_produs;
	    private String nume_categorie;
	    private String nume_produs;
	    private String descriere_produs;
	    private float pret_unitar;
	    private int nivel_existent;
	    private int numar_portii;
	        
	    	        
		public Produs() {
			super();
		}


		@Id
		@Column(name = "id_produs")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    public long getId_produs() {
			return id_produs;
		}


		public void setId_produs(long id_produs) {
			this.id_produs = id_produs;
		}


		public String getNume_categorie() {
			return nume_categorie;
		}

		public void setNume_categorie(String nume_categorie) {
			this.nume_categorie = nume_categorie;
		}


		public String getNume_produs() {
			return nume_produs;
		}

		public void setNume_produs(String nume_produs) {
			this.nume_produs = nume_produs;
		}



		public String getDescriere_produs() {
			return descriere_produs;
		}



		public void setDescriere_produs(String descriere_produs) {
			this.descriere_produs = descriere_produs;
		}



		public float getPret_unitar() {
			return pret_unitar;
		}



		public void setPret_unitar(float pret_unitar) {
			this.pret_unitar = pret_unitar;
		}



		public int getNivel_existent() {
			return nivel_existent;
		}



		public void setNivel_existent(int nivel_existent) {
			this.nivel_existent = nivel_existent;
		}



		public int getNumar_portii() {
			return numar_portii;
		}



		public void setNumar_portii(int numar_portii) {
			this.numar_portii = numar_portii;
		}
		
		
	    
}
