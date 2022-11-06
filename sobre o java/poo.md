#Programação Orientada a objetos

A orientação a objetos é baseado na composição e interação entre objetos.

O Paradima estruturado tem uma forma mais simplista do mundo real, enquanto a POO tem uma forma mais realizada.

Poo foca na modelagem de entidades e interações entre elas. Foco no que fazer.

## Vantagens

* Melhor coesão, responsabilidades bem definidas
* Melhor acoplamento
* Diminuição do Gap semântico
* Coletor de lixo




# O que são metodos?

Porcao de codigo (sub-rotina) que é disponibilizada por uma classe. É executado quando é feito uma requisição a ele.
Definem e realizam determinados comportasmentos.

* sintaxe:

~~~java
 visibildade tipo modificador retorno nome (parametros) exceções copo 
~~~

* V: public, protect, private
* T: concreto ou abstrato
* M: static ou final
* R: tipo de dado ou void


# Para criar entidades a partir de horas entidades, temos três coinceitos importantes:

* Heranca
* Associação
* Interface

## Herança
Aqui a subclasse é uma extensão de uma superclasse. A subclasse consegue reaproveitar os atribuitose metodos dela. Além disso, a subclasse pode definir seus proprios membros.

~~~ Java
class A extends B{
}
~~~

### A herança pode ser simples ou multipla. No caso de heranças simples, uma casa filha possui apenas uma classe mãe.

Em herança multipla, uma classe filha pode ter mais de uma classe mae; Em C# e Java, isso não existe.

### UPCAST E DOWNCAST

Upcast sobe na hierarquica de classe, uma generalização.

`Superclasse a = new Subclasse();` o upcast é implicito

Downcas desce na hierarquica, uma especialização.

`Subclasse a = (Subclasse)new Superclasse();` 

o downcast é implicito e sujeito a erros de compilação e execução.

### Polimofirsmo

A mesma ação se comporta de forma diferente. No caso, os metodos podem se comportar de forma diferente.

* Na sobrescrita, pode ou não se comportar de forma diferente.

## Associação

Possibilidade um relacionamento entre classes/objetos no qual estes possam pedir ajuda a outras classes/objetos e representar de forma complexa o conceito ao qual se destinam.
Neste tipo de relacionamento, as classes/objetos interagem entre si.

Pode ser dividido em:

### Estrutural (assoaciado a metodos)
	* Composicao: Com Parte Todo

Pessoa 				Endereco
_________________    ->      ______________
Endereco endereco

Aqui, a parte só existe com o todo. Isto é, o endereço só existe se existir pessoa.
	
~~~ java
class Pessoa {
 Endereco endereco;
} 
~~~~
	* Agregação:  Sem Parte Todo

Disciplina 				Aluno
_________________    ->      ______________
Aluno aluno

Aqui, a parte pode existir sem o todo. Isto é, se uma disciplina deixa de existir, o aluno ainda pode existir.
	
~~~ java
class Disciplina {
 Aluno aluno;
} 
~~~~

E qual é a diferença então entre elas? Elas são implementada de forma igual, mas a questão conceitual é muito distintita.
A composição tem uma relação forte de dependencia dos elementos.


### Comportamento (Associado a atributos)
	* Dependencia: "Dependencia de"

Compra					Cupom
-----------			------->  -----------
Cliente cliente				...
finalizar (Cupom,...)
finalizar (...)

No codigo, é feito uma sobrescrita.

## Interface

Define um contrato que deve ser seguido por uma classe que a implementa. Quando uma classe implementar uma inferteface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza.

~~~java
interface A {
...
}

class B implements A {
...
}

~~~


# Organização de Pacotes e Visibilidades

## Pacotes
 São uma organização física ou lógica para separar classes com responsabilidades distintas. 

package ...;
import ...;

## Visibilidades ou modificadores de acesso

Determinar ate que ponto uma classe, atributo ou metodo pode ser usada. Algumas boas práticas só podem ser atingidas com o uso correto delas.

* Private: Só dentro da classe;
* Protect: Dentro da classe, mesmo pacote e subclasses;
* Public: Em qualquer lugar