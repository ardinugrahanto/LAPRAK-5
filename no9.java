public class no9 {
    public static void main(String[] args) {
        int[] data = new int[5];
        
        // Loop pengisian array
        for (int i = 0; i < data.length; i++) {
            data[i] = i * 2;
        }
        
        // Loop untuk menampilkan isi array
        for (int j = 0; j < data.length; j++) {
            System.out.println(data[j]);
        }
    }
}