<%-- 
    Document   : detalhe
    Created on : 28/11/2018, 21:06:15
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Alunos" %>
<%@page import="Controller.AlunosController" %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consultando um time já cadastrado</h1>
        
        
       
        <p>
                Digite um codigo<br>
                <input type="text" name="codigo" value="" />
            </p>
        
        <p>
            Codigo informado é <%= request.getParameter("codigo") %>
            
            <%
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                
                AlunosController alunoscontroller = new AlunosController();
                
                Alunos alunos = alunoscontroller.getAlunosByCodigo(codigo);
                
                if (alunos == null)
                {
                    out.println("<br>Nao existe time com o codigo informado !");
                }
                else
                {
                    out.println("<br>Nome: " + alunos.getNome());
                    out.println("<br>Endereco: " + alunos.getEndereco());
                    out.println("<br>Bairro: " + alunos.getBairro());
                    out.println("<br>Cidade: " + alunos.getCidade());
                    out.println("<br>Estado: " + alunos.getEstado());
                    out.println("<br>Email: " + alunos.getEmail());
                    out.println("<br>Senha: " + alunos.getSenha());
                }
                
                
                
            %>
            
              <p>
            <a href="index.jsp">voltar</a>
        </p>
    </body>
</html>
