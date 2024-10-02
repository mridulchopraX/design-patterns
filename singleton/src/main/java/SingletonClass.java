public class SingletonClass {

    private String stringProperty;
    private Integer integerProperty;

    private static SingletonClass instance;

    private SingletonClass(String stringProperty, Integer integerProperty) {
        // private constructor

        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        this.stringProperty = stringProperty;
        this.integerProperty = integerProperty;
    }

    public static SingletonClass getInstance(String stringProperty, Integer integerProperty) {
        if (instance == null) {
            instance = new SingletonClass(stringProperty, integerProperty);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonClass{" +
                "stringProperty='" + stringProperty + '\'' +
                ", integerProperty=" + integerProperty +
                '}';
    }
}
