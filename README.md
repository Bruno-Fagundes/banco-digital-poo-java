# Banco Digital - Projeto de Programação Orientada a Objetos (POO) em Java

Este projeto simula um banco digital utilizando os conceitos de **Programação Orientada a Objetos (POO)** em Java. O objetivo é reforçar o conhecimento dos pilares da POO, como **herança**, **polimorfismo**, **encapsulamento** e **abstração**, no contexto bancário.

## Descrição do Projeto

O projeto consiste na criação de um banco digital simples, onde é possível realizar operações bancárias como **depósitos**, **saques**, **transferências** e **consultar extratos**. Além disso, o sistema simula a criação de diferentes tipos de contas (como **Conta Corrente** e **Conta Poupança**) e interage com os dados de **clientes** e **contas bancárias**.

## Funcionalidades

- **Cadastrar Conta**: Criação de contas bancárias de diferentes tipos (Corrente, Poupança, etc).
- **Operações Bancárias**:
    - Depósito: Adicionar valor à conta.
    - Saque: Retirar valor da conta.
    - Transferência: Transferir valores entre contas.
    - Consultar Extrato: Exibir informações da conta.
- **Cadastro de Cliente**: Cada conta está associada a um cliente, e o cliente pode ter múltiplas contas.
- **Exibição de Relatórios**: Relatório de contas e clientes cadastrados.

## Estrutura do Projeto

- **Main**: Classe principal para execução do sistema bancário.
- **Conta**: Classe abstrata que define as operações básicas de uma conta bancária.
- **ContaCorrente, ContaPoupanca, ContaSalario**: Implementações específicas de contas bancárias.
- **Banco**: Classe que gerencia contas e clientes.
- **Cliente**: Classe que representa um cliente do banco.

## Como Usar

### 1. Clonar o repositório

Para começar, clone o repositório para o seu ambiente local:

```bash
git clone https://github.com/seu-usuario/banco-digital-poo-java.git
cd banco-digital-poo-java
