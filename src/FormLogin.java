import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormLogin extends JFrame {
    private JPanel panelMain;
    private JTextField usuariotextField1;
    private JPasswordField passwordField1;
    private JComboBox perfilcomboBox1;
    private JButton accesoButton;

    public FormLogin(){
        setTitle("Login");
        setContentPane(panelMain);
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        /*panelMain.setLayout(null);

        JLabel lblnombre= new JLabel("JUGADORES");
        lblnombre.setBounds(30,10,200,25);
        panelMain.add(lblnombre);

        JTextField nuevaCaja = new JTextField("Estrella");
        nuevaCaja.setBounds(30,50,200,25);
        panelMain.add(nuevaCaja);

        JButton accion = new JButton("click");
        accion.setBounds(30,80,200,25);
        panelMain.add(accion);

        JTextArea areaNueva = new JTextArea();
        areaNueva.setBounds(30, 110, 200,25);
        panelMain.add(areaNueva);*/

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        new FormLogin();
    }
}
