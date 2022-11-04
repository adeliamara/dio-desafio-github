# ANATOMIA DA CLASSE


## Sintaxe de declaração de uma nova classe

```public class ClassName {

	//seu codigo aqui

}
```

## Geral

* Todos os arquivos tem a extensão .java no padrão CamelCase

* A classe deve possuir o mesmo nome do arquivo

* Comentários são feitos com //

* Variaveis no padrao camelCase
	``` int ano = 2022;

* Constantes são todas em maiusculo. Separadas por underscore quando necessário.
	``` final String BR = "BRASIL";

* Estrutura de declaração de variaveis

	``` Tipo NomeBemDefinido = Atribuição opcional;

* Declarando metodos 

	TipoRetorno nomeMetodo (tipo nomeparamentro)

## Java Beans
### Organizando pacotes e Convencionando padrões.

edu.curso.segundasemana
com.loja.vendas



# Tipos primitivos em Jaba

*int, byte, short, long, float, double, boolean, char.
	 * representam valores brutos e não sao consideraod objetos.
	 * são armazenados diretamente na pilha de memória
	 * para evita erros é comum usar int para inteiros e double para fracionários.


# Pasta BIN

É nessa pasta que fica os arquivos .class, o nosso bytecode.

#Blocos de execução

Locais: dentro de metodos

Estaticos e instancia: dentro de classe 

