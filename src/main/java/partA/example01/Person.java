package partA.example01;

public class Person {
    public static String name;
    public int age;
    public String address;

    public String greet(String personToGreet){
        return name + " says `Hello " + personToGreet +", how are you?`";
    }



    public static String tellJoke(){
        return "What has two thumbs and writes bad code? .... " + name +"!";}




    public static void main(String[] args) {
        tellJoke();
    }

}


