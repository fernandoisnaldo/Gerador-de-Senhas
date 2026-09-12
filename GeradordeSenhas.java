/*
 * Gerador de Senhas do Fernando Isnaldo
 * Copyright (c) 2026 Fernando Isnaldo Silva de Faria
 * Programa licenciado sob a GNU General Public License v3.0 (ou qualquer versão posterior).
 * Veja o arquivo LICENSE no repositório do código-fonte para mais detalhes.
 */
import java.security.SecureRandom;
public class GeradordeSenhas {
    static SecureRandom numAleatorio = new SecureRandom();
    static final String[] VOGAIS =  {
            "a", "ae", "ai", "ao", "au", "e", "ea", "ei", "eo", "eu", "i", "ia","ie"
            , "io", "iu", "o", "oa", "oe", "oi", "ou", "u", "ua", "ue","ui", "uo"


        };
    static final String[] CONSOANTES = {
            "", "b", "bl","br", "by", "c", "ch", "cr","cl", "cy", "d", "dr", "dh",
            "dy", "f","fh","fl", "fr", "fy", "g","gl", "gh", "gr", "gy", "h", "hy",
            "j", "jy", "k","kh","kl", "kr", "ky", "l","ll", "lh", "ly", "m", "my", "n"
            , "nh","ny","p","pl","pr","py", "q", "qy", "r", "ry", "s", "sy", "t", "th"
            , "tr","ty","v", "vr","vy", "w", "wh","wy","x","xy", "y", "z", "zh","zy"
        };
    static final  String[] TERMINACOS = {
            "","b", "ck", "d","k","l","ll","m","n","nd","ng","nt","p","r", "s", "sk", "t","th"
            , "w", "wd", "y","yk", "wn"
        };
    static String[] silabas;
    public static void main(String[] args) {
    	long numchar=-1L;
        if(args.length<1 || args.length>2 || args[0].equals("-h") || args[0].equals("--help")){
            System.out.println("""
                             Uso: java GeradordeSenhas [número de caracteres] [variação de caracteres]

                             Este programa aceita no máximo 2 parâmetros, e estes devem estar na ordem indicada por esta mensagem de ajuda.

                             O parâmetro [número de caracteres] é estritamente um número e indica quantos elementos a sua senha terá.
                             Caso este parâmetro não seja utilizado, esta mensagem de ajuda será exibida.

                             O parâmetro [variação de caracteres] é opcional.
                             Caso este parâmetro não seja utilizado, o programa por padrão imprime caracteres ASCII (faixa 33 a 126).

                             Opções de [variação de caracteres]:
                             -a, --ascii    imprime caracteres ASCII (faixa 33 a 126)
                             -an, --alfanum, --alfanumerico    imprime caracteres alfanuméricos
                             -n, --num, --decimal    imprime números decimais
                             -x, --hexa, --hexadecimal    imprime números hexadecimais
                             -s, --silaba    imprime sílabas aleatórias

                             Exemplos de uso:

                             Emitir 12 caracteres ASCII:
                             java GeradordeSenhas.java 12 -a
                             h7H/a?.&!U&0

                             Emitir 12 números decimais:
                             java GeradordeSenhas.java 12 -n
                             559457135144

                             Emitir 12 caracteres alfanuméricos:
                             java GeradordeSenhas.java 12 -an
                             LmKXE26jpFZs

                             Emitir 12 números hexadecimais:
                             java GeradordeSenhas.java 12 -x
                             d5e0a8669e74

                             Emitir 12 sílabas aleatórias:
                             java GeradordeSenhas.java 12 -s
                             dhaoyk muith syik neiwn jyiab meup xyeow vrab uiwn puir kyiuk myaur

                             Gerador de Senhas do Fernando Isnaldo | Copyright (C) 2026 Fernando Isnaldo Silva de Faria.
                             Este é um software livre, você pode redistribui-lo sob as condições da GPL v3 ou posterior.
                             NÃO HÁ GARANTIA vinculada à distribuição deste programa.
                             Veja o arquivo LICENSE para mais detalhes.
                               """);
            if(args.length<2){
                System.exit(0);
            }
            System.exit(1);
        }
        try {
            numchar=Long.parseLong(args[0]); //recebe o 1º parâmetro
        } catch (NumberFormatException e){
            System.err.println("O primeiro parâmetro deve ser um número inteiro razoável");
            System.exit(1);
        }
        if (numchar<1L){
            System.err.println("O primeiro parâmetro não pode ser menor que 1");
            System.exit(1);
        }
        if (args.length==2 && (args[1].equals("-s") || args[1].equals("--silaba"))){
            silabas = new String[CONSOANTES.length*VOGAIS.length*TERMINACOS.length];
            int sidex=0;
            for (int c=0;c<CONSOANTES.length;c++){
                for (int v=0;v<VOGAIS.length;v++){
                    for (int t=0;t<TERMINACOS.length;t++){
                        silabas[sidex] = CONSOANTES[c]+VOGAIS[v]+TERMINACOS[t]; //emite as sílabas no array
                        sidex++;
                    }
                }
            }
        }
        for (long elemento=0L;elemento<numchar;elemento++){
            if(args.length<2 || args[1].equals("-a") || args[1].equals("--ascii") ){
                System.out.print((char)(numAleatorio.nextInt(94)+33)); //emite caractere ASCII aleatório
            }
            else if(args[1].equals("-s") || args[1].equals("--silaba")){
                if(elemento!=0L){
                    System.out.print(" "); //espaço entre as sílabas
                }
                System.out.print(silabas[numAleatorio.nextInt(silabas.length)]);//seleciona e imprime sílaba aleatória
            }
            else if(args[1].equals("-n") || args[1].equals("--num") || args[1].equals("--decimal")){
                System.out.print(numAleatorio.nextInt(10)); //emite número decimal aleatório
            }
            else if (args[1].equals("-an") || args[1].equals("--alfanum") || args[1].equals("--alfanumerico")){
                int base62 = numAleatorio.nextInt(62); //seleciona caractere alfanumérico aleatório
                if (base62<10){
                    System.out.print(base62); //emite 0 a 9
                }
                else if(base62<36){
                    System.out.print((char)(base62+55)); //emite A-Z
                }
                else {
                    System.out.print((char)(base62+61)); //emite a-z
                }
            }
            else if (args[1].equals("-x") || args[1].equals("--hexa") || args[1].equals("--hexadecimal")){
                System.out.print(Integer.toHexString(numAleatorio.nextInt(16))); //emite número hexadecimal aleatório
            }
            else {
                System.err.println("O segundo parâmetro está incorreto, use --help no primeiro parâmetro para ler as opções");
                System.exit(1);
            }
        }
        System.out.println("");
    }
}
