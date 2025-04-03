package br.com.fiap.checkpoint1.dto;

public class PacienteRequestUpdate {

    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneCompleto() {
        return telefone_completo;
    }

    public void setTelefoneCompleto(String telefoneCompleto) {
        this.telefone_completo = telefoneCompleto;
    }
}