📖 Java Efetivo - Terceira Edição

Este repositório foi criado para documentar o estudo do livro Java Efetivo (Effective Java) - Terceira Edição, escrito por Joshua Bloch. Aqui estão reunidos exemplos práticos, explicações teóricas e exercícios relacionados aos conceitos abordados no livro.

O objetivo é consolidar o conhecimento adquirido através da implementação de boas práticas e padrões recomendados para a escrita de um código Java eficiente, robusto e seguro.

📌 Conteúdo do Projeto

1. Introdução ao Java Efetivo

Importância de boas práticas na programação Java

Diferenças entre Java moderno e versões anteriores

Organização do livro em itens práticos

2. Criando e Destruindo Objetos

Considerar métodos fábrica em vez de construtores

Evitar criação desnecessária de objetos

Uso apropriado de singleton e pools de objetos

Gerenciamento adequado de recursos com try-with-resources

3. Métodos Comuns a Todos os Objetos

Implementação correta de equals(), hashCode() e toString()

O impacto de clone() e Comparable

4. Classes e Interfaces

Preferir composição ao invés de herança

Criar interfaces funcionais e evitar classes internas não estáticas

Padrão Builder para construção de objetos complexos

5. Generics e Coleções

Uso correto de generics para evitar ClassCastException

O impacto do wildcard (? extends e ? super)

Melhorando desempenho e legibilidade com Streams e Lambdas

6. Enumerações e Anotações

Vantagens do uso de Enums sobre constantes static final

Como criar anotações personalizadas e quando utilizá-las

7. Concorrência e Performance

Preferir Executors e Streams ao invés de Thread

Evitar problemas com concorrência usando synchronization e locks

Uso correto de volatile, Atomic e Concurrent Collections

8. Tratamento de Exceções

Quando e como lançar exceções verificadas e não verificadas

Criando mensagens de erro informativas

Como evitar swallowing de exceções e garantir logging adequado

9. Boas Práticas de Programação

Escrever código seguro e imutável

Evitar reflexão sempre que possível

Como prevenir vazamento de memória e melhorar a coleta de lixo

📂 Estrutura do Repositório

📦 JavaEfetivo
├── 📁 src
│   ├── 📂 capitulo1
│   ├── 📂 capitulo2
│   ├── 📂 capitulo3
│   └── ...
├── 📜 README.md
└── 📜 effective-java-notes.md

Cada capítulo do livro será representado por um diretório contendo exemplos de código explicativos.

🎯 Objetivo

Este repositório tem como propósito principal consolidar os conceitos do livro Java Efetivo, facilitando o aprendizado por meio de exemplos práticos. Qualquer feedback ou sugestão de melhoria é bem-vindo!

✍ Autor

📌 Caique Braga - Desenvolvedor apaixonado por Java e boas práticas de programação.

