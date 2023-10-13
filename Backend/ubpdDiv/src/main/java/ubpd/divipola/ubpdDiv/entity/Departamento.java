package ubpd.divipola.ubpdDiv.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "DEPARTAMENTO")
public class Departamento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID")
	long id;
	
	@Column(name = "NOMBRE")
	String nombre;
}
