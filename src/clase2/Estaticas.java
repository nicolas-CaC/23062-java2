package clase2;

public class Estaticas {

    static public int telefono = 123456;
    int numero = 123123;
    
    static public String getCadena(){
        return "Esta es la cadena retornada";
    }
    
    int metodo(){
        return Estaticas.telefono;
    }
}
