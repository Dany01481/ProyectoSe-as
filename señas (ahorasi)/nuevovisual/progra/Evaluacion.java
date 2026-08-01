import java.util.ArrayList;

public class Evaluacion {
    private String folioEvaluacion;
    private String fecha;
    private ArrayList<Ejercicio> ejercicios;

    public Evaluacion(String folioEvaluacion, String fecha) {
        this.folioEvaluacion = folioEvaluacion;
        this.fecha = fecha;
        this.ejercicios = new ArrayList<>();
    }
    

    public String getFolioEvaluacion() { return folioEvaluacion; }
    public void setFolioEvaluacion(String folioEvaluacion) { this.folioEvaluacion = folioEvaluacion; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public ArrayList<Ejercicio> getEjercicios() { return ejercicios; }
    public void agregarEjercicio(Ejercicio ejercicio) { this.ejercicios.add(ejercicio); }
    
    public double calcularPromedio(){
        if (ejercicios.isEmpty()) {
            return 0.0; // Evitar división por cero si no hay ejercicios
        }
        double suma=0;
        for(Ejercicio e: ejercicios){
            suma += e.getPuntaje();
        }
        return suma/ejercicios.size();
        
        
    }
}