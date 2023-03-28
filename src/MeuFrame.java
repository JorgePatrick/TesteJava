import javax.swing.*;

public class MeuFrame extends JFrame {
    public MeuFrame() {

        super("Meu Frame");

        JButton botao = new JButton("Clique");

        /* jorge */
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MeuFrame();
    }
}