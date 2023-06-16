package clase2;

public class Clase2 {

    public static void main(String[] args) {

        Elementos variables = new Elementos();
         
        variables.setPalabra("nose");        
        System.out.println(variables.getPalabra());
    
        System.out.println(Estaticas.telefono);
        System.out.println(Estaticas.getCadena());
        Estaticas valorNumero = new Estaticas();
        System.out.println(valorNumero.numero);
        System.out.println("VALOR ESTATICO " + valorNumero.metodo());
    }

}
