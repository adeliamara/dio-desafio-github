<h1> Cookies </h1>


<p>
O Protocolo do HTTP é stateleSs. O servidor não armazena os adados do cliente. Mas se precisarmos identificar nossos clientes?

Utilizamos Cookies para rastrear os dados do cliente.  São bloco de dados contidos no header filer e utilizados pelo servidor para persistir dados no dispostivo do cliente.

Especifição: RFC 6265
</p>

<br>
🔸  Cookie de sessao -> No momento em que sessão se encerra, os cookies são apagados da memória
🔸  Cookies persistentes -> Podem ser mantidos por até anos. 

Exemplo: manter login ativo (utiliza cookies persistentes), carrinho de e-commerce
<br>


<h2> Cookies e privacidade </h2>

<p>
Os cookies podem ser invasivos. A LGPD exige que o usuário tenha consetimento dos cookies.
</p>

<h1> Cache </h1>

<p> Se comporta como um intermediario entre o client e o http server, é o proxy server. Quando ocorre uma requisição, é verificado se as informações no cache são atualizadas e os dados são coletados ali mesmo. 
</p>

<p>
O proxy se comporta um momento como server e outro como client. Há um redução do tempo de resposta e redução do trafego.
</p> 

Cliente:
Mensagens - Request HTTP (OBJETOS WEB)

ServIdOr:
Nebsafebs - Resoibse GTTO (PROTOCOLO TCP)

stateless: o servidor nao armazena o status do cliente

# HTTP Entity Bode

XML e JSON tem como objeto a serialização de dados.

Armazenamento -> transmissao -> reconstruindo