package clase2;

public class Elementos {
    
    private String palabra;
    int numero;
    final boolean booleano;
    final byte numeroCortito = 12;

    public Elementos() {
        this.palabra = "CABA";
        numero = 100;
        booleano = true;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
}
