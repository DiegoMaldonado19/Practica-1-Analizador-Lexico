package modelo;

/**
 *
 * @author ACER
 */
public class Token {
    /**
     * Clase Lexema para generar objetos de tipo lexema, de esta manera guardarmos su contenido y tipo
     */
    
    /**
     * Arreglo de chars para almacenar cada elemento que conforma el lexema
     */
    private char[] lexema;
    /**
     * Objeto de tipo enum para saber que tipo de lexema tenemos
     */
    private TipoToken tipoLexema;

    /**
     * Constructor por defecto de la clase lexema
     * @param lexema conjunto de chars que conforman el lexema
     * @param tipoLexema  tipo de lexema
     */
    public Token(char[] lexema, TipoToken tipoLexema) {
        this.lexema = lexema;
        this.tipoLexema = tipoLexema;
    }

    /**
     * Constructor para instanciar un objeto solo con su conjunto de chars
     * @param lexema conjunto de caracteres que conforman el lexema
     */
    public Token(char[] lexema) {
        this.lexema = lexema;
    }

    /**
     * Getter para el arreglo de caracteres
     * @return 
     */
    public char[] getLexema() {
        return lexema;
    }

    /**
     * Setter para definir un arreglo de caracteres
     * @param lexema 
     */
    public void setLexema(char[] lexema) {
        this.lexema = lexema;
    }

    /**
     * Getter para obtener el tipo de lexema
     * @return 
     */
    public TipoToken getTipoLexema() {
        return tipoLexema;
    }

    /**
     * Setter para setear el tipo de lexema
     * @param tipoLexema 
     */
    public void setTipoLexema(TipoToken tipoLexema) {
        this.tipoLexema = tipoLexema;
    }
}
