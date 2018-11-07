
package centralita;

import java.util.ArrayList;

public class Centralita {

    private int cont; 
    private double acum;
    private ArrayList<Llamada>  llamadas; 

     public Centralita() {
        llamadas = new ArrayList();
    }
     
    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public double getAcum() {
        return acum;
    }

    public void setAcum(double acum) {
        this.acum = acum;
    }
    
    public int getTotalLlamadas(){
        return cont;
    }
    
    public double getTotalFactura(){
        double contador = 0.0; 
        for(int i = 0; i < getLlamadas().size(); i++ ){
            contador += getLlamadas().get(i).calcularPrecio();
        }
        acum = contador; 
        return acum; 
    }
    
    public void registrarLlamada(Llamada llamada){
        cont++;
        llamadas.add(llamada);
    }
    
    
}
