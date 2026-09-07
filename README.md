## Gerador de Senhas do Fernando Isnaldo.

Requer OpenJDK 15 ou superior.

O processo de compilação para gerar bytecode é opcional.


# Principais características: 
1) Uso da classe SecureRandom, para gerar números aleatórios com a melhor qualidade criptográfica.
2) É uma ferramenta de interface de linhas de comando, que recebe parâmetros diretamente ao iniciar a execução.
3) O usuário define a quantidade personalidada de caracteres gerados.
4) O usuário pode escolher gerar combinações numéricas, alfanuméricas, hexadecimais ou de caracteres da tabela ASCII.

# Instruções de uso:
Este programa requer pelo menos 1 parâmetro numérico para ser executado.

Uso: GeradordeSenhas [numero de caracteres] [variação de caracteres]

"GeradordeSenhas 12" emite 12 caracteres.
"GeradordeSenhas 12 1" emite 12 números.

O parâmetro [variação de caracteres] é opcional.

[variação de caracteres] sem parâmetro ou com valor 0 imprime caracteres ASCII na faixa de 33 até 126.
[variação de caracteres] com valor 1 imprime números decimais.
[variação de caracteres] com valor 2 imprime letras e números.
[variação de caracteres] com valor 3 imprime números hexadecimais.

Exemplos de uso:

Emitir 12 caracteres ASCII:
`java GeradordeSenhas.java 12`
h7H/a?.&!U&0

Emitir 12 números decimais:
`java GeradordeSenhas.java 12 1`
559457135144

Emitir 12 caracteres alfanuméricos:
`java GeradordeSenhas.java 12 2`
LmKXE26jpFZs

Emitir 12 números hexadecimais:
`java GeradordeSenhas.java 12 3`
d5e0a8669e74

