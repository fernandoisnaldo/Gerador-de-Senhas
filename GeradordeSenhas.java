import java.security.SecureRandom;
public class GeradordeSenhas {
    static SecureRandom numAleatorio = new SecureRandom();
    public static void main(String[] args) {
    	long numchar=-1l;
        if(args.length<1 || args.length>2 || args[0].equals("-h") || args[0].equals("--help")){
            System.out.println("""
                             Este programa requer pelo menos 1 parâmetro numérico para ser executado.
                             
                             Uso: java GeradordeSenhas [numero de caracteres] [variação de caracteres]
                             
                             "GeradordeSenhas 12" emite 12 caracteres.
                             "GeradordeSenhas 12 -n" emite 12 números.
                             
                             O parâmetro [numero de caracteres] deve ser um número e indica quantos caracteres a sua senha terá, a ausência deste parâmetro imprime esta mensagem de ajuda.
                             
                             O parâmetro [variação de caracteres] é opcional, mas se for usado, deve ser obrigatoriamente o segundo parâmetro.
                             
                             Para emitir caracteres ASCII, o parâmetro de variação pode ser: -a ou --ascii.
                             Para emitir caracteres alfanuméricos, o parâmetro de variação pode ser: -an, --alfanum ou --alfanumerico
                             Para emitir números decimais, o parâmetro de variação pode ser: -n, --num ou --decimal.
                             Para emitir números hexadecimais, o parâmetro de variação pode ser: -x, --hexa ou --hexadecimal
                             
                             Em caso de ausência do parâmetro [variação de caracteres], este programa por padrão emite caracteres ASCII.
                             
                               
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
        if (numchar<1l){
            System.out.println("O primeiro parâmetro não pode ser menor que 1");
            System.exit(1);
        }
        for (long contador=0l;contador<numchar;contador++){
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
