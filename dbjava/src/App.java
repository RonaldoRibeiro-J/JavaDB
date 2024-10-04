import DAO.UsuarioDAO;
import entity.Usuario;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
//        u.setNome("Ronaldo");
//        u.setLogin("ronaldo");
//        u.setSenha("1234");
//        u.setEmail("ronaldo@gmail.com");

        u.setNome(JOptionPane.showInputDialog("Digite seu nome"));
        u.setLogin(JOptionPane.showInputDialog("Digite seu login"));
        u.setSenha(JOptionPane.showInputDialog("Digite sua senha"));
        u.setEmail(JOptionPane.showInputDialog("Digite seu e-mail"));



        new UsuarioDAO().cadastrarUsuario(u);

        JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");

    }
}
