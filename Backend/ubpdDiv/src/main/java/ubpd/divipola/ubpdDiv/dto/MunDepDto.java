package ubpd.divipola.ubpdDiv.dto;

public class MunDepDto {

	private long id_mun;
	private long id_depa;
	private String nom_mun;
	private String nom_depa;
	
	public MunDepDto() {

	}

	
	public MunDepDto(long id_mun, long id_depa, String nom_mun, String nom_depa) {
		super();
		this.id_mun = id_mun;
		this.id_depa = id_depa;
		this.nom_mun = nom_mun;
		this.nom_depa = nom_depa;
	}
	public long getId_mun() {
		return id_mun;
	}
	public void setId_mun(long id_mun) {
		this.id_mun = id_mun;
	}
	public long getId_depa() {
		return id_depa;
	}
	public void setId_depa(long id_depa) {
		this.id_depa = id_depa;
	}
	public String getNom_mun() {
		return nom_mun;
	}
	public void setNom_mun(String nom_mun) {
		this.nom_mun = nom_mun;
	}
	public String getNom_depa() {
		return nom_depa;
	}
	public void setNom_depa(String nom_depa) {
		this.nom_depa = nom_depa;
	}
}
