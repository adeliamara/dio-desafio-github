<h1> Principais protocolos de comunicação na internet </h1>

<h2> Protocolo HTTP: HyperText Transfer Protocol </h2>

<p>
Protocolo de comunicação que faz um intermedio entre cliente e servidor.
</p>

<br>
🔸  Browser -> implementa o cliente HTTP
🔸  sERVIDOR -> HOST objetos web
<br>


Arquitetura client servidor: 

Cliente:
Mensagens - Request HTTP (OBJETOS WEB)

ServIdOr:
Nebsafebs - Resoibse GTTO (PROTOCOLO TCP)

stateless: o servidor nao armazena o status do cliente

# HTTP Entity Bode

XML e JSON tem como objeto a serialização de dados.

Armazenamento -> transmissao -> reconstruindo


<h2> Protocolo HTTP 2.0 </h2>

<p> FALHA do 1.1: HOL - Head Of Line: bloqueia o estado do cliente enquanto ele não receber a reposta do request.

Já no 2.0 é possível fazer varias requisições sem o bloqueio do estado. Aqui há uma multiplexação de canais utilizando streams distintos. 
<strong>PRIORIZAÇÃO DE RECURSOS</strong> </p>


<h3> Features:  </h3>
<ul>
  <li>PUSH: Envia tudo relacionado a um get. O client faz um get de "A" e recebe todoso os recursos relacionados a "A". O push deve ser configado do lado do servidor e do cliente/li>
  <li>Única conexão persistente contedo os streamns</li>
  <li>HTTPs por padrão - TLS</li>
  <li>negociação no handsshake: client escolhe se suporta a versão 2.0</li>
</ul>


<h3> Pontos negativos:  </h3>
<ul>
  <li>Uma má configuração de push gera grandes problemas </li>
  <li>Mix 1.1 e 2.0 há lentidão e possíveis problemas com loadbalancer</li>
</ul>

<h2> Serviores HTTP utilizados no mercado </h2>

<ul>
  <li>APACHE: OPEN SOURCE, modular, multiple r equest processing modes e escalavel. suporta versão 2.0, proxy reverso, websocket</li>
  <li>NGINX: webs server, proxy reverso, mail proxy, http cache</li>
  <li>XAMPP: é um pacote que utiliza o apache server. Possui interpetadores de script (interpreta PHP).
  <strong> Utilizados para testes</strong> </li>
</ul>








