package ejercicios;

/*
 * Crear las clases hijas: SmartPhone y SmartWatch
 * Agregar atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 */

public class SmartWatch extends SmartDevice {

    protected String autonomia;
    protected String modosDeportivos;
    protected Boolean oximetro;

    public SmartWatch(){}

    public SmartWatch(String autonomia, String modosDeportivos, Boolean oximetro){
        this.autonomia = autonomia;
        this.modosDeportivos = modosDeportivos;
        this.oximetro = oximetro;
    }
}
