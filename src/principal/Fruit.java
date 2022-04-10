package principal;

import java.util.ArrayList;

/**
 * esta clase representa una fruta 
 * @author Luis Alfredo Romero
 */

public class Fruit {
    /**
     * este atributo hace referencia al nombre de la fruta
     */
    public String name;
    
    /**
     * este atributo hace referencia al peso aproximado de la fruta
     */
    private float averageWeght;
    
    /**
     * este atributo hace referencia al color de la fruta como una lista de colores
     */
    public ArrayList<String> colors;
    
    /**
     * constructor vacio para instanciar, sin inicializar atributos
     */

    public Fruit() {
    }

    /**
     * este constructor para instanciar, pero con la posiblidad de inicializar atributos
     * @param name 
     * @param averageWeght
     * @param colors 
     */
    public Fruit(String name, float averageWeght, ArrayList<String> colors) {
        this.name = name;
        this.averageWeght = averageWeght;
        this.colors = colors;
    }

    /**
     * para obtener el peso aproximado de la fruta
     * @return retorna el peso aproximado de la fruta
     */
    public float getAverageWeght() {
        return averageWeght;
    }
    /**
     * inicializa el atributo peso aproximado de la fruta
     * @param averageWeght 
     */
    public void setAverageWeght(float averageWeght) {
        this.averageWeght = averageWeght;
    }
    /**
     * muestra las caraacteristicas de la fruta
     */
    public void features() {
        System.out.println("nombre de la fruta " + name + " ,promedio peso" + getAverageWeght());

    }
    /**
     * este metodo permite calcular la masa de una fruta
     * @param volume este parametro es el volumen de la fruta
     * @param density esta es la densidad de la fruta
     * @return  retorna el valor de la masa
     */
    protected float masses(float volume, float density) {
        
        float dough = volume / density;

        return dough;

    }

}
