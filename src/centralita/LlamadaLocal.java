
package centralita;

public class LlamadaLocal extends Llamada{

    private double _precio;

    public LlamadaLocal(double _precio, String _numOrigen, String _numDestino, double _duracion, String tipo) {
        super(_numOrigen, _numDestino, _duracion, tipo);
        this._precio = _precio;
    }
    
      public double getPrecio() {
        return _precio;
    }

    public void setPrecio(double precio) {
        this._precio = precio;
    }

    @Override
    public double calcularPrecio() {
      double calcular = super.getDuracion() * _precio;
       return calcular; 
    }

    @Override
    public String toString() {
        return "Número Origen: " 
                + super.getNumOrigen() 
                + " Número Destino: "  
                + super.getNumDestino()+ 
                " Tipo: " 
                + super.getTipo() +
                " Duracion: " + super.getDuracion() +
                "Costo llamada : " + calcularPrecio() +" céntimos";
    }
    
    
    
    
}
