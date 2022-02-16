public class Ques {
    public static void main(String[] arg) {
        int i = 0, j = 1, k, m, count = 10;
        for (m = 2; m < count; m++){
            k = i + j;
            System.out.println(k);
            i = j;
            j = k;
            //k = j;
        }
    }
}