package principal;

/**
 * esta clase representa a un libro
 * @author Luis Alfredo Romero
 */
public class Books {
    
    /**
     * este atributo representa el titulo del libro
     */
    private String tittle;
    
    /**
     * este atributo representa el nombre de autor del libro
     */
    private String author;
    
    /**
     * este atributo representa la cantidad de paginas del libro
     */
    private int pages;
    
    /**
     * consructor para instanciar la clase
     */
    public Books() {
    }
    
    /**
     * constructor para instanciar la clase con opcion de inicializar los atributos
     * @param tittle titulo del libro
     * @param author autor del libro
     * @param pages  cantidad de paginas
     */
    public Books(String tittle, String author, int pages) {
        this.tittle = tittle;
        this.author = author;
        this.pages = pages;
    }
    
    /**
     * este metodo permite obtener el valor de titulo
     * @return devuelve el titulo del libro
     */
    public String getTittle() {
        return tittle;
    }
    
    /**
     * este metodos permite inicializar o cambiar valor del titulo
     * @param tittle recibe el titulo del libro como argumento
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    
    /**
     * este metodo permite obtener el nombre de autor del libro
     * @return devuelve el autor del libro
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * este metodos permite inicializar o cambiar nombre del autor del libro
     * @param author recibe el nombre del autor del libro como argumento
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    /**
     * este metodo permite obtener cantidad de paginas del libro
     * @return devuelve cantidad de paginas del libro
     */
    public int getPages() {
        return pages;
    }
    
    /**
     * este metodos permite inicializar o cambiar cantidad de paginas del libro
     * @param pages recibe el titulo del libro como argumento
     */
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    /**
     * este metodo permite visualizar todos las atributos que representan al libro
     * @return información de libro
     */
    protected String infoBooks() {
        return "información del libro{" + "Titulo=" + tittle + ", autor=" + author + ", pages=" + pages + '}';
    }

}
