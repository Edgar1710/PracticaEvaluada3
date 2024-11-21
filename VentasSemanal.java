import java.util.Random;

public class VentasSemanal {

    private String[] nombresProductos;
    private int[][] ventasSemanal;

    public VentasSemanal(String[] nombresProductos) {
        this.nombresProductos = nombresProductos;
        this.ventasSemanal = new int[7][nombresProductos.length];
        ventasramdom();
    }

    private void ventasramdom() {
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < nombresProductos.length; j++) {
                ventasSemanal[i][j] = random.nextInt(10);
            }
        }
    }

    public void Ventas() {
        System.out.println("Ventas semanales:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < nombresProductos.length; j++) {
                System.out.print(ventasSemanal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void totalporproducto() {
        for (int j = 0; j < nombresProductos.length; j++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += ventasSemanal[i][j];
            }
            System.out.println(nombresProductos[j] + ": " + total);
        }
    }
}

