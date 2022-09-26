package ejercicios;

/*
 * Crear las clases hijas: SmartPhone y SmartWatch
 * Agregar atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 */

public class SmartPhone extends SmartDevice {

    protected int ram;
    protected int rom;
    protected String camaraPrincipal;
    protected String camaraFrontal;
    protected String bandasFrecuencia;

    public SmartPhone() {}

    public SmartPhone(int ram, int rom, String camaraPrincipal, String camaraFrontal, String bandasFrecuencia) {
        this.ram = ram;
        this.rom = rom;
        this.camaraPrincipal = camaraPrincipal;
        this.camaraFrontal = camaraFrontal;
        this.bandasFrecuencia = bandasFrecuencia;
    }
}

