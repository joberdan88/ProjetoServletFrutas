# ProjetoServletFullStack

Este repositório reúne vários projetos desenvolvidos por mim (**Jonas Oberdan**) com Java, com foco em aplicações web utilizando **Servlets**, **JSP**, **JSF**, **JPA** e **Hibernate**. Tem integração completa com banco de dados.

---

##  Projetos incluídos

### 🔹 AplicacaoJPA
CRUD completo de alunos com JSF + JPA + Hibernate  
- Cadastro, listagem, edição e exclusão de alunos  
- Integração com banco MySQL  
- Interface com páginas JSF (`listaalunos.xhtml`, `novoaluno.xhtml`, `editaraluno.xhtml`)  
- Uso de `EntityManager`, `Query`, e `FacesMessage`

### 🔹 CalculadoraJSP
Aplicação simples de calculadora usando JSP  
- Operações básicas: soma, subtração, multiplicação, divisão  
- Interface com formulário HTML e lógica em JavaBean

### 🔹 JSFPersistencia
Exemplo de persistência de dados com JSF  
- Cadastro de dados via formulário  
- Armazenamento em banco usando JPA  
- Demonstração de escopos de bean e navegação entre páginas

### 🔹 ProjetoConversorTemperatura
Conversor de temperatura com JSF  
- Entrada de valor em Celsius  
- Conversão para Fahrenheit  
- Interface dinâmica com JSF e feedback visual

### 🔹 ProjetoJSP
Cadastro de usuário com JavaBean e JSP  
- Formulário de entrada  
- Exibição de dados cadastrados  
- Separação entre lógica e apresentação

### 🔹 ProjetoLoginJSF
Sistema de login com JSF  
- Autenticação de usuário  
- Redirecionamento com base em credenciais  
- Uso de escopo de sessão e mensagens de erro

### 🔹 ProjetoServletNome
Aplicação com Servlet para manipulação de nomes  
- Cadastro e exibição de nomes via formulário  
- Processamento com `doPost` e `doGet`  
- Armazenamento em lista e exibição dinâmica

### 🔹 ProjetoServletFrutas
Primeiro projeto com Servlet  
- Cadastro de frutas via formulário  
- Exibição em tabela HTML  
- Introdução ao ciclo de vida de Servlets

---

##  Tecnologias Utilizadas

- Java 8+
- Servlets
- JSP (JavaServer Pages)
- JSF (JavaServer Faces)
- JPA (Java Persistence API)
- Hibernate
- MySQL
- NetBeans
- Git & GitHub

---

##  Aprendizados

- Criação e manipulação de JavaBeans
- Integração entre front-end (HTML/JSF) e back-end Java
- Persistência de dados com JPA e Hibernate
- Navegação entre páginas e escopos de bean
- Autenticação e controle de sessão
- Uso de `EntityManager`, `Query`, e `FacesMessage`
- Versionamento e organização de projetos com Git

---

##  Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/joberdan88/ProjetoServletFullStack.git
2. Importe os projetos no NetBeans ou Eclipse
3. Configure o banco de dados (se necessário):
- Crie o banco aplicacaojpa
- Atualize o persistence.xml com suas credenciais
4. Execute os projetos em um servidor compatível (GlassFish, Tomcat)
  
  
