public class EjercicioTraduccion extends Ejercicio {
    private int frase;
    private String contexto;

    public EjercicioTraduccion(String ideEjercicio, int puntBase, int tiempoLimiteSeg, Estudiante estudiante, int frase, String contexto) {
        super(ideEjercicio, puntBase, tiempoLimiteSeg, estudiante);
        this.frase = frase;
        this.contexto = contexto;
    }

    public int getFrase() { return frase; }
    public void setFrase(int frase) { this.frase = frase; }

    public String getContexto() { return contexto; }
    public void setContexto(String contexto) { this.contexto = contexto; }
    
    @Override
    public String iniciarEjercicio(){
        return "traduzca la siguiente palabra" + contexto;

        

    }
}