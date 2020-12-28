//versão multiprocessada.
import java.security.SecureRandom;
public class SenhaSMT {
//atributos de repetição
static int rep, mod;
//define número de processos
static int numproc;
	//Parâmetro numérico define número personalizado de caracteres.
	public static void main(String[] args) {
		Runtime hwinfo = Runtime.getRuntime();
		try {
			numproc=Integer.parseInt(args[0])/12;
   			if (numproc>hwinfo.availableProcessors()){
				numproc=hwinfo.availableProcessors();
			}
			else if (numproc==0){
				numproc=1;
   		 	}
			mod=Integer.parseInt(args[0])%numproc;
			rep=Integer.parseInt(args[0]);
		}
		catch (Exception e){
			numproc=1;
			rep=12;
		}
		for (int a=0; a<numproc; a++) {
			new Thread(mete).start();
		}
		for (int a=0;a<mod;a++){
			digitos();
		}
	}
	private static Runnable mete = new Runnable() {
		public void run() {
			try{
				for (int a=0;a<(rep/numproc);a++){
					digitos();
				}
			}
			catch (Exception e){
				System.out.println(e);
			}
			System.exit(0);
		}
	};
	private static void digitos(){
		SecureRandom senha = new SecureRandom();
		byte random62 = (byte)senha.nextInt(62);
		//imprime caractere latino minúsculo
		if (random62<26) {
			System.out.print((char) (random62+97));
		}
		//imprime caractere latino maiúsculo
		else if(random62<52){
			System.out.print((char) (random62+39));
		}
		//imprime número
		else {
			System.out.print(random62-52);
		}
	}
}
