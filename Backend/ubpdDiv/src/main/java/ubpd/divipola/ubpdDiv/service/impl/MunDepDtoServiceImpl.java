package ubpd.divipola.ubpdDiv.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubpd.divipola.ubpdDiv.dto.MunDepDto;
import ubpd.divipola.ubpdDiv.entity.*;
import ubpd.divipola.ubpdDiv.service.*;



@Service
public class MunDepDtoServiceImpl implements MunDepDtoService{

	@Autowired
	private DepartamentoService depService;
	
	@Autowired
	private MunicipioService munService;
	
	@Override
	public List<MunDepDto> listMunAndDep() {

		
		List<MunDepDto> res = new ArrayList<>();
		List<Municipio> resMun = munService.listSearchMun();
		Departamento resDep = depService.searchDep(5l);
		
		
		for (Municipio municipio : resMun) {
			
			MunDepDto resDto = new MunDepDto();
			resDto.setId_mun(municipio.getId());
			resDto.setNom_mun(municipio.getNombre_mun());
			resDto.setId_depa(municipio.getId_dep());
			resDto.setNom_depa(resDep.getNombre());
			res.add(resDto);
		}

		return res;
	}

}
