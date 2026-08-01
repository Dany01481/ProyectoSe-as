import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class EjercicioController {
    @GetMapping("/ejercicio-actual")

    public Map<String, Object> obtenerEjercicio() {
        Estudiante estudiante = new Estudiante("E1", "Yiyi","correo@ejemplo.com","2026", "Avanzado",  100);
        Sena senA = new Sena("S001", "A", "Abecedario","puño cerrado dedo pulgar","videos/A.mp4", 1);
        EjercicioDactilogia ej = new EjercicioDactilogia("EJ-01", 100, 30, estudiante, senA, "Derecha");
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("estudiante", estudiante.getNombre());
        respuesta.put("instruccion", ej.iniciarEjercicio()); // Llama a tu método
        respuesta.put("tiempo", ej.getTiempoLimiteSeg());

        return respuesta;



}
}
