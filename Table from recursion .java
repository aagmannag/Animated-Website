import java.util.*;
class table {
    void table (int a,int i){
        if(i==11)
        System.out.println(" ");
        else{
            int t=a*i;
            System.out.println(t);
            table(a,i+1);
        }
    }
    public static void main(String[] args) {
        table obj=new table();
        int a=5,i=1;
        obj.table(a,i);
    }
}
