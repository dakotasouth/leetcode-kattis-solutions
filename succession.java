import java.util.*;
class Person{
    String name;
    ArrayList<Person> parents;
    double blood = -1;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, ArrayList<Person> parents){
        this.name = name;
        this.parents = parents;
    }

    public double getBlood(){
        return this.blood;
    } 
}
public class succession {
    public static double calcBlood(Person p){
        //System.out.println(p.name + "--");
        if(p.blood != -1) return p.blood;
        else if(p.parents == null) return 0;
        else{
            p.blood = (calcBlood(p.parents.get(0)) + calcBlood(p.parents.get(1))) / 2; 
            // System.out.println(p.name + " " + p.blood);
            return p.blood;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Person> people = new ArrayList<>();
        Person founder = new Person(sc.next());
        founder.blood = 1;
        people.add(founder);

        for(int i=0;i<n;i++){
            String child = sc.next();
            String p1 = sc.next();
            String p2 = sc.next();
            ArrayList<Person> parents = new ArrayList<>();
            // if list doesnt contain person with name of parent 1
            // create person and add to parents and people
            Person parent1 = null;
            for(Person p: people) if(p.name.equals(p1)) parent1 = p;
            if (parent1 == null){
                parent1 = new Person(p1);
                parents.add(parent1);
                people.add(parent1);
            }
            // else find parent object and add to parents
            else parents.add(parent1);
            // repeat for parent 2
            Person parent2 = null;
            for(Person p: people) if(p.name.equals(p2)) parent2 = p;
            if (parent2 == null){
                parent2 = new Person(p2);
                parents.add(parent2);
                people.add(parent2);
            }
            else parents.add(parent2);
            // if the child doesnt already exist add to people
            Person ch = null;
            for(Person p: people) if(p.name.equals(child)) ch = p;
            if(ch == null){
                people.add(new Person(child, parents));
            }
            // if child does exist add parents
            else{
                ch.parents = parents;
            }
        }
        ArrayList<Person> claimants = new ArrayList<>();
        // add each claimant to list after calculating blood
        // if it doesnt exist, init and set blood to 0
        for(int i=0;i<m;i++){
            String currName = sc.next();
            Person curr = null;
            for(Person p: people) if(p.name.equals(currName)) curr = p;
            if(curr != null){
                calcBlood(curr);
                claimants.add(curr);
            }
            else{
                Person newP = new Person(currName);
                newP.blood = 0;
                claimants.add(newP);
            }
            
        }
        // finds what claimant has the highest blood value and prints out the name
        Person max = claimants.get(0);
        for(Person p: claimants) if(p.blood > max.blood) max = p;
        System.out.println(max.name);
    }
}