package clase2;

import otroPaquete.ClasePrivada;

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
        
        
        // PRIVADO
        
        Privadas nuevasVariables = new Privadas();
        System.out.println(nuevasVariables.getNumeroPrivado());
        
        // OTRO PKG
        
        ClasePrivada otraClase = new ClasePrivada();
        System.out.println(otraClase.getValores()[0]);
        
        Usuarios usuario1 = new Usuarios("Nicolas", "Mendez", 25);
        System.out.println("id 1: " + usuario1.id);
        
        Usuarios usuario2 = new Usuarios("Nicolas", "Mendez", 35);
        System.out.println("id 2: " + usuario2.id);
        
        System.out.println(usuario1.getUsersCount());
        
    }

}
