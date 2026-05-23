📘 Padrão de Projeto Observer
O padrão de projeto Observer é um padrão comportamental que define uma dependência do tipo um-para-muitos entre objetos. Nesse padrão, quando o estado de um objeto muda, todos os seus dependentes (observadores) são automaticamente notificados e atualizados.

🎯 Objetivo
O principal objetivo do Observer é desacoplar o objeto que gera eventos (Subject) dos objetos que reagem a esses eventos (Observers), permitindo maior flexibilidade e extensibilidade no sistema.

🧩 Componentes do Padrão
1. Subject (Sujeito / Observable)
É o objeto principal que:

Mantém uma lista de observadores
Permite adicionar/remover observadores
Notifica os observadores quando ocorre uma mudança

2. Observer (Observador)
É uma interface ou classe abstrata que define o método de atualização (update ou equivalente), que será chamado quando houver mudanças no Subject.
3. ConcreteObserver (Observadores concretos)
São as implementações da interface Observer. Cada uma reage de forma diferente às notificações recebidas.

🔄 Funcionamento

Observadores se registram no Subject
Um evento ocorre no Subject (ex: mudança de estado)
O Subject notifica todos os Observers
Cada Observer executa sua lógica de reação


📊 Vantagens

✅ Baixo acoplamento entre objeto principal e dependentes
✅ Permite adicionar novos comportamentos sem modificar o Subject
✅ Facilita manutenção e evolução do sistema
✅ Implementa o princípio Open/Closed (aberto para extensão, fechado para modificação)


⚠️ Desvantagens

❗ Pode gerar muitas notificações (overhead)
❗ Dificuldade de rastrear fluxo de execução em sistemas grandes
❗ Possível impacto de performance se houver muitos observers


💡 Aplicação no Exercício
No problema da operadora de pedágio:

Subject → Sistema de registro de passagens (PassagemPublisher)
Eventos → Cada passagem registrada
Observers →

Fatura (cálculo financeiro)
Analytics (BI)
Contabilidade
Notificação ao cliente



✔ Benefício no contexto:
Cada área do sistema reage de forma independente ao mesmo evento de passagem, sem que o sistema principal precise conhecer os detalhes de cada área.

🧠 Resumo
O padrão Observer permite que múltiplos objetos sejam automaticamente notificados quando um evento ocorre em outro objeto, mantendo o sistema flexível, modular e facilmente extensível.



## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
