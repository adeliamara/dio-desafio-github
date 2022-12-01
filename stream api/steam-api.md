# STREAM API

A Strean API traz uma forma de manipulação de coleções em Java seguindo principios de programação funcional.
pARA ENTENDER ISSO, é necessário compreender os seguintes pontos:

1. Classe Anônima

Classes que nao possuem nomes; É instanciado e declarado em ua unica instrução.
É utilizado para criar classes que serão instanciadas apenas uma vez.


2. Functional Interface

Qualquer interface com um SAM (Single Abstract Method) é uma inferface funcional e sua implementação pode ser tratada como express~]ao lambda.


3.Função lambda
 Função lambda é uma função sem declaração. Semelhante a array funcion em JS.

4. Referente Method
Permite fazer referencia a um unico metodo ou construtor de um codigo, dessa forma indicado que ele deve ser utilizado num ponto especifico do codigo, deixando ele mais simples e legivel.
É uma forma de simplificar uma expressão lamapada
sintaxe:


antes:
~~~
meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));
~~~

depois:

~~~
meusGatos.sort(Comparator.comparing((Gato::getNome));
~~~


