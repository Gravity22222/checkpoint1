package br.com.fiap.checkpoint1.repository;

import br.com.fiap.checkpoint1.model.Paciente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PacienteRepository {

    private List<Paciente> pacientes = new ArrayList<>();

    public Paciente save(Paciente paciente) {
        pacientes.add(paciente);
        return paciente;
    }

    public Optional<Paciente> findById(Long id) {
        return pacientes.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public List<Paciente> findAll() {
        return new ArrayList<>(pacientes);
    }

    public boolean deleteById(Long id) {
        return pacientes.removeIf(p -> p.getId().equals(id));
    }
}