package principal;

/**
 * esta clase representa una motocicleta
 * @author Luis Alfredo Romero
 */
public class Motorcycles {
    /**
     * este atributo representa el color de la moto
     */
    public String colour;
    
    /**
     * este atributo representa la marca de la moto
     */
    private String Mark;
    
    /**
     * este atributo representa el modelo de la moto
     */
    protected String model;
    
    /**
     * este atributo representa el cilindraje de la moto
     */
    private float displacement;

    /**
     * este constructor instaciamos la clase
     */
    public Motorcycles() {
    }
    
    /**
     * este constructor instanciamos la clase con la opción de inicializar sus atributos
     * @param colour color de la moto
     * @param Mark   marca de la moto
     * @param model modelo de la moto
     * @param displacement cilindraje de la moto
     */
    public Motorcycles(String colour, String Mark, String model, float displacement) {
        this.colour = colour;
        this.Mark = Mark;
        this.model = model;
        this.displacement = displacement;
    }
    
    /**
     * este metodo nos permite obtener el valor de la marca de la moto
     * @return  devuelve la marca
     */
    public String getMark() {
        return Mark;
    }
    
    /**
     * este metodo nos permite inicializar o cambiar el valor de la marca de la motocicleta
     * @param Mark recibe el parametro marca como argumento
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }
    
    /**
     * este metodo nos permite obtener el valor de la modelo de la moto
     * @return  devuelve el modelo
     */
    public String getModel() {
        return model;
    }
    
    /**
     * este metodo nos permite inicializar o cambiar el valor del modelo de la motocicleta
     * @param model recibe el parametro model como argumento
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    /**
     * este metodo nos permite obtener el valor del cilindraje de la moto
     * @return  devuelve el cilindraje
     */
    public float getDisplacement() {
        return displacement;
    }
    
    /**
     * este metodo nos permite inicializar o cambiar el valor del cilindraje de la motocicleta
     * @param displacement recibe el parametro cilindraje como argumento
     */
    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }
    
    /**
     * este metodo retorna la informacion relacionada con la moto
     * @return retorna todos los atributos que representan la moto
     */
    protected String watchInfo() {
        return "Informacion Motocicleta{" + "color=" + colour + ", Marca=" + Mark + ", model0=" + model + ", Cilindraje=" + displacement + '}';
    }
    
    /**
     * este metodo representa las acciones que puede realizar una moto
     * @param action
     * @return retorna la accion segun el caso
     */
    public String Actions(String action) {
        switch (action) {
            case "frenar":
                return brake();
            case "acelerar":
                return accelerate();
            default:
                return " Accion no valida";

        }

    }
    
    /**
     * este metodo representa el frenado de la moto
     * @return devuelve una String que indica que la mot esta frenando
     */
    private String brake() {

        return "La motocicleta esta frenando";

    }
    
    /**
     * este metodo representa que  moto esta acelerando
     * @return devuelve una String que indica que la moto esta acelerando
     */
    private String accelerate() {

        return "La motocicleta esta acelerando";

    }

}
