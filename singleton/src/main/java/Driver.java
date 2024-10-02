public class Driver {

    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance("string1", 1);
        SingletonClass singletonClass2 = SingletonClass.getInstance("string2", 2);

        System.out.println(singletonClass1);
        System.out.println(singletonClass2);
    }
}
