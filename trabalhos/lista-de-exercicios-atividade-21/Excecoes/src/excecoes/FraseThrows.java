package excecoes;

/**
 *
 * @author Gabriel Haruki Gomes Satô  RA: 120150
 */

//Classe para exemplificar o Throws
public class FraseThrows {
    
    //Duas variáveis strings são criadas
    String frase;
    String novaFrase;
    
    //Construtor da classe
    public FraseThrows() {
        
        //A variável frase terá valor null para que ocorra um erro intencional do tipo NullPointerException
        frase = null;
        novaFrase = null;
    }
    
    //Neste caso a exceção é lançada e, então, tratada em outro método
    public void aumentarLetra () throws NullPointerException {
        
        /*
         * Caso a frase esteja vazia ocorrerá um erro do tipo NullPointerException, portanto
         * é lançado uma exceção do mesmo tipo para que ela seja tratada em outro método
         */
        if (frase == null) {
            throw new NullPointerException("A frase não contém nada!");
        }
        
        //Caso contrário, o método ocorrerá normalmente
        novaFrase = frase.toUpperCase();
        System.out.println("Frase Antiga: " + frase);
        System.out.println("Nova Frase : " + novaFrase);
        
    }
}
