# Sistema Escolar - Gestão de Alunos, Professores e Turmas

## Descrição do Projeto
Este é um sistema simples de **gestão escolar** desenvolvido para gerenciar informações sobre **alunos**, **professores** e **turmas**. O sistema oferece funcionalidades para realizar operações de CRUD (Criar, Ler, Atualizar e Deletar) em cada uma dessas entidades. O objetivo do projeto é organizar e armazenar os dados de uma escola de forma eficiente, utilizando o banco de dados **MySQL**.

O projeto possui três entidades principais:
- **Alunos**: Armazena informações sobre os estudantes da escola.
- **Professores**: Armazena informações sobre os professores da escola.
- **Turmas**: Armazena informações sobre as turmas oferecidas.

---

## Funcionalidades
- **CRUD de Alunos**:
  - Adicionar, listar, atualizar e excluir alunos.
  - Cada aluno está associado a uma **turma** e possui uma **nota**.
- **CRUD de Professores**:
  - Adicionar, listar, atualizar e excluir professores.
  - Cada professor está associado a uma **turma** e recebe um **salário**.
- **CRUD de Turmas**:
  - Adicionar, listar, atualizar e excluir turmas.
  - Cada turma pode ter múltiplos **alunos** e **professores**.

---

## Banco de Dados
O banco de dados é gerido pelo **MySQL** e contém três tabelas principais:

1. **turmas**: Armazena as turmas da escola.
   - Campos: `id`, `nome_turma`.
2. **alunos**: Armazena os alunos e suas respectivas turmas e notas.
   - Campos: `id`, `nome_aluno`, `turma_id`, `nota`.
3. **professores**: Armazena os professores, suas respectivas turmas e salários.
   - Campos: `id`, `nome_professor`, `turma_id`, `salario`.

---

## Scripts de Banco de Dados
Para configurar o banco de dados, utilize os seguintes comandos SQL para criar as tabelas necessárias:


### Pré-requisitos
- **MySQL** instalado e rodando na sua máquina local ou servidor.
- Um banco de dados chamado `escola` deve ser criado.

### Passos para Execução:
1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/sistema-escolar.git

 ---

  ## Observações Finais
Este sistema é um projeto simples de gestão escolar, com foco em organização e persistência de dados. Ele pode ser facilmente expandido com novos recursos e funcionalidades, 
como matrículas, cursos e avaliações. A estrutura de banco de dados foi planejada para ser flexível e suportar futuras modificações sem comprometer a integridade dos dados

