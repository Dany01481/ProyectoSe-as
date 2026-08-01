public class EjercicioDactilogia extends Ejercicio {
    private Sena senaObjetivo;
    private String manoDominante;

    public EjercicioDactilogia(String ideEjercicio, int puntBase, int tiempoLimiteSeg, Estudiante estudiante, Sena senaObjetivo, String manoDominante) {
        super(ideEjercicio, puntBase, tiempoLimiteSeg, estudiante);
        this.senaObjetivo = senaObjetivo;
        this.manoDominante = manoDominante;
    }
    


    public Sena getsenaObjetivo() { return senaObjetivo;}

    public void setSenaObjetivo(Sena senaObjetivo) { 
        this.senaObjetivo = senaObjetivo; 
    }
    
    public String getmanoDominante() { return manoDominante; }

    public void setmanoDominante(String manoDominante) {
         this.manoDominante = manoDominante; }
    
    
    @Override
    public String iniciarEjercicio(){
        return "Realice la seña indicada utilizando su mano" + manoDominante + ".";
    }
    

}