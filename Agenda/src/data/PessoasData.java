package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Pessoa;

public class PessoasData {

    public boolean incluir(Pessoa obj) throws SQLException {
        Conexao con = new Conexao();
        String SQL = "INSERT INTO pessoa (pes_id, pes_nome, pes_telefone) VALUES (?,?,?)";
        PreparedStatement banco = con.getConexao().prepareStatement(SQL);

        banco.setInt(1, obj.getId());
        banco.setString(2, obj.getNome());
        banco.setString(3, obj.getTelefone());
        int registros = banco.executeUpdate();
        return registros > 0;
    }

}
