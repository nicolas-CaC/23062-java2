package otroPaquete;

public class ClasePrivada {

    String palabra = "medianera";
    public String palabraPublica = "pared publica";
    private int numeroPrivado = 123;
    
    public String[] getValores(){
        String[] palabras = {palabra, palabraPublica};
        return palabras;
    }
}
