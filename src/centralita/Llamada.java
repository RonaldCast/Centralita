
package centralita;

public abstract class  Llamada {
    private String _numOrigen;
    private String _numDestino;
    private double _duracion; 
    private String tipo; 

    public Llamada(String _numOrigen, String _numDestino, double _duracion, String tipo) {
        this._numOrigen = _numOrigen;
        this._numDestino = _numDestino;
        this._duracion = _duracion;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumOrigen() {
        return _numOrigen;
    }

    public void setNumOrigen(String _numOrigen) {
        this._numOrigen = _numOrigen;
    }

    public String getNumDestino() {
        return _numDestino;
    }

    public void setNumDestino(String _numDestino) {
        this._numDestino = _numDestino;
    }

    public double getDuracion() {
        return _duracion;
    }

    public void setDuracion(double _duracion) {
        this._duracion = _duracion;
    }
    
    public abstract double calcularPrecio();
}
