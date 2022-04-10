package principal;

import java.util.ArrayList;

/**
 * esta clase representa una laptop o computadora portatil
 * @author Luis Alfredo Romero
 */

public class PersonalComputer {

    /**
     * este atributo representa la marca de la pc
     */
    public String mark;
    
    /**
     * este atributo representa el serial del pc
     */
    private String serial;
    
    /**
     * este atributo representa el modelo del pc
     */
    protected String model;
    
    /**
     * este atributo representa la memoria RAM  del pc
     */
    private String ram;
    
    /**
     * este atributo representa el disco duro (capacidad de almacenamiento) del pc
     */
    public String hardDisk;
    
    /**
     * este atributo representa lista de caracteristicas del  pc
     */
    private ArrayList<String> infoSave;
    
    
    /**
     * constructor para instanciar clase
     */

    public PersonalComputer() {
    }
    
    /**
     * constructor para instanciar clase con la opcion de inicializar 
     * @param mark marca
     * @param serial serial
     * @param model modelo
     * @param ram  memoria RAM
     * @param hardDisk Disco duro
     */
    public PersonalComputer(String mark, String serial, String model, String ram, String hardDisk) {
        
        this.mark = mark;
        this.serial = serial;
        this.model = model;
        this.ram = ram;
        this.hardDisk = hardDisk;
        
        
    }
    
    /**
     * con este metodo obtengo la informacion de un pc
     * @return retorna todos los datos referente a un pc especifico
     */
    public ArrayList<String> getInfoSave() {
        
        infoSave=new ArrayList<>();
        infoSave.add(mark);
        infoSave.add(serial);
        infoSave.add(model);
        infoSave.add(ram);
        infoSave.add(hardDisk);
                
        return infoSave;
    }
    
    /**
     * metodo para obtener el serial
     * @return serial
     */
    public String getSerial() {
        return serial;
    }
    
    /**
     * metodo para cambiar serial
     * @param serial 
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }
    
    /**
     * metodo para obtener modelo de pc
     * @return retorna el modelo
     */
    public String getModel() {
        return model;
    }
    
    /**
     * metodo para cambiar o inicializar el modelo del pc
     * @param model 
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    /**
     * metodo para obtener valor de la RAM
     * @return retorna el valor (capaidad) de memoria RAM
     */
    public String getRam() {
        return ram;
    }
    
    
    /**
     * este metodo permite inicializar o cambiar valor de la RAM
     * @param ram 
     */
    public void setRam(String ram) {
        this.ram = ram;
    }
    
    /**
     * este metodos nos permite encender la pc se puede utilizar sin necesidad de instanciar la clase
     */
    public static void power() {
        System.out.println("encendiendo computadora");
    }
    

   
    /**
     * este metodo es utilizado para mostrar algunas de las caracteristicas(atributos) de un pc
     */
    protected void watchFeatures(){
        
        System.out.println("la marca del equipo es:"+mark);
        System.out.println("la modelo del equipo es:"+model);
        System.out.println("la serial del equipo es:"+serial);
        
    }

}
