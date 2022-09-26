package ejercicios;

/*
 * Crear una clase SmartDevice
 * Agregar atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 */

public class SmartDevice {

    protected String fabricante;
    protected String modelo;
    protected String pantalla;
    protected String procesador;

    protected String sistemaOp;
    protected int peso;
    protected int bateria;


    public SmartDevice(){}

    public SmartDevice(String fabricante, String modelo, String pantalla, String procesador,
                       String sistemaOp, int peso, int bateria) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.sistemaOp = sistemaOp;
        this.peso = peso;
        this.bateria = bateria;

    }
}
