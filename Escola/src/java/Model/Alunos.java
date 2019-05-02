/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Alunos {
    private int codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private String senha;   
         
    public Alunos (){
    }
    
    
    
 /*  public Alunos(){

    codigo =0;
    nome = "";
    endereco = "";
    bairro = "";
    cidade = "";
    estado = "";
    email = "";
    senha = "";

}*/
    
    public Alunos (int codigo,String nome,String endereco,String bairro,String cidade,
            String estado,String email,String senha)
    {
    
    this.codigo=codigo;
    this.nome = nome;
    this.endereco = endereco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.email = email;
    this.senha = senha;
    
    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
    }
