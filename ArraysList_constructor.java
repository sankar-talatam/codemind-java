import java.util.ArrayList;

class person{
    String name;
    int age;
    char gender;
    // person(){
    //     System.out.println("I AM SHANKAR REPORTING SIRRRRR");
    // }
    person(String n,int a,char g)
    {
        name=n;
        age=a;
        gender=g;
    }
    public String toString(){
        return "(" + name + ", " + age + " ," + gender + ")";
    }
    void printDetails(){
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
        System.out.println("Gender is: "+ gender);
        System.out.println();
    }
}
public class ArraysList_constructor {
    public static void main(String[] args) {

       ArrayList<person> arr= new ArrayList<>();
       arr.add(new person("virat",35, 'M'));
       arr.add(new person("Smriti",26, 'F'));
       arr.add(new person("KOHLI",35, 'M'));
       for(person p:arr)
       {
        System.out.println(p);
       }

    }
}
