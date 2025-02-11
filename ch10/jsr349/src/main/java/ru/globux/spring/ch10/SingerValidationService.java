package ru.globux.spring.ch10;

import ru.globux.spring.ch10.obj.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import java.util.Set;

@Service("singerValidationService")
public class SingerValidationService {

	@Autowired
	private Validator validator;

	public Set<ConstraintViolation<Singer>> validateSinger(Singer singer) {
		return validator.validate(singer);
	}
}
