import java.security.SecureRandom;
public class GeradordeSenhas {
    static int numchar, opcao, varchar=0;
    static SecureRandom numAleatorio = new SecureRandom();
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Este programa requer pelo menos 1 parâmetro "
                    + "numérico para ser executado.\n"
                    + "\n"
                    + "Exemplos de execução: GeradordeSenhas [numero de caracter"
                    + "es] [variação de caracteres]\n\n"
                    + "\"GeradordeSenhas 12\" emite 12 caracteres\n"
                    + "\"GeradordeSenhas 12 1\" emite 12 números\n"
                    + "\n"
                    + "O parâmetro [variação de caracteres] é opcional\n"
                    + "\n"
                    + "\n[variação de caracteres] sem parâmetro ou com valor 0 "
                    + "imprime todos os caracteres ASCII na faixa de 33 até 126\n"
                    + "[variação de caracteres] 1 imprime só números\n"
                    + "[variação de caracteres] 2 imprime só letras e números\n"
                    + "\nExemplos:"
                    + "\n\njava GeradordeSenhas.java 12\n"
                    + "h7H/a?.&!U&0"
                    + "\n\njava GeradordeSenhas.java 12 1\n"
                    + "559457135144"
                    + "\n\njava GeradordeSenhas.java 12 2\n"
                    + "LmKXE26jpFZs");
            System.exit(0);
        }
        if (args.length<=2){
           try {
               if (args.length==2){
                   varchar=Integer.parseInt(args[1]); 
               }
               if(varchar>2){
                   System.out.println("O segundo parâmetro está errado");
                   System.exit(0);
               }
           } catch (Exception e){
               System.out.println("O parâmetro deve ser número");
               System.exit(0);
           }
        }
        else if (args.length>2){
            System.out.println("A quantidade de parâmetros está incorreta");
            System.exit(0);
        }
        //verifica se args[0] existe
        try {
            numchar=Integer.parseInt(args[0]);
        } catch (Exception e){
            System.out.println("Os parâmetro deve ser número");
            System.exit(0);
        }
        if (numchar<1){
            System.out.println("Número de caracteres não pode ser número menor "
                    + "que 1");
            System.exit(0);
        }
        if(varchar<0){
            System.out.println("Variação de caracteres não pode ser negativo");
            System.exit(0);
        }
        for (int contador=0;contador<numchar;contador++){
            if(varchar==0){
                System.out.print((char)(numAleatorio.nextInt(93)+33));
            }
            else if(varchar==1){
                System.out.print(numAleatorio.nextInt(10));
            }
            else if (varchar==2){
                int base62 = numAleatorio.nextInt(62);
                if (base62<10){
                    System.out.print(base62);
                }
                else if(base62<36){
                    System.out.print((char)(base62+55));
                }
                else {
                    System.out.print((char)(base62+61));
                }
            }
        }
        System.out.println("");
    }
}
