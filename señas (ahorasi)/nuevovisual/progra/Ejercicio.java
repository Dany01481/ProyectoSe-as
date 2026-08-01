public abstract class Ejercicio {
    private Estudiante estudiante;
    private String ideEjercicio;
    private int puntBase;
    private int tiempoLimiteSeg;
    private double puntaje;
    private boolean completado;

    public  Ejercicio(String ideEjercicio, int puntBase, int tiempoLimiteSeg, Estudiante estudiante) {
        this.ideEjercicio = ideEjercicio;
        this.puntBase = puntBase;
        this.tiempoLimiteSeg = tiempoLimiteSeg;
        this.estudiante = estudiante;
    }

    public String getIdeEjercicio() { return ideEjercicio; }
    public void setIdeEjercicio(String ideEjercicio) { this.ideEjercicio = ideEjercicio; }

    public int getPuntBase() { return puntBase; }
    public void setPuntBase(int puntBase) { this.puntBase = puntBase; }

    public int getTiempoLimiteSeg() { return tiempoLimiteSeg; }
    public void setTiempoLimiteSeg(int tiempoLimiteSeg) { this.tiempoLimiteSeg = tiempoLimiteSeg; }
    
    public double getPuntaje() {return puntaje;}

    public void setPuntaje(double puntaje) {this.puntaje = puntaje;}
    
    public abstract String iniciarEjercicio();

    

    
    
}