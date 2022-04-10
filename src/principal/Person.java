package principal;

import java.util.Date;

/**
 * esta clase respresenta a una persona
 *
 * @author Luis Alfedo Romero
 */
class Person {

    /**
     * este atributo representa el nombre de la persona
     */
    private String name;
    /**
     * este atributo representa el primer apellido de la persona
     */
    public String lastName1;
    /**
     * este atributo representa el segundo apellido de la persona
     */
    public String lastName2;
    /**
     * este atributo representa fecha de nacimiento de la persona
     */
    public Date dateBirth;
    /**
     * este atributo representa altura de la persona
     */
    public float height;

    /**
     * constructor vacio para instanciar clase sin inicializar atributos
     */
    public Person() {
    }

    /**
     * constructor para instanciar clase con posibilidad de inicializar
     * atributos
     *
     * @param name representa nombre la persona
     * @param lastName1 representa primer apellido la persona
     * @param lastName2 representa segundo apellido la persona
     * @param dateBirth representa fecha nacido de la persona
     * @param height representa altura de la persona
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * metodo para obtener nombre la persona
     *
     * @return devuelve nombre la persona
     */
    public String getName() {
        return name;
    }

    /**
     * metodo para inicializar name que representa nombre la persona
     *
     * @param name recibe un nombre persona como parametro
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * metodo representa que la persona esta caminando
     */

    public void walk() {
        System.out.println("la persona esta caminando");
    }
    
    /**
     * metodo que representa cuando la persona tiene hambre
     */
    public void haveHungry(){
        eat();
    }

    /**
     * metodo representa que persona esta comiendo
     * @return devuelve cadena de caracteres para indicar que esta comiendo
     */
    private String eat() {

        return "la persona se esta alimentando";

    }
    
    /**
     * metodo que indica que la persona esta saltando
     * @param distance recibe un parametro de la distancia que salto
     * @return retorna el salto a cuantos pies equivale
     */
    protected double skip(double distance) {

        return distance/30.48;

    }

}
