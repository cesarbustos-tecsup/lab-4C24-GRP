public class StudentReport {

    public void printReport() {
        System.out.println("=================================");
        System.out.println("     REPORTE DE ESTUDIANTES      ");
        System.out.println("=================================");
        
        // Datos de ejemplo impresos directamente
        System.out.println("1. Ana García   - Nota: 9.5");
        System.out.println("2. Carlos Pérez - Nota: 8.2");
        System.out.println("3. María López  - Nota: 7.8");
        
        System.out.println("---------------------------------");
        System.out.println("Reporte generado con éxito.");
        System.out.println("=================================");
    }

    // Método principal para probar que funcione
    public static void main(String[] args) {
        StudentReport report = new StudentReport();
        report.printReport(); // Llama a la función
    }
}
