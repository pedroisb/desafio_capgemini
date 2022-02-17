# Desafio Academia Técnica Capgemini
Respositório contendo soluções para os desafios propostos no processo seletivo da Academia Técnica Capgemini


## Pré-requisitos:
- IntelliJ (ou outra IDE apta a rodar Java)
- JDK 17
- JUnit

## Instruções
- Instale uma IDE apta a rodar programas em Java: Recomendo IntelliJ, porém há outras boas IDEs, como Eclipse
- Instale o JDK 17: Pode ser encontrado no site oficial da Oracle. Alternativamente, o OpenJDK é uma excelente alternativa
- Clone este repositório: Utilize o comando ```git clone https://github.com/pedroisb/desafio_capgemini.git```
- Inicie a IDE, selecione na qual se encontra os arquivos clonados e abra
- Instale as dependências utilizando Maven
- Selecione a resolução da questão desejada a partir da pasta src e da sleeção de um dos 3 packages contendo as respectivas questões
- Execute Run na classe Main da questão desejada
- Caso deseje executar os casos de teste existentes, selecione a pasta test e o package correspondente à questão desejada. Então, execute o comando Run 


## Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter
nenhum espaço.

**Exemplo**:

*Entrada:*
```
n = 6
```
*Saída:*
```
     *
    **
   ***
  ****
 *****
******
```

## Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser
forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres

- Contém no mínimo 1 digito

- Contém no mínimo 1 letra em minúsculo

- Contém no mínimo 1 letra em maiúsculo

- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

**Exemplo:**

*Entrada:*
```
Ya3
```
*Saída:*
```
3
```

**Explicação:**

Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho
mínimo de 6 caracteres.


## Questão 03

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.

**Exemplo:**

*Entrada:*
```
ifailuhkqq
```
*Saída:*
```
3
```

**Explicação:**

A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]],
[[8, 9]] e [[0, 1, 2], [1, 2, 3]].
