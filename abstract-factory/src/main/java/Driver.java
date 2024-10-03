import com.example.ui.button.Button;
import com.example.ui.checkbox.Checkbox;
import com.example.ui.factory.AbstractUIFactory;
import com.example.ui.factory.MacUIFactory;
import com.example.ui.factory.WindowsUIFactory;

public class Driver {

    public static void main(String[] args) {

        String os = "MacOS";
        AbstractUIFactory factory;

        if(os.equals("Windows")) {
            factory = new WindowsUIFactory();
        } else {
            factory = new MacUIFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();

        button.click();
        checkbox.toggle();
    }
}
