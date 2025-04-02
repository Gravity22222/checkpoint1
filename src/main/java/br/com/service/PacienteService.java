package br.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.model.Paciente;
import dto.PacienteRequestCreate;

@Service
public class PacienteService {
    
    private List<Paciente> pacientes = new ArrayList<>();
    private Long sequence = 1L;

public Paciente createPaciente(PacienteRequestCreate dto){
    Paciente paciente = new Paciente();
    paciente.setId(sequence++);
    paciente.setNome(dto.getNome());
    paciente.setBairro(dto.getBairro());
    paciente.setEmail(dto.getEmail());
    paciente.setTelefone_completo(dto.getTelefone_completo());
    return paciente;
}
}