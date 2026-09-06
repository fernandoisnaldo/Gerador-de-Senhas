## Gerador de Senhas do Fernando Isnaldo.

Requer OpenJDK 15 ou superior.

O processo de compilação para gerar bytecode é opcional.


# Principais características: 
1) Uso da classe SecureRandom, para gerar números aleatórios com a melhor qualidade criptográfica.
2) Nenhuma String ou StringBuilder é utilizada para acumular caracteres. (isso é meramente uma curiosidade técnica)
3) Os valores são impressos diretamente, de forma homogênea e se aplicável, com offsets para caracteres imprimíveis da tabela ASCII.
4) É uma ferramenta de interface de linhas de comando.
5) O usuário define a quantidade personalidada de caracteres gerados.
6) O usuário pode escolher gerar combinações numéricas, alfanuméricas ou de caracteres da tabela ASCII.

# Comando para executar:
`java GeradordeSenhas.java`
