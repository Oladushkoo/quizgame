import javax.swing.*;

public class Window extends JFrame {
    public Window() {
        setTitle("quiz");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(520,545);
        add(new Game());
        setVisible(true);
    }

    public static void main(String[] args) {
        Window w = new Window();
    }
}
