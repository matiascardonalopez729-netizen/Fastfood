public class ObjFastFood {
    private int Tipo;
    private int Tamaño;
    private int Cantidad;
    private double PrecioUnidad;
    private double TotalPagar;
    
    public ObjFastFood(int tipo, int tamaño, int cantidad, double precioUnidad, double totalPagar) {
        Tipo = tipo;
        Tamaño = tamaño;
        Cantidad = cantidad;
        PrecioUnidad = precioUnidad;
        TotalPagar = totalPagar;
    
    }
    public void setTipo(int tipo) {
        Tipo = tipo;
    }
    public void setTamaño(int tamaño) {
        Tamaño = tamaño;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public void setPrecioUnidad(double precioUnidad) {
        PrecioUnidad = precioUnidad;
    }
    public void setTotalPagar(double totalPagar) {
        TotalPagar = totalPagar;
    }
   
    
    
    public ObjFastFood() {
    }
    public int getTipo() {
        return Tipo;
    }
    public int getTamaño() {
        return Tamaño;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public double getPrecioUnidad() {
        return PrecioUnidad;
    }
    public double getTotalPagar() {
        return TotalPagar;
    }
    
    
}