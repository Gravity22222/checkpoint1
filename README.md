# checkpoint1

Projeto desenvolvido como parte do curso **"SOA - Microservices and Web Engineering"**, ministrado pelo professor Antonio Carlos de Lima Júnior.

## Instalação

1. **Compilar e empacotar o projeto:**
   ```bash
   mvn clean package

2. **Configuração do Swagger:** Adicione as seguintes propriedades ao arquivo application.properties para configurar o Swagger:
```bash
  springdoc.swagger-ui.path=/
  springdoc.swagger-ui.disable-swagger-default-url=true
````
 **Documentação oficial do Swagger**
- https://springdoc.org/properties.html

## Execução

**Iniciar a aplicação utilizando o Maven:**

  ````bash
  mvn spring-boot:run
  ````

## Documentação da API
Após iniciar a aplicação, a documentação interativa da API estará disponível em:
- http://localhost:8080/swagger-ui.html


## Referencias
- https://springdoc.org

  
