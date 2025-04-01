# Cenário 
um sistema para gerenciar projetos de software em uma empresa de desenvolvimento. O sistema deve permitir o controle de projetos, desenvolvedores, tarefas e dependências entre as tarefas.

## Requisitos do sistema:
### Projeto:
Deve possuir um nome, descrição, data de início e término. Um projeto é composto por tarefas (composição).
### Desenvolvedor: 
Deve possuir nome, e-mail e especialidade. Um desenvolverdor pode ser responsável por múltiplas tarefas (associação).
### Tarefa: 
Possuir titulo, descrição, status (pendente, em andamento e concluída) e um desenvolvedor responsável. Uma tarefa pode ter dependências de outras tarefas (associação).
### Dependência:
Deve possuir uma tarefa predecessora e uma tarefa sucessora. Uma dependência define que a tarefa sucessora só pode ser iniciada após a conclusão da tarefa predecessora.
### Interface Gerenciavel: 
Deve definir um método exibirDetalhes() que imprime na tela os detalhes do projeto ou da tarefa.