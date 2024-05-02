<p align="center">
  <img src="https://github.com/hildocosta/hildocosta-Curso-Java--Nelio-Alves/blob/main/logo.png" width="300">
</p>

<h1 align="center">💡 Explorando Polimorfismo em Java</h1>

<p>🚀 Este repositório é dedicado à exploração do conceito de polimorfismo na programação orientada a objetos (POO) em Java. Aqui, você encontrará uma variedade de recursos para aprofundar seu entendimento e praticar sua implementação.</p>

<p>🎓 Sou estudante de Engenharia de Computação no 3º semestre e estou em busca de aprimorar minhas habilidades em Java, especialmente em polimorfismo. Este repositório serve como um complemento ao meu aprendizado, oferecendo exercícios desafiadores e projetos práticos para aplicar os conceitos aprendidos.</p>

<p>🔥 O objetivo principal é fornecer um ambiente onde eu possa não apenas aprender os conceitos teóricos, mas também colocá-los em prática de maneira significativa, construindo soluções eficazes e elegantes por meio do polimorfismo.</p>

<h2 align="center">🔒 Licença</h2>

<p>⚖️ Este projeto está licenciado sob a <a href="LICENSE">Licença MIT</a>.</p>

<h2 align="center">📧 Contato</h2>

<h3>🔗 Redes Sociais e Contato</h3>

<ul>
  <li>📌 GitHub: <a href="https://github.com/hildocosta">hildocosta</a></li>
  <li>💼 LinkedIn: <a href="https://www.linkedin.com/in/hildo-costa-b83812231/">Hildo Costa</a></li>
  <li>✉️ Email: hildo.costa@pm.pr.gov.br</li>
</ul>

<p>Agora que você está preparado e animado, vamos começar!</p>

<h2 align="center">🚀 Vamos Começar</h2>

<h3>🧩 Polimorfismo </h3>

<h2> Exercício - 01</h2>

<p>💥 Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar o nome, horas trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional.
  
O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondednte a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar o nome e pagamento de cada funcionários na mesma ordem em que foram digitados.

Construa o programa conforme projeto abaixo e exemplo:</p>

<h3>Projeto UML:</h3>

 <p align="center">
  <img src="https://github.com/hildocosta/Polimorfismo/blob/main/projetoUML.jpg">
</p>

<h3>Exemplo dos Objetos em Memoria:</h3>


 <p align="center">
  <img src="https://github.com/hildocosta/Polimorfismo/blob/main/objetosemmemoria.jpg">
</p>


<h3>Exemplo do Programa:</h3>

```
Enter the number of employees: 3
Employee #1 data:
Outsourced (y/n)? n
Name: Alex
Hours: 50
Value per hour: 20.00
Employee #2 data:
Outsourced (y/n)? y
Name: Bob
Hours: 100
Value per hour: 15.00
Additional charge: 200.00
Employee #3 data:
Outsourced (y/n)? n
Name: Maria
Hours: 60
Value per hour: 20.00
PAYMENTS:
Alex - $ 1000.00
Bob - $ 1720.00
Maria - $ 1200.00
```


<h2> Exercício - 02</h2>

<p>💥 Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo (próxima página). Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto. </p>

Construa o programa conforme projeto abaixo e exemplo:</p>

<h3>Projeto UML:</h3>

 <p align="center">
  <img src="https://github.com/hildocosta/Polimorfismo/blob/main/projetoUML-02.jpg">
</p>


<h3>Exemplo do Programa:</h3>

```
Enter the number of products: 3
Product #1 data:
Common, used or imported (c/u/i)? i
Name: Tablet
Price: 260.00
Customs fee: 20.00
Product #2 data:
Common, used or imported (c/u/i)? c
Name: Notebook
Price: 1100.00
Product #3 data:
Common, used or imported (c/u/i)? u
Name: Iphone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2017

PRICE TAGS:
Tablet $ 280.00 (Customs fee: $ 20.00)
Notebook $ 1100.00
Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
```
