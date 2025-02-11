package ru.globux.spring.ch10;

import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

import ru.globux.spring.ch10.obj.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("singerValidationService")
public class SingerValidationService {
    @Autowired
    private Validator validator;

    public Set<ConstraintViolation<Singer>> validateSinger(Singer singer) {
        return validator.validate(singer);
    }
}
