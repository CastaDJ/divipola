package ubpd.divipola.ubpdDiv.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "MUNICIPIO")
public class Municipio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID")
	long id;
	
	@Column(name = "NOMBRE_MUN")
	String nombre_mun;
	
	@Column(name = "ID_DEP")
	long id_dep;
	
}
