import java.security.SecureRandom;
public class GeradordeSenhas {
    static SecureRandom numAleatorio = new SecureRandom();
    public static void main(String[] args) {
    	long numchar=-1L;
        if(args.length<1 || args.length>2 || args[0].equals("-h") || args[0].equals("--help")){
            System.out.println("""
                             Uso: java GeradordeSenhas [número de caracteres] [variação de caracteres]

                             Este programa aceita no máximo 2 parâmetros, e estes devem estar na ordem indicada por esta mensagem de ajuda
                             
                             O parâmetro [número de caracteres] é estritamente um número e indica quantos caracteres a sua senha terá.
                             A ausência deste parâmetro resulta nesta mensagem de ajuda.
                             
                             O parâmetro [variação de caracteres] é opcional. Caso este parâmetro não seja utilizado, o programa por padrão imprime caracteres ASCII (faixa 33 a 126).

                             Opções de [variação de caracteres]:
                             -a, --ascii    imprime caracteres ASCII (faixa 33 a 126)
                             -an, --alfanum, alfanumerico    imprime caracteres alfanuméricos
                             -n, --num, --decimal    imprime números decimais
                             -x, --hexa, --hexadecimal    imprime números hexadecimais
                             
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
                               """);
            if(args.length<2){
                System.exit(0);
            }
            System.exit(1);
        }
        try {
            numchar=Long.parseLong(args[0]); //recebe o 1º parâmetro
        } catch (NumberFormatException e){
            System.out.println("O primeiro parâmetro deve ser um número inteiro razoável");
            System.exit(1);
        }
        if (numchar<1L){
            System.out.println("O primeiro parâmetro não pode ser menor que 1");
            System.exit(1);
        }
        for (long contador=0L;contador<numchar;contador++){
            if(args.length<2 || args[1].equals("-a") || args[1].equals("--ascii") ){
                System.out.print((char)(numAleatorio.nextInt(94)+33)); //emite caractere ASCII aleatório
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
                System.out.println("O segundo parâmetro está incorreto, use --help para ler as opções");
                System.exit(1);
            }
        }
        System.out.println("");
    }
}
