package ejercicios;

/*
 *Desde una clase Main: crear objetos de cada una y utilizarlos para imprimir sus valores por consola.
 */


public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        SmartDevice ipadPro11 = new SmartDevice("Apple", "iPad Pro 11", "11.0'' 2388x1668",
                "Apple A12Z Bionic", "iOS", 466, 28650);

        System.out.println("Producto SmartDevice: " + "\n" + "Fabricante: " + ipadPro11.fabricante +
                "\n" + "Modelo: " + ipadPro11.modelo + "\n" + "Pantalla: " + ipadPro11.pantalla +
                "\n" + "Procesador: " + ipadPro11.procesador + "\n" + "Sistema Operativo: " + ipadPro11.sistemaOp +
                "\n" + "Peso: " + ipadPro11.peso + "\n" + "Batería: " + ipadPro11.bateria + "\n");

        SmartPhone xiaomi10TPro = new SmartPhone(8, 256, "64 Mpx f/1.69",
                "20 Mpx f/2.2", "5G, 4G, 3G, 2G");
        xiaomi10TPro.fabricante = "Xiaomi";
        xiaomi10TPro.modelo = "10 T Pro";
        xiaomi10TPro.pantalla = "6.67'' FHD+";
        xiaomi10TPro.procesador = "SnapDragon 865";
        xiaomi10TPro.sistemaOp = "Android";
        xiaomi10TPro.peso = 218;
        xiaomi10TPro.bateria = 5000;

        System.out.println("Producto SmartPhone: " + "\n" + "Fabricante: " + xiaomi10TPro.fabricante +
                "\n" + "Modelo: " + xiaomi10TPro.modelo + "\n" + "Pantalla: " + xiaomi10TPro.pantalla +
                "\n" + "Procesador: " + xiaomi10TPro.procesador + "\n" + "Sistema Operativo: " + xiaomi10TPro.sistemaOp +
                "\n" + "Peso: " + xiaomi10TPro.peso + "\n" + "Batería: " + xiaomi10TPro.bateria +
                "\n" + "RAM: " + xiaomi10TPro.ram + "\n" + "ROM: " + xiaomi10TPro.rom +
                "\n" + "Cámara Principal: " + xiaomi10TPro.camaraPrincipal +
                "\n" + "Cámara Frontal: " + xiaomi10TPro.camaraFrontal +
                "\n" + "Bandas de Frecuencia: " + xiaomi10TPro.bandasFrecuencia + "\n");

        SmartWatch amazfitGtr2 = new SmartWatch("Hasta 38 días", "90 modos preconfigurados",
                true);
        amazfitGtr2.fabricante = "Amazfit";
        amazfitGtr2.modelo = "GTR2";
        amazfitGtr2.pantalla = "1.39'' AMOLED";
        amazfitGtr2.procesador = "4 Core 1100 Mhz";
        amazfitGtr2.sistemaOp = "Amazfit OS";
        amazfitGtr2.peso = 39;
        amazfitGtr2.bateria = 471;

        System.out.println("Producto SmartWatch: " + "\n" + "Fabricante: " + amazfitGtr2.fabricante +
                "\n" + "Modelo: " + amazfitGtr2.modelo + "\n" + "Pantalla: " + amazfitGtr2.pantalla +
                "\n" + "Procesador: " + amazfitGtr2.procesador + "\n" + "Sistema Operativo: " + amazfitGtr2.sistemaOp +
                "\n" + "Peso: " + amazfitGtr2.peso + "\n" + "Batería: " + amazfitGtr2.bateria +
                "\n" + "Autonomía: " + amazfitGtr2.autonomia + "\n" + "Modos Deportivos: " + amazfitGtr2.modosDeportivos +
                "\n" + "Oxímetro: " + amazfitGtr2.oximetro);

    }
}
