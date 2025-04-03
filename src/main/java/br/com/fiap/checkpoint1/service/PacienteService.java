package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint1.dto.PacienteRequestUpdate;
import br.com.fiap.checkpoint1.dto.PacienteResponse;
import br.com.fiap.checkpoint1.model.Paciente;
import br.com.fiap.checkpoint1.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;
    private Long sequence = 1L;

    public Paciente createPaciente(PacienteRequestCreate dto) {
        Paciente paciente = new Paciente();
        paciente.setId(sequence++);
        paciente.setNome(dto.getNome());
        paciente.setEndereco(dto.getEndereço());
        paciente.setBairro(dto.getBairro());
        paciente.setEmail(dto.getEmail());
        paciente.setTelefone_completo(dto.getTelefone_completo());
        return repository.save(paciente);
    }

    public Paciente updatePaciente(Long id, PacienteRequestUpdate dto) {
        Optional<Paciente> optionalPaciente = repository.findById(id);
        if (optionalPaciente.isPresent()) {
            Paciente paciente = optionalPaciente.get();
            paciente.setNome(dto.getNome());
            paciente.setEndereco(dto.getEndereco());
            paciente.setBairro(dto.getBairro());
            paciente.setEmail(dto.getEmail());
            paciente.setTelefone_completo(dto.getTelefoneCompleto());
            return repository.save(paciente);
        }
        return null;
    }

    public boolean deletePaciente(Long id) {
        return repository.deleteById(id);
    }

    public Paciente getPacienteById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<PacienteResponse> getAll() {
        return repository.findAll().stream()
                .map(paciente -> new PacienteResponse().toDto(paciente))
                .collect(Collectors.toList());
    }
}