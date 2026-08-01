import java.util.ArrayList;

public class Estudiante extends Persona {
    private String numMatricula;
    private String nivelActual;
    private int puntosAcumulados;
    private ArrayList<Evaluacion> listaEvaluacion;

    public Estudiante(String id, String nombre, String correo, String numMatricula, String nivelActual, int puntosAcumulados) {
        super(id, nombre, correo);
        this.numMatricula = numMatricula;
        this.nivelActual = nivelActual;
        this.puntosAcumulados = puntosAcumulados;
        this.listaEvaluacion = new ArrayList<>();
    }

    public String getNumMatricula() { return numMatricula; }
    public void setNumMatricula(String numMatricula) { this.numMatricula = numMatricula; }

    public String getNivelActual() { return nivelActual; }
    public void setNivelActual(String nivelActual) { this.nivelActual = nivelActual; }

    public int getPuntosAcumulados() { return puntosAcumulados; }
    
    public void sumarPuntos(int puntos){
        puntosAcumulados += puntos;
    
    }

    public ArrayList<Evaluacion> getListaEvaluacion() { return listaEvaluacion; }
    public void agregarEvaluacion(Evaluacion ev) { this.listaEvaluacion.add(ev); }
    
    public String ObtenerDatos(){
        return ObtenerDatos() + " | Matricula: " + numMatricula + " | Nivel Actual: " + nivelActual + " | Puntos Acumulados: " + puntosAcumulados;
        
    }
}