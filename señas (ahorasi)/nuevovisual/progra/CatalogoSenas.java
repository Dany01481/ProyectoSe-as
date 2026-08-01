import java.util.ArrayList;

public class CatalogoSenas{
    private ArrayList<Sena> listaSenas;
    
    public CatalogoSenas(){
        listaSenas= new ArrayList<>();
        listaSenas.add(new Sena("S001", "hola",  "saludo", "mover la mano junto a la frente", "videos/A.mp4", 1));
        
        listaSenas.add(new Sena("S002", "A", "Abecedario", "Cerrar el puño con el pulgar al costado", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S003", "B", "Abecedario", "Cerrar el puño con el pulgar al costado", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S004", "D", "Abecedario", "Solamente levante el dedo indice", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S005", "E", "Abecedario", "meter todos tus dedos a la palma, pero que se siga viendo tus uñas", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S006", "G", "Abecedario", "levante el dedo indice y el pulgar, ponga su mano de forma horizontal", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S007", "H", "Abecedario", "levante el dedo indice, corazon y el pulgar, ponga su mano de forma horizontal", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S008", "I", "Abecedario", "levantar unicamente el dedo meñique de forma vertical", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S009", "U", "Abecedario", "levantar el dedo indice y coraon de forma vertical", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S010", "W", "Abecedario", "levantar los dedos, indice, corazon y anular de forma vertical", "videos/A.mp4", 1));
        listaSenas.add(new Sena("S011", "Te amo", "palabra" ,"levantar unicamente el dedo pulgar, indice y meñique", "videos/A.mp4", 1));
            
    }
    public Sena buscarPorSignificado(String significado) {
            for (Sena sena : listaSenas) {
                if (sena.getSignificado().equalsIgnoreCase(significado)) {
                    return sena;
                }
            }
            return null;
        }
    public ArrayList<Sena> buscarPorCategoria(String categoria){
        ArrayList<Sena> resultado = new ArrayList<>();
        for (Sena sena : listaSenas){
            if(sena.getCategoria().equalsIgnoreCase(categoria)){
                resultado.add(sena);
            }
        }
        return resultado;
    }
}