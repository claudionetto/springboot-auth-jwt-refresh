# Spring Boot Auth JWT Refresh Token
API Spring Boot para autenticação de usuários com JSON Web Token (JWT) e refresh token.

## Descrição

Este projeto demonstra uma implementação segura de autenticação utilizando JWT e refresh token em uma API Spring Boot. Ele fornece endpoints para registro de usuários, login, refresh de token e acesso a recursos protegidos.

## Funcionalidades

- **Registro de Usuário**: Permite que novos usuários se registrem na API fornecendo nome de usuário, email e senha.
- **Login**: Autentica usuários existentes e emite um JWT de acesso e um refresh token.
- **Refresh Token**: Permite que usuários renovem seus tokens de acesso utilizando o refresh token, sem precisar inserir credenciais novamente.
- **Acesso a Recursos Protegidos**: Os endpoints que exigem autenticação só podem ser acessados com um JWT válido.

## Tecnologias Utilizadas
- **Linguagem**: Java
- **Framework**: Spring Boot
- **Segurança**: Spring Security
- **Autenticação**: JWT (JSON Web Token)
- **Banco de Dados**: H2 (em memória)
- **ORM**: Spring Data JPA
- **Documentação**: Swagger UI

## Instalação

1. **Clone o repositório:**
```bash
git clone https://github.com/claudionetto/springboot-auth-jwt-refresh.git
```

2. **Acesse o diretório do projeto:**
```bash
cd springboot-auth-jwt-refresh
```

3. **Construa o projeto com o Maven:**
```bash
mvn clean install
```
   
4. **Execute a aplicação:**
```bash
mvn spring-boot:run
```

## Uso

Após iniciar a aplicação, acesse a documentação da API através do Swagger UI:

http://localhost:8080/swagger-ui/index.html

A documentação do Swagger fornece detalhes sobre os endpoints da API, incluindo:

- ``/api/auth/signup``: Registra um novo usuário.
- ``/api/auth/signin``: Realiza o login do usuário e retorna os tokens JWT.
- ``/api/auth/refresh``: Renova o token de acesso utilizando o refresh token.
- ``/api/users``: Endpoint protegido que retorna informações do usuário (requer autenticação).

## Diagrama de Fluxo

[Usuário] --solicitação de registro--> [API] --cria usuário e retorna token--> [Usuário]
[Usuário] --solicitação de login--> [API] --verifica credenciais e retorna tokens--> [Usuário]
[Usuário] --token expira--> [API] --solicita refresh token--> [API] --valida refresh token e retorna novo token de acesso--> [Usuário] 

## Segurança

O projeto implementa as seguintes medidas de segurança:

- **JWTs assinados**: Os JWTs são assinados com uma chave secreta para garantir sua integridade e autenticidade.
- **Refresh Tokens**: Permite renovar o token de acesso sem exigir que o usuário se autentique novamente.
- **Armazenamento seguro de tokens**: Armazene o refresh token de forma segura (por exemplo, em um HttpOnly cookie) para evitar acesso não autorizado.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto está licenciado sob a licença MIT - consulte o arquivo LICENSE para obter detalhes.

## Contato

Claudio Netto Junior- cnetto147@gmail.com
   
