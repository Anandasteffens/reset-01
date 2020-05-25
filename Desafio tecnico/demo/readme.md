# Objetivo

No cooperativismo, cada associado possui um voto e as decisões são tomadas em assembleias, por votação. A partir disso, você precisa criar uma solução back-end para gerenciar essas sessões de votação. Essa solução deve ser executada na nuvem e promover as seguintes funcionalidades através de uma API REST:

- Cadastrar uma nova pauta;
- Abrir uma sessão de votação em uma pauta (a sessão de votação deve ficar aberta por um tempo determinado na chamada de abertura ou 1 minuto por default);
- Receber votos dos associados em pautas (os votos são apenas &#39;Sim&#39;/&#39;Não&#39;. Cada associado é identificado por um id único e pode votar apenas uma vez por pauta);
- Contabilizar os votos e dar o resultado da votação na pauta.

# Requisitos

**Linguagens/Tecnologias:**

- JAVA (linguagem principal)
- Spring Boot Web
- Maven
- OpenAPI – Swagger 2.0 (documentação de API)

# Execução

Ao executar a aplicação o projeto rodará no seguinte endereço:

[http://localhost:8080](http://localhost:8080/swagger-ui.html#/)

Para acessar a documentação da API utilizar o seguinte endereço:

[http://localhost:8080/swagger-ui.html#/](http://localhost:8080/swagger-ui.html#/)

# Solução

**Entidades**

- Pauta - Representa cada pauta;
- Associado - Representa os associados;
- Resultado - Representa as sessões de votação abertas para cada pauta;
- Voto - Representa os votos adicionados por cada associado para cada sessão de votação.

# Aplicação

**Cadastro usuário:** O usuário realiza seu cadastro para votação informando seu nome e então é identificado com um ID único.

**Criar uma Pauta:** O usuário cria uma pauta adicionando o assunto da votação, além de informar o tempo de votação, porém este segundo item não é obrigatório.

**Sessão de votação:** A nova sessão de votação é aberta para uma pauta identificada pelo ID que já foi cadastrada anteriormente, pode-se adicionar o tempo limite para que ela fique aberta, caso o tempo não seja informado, o valor de 1 minuto é definido como padrão.

**Encerramento da votação:** A sessão é encerrada automaticamente após transcorrido o tempo previamente definido, é utilizada a data de abertura acrescido do tempo definido que a sessão de votação deve ficar aberta.

**Voto em uma sessão:** O voto em uma sessão de votação pode ser feito com a opção: SIM(&quot;true&quot;) ou NÃO(&quot;false&quot;), juntamente com o ID do Associado e o ID da pauta previamente cadastrado no sistema.