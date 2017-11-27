package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Id {

    public int id_incremento() {
        int id = 1;
        PreparedStatement banco = null;
        ResultSet bancoResult = null;
        Conexao conectar = new Conexao();

        try {
            banco = conectar.getConexao().prepareStatement("SELECT AX pes_id FROM pessoa");
            bancoResult = banco.executeQuery();
            while (bancoResult.next()) {
                id = bancoResult.getInt(1) + 1;
            }

        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        } finally {
            try {
                banco.close();
                bancoResult.close();
                
            } catch (Exception e) {
            }
        }

        return id;
    }

}
