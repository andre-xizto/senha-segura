package dev.buskopan.senha_segura.validator.validators;

import dev.buskopan.senha_segura.validator.Validator;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class NumericValidator implements Validator {
    @Override
    public String validate(String pass) {
        String regex = "(?=.*[0-9])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);

        if (!matcher.find()) {
            return "Password must have at least one numeric character";
        }

        return null;

    }
}
