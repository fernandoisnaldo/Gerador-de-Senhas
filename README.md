## Gerador de Senhas do Fernando Isnaldo

Requer OpenJDK 15 ou superior.

O processo de compilação para gerar bytecode é opcional, mas se você quiser compilar, o comando é `javac GeradordeSenhas.java`.

# Instruções de uso
Para ler as instruções de uso, execute o comando: `java GeradordeSenhas.java` 

# Principais características
1) Uso da classe SecureRandom, para gerar números aleatórios com ótima qualidade criptográfica.
2) É uma ferramenta de interface de linhas de comando, que recebe parâmetros diretamente ao iniciar a execução.
3) Quem usa o programa define a quantidade de elementos gerados.
4) Quem usa o programa pode escolher gerar combinações numéricas, alfanuméricas, hexadecimais ou de caracteres da tabela ASCII.
5) Todo elemento tem exatamente a mesma chance de ser gerado no terminal.
6) Este programa é um software livre: pode ser modificado, usado e redistribuído nos termos da GPL v3 ou posterior.

# Ver também
[Gerador de Senhas versão web](https://github.com/fernandoisnaldo/Gerador-de-Senhas-Web) (JavaScript)
