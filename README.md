## Gerador de Senhas do Fernando Isnaldo.

Requer OpenJDK 15 ou superior.

O processo de compilação para gerar bytecode é opcional.


# Principais características: 
1) Uso da classe SecureRandom, para gerar números aleatórios com a melhor qualidade criptográfica.
2) Nenhuma variável String, StringBuilder ou array de tipo primitivo é utilizado para acumular caracteres. Os valores são impressos diretamente, de forma homogênea e se aplicável, com offsets para caracteres imprimíveis da tabela ASCII.
4) É uma ferramenta de interface de linhas de comando, que recebe parâmetros diretamente ao iniciar a execução.
5) O usuário define a quantidade personalidada de caracteres gerados.
6) O usuário pode escolher gerar combinações numéricas, alfanuméricas, hexadecimais ou de caracteres da tabela ASCII.

# Comando para executar:
`java GeradordeSenhas.java`
