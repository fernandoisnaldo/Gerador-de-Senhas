# Gerador-de-Senhas
Programa em Java feito para gerar senhas.
Este programa por padrão gera uma senha de 12 caracteres, porém este número pode ser personalizado a seu gosto.

<h1>Como compilar: </h1>

1) Instale o OpenJDK ou o Oracle JDK.

2) Configure as suas variáveis de ambiente para o JDK (caso o seu sistema operacional já não faça isso pra você)

3) Digite javac Senha.java para compilar.

<h1>Como executar: </h1>

1) Baixe ou gere o arquivo Senha.class 

Algumas versões do OpenJDK permitem executar a partir do código-fonte, mas recomendamos o bytecode .class por razões de desempenho.

2) Digite java Senha.

Para valores personalizados, digite um número inteiro após java Senha.

<h1>Dicas para usuários de Linux: </h1>

Em caso de lentidão/travamento para geração de valores pseudoaleatórios, considere a possibilidade de instalar e configurar o rng-tools, para melhorar velocidade de geração de entropia de qualidade.

https://wiki.archlinux.org/index.php/Rng-tools

Se (e somente se) o seu hardware não possui HRNG, considere instalar e configurar o Haveged.

https://wiki.archlinux.org/index.php/Haveged
