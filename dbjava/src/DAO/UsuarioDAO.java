package DAO;

import conexao.Conexao;
import entity.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    public void cadastrarUsuario(Usuario usuario) {
        String sql = "insert into usuario (nome, login, senha, email) values (?,?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e){
            e.printStackTrace();
        }


    }
}
