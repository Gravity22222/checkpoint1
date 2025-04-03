package br.com.fiap.checkpoint1.controller;

import br.com.fiap.checkpoint1.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint1.dto.PacienteRequestUpdate;
import br.com.fiap.checkpoint1.dto.PacienteResponse;
import br.com.fiap.checkpoint1.model.Paciente;
import br.com.fiap.checkpoint1.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping
    public ResponseEntity<PacienteResponse> criarPaciente(@RequestBody PacienteRequestCreate dto) {
        Paciente paciente = service.createPaciente(dto);
        PacienteResponse pacienteResponse = new PacienteResponse().toDto(paciente);
        return ResponseEntity.status(201).body(pacienteResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacienteResponse> atualizarPaciente(@PathVariable Long id,
            @RequestBody PacienteRequestUpdate dto) {
        Paciente paciente = service.updatePaciente(id, dto);
        if (paciente != null) {
            PacienteResponse pacienteResponse = new PacienteResponse().toDto(paciente);
            return ResponseEntity.ok(pacienteResponse);
        }
        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPaciente(@PathVariable Long id) {
        if (service.deletePaciente(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponse> lerPacientePorId(@PathVariable Long id) {
        Paciente paciente = service.getPacienteById(id);
        if (paciente != null) {
            PacienteResponse pacienteResponse = new PacienteResponse().toDto(paciente);
            return ResponseEntity.ok(pacienteResponse);
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponse>> listarTodosOsPacientes() {
        List<PacienteResponse> pacientes = service.getAll();
        return ResponseEntity.ok(pacientes);
    }
}