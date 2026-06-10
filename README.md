# ☕ Programação Orientada a Objetos — Java

Repositório com exercícios e projetos desenvolvidos ao longo da disciplina de **Programação Orientada a Objetos (POO)**, implementados em **Java**.

![Linguagem](https://img.shields.io/static/v1?label=Java&message=language&color=orange&style=for-the-badge&logo=java)
![Status](https://img.shields.io/static/v1?label=STATUS&message=EM%20ANDAMENTO&color=yellow&style=for-the-badge)

## 🎯 Sobre a Disciplina

A disciplina tem por objetivo auxiliar os(as) alunos(as) a compreenderem os principais conceitos relacionados ao paradigma de **Programação Orientada a Objetos (POO)**, a citar:

- Classes, atributos e métodos
- Métodos construtores e modificadores de acesso
- Encapsulamento, herança e polimorfismo
- Sobrescrita e sobrecarga de métodos

Tudo isso aplicado ao **Java**, linguagem reconhecida como fortemente orientada a objetos.

Também faz parte do objetivo da disciplina capacitar os(as) alunos(as) a aplicar esses conceitos em um **cenário próximo ao mercado real**, com a criação de uma aplicação Java que possua **interface gráfica** e realize **conexão com um banco de dados (SGBD)**.

## 📂 Estrutura do Repositório

| Pasta | Tipo | Conteúdo |
|-------|------|----------|
| [`INTRO`](./INTRO) | Exercício introdutório | Operadores, estruturas condicionais (`if/else`, `switch`) e entrada de dados com `Scanner` |
| [`Genérico`](./Genérico) | Exercício introdutório | Manipulação de arrays, ordenação com `Arrays.sort()` e laços com filtros de pares/ímpares |
| [`ATV_00`](./ATV_00) | Exercício introdutório | Variáveis, tipos primitivos, `printf`, data/hora com `LocalDate` e saudação dinâmica |
| [`ATV_01`](./ATV_01) | Exercício introdutório | Problema de permutação de vagões usando `Stack` — resolução estilo Beecrowd |
| [`Cadastrex`](./Cadastrex) | Projeto | Classes, objetos, herança e encapsulamento: `Circulo`, `Conta`, `Estudante`, `Funcionario` e `Gerente` |
| [`Mercadex`](./Mercadex/Mercadex) | Projeto | Aplicação com interface gráfica (`JFrame`) e conexão com banco de dados |

## 🗂️ Detalhes

### 📁 Exercícios Introdutórios

#### [INTRO](./INTRO)
Primeiros passos com Java: declaração de variáveis, operadores aritméticos e lógicos, estruturas condicionais `if/else` e `switch`, além de entrada de dados com `Scanner`. Inclui um exercício de classificação por nota do ENEM.

#### [Genérico](./Genérico)
Manipulação de arrays com `Arrays.sort()`, ordenação crescente e decrescente, e uso de laços para filtrar elementos pares e múltiplos de 3.

#### [ATV_00](./ATV_00)
Exercício com variáveis, formatação de saída com `printf`, cálculo de IMC, desconto percentual e exibição dinâmica do dia da semana e saudação de acordo com o horário atual, usando `LocalDate` e `LocalDateTime`.

#### [ATV_01](./ATV_01)
Solução para um problema de estrutura de dados: verificação de permutações possíveis de vagões de trem utilizando `Stack`. Modelo de entrada/saída no estilo Beecrowd.

### 📁 [Cadastrex](./Cadastrex)

Projeto que aplica os pilares da POO na prática. Contém as classes:

- **`Circulo`** — cálculo e comparação de áreas
- **`Conta`** — operações bancárias (depósito, saque, saldo insuficiente)
- **`Pessoa`** → **`Estudante`**, **`Funcionario`**, **`Gerente`** — demonstração de **herança** e **polimorfismo**

### 📁 [Mercadex](./Mercadex/Mercadex)

Projeto de maior complexidade, com **interface gráfica** construída com `JFrame` (Swing) e integração com **banco de dados** via SGBD. Representa o cenário mais próximo de uma aplicação real, conforme proposto pela disciplina.

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- **JDK** instalado (versão 8 ou superior) — [Baixar aqui](https://www.oracle.com/java/technologies/downloads/)
- Uma IDE de sua preferência: [IntelliJ IDEA](https://www.jetbrains.com/idea/), [NetBeans](https://netbeans.apache.org/) ou [VS Code](https://code.visualstudio.com/)
- Um **SGBD** instalado para o projeto Mercadex (ex: [MySQL](https://www.mysql.com/) ou [PostgreSQL](https://www.postgresql.org/))
- Sistema operacional: `Windows`, `Linux` ou `macOS`.

## 🚀 Clonando o Repositório

```bash
git clone https://github.com/DebbieMatt/<nome-do-repositorio>.git
```

Para os projetos NetBeans (`Cadastrex` e `Mercadex`), abra a pasta diretamente no NetBeans via **File > Open Project**.

Para os exercícios avulsos, basta abrir e executar o arquivo `Main.java` na sua IDE.

## 🤝 Colaboradores

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/DebbieMatt" title="Colaboradora">
        <img src="https://avatars.githubusercontent.com/u/112919058?v=4" width="100px;" alt="Foto da Débora"/><br>
        <sub><b>Débora Mateus</b></sub>
      </a>
    </td>
  </tr>
</table>

## 😄 Seja um Contribuidor

Quer fazer parte desse projeto? Clique [AQUI](CONTRIBUTING.md) e leia como contribuir.

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.
