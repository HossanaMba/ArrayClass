public class RotLeft3 {
    public static void main(String[] args) {

        // 3. Left Rotation Logic
        for (int i = 0; i < n; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }

     }
}