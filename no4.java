public class no4 {
    public static void main(String[] args) {
        int[] bilangan = new int[5];
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i+1;
        }
        System.out.println("isi array bilangan adalah : ");
        for (int angka1sampai5 : bilangan) {
            System.out.println(angka1sampai5);
        }

    }
}
