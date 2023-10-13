package ubpd.divipola.ubpdDiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ubpd.divipola.ubpdDiv.service.MunDepDtoService;


@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private MunDepDtoService service;
	
	
	@GetMapping("/municipio")
	public String principal(Model model) {
		// hacer llamado al service para hacer consulta y traer los datos indicados
        model.addAttribute("ListDtoMunDep", service.listMunAndDep());
        return "vistaPrincipal";
		//return null;
	}
}
