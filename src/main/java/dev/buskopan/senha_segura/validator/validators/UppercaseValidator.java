package dev.buskopan.senha_segura.validator.validators;

import dev.buskopan.senha_segura.validator.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UppercaseValidator implements Validator {

    @Override
    public String validate(String pass) {
        String regex = "(?=.*[A-Z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);
        if (!matcher.find()) {
            return "Password must have at least one uppercase character";
        }
        return null;
    }
}
