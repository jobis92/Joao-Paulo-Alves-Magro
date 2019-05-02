<%-- 
    Document   : index
    Created on : 28/11/2018, 20:10:06
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Alunos" %>
<%@page import="Controller.AlunosController" %>

<%
    
    if (request.getParameter("nome") != null) {
        
    
        String nome, endereco, bairro, cidade, estado, email, senha;
        
        
        nome = request.getParameter("nome");
        endereco = request.getParameter("endereco");
        bairro = request.getParameter ("bairro");
        cidade  = request.getParameter ("cidade");
        estado = request.getParameter ("estado");
        email = request.getParameter ("email");
        senha = request.getParameter ("senha");
        
        Alunos aluno = new Alunos (0,nome, endereco, bairro, cidade, estado , email, senha);
        AlunosController alunoscontroller = new AlunosController();
        
        alunoscontroller.cadastrar(aluno);
        
    }


%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prova</title>
    </head>
    <body>
        <h1>Cadastro de Alunos</h1>
        
        <form action="index.jsp" method="POST">
            
           <p>
                Digite o nome do aluno<br>
                <input type="text" name="nome" value="" />
            </p>
            
            <p>
                Digite o endereco<br>
                <input type="text" name="endereco" value="" />
            </p>
            
            <p>
                Digite o bairro<br>
                <input type="text" name="bairro" value="" />
            </p>
            
            <p>
                Digite a cidade<br>
                <input type="text" name="cidade" value="" />
            </p>
            
            <p>
                Digite o estado<br>
                <input type="text" name="estado" value="" />
            </p>
            
            <p>
                Digite o email<br>
                <input type="text" name="email" value="" />
            </p>
            
            <p>
                Digite a senha<br>
                <input type="text" name="senha" value="" />
            </p>
           
            <p>
                <input type="submit" value="Cadastrar" />
                <input type="reset" value="Limpar" />
            </p>
            
            
            
        </form>
        
        <h1>Listagem de Alunos</h1>
        <table border="1">
            <tr>
                <td>Codigo</td>
                <td>Nome</td>
                <td>Endereco</td>
                <td>Bairro</td>
                <td>Cidade</td>
                <td>Estado</td>
                <td>Email</td>
                <td>Senha</td>
            </tr>
            <%                AlunosController alunos = new AlunosController();

                for (Alunos aluno : alunos.getAlunos()) {
            %>
            <tr>
                <td><%= aluno.getCodigo()%></td>
                <td><%= aluno.getNome()%></td>
                <td><%= aluno.getEndereco()%></td>
                <td><%= aluno.getBairro()%></td>
                <td><%= aluno.getCidade()%></td>
                <td><%= aluno.getEstado()%></td>
                <td><%= aluno.getEmail()%></td>
                <td><%= aluno.getSenha()%></td>
                
                <td>
                    <a href="consultar.jsp?codigo=<%= aluno.getCodigo()%>">Consultar por Codigo</a>
                   
                </td>
            </tr>
            <%
                }
            %>
        </table>
        
        
          
        
        
        
        
        
        
    </body>
</html>
