package ubpd.divipola.ubpdDiv.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ubpd.divipola.ubpdDiv.entity.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long>{

}
