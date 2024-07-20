package dev.buskopan.senha_segura.service;

import java.util.List;

public interface PasswordService {
    List<String> validate (String pass);
}
