public class First4 {
    public static void main(String[] args){
        int[] oddNumbers = new int[50];

        int number = 1;

        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = number;
            number += 2;
            System.out.println(oddNumbers[i]);
        }

        }

    }
