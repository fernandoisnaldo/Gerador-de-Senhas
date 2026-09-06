## Gerador de Senhas do Fernando Isnaldo.

Requer OpenJDK 15 ou superior.


# Principais características: 
1) Uso da classe SecureRandom, para gerar números aleatórios com a melhor qualidade criptográfica.
2) Nenhuma String ou StringBuilder é utilizada para acumular caracteres. (isso é meramente uma curiosidade técnica)
3) Os valores são impressos diretamente, de forma homogênea e se necessário com offsets para caracteres imprimíveis da tabela ASCII.
4) É uma ferramenta de interface de linhas de comando.
5) O usuário define a quantidade personalidada de caracteres gerados.
6) O usuário pode gerar combinações numéricas, alfanuméricas ou de caracteres da tabela ASCII.

# Comando para executar:
`java GeradordeSenhas.java`

O processo de compilação é opcional.
