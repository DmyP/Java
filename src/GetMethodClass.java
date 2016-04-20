import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*Класс, получающий список методов объекта*/
public class GetMethodClass {
    static void getMethods(Object target){
        Class clazz = target.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method m:methods){
            System.out.println(Modifier.toString(m.getModifiers()) +" "+ m.getName());
        }
    }

    public static void main(String[] args) {
        getMethods(new SomeClassWithMethods());
    }
}
/*Класс с каким-то набором методов*/
class SomeClassWithMethods{
    private   void someMethod(){    }
    public int getInt(){
        return 0;
    }
    void f(){}
    protected final void proFinMeth(){}
}