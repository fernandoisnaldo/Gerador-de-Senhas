## Gerador de Senhas do Fernando Isnaldo.

Requer OpenJDK 15 ou superior.


# Principais características: 
1) Uso da classe SecureRandom, para gerar números aleatórios com a melhor qualidade criptográfica.
2) Nenhuma String ou StringBuilder é utilizada para acumular caracteres, os valores são impressos diretamente e se necessário com offsets para caracteres imprimveis da tabela ASCII.
   (isso é mais uma curiosidade técnica do que uma utilidade prática)
4) É uma ferramenta de interface de linhas de comando.
5) Permite definir a quantidade de caracteres gerados.
6) Permite gerar combinações numéricas, alfanuméricas ou de caracteres da tabela ASCII.

# Para executar:
`java GeradordeSenhas.java`
