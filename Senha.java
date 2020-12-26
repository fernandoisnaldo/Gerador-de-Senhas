
import java.security.SecureRandom;

/*
 * Copyright (C) 2020 Fernando Isnaldo Silva de Faria
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Fernando Isnaldo Silva de Faria
 */
public class Senha {
    /**
     * 
     * @param args Número inteiro define um número personalizado de caracteres. 
     * Ausência de parâmetro correto implica em 12 caracteres.
     */
    public static void main(String[] args) {
        SecureRandom senha = new SecureRandom();
        //Define fator de aleatoriedade para reiniciar SecureRandom
        byte randomcont=(byte)senha.nextInt(8);
        System.out.print("Senha:\n");
        try {
            //Personaliza quantidade de caracteres (requer parâmetro args[0])
            for (int a=0;a<Integer.parseInt(args[0]);a++) {
                //invoca método digitos e passa parâmetro aleatório
                digitos((byte)senha.nextInt(62));
                //Reinicia o SecureRandom a cada múltiplo de entre 7 e 14
                if (a%(7+randomcont)==0) {
                	randomcont=(byte)senha.nextInt(8);
                	senha = new SecureRandom();
                }
            }
        }
        //Imprime 12 caracteres, quando não tem parâmetro
        catch (Exception e) {
            for (byte a=0;a<12;a++) {
                //invoca método digitos e passa parâmetro aleatório
                digitos((byte)senha.nextInt(62));
            }
        }
        System.out.print("\n");
        System.exit(0);
    }
    //Recebe parâmetro de SecureRandom e imprime 1 caractere
    static void digitos(byte random62){
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
