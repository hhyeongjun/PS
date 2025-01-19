import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] arr = new int[26];
        int maxCount = 0;
        char maxChar = '?';

        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }

        for(int i = 0; i < 26; i++) {
            if(arr[i] > maxCount) {
                maxCount = arr[i];
                maxChar = (char)(i + 'A');
            }
            else if(arr[i] == maxCount) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}