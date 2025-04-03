# Documentação do Projeto - Checkpoint 1

## Introdução

Este repositório contém a implementação de um sistema baseado em **microservices** utilizando **Spring Boot** e **Java**. O objetivo é fornecer um serviço RESTful para manipulação de recursos, aplicando boas práticas de desenvolvimento, estruturação de código, testes e documentação.

O projeto faz parte das atividades avaliativas da disciplina **SOA - Microservices and Web Engineering**, ministrada pelo professor **Antonio Carlos de Lima Júnior.**

---

## Configuração do Ambiente

Antes de iniciar o projeto, certifique-se de ter instalado:

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)
- [Postman](https://www.postman.com/) (opcional, para testar a API)

Para verificar se o Java e o Maven estão corretamente instalados, execute os comandos abaixo:

```bash
java -version
mvn -version
```

Caso precise configurar as variáveis de ambiente do Java, siga as instruções no site oficial do [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

---

## Instalação

Para instalar e executar o projeto localmente, siga as etapas abaixo:

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Gravity22222/checkpoint1.git
   ```

2. **Navegue até o diretório do projeto:**
   ```bash
   cd checkpoint1
   ```

3. **Troque para a branch pacient-crud:**
   ```bash
   git checkout pacient-crud
   ```

4. **Execute o projeto usando o Maven:**
   ```bash
   mvn spring-boot:run
   ```

A aplicação estará disponível em **http://localhost:8080**.

---

## Uso

### Endpoints Disponíveis

- **POST** `/pacientes`: Cria um novo paciente.
- **PUT** `/pacientes/{id}`: Atualiza um paciente existente.
- **DELETE** `/pacientes/{id}`: Deleta um paciente existente.
- **GET** `/pacientes/{id}`: Retorna os detalhes de um paciente específico.
- **GET** `/pacientes`: Lista todos os pacientes.

---

## Exemplos de Requisição

### Criar um Novo Paciente

```bash
curl -X POST http://localhost:8080/pacientes \ 
     -H "Content-Type: application/json" \ 
     -d '{
  "nome": "João Silva",
  "endereco": "Rua das Flores, 123",
  "bairro": "Centro",
  "email": "joao.silva@example.com",
  "telefoneCompleto": "+5511999999999"
}'
```

### Atualizar um Paciente

```bash
curl -X PUT http://localhost:8080/pacientes/1 \ 
     -H "Content-Type: application/json" \ 
     -d '{
  "nome": "João Silva",
  "endereco": "Rua das Flores, 123",
  "bairro": "Centro",
  "email": "joao.silva@example.com",
  "telefoneCompleto": "+5511999999999"
}'
```

### Deletar um Paciente

```bash
curl -X DELETE http://localhost:8080/pacientes/1
```

### Listar Todos os Pacientes

```bash
curl -X GET http://localhost:8080/pacientes
```

---

