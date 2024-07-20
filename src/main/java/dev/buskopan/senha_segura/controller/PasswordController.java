package dev.buskopan.senha_segura.controller;

import dev.buskopan.senha_segura.controller.dto.RequestDTO;
import dev.buskopan.senha_segura.controller.dto.ResponseDTO;
import dev.buskopan.senha_segura.service.PasswordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/check")
public class PasswordController {

    private final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @PostMapping
    public ResponseEntity<?> checkPassword(@RequestBody RequestDTO req) {
        List<String> errors = passwordService.validate(req.password());
        if (errors.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        ResponseDTO response = new ResponseDTO(errors);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
