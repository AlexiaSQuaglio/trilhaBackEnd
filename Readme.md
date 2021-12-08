A)	Controle de versão é a pratica de rastrear e gerenciar alterações em um código e com isso ajuda os desenvolvedores a gerenciar o código fonte ao longo do tempo, sendo muito utilizado por equipes de DevOps.

B)	Com essa ferramenta é possível que vários desenvolvedores consigam trabalhar com o mesmo arquivo sem sobrescrever o código do outro; o suporte a marcações dos documentos; ao ser criada uma nova versão de um documento, essa ferramenta identifica unicamente de modo que seja permitido recuperar a qualquer momento;  o Controle de Versão permite que haja uma rapidez no processamento das operações e também uma autonomia.

C)	CVS, Subversion e TFS.


\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

Desafio 2
a) POO é um paradigma de programação que se basea no conceito de objetos, onde contem seus atributos que são os dados e os metodos que 
são os procedimentos feitos dentro do objeto, seus  pilares são Abstração, Encapsulamento, Herança e Polimorfismo.

b) Abstração  é  usada para  fazer a definição das entidad no mundo real, considerando suas caracteristicas e ações , por exemplo, a entidade Carro tem como caracteristica sua cor e sua marca  e tem como ações ligar, parar , acelerar  e desligar.

c)  Encapsulamento é usada para esconder os detalhes de implementação de uma classe e apenas expondo operações seguras ,  a classe ficando no tipo private e só sendo possível de acessar usando os métodos getters e setters, por exemplo:
private String carro; 

public String getCarro(){
        return carro;
 }
 public void setCarro (String carro){
        this.carro=carro;
 }
 
 d) Herança igual como na vida real é o método onde uma classe herda os atributos de uma outra classe , podendo ser visualizadas apenas os atributos e métodos do tipo public e protected, por exemplo,  na classe Funcionario estão todos os métodos e atributos ede um funcionário e a classe Gerente irá herdar da classe Funcionario os métodos e atributos:
 public class Gerente extends Funcionario 
 
 e) Polimorfismo é o princípio  onde duas ou mais classes que são derivadas de uma mesma superclasse podem invocar métodos que possuem a mesma identificação , assinatura mas comportamentos diferentes para cada classe derivada podendo ser usada para referenciar um objeto da supercalsse.
 
 f) 1- os programas feitos em POO são fáceis de ler  e entender;
 2- os códigos em POO são fáceis de modificar;
 3 -  Pode ser mais rápido de se programar em  POO;
 4 - Sendo baseado em objetos e  classes, o código acaba sendo mais independente;
 5 - O código permite que se posso reutilizar métodos e atributos usados anteriormente e não precisando repitilos.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Desafio 3
a)	 I. HTTP (Hypertext Transfer Protocol) é um protocolo de transferência de comunicação entre um navegador e um servidor web, sendo um dos principais o WWW (World Wide Web). 
II.	Rest é um protocolo para troca de mensagens (XML ou JSON) que podem usar HTTP para transportar as mensagens.
Web API é uma interface de programação de aplicações tanto para um servidor quanto um navegador.
III.	 	Swagger é um framework para descrição, consumo e visualização de serviços Restful, tendo como objetivo permitir que a documentação evolua na mesma velocidades que a implementação. 
b)	Get – requisição por onde nós pedimos a representação de um recurso, por exemplo, html, xml, json e etc.;
Post – método utilizado quando desejamos criar um recurso;
Put – método que requisita que um recurso seja guardado na URI fornecida e se o recurso já existir o mesmo será atualizado;
Delete – exclui recursos especificados;
Trace – Devolve a mesma requisição que for enviada tanto se houver mudança e também se houver adição feita por servidores intermediários;
Options -  retorna os métodos HTTP suportados pelo servidor para a URL;
Patch – usado para editar o recurso sem necessidade e enviar todos os atributos
