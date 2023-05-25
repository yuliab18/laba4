public class Fifth4 {
    public static void main(String[] args) {
        int evenelements = 0;
        int array[] = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0)
                evenelements++;
        }
        System.out.println();
        System.out.println(evenelements);
        }

    }
