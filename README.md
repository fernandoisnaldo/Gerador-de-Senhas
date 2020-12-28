# Gerador-de-Senhas
Este programa em Java, por padrão gera uma senha de 12 caracteres contendo letras do alfabeto latino (caixa alta e caixa baixa) e números. Porém, o número de caracteres pode ser personalizado a seu gosto.

Este programa é disponibilizado em 2 versões.

Senha.java executa todo o código de forma sequencial.

SenhaSMT.java executa o código de forma multiprocessada.

Você deve escolher um ou outro, você não precisa de ambos os programas.

**Observações preliminares:**

1) Não renomeie os arquivos .java ou .class, a não ser que você saiba editar o código-fonte e compilar para adequar a classe ao nome do arquivo.

2) Configure as suas variáveis de ambiente para o JDK, caso o seu sistema operacional já não faça isso pra você: https://www.formaticabit.com/configurando-variaveis-de-ambiente-no-java/

3) Não há garantias de que o multiprocessamento melhore o desempenho do gerador de senhas, pois o pool de entropia normalmente é mais lento que o CPU.

**Como compilar:**

1) Instale o OpenJDK ou o Oracle JDK: https://openjdk.java.net/install/

2) Baixe o arquivo Senha.java.

3) Digite `javac Senha.java` para compilar.

**Como executar:**

1) Baixe o arquivo Senha.class. Se você preferir, pode gerar o .class a partir do procedimento de compilação.

2) Digite `java Senha` para executar Senha.class.

Para valores personalizados, digite um número inteiro após java Senha. (exemplo: `java Senha 20`)

Dica: Algumas versões do OpenJDK permitem executar a partir do código-fonte (`java senha.java`), mas recomendo executar o bytecode .class por razões de melhor desempenho.

# Dicas para usuários de Linux:

Em caso de lentidão/travamento para geração de valores pseudoaleatórios, considere a possibilidade de instalar e configurar o rng-tools, para melhorar velocidade de geração de entropia de qualidade.

https://wiki.archlinux.org/index.php/Rng-tools

Se (e somente se) o seu hardware não possui um RNG confiável, considere instalar e configurar o Haveged.

https://wiki.archlinux.org/index.php/Haveged
