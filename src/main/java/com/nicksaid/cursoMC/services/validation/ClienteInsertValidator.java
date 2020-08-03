package com.nicksaid.cursoMC.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.nicksaid.cursoMC.domain.Cliente;
import com.nicksaid.cursoMC.domain.enums.TipoCliente;
import com.nicksaid.cursoMC.dto.ClienteNewDTO;
import com.nicksaid.cursoMC.repositories.ClienteRepository;
import com.nicksaid.cursoMC.resources.exception.FieldMessage;
import com.nicksaid.cursoMC.services.validation.utils.BR;

//Validator personalizado para anotação e para o nosso DTO
public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {

	@Autowired
	private ClienteRepository repo;

	@Override
	public void initialize(ClienteInsert ann) {
	}

	@Override
	public boolean isValid(ClienteNewDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		// Programando o Validator, fazendo testes e inserindo as mensagens de erro
		if (objDto.getTipo().equals(TipoCliente.PESSOAFISICA.getCod()) && !BR.isValidCPF(objDto.getCpfOuCnpj())) {
			list.add(new FieldMessage("cpfOuCnpj", "O CPF inserido é inválido"));
		}

		if (objDto.getTipo().equals(TipoCliente.PESSOAJURIDICA.getCod()) && !BR.isValidCNPJ(objDto.getCpfOuCnpj())) {
			list.add(new FieldMessage("cpfOuCnpj", "O CNPJ inserido é inválido"));
		}

		Cliente aux = repo.findByEmail(objDto.getEmail());
		if (aux != null) {
			list.add(new FieldMessage("email", "O Email inserido já existente!"));
		}

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}