public class Bhupesh_break_continue_using_loop {
    public static void main(String[] args) {
        for (int i=0;i<50;i++){
            System.out.println(i);
            System.out.println("java is great");
            if (i==2){
                System.out.println("end the loop");
                break;
            }
        }
        System.out.println("loop ends here");
    }
}
