public class Main {
    public static void main(String [] arreglo){
        // String es una clase Inmutable (Que no cambia)

        // Creamos asiganciones de cadenas - String literals
        String cableVGA = "VGA";
        String cableVGA2 = "VGA";
        System.out.println("Para la cadena VGA: ");
        System.out.println("¿El contenido es el mismo? :" + (cableVGA.equals(cableVGA2)));
        System.out.println("¿El código de Referencia (Hashcode) "
                + System.identityHashCode(cableVGA) + " / "+ System.identityHashCode(cableVGA2) +" es el mismo? : " + (cableVGA == cableVGA2));
        System.out.println();

        // Creamos cadenas que utilizan inmediatamente sus métodos.
        System.out.println("Para la cadena RJ45: ");
        System.out.println("¿El contenido es el mismo? :" + ("RJ45".equals("RJ45")));
        System.out.println("¿El código de Referencia (Hashcode) "
                + System.identityHashCode("RJ45") + " / "+ System.identityHashCode("RJ45") +" es el mismo? : " + ("RJ45" == "RJ45"));
        System.out.println();

        // Creamos instancias de clase String
        String cableHDMI = new String("HDMI");
        String cableHDMI2 = new String("HDMI");
        System.out.println("Para la cadena HDMI:");
        System.out.println("¿El contenido es el mismo? :" + cableHDMI.equals(cableHDMI2));
        System.out.println("¿El código de Referencia (Hashcode) "
                + System.identityHashCode(cableHDMI) + " / "+ System.identityHashCode(cableHDMI2) +" es el mismo? : " + (cableHDMI == cableHDMI2));
        System.out.println();

        // Comparamos cadenas diferentes
        System.out.println("Para la cadena VGA y HDMI: ");
        System.out.println("¿El contenido es el mismo? :" + (cableHDMI.equals(cableVGA)));
        System.out.println("¿El código de Referencia (Hashcode) "
                + System.identityHashCode(cableHDMI) + " / "+ System.identityHashCode(cableVGA2) +" es el mismo? : " + (cableHDMI == cableVGA));
        System.out.println();


        System.out.println("RECUERDA QUE 'equals(String)' COMPARA EL CONTENIDO");
        System.out.println("Y QUE '==' COMPARA HASCODES DE OBJETOS (VARIABLES DE REFERENCIA) EN LA MEMORIA");
    }
}
