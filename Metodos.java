import java.util.Scanner;
public class Metodos {
    public ObjFastFood[][] Ingresarpedidos(int n, Scanner sc){
        ObjFastFood[] m = new objFastFood[n][n];
         int Tipo = 0, opt = 0;
         int Tamaño = 0;
         int Cantidad = 0;
         double PrecioUnidad = 0.0;
         double TotalPagar = 0.0;
       
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Bienvenido al expendio de comidas rapidas");
                System.out.println("Selecciones el tipo de comida");
                System.out.println("1. Perro");
                System.out.println("2. Perra");
                System.out.println("3. Salchipapa");
                System.out.println("4. Hamburguesa");
                Tipo = M.validarEntero(sc);

                System.out.println("Ingrese tamaño");
                System.out.println("1. pequeño");
                System.out.println("2. mediano");
                System.out.println("3. grande");
                Tamaño = M.validarEntero(sc);

                System.out.println("Ingrese la cantidad");
                Cantidad = sc.nextInt();
                System.out.println("Ingrese el precio");
                PrecioUnidad = sc.nextDouble();
                TotalPagar = Cantidad * PrecioUnidad;
                ObjFastFood o = new objFastFood(Tipo, Tamaño, Cantidad, PrecioUnidad);
                
            }
        }
    }
}
