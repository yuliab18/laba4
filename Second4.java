public class Second4 {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) array[i] = (int) Math.round(Math.random() * 9);
        System.out.println("Масив до заміни:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println("\nМасив після заміни:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }
    }
}




