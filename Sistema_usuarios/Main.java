public class Main {
    public static void main(String[] args) {

        // creando objetos y llamando metodos
        // objeto administrador
        Admin admin1 = new Admin("Andres", 01, "Admin123");
        System.out.println("Nombre: " + admin1.getNombre());
        admin1.asignarPermisos();
        admin1.crearNota();

        System.out.println("");
        
        //objeto estudiante 
        Estudiante est1 = new Estudiante("Maria", 02, "estudiante","ingles");    
        est1.actualizar_info();
        est1.subir_trabajos();
        est1.leernotas();

        System.out.println("");

        //objeto profesor
        Profesor prof1 = new Profesor("Juan", 03, "profesor123", "Filosofia");
        prof1.administrar_notas();
        prof1.enviar_reportenotas();

    }
}