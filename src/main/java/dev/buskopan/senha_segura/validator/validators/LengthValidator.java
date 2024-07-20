package dev.buskopan.senha_segura.validator.validators;

import dev.buskopan.senha_segura.validator.Validator;
import org.springframework.stereotype.Component;

@Component
public class LengthValidator implements Validator {

    @Override
    public String validate(String pass) {
        if (pass != null && pass.length() >= 8) {
            return null;
        }
        return "Password must have at least 8 characters";
    }
}
