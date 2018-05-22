package excecoes;

/**
 *
 * @author Gabriel Haruki Gomes Satô  RA: 120150
 */

//Classe para exemplificar o Try e Catch
public class FraseTryCatch {
    
    //Duas variáveis strings são criadas
    String frase;
    String novaFrase;
    
    //Construtor da classe
    public FraseTryCatch() {
        
        //A variável frase terá valor null para que ocorra um erro intencional do tipo NullPointerException
        frase = null;
        novaFrase = null;
    }
    
    //Neste caso a exceção é tratada no próprio método
    public void aumentarLetra (){
        
        try {
            //Trecho do código que ele vai tentar executar
            novaFrase = frase.toUpperCase();
        }
        //Caso ocorra uma exceção do tipo NullPointerException ele entrará no catch
        catch (NullPointerException e){
            System.out.println(e + ": A frase não contém nada!");
            //Aqui ocorreria o tratamento da exceção
        }
        //Depois de tudo, mesmo que ele não encontrasse exceção, o finally é executado
        finally {
            System.out.println("Frase Antiga: " + frase);
            System.out.println("Nova Frase : " + novaFrase);
        }
    }
}
