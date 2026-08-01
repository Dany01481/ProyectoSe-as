import java.util.ArrayList;
public class EjercicioVocabulario extends Ejercicio {
    private String tema;
    private boolean requiereDosManos;
    private CatalogoSenas catalogo;
    

    public EjercicioVocabulario (String ideEjercicio, int puntBase, int tiempoLimiteSeg,Estudiante estudiante, String tema, boolean requiereDosManos, CatalogoSenas catalogo) {
        super(ideEjercicio, puntBase, tiempoLimiteSeg, estudiante);
        this.tema = tema;
        this.requiereDosManos = requiereDosManos;
        this.catalogo = catalogo;
    }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }

    public boolean isRequiereDosManos() { return requiereDosManos; }
    public void setRequiereDosManos(boolean requiereDosManos) { this.requiereDosManos = requiereDosManos; }
    
    @Override
    public String iniciarEjercicio(){
        ArrayList<Sena> senas = catalogo.buscarPorCategoria(tema);
        return "modulo de vocabulario: categoria [" + tema +"]. se encontraron" + senas.size() + "señas disponibles";
        
    }
    
    
    


}