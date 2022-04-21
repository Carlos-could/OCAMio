class ArrayconStatic {
    public static void main(String[] args) {
        int numbers[] ={12,13,42,32,15,156,23,51,12};
        int max=findMax(numbers); // la pregunta es llamar al metodo findmax
                                    // sin instanciar la clase

    }

    static int findMax(int[] numbers){ // tiene que ser static el metodo, para llamarlo sin instanciar
        int max=0;
        return max;


    }
}