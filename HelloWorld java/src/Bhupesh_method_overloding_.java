import javafx.scene.control.TextFormatter;

public class Bhupesh_method_overloding_ {
    static void foo(){
        System.out.println("good morinig bro");
    }
    static void foo (int a){
        System.out.println("good morning "+a+" bro!");
    }
    static void change(int a ){
        a=98;
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n" +
                "plagiarism!");
    }

    public static void main(String[] args) {
        //tell joke
       // int[] marks={53,73,89,98,94};
        //int x=45;
       // change(x);
        //System.out.println("the value of x after running change is "+ x);

        //methods overloading
        foo();
        foo(3000);
    }
}
