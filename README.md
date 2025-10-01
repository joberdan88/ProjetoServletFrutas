 Projetos incluídos
 1. ServletFrutas
Aplicação que permite ao usuário selecionar frutas favoritas em um formulário HTML. Os dados são processados por um Servlet e exibidos dinamicamente em uma página JSP.
Funcionalidades:
- Formulário com checkboxes de frutas
- Envio via método POST
- Servlet que processa os dados
- Página JSP que exibe os resultados

 2. AplicacaoNomes
Aplicação simples que recebe o nome do usuário via formulário e exibe uma saudação personalizada.
Funcionalidades:
- Formulário HTML com campo de texto
- Servlet que processa o nome e retorna uma mensagem
- Mapeamento via web.xml e/ou anotação @WebServlet

 Como executar
- Clone o repositório:
git clone https://github.com/joberdan88/ProjetoServletFrutas.git
- Importe os projetos no Eclipse:
- File > Import > Existing Projects into Workspace
- Configure o servidor GlassFish ou Tomcat:
- Adicione os projetos à instância do servidor
- Execute como aplicação web
- Acesse no navegador:
- http://localhost:8080/ServletFrutas/index.html
- http://localhost:8080/AplicacaoNomes/index.html

 Tecnologias usadas
- Java 21
- Jakarta Servlet API
- HTML5 / JSP
- Eclipse IDE
- GlassFish / Tomcat
