public class Practicaevaluada3 {
    public static void main(String[] args) {
        String[] productos = {"Producto1", "Producto2", "Producto3"};
        VentasSemanal ventas = new VentasSemanal(productos);

        ventas.Ventas();
        System.out.println("\nTotales por producto:");
        ventas.totalporproducto();
    }
}
