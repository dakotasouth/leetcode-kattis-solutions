
import java.util.*;
import java.io.*;

public class CourseScheduling {
    public static class Course{
        String name;
        Set<String> students = new HashSet<>();
        
        Course(String name){
            this.name = name;
        }       
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Course> courses = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String name = sc.next() + " " + sc.next();
            //System.out.println(name);
            String course = sc.next();
            //System.out.println(course);
            Course c1 = new Course(course);
            if (!courses.containsKey(course)){
                courses.put(course, c1);
            }
            else courses.get(course).students.add(name);
        }
        Set<Map.Entry<String, Course>> entries = courses.entrySet();
        TreeMap<String, Course> sorted = new TreeMap<>(courses);
        Set<Map.Entry<String, Course>> mappings = sorted.entrySet();
        for (Map.Entry<String, Course> mapping : mappings){
            System.out.println(mapping.getKey()+ " " +mapping.getValue().students.size());
        }
        
        
    }
}
