package date;
import javax.persistence.*;

@Entity
@Table(name = "produse")
public class Produs {
	    private Integer id_produs;
	    private String nume_categorie;
	    private String nume_produs;
	    private String descriere_produs;
	    private Float pret_unitar;
	    private Integer nivel_existent;
	    private Integer numar_portii;
	    private String poza;
	        
	    	        
		

		public Produs() {
			super();
		}


		public Produs(String nume_categorie, String nume_produs, String descriere_produs, Float pret_unitar,
				Integer nivel_existent, Integer numar_portii, String poza) {
			super();
			this.nume_categorie = nume_categorie;
			this.nume_produs = nume_produs;
			this.descriere_produs = descriere_produs;
			this.pret_unitar = pret_unitar;
			this.nivel_existent = nivel_existent;
			this.numar_portii = numar_portii;
			this.poza = poza;
		}


		@Id
		@Column(name = "id_produs")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    public Integer getId_produs() {
			return id_produs;
		}


		public void setId_produs(Integer id_produs) {
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



		public Float getPret_unitar() {
			return pret_unitar;
		}



		public void setPret_unitar(Float pret_unitar) {
			this.pret_unitar = pret_unitar;
		}



		public Integer getNivel_existent() {
			return nivel_existent;
		}



		public void setNivel_existent(Integer nivel_existent) {
			this.nivel_existent = nivel_existent;
		}



		public Integer getNumar_portii() {
			return numar_portii;
		}



		public void setNumar_portii(Integer numar_portii) {
			this.numar_portii = numar_portii;
		}
		public String getPoza() {
			return poza;
		}


		public void setPoza(String poza) {
			this.poza = poza;
		}

		
	    
}
