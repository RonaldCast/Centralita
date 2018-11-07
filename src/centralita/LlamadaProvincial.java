
package centralita;

public class LlamadaProvincial extends Llamada {
    
    private double _precio; 
    private int _franja;

    public LlamadaProvincial(double _precio, int _franja, String _numOrigen, String _numDestino, double _duracion, String tipo) {
        super(_numOrigen, _numDestino, _duracion, tipo);
        this._precio = _precio;
        this._franja = _franja;
    }   
     public double getPrecio() {
        return _precio;
    }

    public void setPrecio(double _precio) {
        this._precio = _precio;
    }

    public int getFranja() {
        return _franja;
    }

    public void setFranja(int _franja) {
        this._franja = _franja;
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
