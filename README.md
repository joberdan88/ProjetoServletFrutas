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

3. CalculadoraJSP
Aplicação web que simula uma calculadora simples usando JSP e Servlet. O usuário pode clicar em números e operações, e o resultado é exibido dinamicamente.

**Funcionalidades:**
- Botões numéricos e operadores
- Processamento via Servlet (`CalcSer.java`)
- Visor atualizado com parâmetros via `request` e `session`]

4. UsuarioBeanJSP

Aplicação web que demonstra o uso de JavaBeans com JSP. O usuário informa seu nome, que é encapsulado em um Bean e exibido em uma página de resposta.

**Funcionalidades:**
- Formulário com campo de nome
- Bean `UsuarioBean` com getter/setter
- Uso de `<jsp:useBean>`, `<jsp:setProperty>` e `<jsp:getProperty>`



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
