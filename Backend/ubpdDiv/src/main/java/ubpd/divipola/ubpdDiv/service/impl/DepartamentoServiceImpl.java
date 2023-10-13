package ubpd.divipola.ubpdDiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubpd.divipola.ubpdDiv.entity.Departamento;
import ubpd.divipola.ubpdDiv.persistence.DepartamentoRepository;
import ubpd.divipola.ubpdDiv.service.DepartamentoService;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

	@Autowired
	private DepartamentoRepository dataDep;
	@Override
	public Departamento searchDep(long id) {
		// TODO Auto-generated method stub
		return dataDep.getReferenceById(id);
	}

}
