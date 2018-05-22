package excecoes;

/**
 *
 * @author Gabriel Haruki Gomes Satô  RA: 120150
 */

//Classe Principal
public class Excecoes {

    public static void main(String[] args) {
        
        /*
         * É criado 2 objetos, um para exemplificar o tratamento da exceção com Throws,
         * e o outro para exemplificar o tratamento da exceção com Try e Catch
         */
        FraseThrows frase1 = new FraseThrows ();
        FraseTryCatch frase2 = new FraseTryCatch ();
        
        //Caso o tratamento da exceção seja com Throws utilize este trecho do código
        try {
            //Trecho do código que ele vai tentar executar
            frase1.aumentarLetra();
        }
        catch (Exception e) {
            System.out.println(e);
            //Aqui ocorreria o tratamento da exceção
        }
        
        //Caso o tratamento da exceção seja com Try e Catch utilize este trecho do código
        //frase2.aumentarLetra();
        
    }
}
