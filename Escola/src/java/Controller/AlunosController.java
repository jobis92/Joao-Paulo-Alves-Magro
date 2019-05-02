/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.util.ArrayList;
import Model.Alunos;
public class AlunosController {
    
    
    private ArrayList<Alunos> listaAlunos;
    
     public void cadastrar(Alunos aluno) throws Exception {

        String sql = "insert into alunos(nome, endereco, bairro, cidade, estado, email, senha)"
                + " values (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

        ps.setString(1, aluno.getNome());
        ps.setString(2, aluno.getEndereco());
        ps.setString(3, aluno.getBairro());
        ps.setString(4, aluno.getCidade());
        ps.setString(5, aluno.getEstado());
        ps.setString(6, aluno.getEmail());
        ps.setString(7, aluno.getSenha());
        

        ps.execute();

    }// fim cadastrarAlunos
     
      public ArrayList<Alunos> getAlunos() throws Exception {
        listaAlunos = new ArrayList<Alunos>();

        String sql = "select * from alunos";
        PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Alunos aluno = new Alunos(
                    rs.getInt("codigo"),
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("estado"),
                    rs.getString("email"),
                    rs.getString("senha"));

            listaAlunos.add(aluno);
        }

        return listaAlunos;

    }// fim getAlunos
    
      public Alunos getAlunosByCodigo(int codigo) throws Exception {

        Alunos aluno;

        String sql = "select * from alunos where codigo = ?";

        PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            aluno = new Alunos(
                    rs.getInt("codigo"),
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("estado"),
                    rs.getString("email"),
                    rs.getString("senha"));

            aluno.setCodigo(rs.getInt("codigo"));
        } else {
            aluno = null;
        }

        return aluno;

    }// fim getAlunoByCodigo
    
    
    
}
