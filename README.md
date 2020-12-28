# Gerador-de-Senhas
Este programa em Java, por padrão gera uma senha de 12 caracteres contendo letras do alfabeto latino (caixa alta e caixa baixa) e números. Porém, o número de caracteres pode ser personalizado a seu gosto.

**Este programa é disponibilizado em 2 versões:**

1) `Senha.java` executa todo o código de forma sequencial. Sua compilação gera `Senha.class`.

2) `SenhaSMT.java` executa o código de forma multiprocessada. Sua compilação gera `SenhaSMT.class` e `SenhaSMT$1.class`

Senha e SenhaSMT são programas que funcionam de forma independente e um não depende do outro.

**Observações preliminares:**

1) Não renomeie os arquivos .java ou .class, a não ser que você saiba editar o código-fonte e compilar para adequar a classe ao nome do arquivo.

2) Configure as suas variáveis de ambiente para o JDK, caso o seu sistema operacional já não faça isso pra você: https://www.formaticabit.com/configurando-variaveis-de-ambiente-no-java/

3) Não há garantias de que o multiprocessamento melhore o desempenho do gerador de senhas, pois o pool de entropia normalmente é mais lento que o CPU.

**Como compilar:**

1) Instale e configure o OpenJDK ou o Oracle JDK: https://openjdk.java.net/install/

2) Digite `javac Senha.java` para compilar a versão sequencial, ou `javac SenhaSMT.java` para compilar a versão multiprocessada.

**Como executar:**

1) Instale e configure o Java Runtime de sua preferência

2) Digite `java Senha` para executar.class ou `java SenhaSMT`para executar SenhaSMT.class.

Para valores personalizados, digite um número inteiro após java Senha. (exemplo: `java Senha 20`)

Dica: Algumas versões do OpenJDK permitem executar a partir do código-fonte (`java senha.java`), mas recomendo executar o bytecode .class por razões de melhor desempenho.

**Problemas conhecidos**

1) O SenhaSMT não pula linha ao final da execução, pois a partir do momento que uma nova thread é chamada não se tem controle da ordem de execução do código. Recomenda-se opcionalmente a execução do comando `java SenhaSMT && echo ""`, para utilizar o shell para pular a linha manualmente.

Uma solução para este problema envolveria criar uma String para alocar caracteres para imprimir no println, porém isso não foi feito porque parâmetros muito grandes podem desde aumentar o consumo de memória e até crashar o programa.

# Dicas para usuários de Linux:

Em caso de lentidão/travamento para geração de valores pseudoaleatórios, considere a possibilidade de instalar e configurar o rng-tools, para melhorar velocidade de geração de entropia de qualidade.

https://wiki.archlinux.org/index.php/Rng-tools

Se (e somente se) o seu hardware não possui um RNG confiável, considere instalar e configurar o Haveged.

https://wiki.archlinux.org/index.php/Haveged
