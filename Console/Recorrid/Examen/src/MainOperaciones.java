public class MainOperaciones {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        Operaciones op = new Operaciones(arr);
        System.out.println("Mi super clase es: Aritmetica");
        System.out.println("Promedio: " + op.getPromedio());
        System.out.println("Mediana: " + op.getMediana());
    }
    
}
