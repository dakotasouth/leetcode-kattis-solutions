import java.util.*;
public class pachydermpeanutpacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        while(n != 0){
            HashMap<double[], String> boxes = new HashMap<>();

            for(int i=0;i<n;i++){
                // ArrayList<String> line = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
                String line = sc.nextLine();
                //System.out.println(line + " line");
                double[] dims = new double[4];
                for(int j=0;j<4;j++){
                    dims[j] = sc.nextDouble();
                }
                String word = sc.next();
                boxes.put(dims, word);
                //System.out.println(dims.toString() + " box");
            }
            int m = sc.nextInt();
            
            for(int i=0;i<m;i++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                String size = sc.next();
                //System.out.println(size);
                boolean floor = true;
                for(double[] box: boxes.keySet()){
                    if(x <= Math.max(box[0],box[2]) && x >= Math.min(box[0],box[2]) && y <= Math.max(box[1],box[3]) && y >= Math.min(box[1],box[3])){
                        if(boxes.get(box).equals(size)) System.out.println(size + " correct");
                        else System.out.println(size + " " + boxes.get(box));
                        floor = false;
                        break;
                    }
                }
                if(floor) System.out.println(size + " floor");
            }
            System.out.println();
            n = sc.nextInt();
            
        }
    }
}