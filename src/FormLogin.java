import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormLogin extends JFrame {
    private JPanel panelMain;
    private JTextField txtUsuario;
    private JPasswordField txtContrasenia;
    private JComboBox comboRol;
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
                String usuario = txtUsuario.getText();
                String contrasenia = String.valueOf(txtContrasenia.getPassword());
                String rol = (String) comboRol.getSelectedItem();

                if (usuario.isEmpty() ||  contrasenia.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Llenar los campos");
                    return;
                }
                if (rol.equals("Administrador") && usuario.equals("admin") && contrasenia.equals("123")){
                    new FormAdmin().setVisible(true);
                    dispose();
                }
                if (rol.equals("Jugador") && usuario.equals("Jugar") && contrasenia.equals("123")){
                    new FormJugador().setVisible(true);
                    dispose();
                }
            }
        });
    }
    public static void main(String[] args) {
        new FormLogin();
    }
}
