// import java.util.*;
class print_1to5 {
    void number(int i){
        if(i==6)
        return;
        else{
            System.out.println(i);
            number(i+1);
        }
    }
    public static void main(String[] args) {
        print_1to5 obj=new print_1to5();
        obj.number(1);
    }
}
