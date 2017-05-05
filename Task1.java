import java.util.Scanner;

/**
 * Created by pravindap on 5/5/17.
 */
public class Task1 {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        int len = 3;
        int max = 0;
        int min = 100;

        int[] s = new int[len];

        while(reader.hasNext()) {
            reader.next();
            reader.next();

            for (int i = 0; i < s.length; i++) {
                s[i] = reader.nextInt();

                if (s[i] < min) {
                    min = s[i];
                }
            }

            System.out.println("The min is" + min);

            reader.next();
            reader.next();


            for(int i=0; i<s.length; i++){
                s[i] = reader.nextInt();

                if(s[i]> max){
                    max = s[i];
                }
            }

            System.out.println("The max is" +max);

        }
    }
}
