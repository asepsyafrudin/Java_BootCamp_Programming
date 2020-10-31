package co.g2academy.basic;

public class StaticVarExample {
    public static String myClassVar = "Class or Static Variable";
    public static void main (String[] args){
        StaticVarExample obj1 = new StaticVarExample();
        StaticVarExample obj2 = new StaticVarExample();
        StaticVarExample obj3 = new StaticVarExample();

        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);


        obj2.myClassVar = "Change Text";
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);


    }
}
