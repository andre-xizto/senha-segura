package dev.buskopan.senha_segura.validator.validators;

import dev.buskopan.senha_segura.validator.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacterValidator implements Validator {
    @Override
    public String validate(String pass) {
        String regex = "(?=.*[!@#$%^&*(),.?\":{}|<>])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);

        if (!matcher.find()) {
            return "Password must have at least one special character";
        }

        return null;
    }
}
