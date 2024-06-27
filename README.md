# Sistema de Gestão de Funcionários

## Descrição
Este projeto é um sistema para gerenciar informações de funcionários da empresa **MGS (Max Global Sports)**, tem a unica finalidade de apresentação do trabalho  de Sistematização da disciplina de Programação Orientada a Objetos. Permite adicionar, buscar e listar funcionários, incluindo detalhes como alergias e problemas médicos. 

## Tecnologias Utilizadas
- **Java SE (Standard Edition):** Plataforma básica para o desenvolvimento em Java.
- **Java Swing:** Biblioteca GUI para criar a interface gráfica do usuário.
- **Eclipse IDE:** Ambiente de desenvolvimento integrado utilizado para escrever, compilar e executar o código Java.

## Como colocar em operação
1. **Clone o repositório:**
    ```sh
    git clone https://github.com/seu_usuario/sistema-MGS.git
    ```
2. **Importe o projeto no Eclipse:**
    - Vá para `File > Import`.
    - Selecione `Existing Projects into Workspace` e clique em `Next`.
    - Selecione a pasta onde o repositório foi clonado e clique em `Finish`.

3. **Compile e execute o sistema:**
    - Clique com o botão direito na classe `Main` no `Package Explorer`.
    - Selecione `Run As > Java Application`.

## Uso
- **Adicionar um novo funcionário:**
  - Insira as informações solicitadas através da interface gráfica.
- **Buscar um funcionário:**
  - Busque um funcionário pelo nome.
- **Listar todos os funcionários:**
  - Veja uma lista de todos os funcionários cadastrados.

## Estrutura do Projeto
O projeto é composto pelas seguintes classes:
1. **Funcionario:** Representa um funcionário e contém informações como nome, matrícula, alergias, problemas médicos, telefone e email de contato.
2. **SistemaGestaoFuncionarios:** Gerencia a lista de funcionários, permitindo adicionar, buscar e listar funcionários.
3. **Main:** Classe principal que cria a interface gráfica e interage com o usuário.
