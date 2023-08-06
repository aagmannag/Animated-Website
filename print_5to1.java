// import java.util.*;
class print_5to1{
    void Number(int i){
        if(i==6)
        return;
        else{
            Number(i+1);
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        print_5to1 obj=new print_5to1();
        obj.Number(1);
    }
}