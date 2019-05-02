package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Alunos;
import Controller.AlunosController;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
    if (request.getParameter("nome") != null) {
        
        int codigo;
        String nome, endereco, bairro, cidade, estado, email, senha;
        
       // codigo = Integer.parseInt (request.getParameter("codigo"));
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



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Prova</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro de Alunos</h1>\n");
      out.write("        \n");
      out.write("        <form action=\"index.jsp\" method=\"POST\">\n");
      out.write("            \n");
      out.write("           <p>\n");
      out.write("                Digite o nome do aluno<br>\n");
      out.write("                <input type=\"text\" name=\"nome\" value=\"\" />\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Digite o endereco<br>\n");
      out.write("                <input type=\"text\" name=\"endereco\" value=\"\" />\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Digite o bairro<br>\n");
      out.write("                <input type=\"text\" name=\"bairro\" value=\"\" />\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Digite a cidade<br>\n");
      out.write("                <input type=\"text\" name=\"cidade\" value=\"\" />\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Digite o estado<br>\n");
      out.write("                <input type=\"text\" name=\"estado\" value=\"\" />\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Digite o email<br>\n");
      out.write("                <input type=\"text\" name=\"email\" value=\"\" />\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Digite a senha<br>\n");
      out.write("                <input type=\"text\" name=\"senha\" value=\"\" />\n");
      out.write("            </p>\n");
      out.write("           \n");
      out.write("            <p>\n");
      out.write("                <input type=\"submit\" value=\"Cadastrar\" />\n");
      out.write("                <input type=\"reset\" value=\"Limpar\" />\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h1>Listagem de Alunos</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Codigo</td>\n");
      out.write("                <td>Nome</td>\n");
      out.write("                <td>Endereco</td>\n");
      out.write("                <td>Bairro</td>\n");
      out.write("                <td>Cidade</td>\n");
      out.write("                <td>Estado</td>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>Senha</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
                AlunosController alunos = new AlunosController();

                for (Alunos aluno : alunos.getAlunos()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( aluno.getCodigo());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( aluno.getNome());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( aluno.getEndereco());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( aluno.getBairro());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( aluno.getCidade());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( aluno.getEstado());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( aluno.getEmail());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( aluno.getSenha());
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <a href=\"consultar.jsp?codigo=");
      out.print( aluno.getCodigo());
      out.write("\">Consultar por Codigo</a>\n");
      out.write("                   \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
