# 🏥 Sistema de Gestão Hospitalar e Faturamento

Projeto Final desenvolvido para a disciplina de **Programação Orientada a Objetos (P.O.O)**. O objetivo é gerenciar as operações de um hospital, desde o atendimento clínico até a geração automatizada de notas fiscais com cálculos de impostos.

## 👥 Integrantes do Grupo (Grupo 5)
* Lucas Lopes Cardoso
* João Paulo Cordebello
* Nome do Participante 3
* Nome do Participante 4
* Nome do Participante 5

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java
* **Banco de Dados:** PostgreSQL (Hospedado via **Neon.tech**)
* **Conectividade:** JDBC (Java Database Connectivity)
* **Ferramentas de Modelagem:** Diagrama de Classes UML e Diagrama Entidade-Relacionamento (ER)

## 📋 Requisitos de P.O.O Aplicados
O sistema foi desenvolvido utilizando os pilares da Orientação a Objetos exigidos:
* **Encapsulamento e Modificadores de Acesso:** Proteção de dados sensíveis em classes de entidade.
* **Herança e Polimorfismo:** Classes abstratas e concretas para Médicos, Enfermeiras e Pacientes.
* **Interfaces:** Implementação de contratos para serviços de faturamento e exportação.
* **Tratamento de Exceções:** Gestão de erros para faturas inexistentes ou falhas de conexão.
* **Coleções:** Uso de `ArrayList`, `HashSet` ou `Map` para gerenciar listas de leitos e atendimentos.
* **Arquivos:** Geração de relatórios e notas fiscais em formato `.csv`.

## ⚙️ Funcionalidades Principais
1.  **Gestão Hospitalar:** Cadastro de alas (UTI, Pediatria, etc.), controle de leitos e credenciamento de planos de saúde.
2.  **Corpo Clínico:** Registro de médicos (CRM) e enfermeiras (CRE) com hierarquia de enfermeira-chefe.
3.  **Atendimento e Internação:** Registro de consultas, exames, prescrição de medicamentos e controle de entrada/saída de leitos.
4.  **Faturamento Automatizado:**
    * Cálculo de impostos utilizando a classe `BigDecimal` (ISS: 3%, PIS: 0.65%, COFINS: 3%, IRPJ: 1.2%, CSLL: 1.08%).
    * Geração de Nota Fiscal eletrônica em arquivo CSV.
    * Pesquisa de faturas via Scanner/Swing com tratamento de erro.

## 📂 Estrutura do Banco de Dados
O banco de dados está estruturado para suportar o modelo lógico proposto:
* **DDL:** Scripts de criação de tabelas e tipos ENUM.
* **DML:** Inserção de pelo menos 10 registros por tabela para testes (exceto na tabela de Nota Fiscal).

## 🚀 Como Executar
1. Clone o repositório em sua máquina.
2. Certifique-se de ter o Java JDK 17+ instalado.
3. Importe o driver JDBC do PostgreSQL no seu projeto.
4. Configure as credenciais do banco de dados (Neon) no arquivo de conexão.
5. Execute a classe principal para abrir a interface de faturamento.

---
