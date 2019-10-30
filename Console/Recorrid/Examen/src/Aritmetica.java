
class Aritmetica {

    private int promedio;
    private int mediana;

    public Aritmetica(int[] arr) {
        for (int i = 0; i < 5; i++) {
            promedio += arr[i];
        }
        promedio = promedio / 5;
        mediana = arr[2];

    }

    public int getPromedio() {
        return promedio;
    }

    public int getMediana() {
        return mediana;
    }
}
