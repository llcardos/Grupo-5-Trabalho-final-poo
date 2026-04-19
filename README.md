# 🏥 Sistema de Gestão Hospitalar e Faturamento

Projeto Final desenvolvido para a disciplina de **Programação Orientada a Objetos (P.O.O)**. [cite_start]O objetivo é gerenciar as operações de um hospital, desde o atendimento clínico até a geração automatizada de notas fiscais com cálculos de impostos[cite: 1, 3, 5].

## 👥 Integrantes do Grupo (Grupo 5)
* Lucas Lopes Cardoso
* Nome do Participante 2
* Nome do Participante 3
* Nome do Participante 4
* Nome do Participante 5

## 🛠️ Tecnologias Utilizadas
* [cite_start]**Linguagem:** Java [cite: 85]
* [cite_start]**Banco de Dados:** PostgreSQL (Hospedado via **Neon.tech**) [cite: 23, 79]
* **Conectividade:** JDBC (Java Database Connectivity)
* [cite_start]**Ferramentas de Modelagem:** Diagrama de Classes UML e Diagrama Entidade-Relacionamento (ER) [cite: 81, 133]

## 📋 Requisitos de P.O.O Aplicados
[cite_start]O sistema foi desenvolvido utilizando os pilares da Orientação a Objetos exigidos[cite: 8]:
* [cite_start]**Encapsulamento e Modificadores de Acesso:** Proteção de dados sensíveis em classes de entidade[cite: 12, 13].
* [cite_start]**Herança e Polimorfismo:** Classes abstratas e concretas para Médicos, Enfermeiras e Pacientes[cite: 10, 11, 19].
* [cite_start]**Interfaces:** Implementação de contratos para serviços de faturamento e exportação[cite: 9].
* [cite_start]**Tratamento de Exceções:** Gestão de erros para faturas inexistentes ou falhas de conexão[cite: 14, 122].
* [cite_start]**Coleções:** Uso de `ArrayList`, `HashSet` ou `Map` para gerenciar listas de leitos e atendimentos[cite: 18].
* [cite_start]**Arquivos:** Geração de relatórios e notas fiscais em formato `.csv`[cite: 16, 124].

## ⚙️ Funcionalidades Principais
1.  [cite_start]**Gestão Hospitalar:** Cadastro de alas (UTI, Pediatria, etc.), controle de leitos e credenciamento de planos de saúde[cite: 26, 39, 41, 52].
2.  [cite_start]**Corpo Clínico:** Registro de médicos (CRM) e enfermeiras (CRE) com hierarquia de enfermeira-chefe[cite: 31, 35, 37].
3.  [cite_start]**Atendimento e Internação:** Registro de consultas, exames, prescrição de medicamentos e controle de entrada/saída de leitos[cite: 43, 49, 57, 60].
4.  **Faturamento Automatizado:**
    * [cite_start]Cálculo de impostos utilizando a classe `BigDecimal` (ISS: 3%, PIS: 0.65%, COFINS: 3%, IRPJ: 1.2%, CSLL: 1.08%)[cite: 21, 100, 103, 106, 109, 112].
    * [cite_start]Geração de Nota Fiscal eletrônica em arquivo CSV[cite: 75, 125].
    * [cite_start]Pesquisa de faturas via Scanner/Swing com tratamento de erro[cite: 116, 122].

## 📂 Estrutura do Banco de Dados
O banco de dados está estruturado para suportar o modelo lógico proposto:
* **DDL:** Scripts de criação de tabelas e tipos ENUM.
* [cite_start]**DML:** Inserção de pelo menos 10 registros por tabela para testes (exceto na tabela de Nota Fiscal)[cite: 84].

## 🚀 Como Executar
1. Clone o repositório em sua máquina.
2. Certifique-se de ter o Java JDK 17+ instalado.
3. Importe o driver JDBC do PostgreSQL no seu projeto.
4. Configure as credenciais do banco de dados (Neon) no arquivo de conexão.
5. [cite_start]Execute a classe principal para abrir a interface de faturamento[cite: 116].

---
