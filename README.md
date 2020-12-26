# Gerador-de-Senhas
Programa em Java feito para gerar senhas.
Este programa por padrão gera uma senha de 12 caractéres, porem este número pode ser personalizado a seu gosto. (Eg:. Para gerar 20 caracteres, utilize o parâmetro 20. O mesmo vale pra qualquer número inteiro)

Comando de exemplo para 20 caracteres: java Senha 20

Dica para usuários de Linux:
Em caso de lentidão/travamento para geração de valores aleatórios, considere a possibilidade de instalar e configurar o rng-tools, para melhorar velocidade de geração de entropia de qualidade.

https://wiki.archlinux.org/index.php/Rng-tools

Se o seu hardware não suporta TRNG, considere instalar e configurar o haveged.

https://wiki.archlinux.org/index.php/Haveged

Não inventem moda de utilizar o /dev/urandom como gerador de valores pseudoaleatórios, isso é terrível para criptografia e segurança. Usem o /dev/urandom somente para programas que não precisem de segurança.
