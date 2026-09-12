## Gerador de Senhas do Fernando Isnaldo

Requer OpenJDK 15 ou superior.

O processo de compilação para gerar bytecode é opcional, mas se você quiser compilar, o comando é `javac GeradordeSenhas.java`.


# Principais características
1) Uso da classe SecureRandom, para gerar números aleatórios com ótima qualidade criptográfica.
2) É uma ferramenta de interface de linhas de comando, que recebe parâmetros diretamente ao iniciar a execução.
3) O usuário define a quantidade de elementos gerados.
4) O usuário pode escolher gerar combinações numéricas, alfanuméricas, hexadecimais, de caracteres da tabela ASCII ou até de sílabas aleatórias.
5) Todo elemento tem exatamente a mesma chance de ser gerado no terminal.
6) Este programa é um software livre: pode ser modificado, usado e redistribuído nos termos da GPL v3 ou posterior.

Observações:
1) Devido à alta eficiência combinatória e fonética no modo sílaba, uma pequena fração das sílabas pode coincidir com palavras ofensivas em diversos idiomas.
2) Se você quiser entender quais são as sílabas geradas pelo programa, [a documentação delas está por aqui](https://github.com/fernandoisnaldo/Gerador-de-Senhas/wiki/Especifica%C3%A7%C3%B5es-das-s%C3%ADlabas-aleat%C3%B3rias,-Gerador-de-Senhas-do-Fernando-Isnaldo).

# Instruções de uso
Para ler as instruções de uso, execute o comando: `java GeradordeSenhas.java` 
