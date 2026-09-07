import java.security.SecureRandom;
public class GeradordeSenhas {
    static int numchar, varchar=0;
    static SecureRandom numAleatorio = new SecureRandom();
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("""
                             Este programa requer pelo menos 1 parâmetro numérico para ser executado.
                             
                             Uso: GeradordeSenhas [numero de caracteres] [variação de caracteres]
                             
                             "GeradordeSenhas 12" emite 12 caracteres
                             "GeradordeSenhas 12 1" emite 12 números
                             
                             O parâmetro [variação de caracteres] é opcional
                             
                             
                             [variação de caracteres] sem parâmetro ou com valor 0 imprime todos os caracteres ASCII na faixa de 33 até 126
                             [variação de caracteres] com valor 1 imprime só números decimais
                             [variação de caracteres] com valor 2 imprime só letras e números
                             [variação de caracteres] com valor 3 imprime números hexadecimais
                               
                             Exemplos:

                             Emitir 12 caracteres ASCII:
                             java GeradordeSenhas.java 12 
                             h7H/a?.&!U&0

                             Emitir 12 números decimais:
                             java GeradordeSenhas.java 12 1
                             559457135144

                             Emitir 12 caracteres alfanuméricos:
                             java GeradordeSenhas.java 12 2
                             LmKXE26jpFZs
                             
                             Emitir 12 caracteres hexadecimais:  
                             java GeradordeSenhas.java 12 3
                             d5e0a8669e74
                               """);
            System.exit(0);
        }
        try {
            if(args.length==2){
                varchar=Integer.parseInt(args[1]);
            }
            numchar=Integer.parseInt(args[0]);
        } catch (Exception e){
            System.out.println("Os parâmetros só aceitam números inteiros");
            System.exit(0);
        }
        if (numchar<1){
            System.out.println("O parâmetro [numero de caracteres] não pode ser menor que 1");
            System.exit(0);
        }
        for (int contador=0;contador<numchar;contador++){
            if(varchar==0){
                System.out.print((char)(numAleatorio.nextInt(94)+33)); //emite caractere ASCII aleatório
            }
            else if(varchar==1){
                System.out.print(numAleatorio.nextInt(10)); //emite caractere numérico aleatório
            }
            else if (varchar==2){
                int base62 = numAleatorio.nextInt(62); //seleciona caractere alfanérico aleatório
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
            else if (varchar==3){
                System.out.print(""+Integer.toHexString(numAleatorio.nextInt(16))); //emite caractere hexadecimal
            }
            else {
                System.out.println("O parâmetro [variação de caracteres] está incorreto");
                System.exit(0);
            }
        }
        System.out.println("");
    }
}
