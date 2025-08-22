# API de Gerenciamento de Usuários

API REST desenvolvida com Spring Boot para gerenciamento de usuários.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- JPA / Hibernate
- Banco de dados (H2)

## Endpoints

### Usuários

- `GET /usuarios`: Lista todos os usuários
- `GET /usuarios/{id}`: Busca um usuário por ID
- `POST /usuarios`: Cria um novo usuário
- `PUT /usuarios/{id}`: Atualiza um usuário existente
- `DELETE /usuarios/{id}`: Remove um usuário


## Modelo de Requisição

### Criar/Atualizar Usuário (POST/PUT)
```json
{
    "nome": "Nome do Usuário",
    "email": "email@exemplo.com",
    "telefone": "999999999"
}
```

## Estrutura do Projeto

```plaintext
src/main/java/com/estudos/dayane/projetoweb/
├── entities/
│   └── Usuario.java
├── repositories/
│   └── UsuarioRepository.java
├── resources/
│   ├── UsuarioResource.java
│   └── exceptions/
│       └── MensagemError.java
├── services/
│   ├── UsuarioService.java
│   └── exceptions/
│       ├── BancoDeDadosException.java
│       └── RecursoNaoEncontradoException.java
└── ProjetowebApplication.java
```






