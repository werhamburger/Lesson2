public class Main {
    public static void main(String[] args) {
        int[] tab = new int[5];
        int[] cos = {1,2,3,4,5};
        String[] napisy = {"kupa1","kupa2","kupa3"};
        String[] cosie = new String[3];
        tab[0] = cos[1];
        tab[1] = cos[2];
        tab[3] = cos[4];
        tab[4] = cos[0];
        tab[2] = cos[3];
        System.out.println(tab[0] +" " + " " + cos[3] + " " + napisy[1]);
    }
}

