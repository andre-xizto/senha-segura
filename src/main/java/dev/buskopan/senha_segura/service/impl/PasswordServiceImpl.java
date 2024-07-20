package dev.buskopan.senha_segura.service.impl;

import dev.buskopan.senha_segura.service.PasswordService;
import dev.buskopan.senha_segura.validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class PasswordServiceImpl implements PasswordService {

    private final List<Validator> validators;

    public PasswordServiceImpl(List<Validator> validators) {
        this.validators = validators;
    }

    @Override
    public List<String> validate(String pass) {
        List<String> errors = new ArrayList<>();
        for (Validator validator : validators) {
            String error = validator.validate(pass);
            if (error != null) {
                errors.add(error);
            }
        }
        return errors;
    }
}
