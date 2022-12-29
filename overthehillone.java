import java.util.*;
public class overthehillone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> alpha = new ArrayList<>(Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ".split("")));
        int n = sc.nextInt();

        // creating matrix
        int[][] encrypt = new int[n][n];
        sc.nextLine();

        // reading in matrix
        for(int i=0;i<n;i++) encrypt[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // System.out.println(Arrays.deepToString(encrypt));

        // gets string and adds spaces if needed
        String text = sc.nextLine();
        //System.out.println(text);
        for(int i=0;i<text.length() % n;i++) text = text.concat(" ");
        
        // convert to matrix
        String[] letters = text.split("(?<=\\G.{" + n + "})");
        Arrays.toString(letters);
        int[][] textMatrix = new int[letters.length][3];
        for(int i=0;i<letters.length;i++){
            int[] mat = new int[n];
            for(int j=0;j<n;j++){
                mat[j] = alpha.indexOf(letters[i].split("")[j]);
                //System.out.println(mat[j]);
            }
            textMatrix[i] = mat;
        }
        //System.out.println(Arrays.deepToString(textMatrix));
        // Arrays.stream(textMatrix).forEach(System.out::println);


        for(int vec=0;vec<textMatrix.length;vec++){
            for(int i=0;i<n;i++){
                int curr = 0;
                for(int j=0;j<n;j++){
                    curr += encrypt[i][j] * textMatrix[vec][j];
                }
                System.out.print(alpha.get(curr % 37));
            }
        }
        
    }
}
