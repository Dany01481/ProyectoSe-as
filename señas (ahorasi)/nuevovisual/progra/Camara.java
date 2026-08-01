
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.videoio.VideoCapture;

public class Camara{
    

    static {
        // Carga la librería nativa
         System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    public void iniciarCamara(){

        System.out.println("Cargando OpenCV...");

        // Abrir la cámara en el índice 0
        VideoCapture camera = new VideoCapture(0);

        if (!camera.isOpened()) {
            System.out.println("❌ No se pudo abrir la cámara.");
            return;
        }

        System.out.println("¡Cámara abierta exitosamente! Presiona cualquier tecla en la ventana para salir.");

        // Matriz donde se guardará cada fotograma (frame) de video
        Mat frame = new Mat();

        // Bucle para capturar y mostrar el video en vivo
        while (true) {
            // Leer el fotograma actual de la cámara
            if (camera.read(frame) && !frame.empty()) {
                // Mostrar la imagen en una ventana llamada "Camara Evaluacion"
                HighGui.imshow("Camara Evaluacion", frame);

                // Esperar 30ms para actualizar la ventana (equivale a ~30 FPS)
                // Si presionas cualquier tecla, o cierras la ventana, saldrá del bucle
                if (HighGui.waitKey(30) >= 0) {
                    break;
                }
            } else {
                System.out.println("No se pudo recibir fotograma de la cámara.");
                break;
            }
        }

        camera.release();
        HighGui.destroyAllWindows();
        
        System.out.println("Camara cerrada");

    }
    
    }