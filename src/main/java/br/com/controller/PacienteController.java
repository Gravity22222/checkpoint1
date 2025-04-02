package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.service.PacienteService;
import dto.PacienteRequestCreate;
import dto.PacienteResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<PacienteResponse> create(
                                @RequestBody PacienteRequestCreate dto) {                                    
        
        return ResponseEntity.status(201).body(
            new PacienteResponse().toDto(
                pacienteService.createPaciente(dto)
            )
        );
    }

    
}
