package ubpd.divipola.ubpdDiv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubpd.divipola.ubpdDiv.entity.Municipio;
import ubpd.divipola.ubpdDiv.persistence.MunicipioRepository;
import ubpd.divipola.ubpdDiv.service.MunicipioService;

@Service
public class MunicipioServiceImpl implements MunicipioService{
	
	@Autowired
	private MunicipioRepository dataMun;

	@Override
	public List<Municipio> listSearchMun() {
		// TODO Auto-generated method stub
		return dataMun.findAll();
	}

}
