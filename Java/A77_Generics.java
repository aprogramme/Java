import java.util.ArrayList;

class MyGeneric<T1>{
    int val;
    private T1 t1;

    public MyGeneric(int val, T1 t1){
        this.val = val;
        this.t1 = t1;
    }

    public int getVal(){
        return val;
    }
    public void setVal(int val){
        this.val = val;
    }
    public T1 geT1(){
        return t1;
    }
    public void setT1(int T1){
        this.t1 = t1;
    }
}

public class A77_Generics {
    public static void main(String[] args) {
        // ArrayList al = new ArrayList<>();
        // al.add("str1");
        // al.add(54);
        // al.add(678);
        // int a = (int)al.get(2);
        // System.out.println(a);

        ArrayList<Integer> al = new ArrayList<>();
        // al.add("str1");
        al.add(54);
        al.add(678);
        int a = al.get(2);
        // System.out.println(a);

        MyGeneric<String> g1 = new MyGeneric(23, "MyString is my string");
        String str = g1.geT1();
        System.out.println(str);
    }
}