# CHALLENGE  2023 - Projeto UrBuy

![ LOGO DO PROJETO ](documentação/UrBuyLogo.jpeg)

Responsável pelo projeto: Matheus Martins da Rocha - RM96505 Turma: 2TDSPT


# Como rodar a aplicação: 

1. Configurar o Arquivo de Configuração:
   Primeiro, você precisa configurar um arquivo chamado persistence.xml. Este arquivo contém informações importantes, como qual banco de dados usar, onde encontrar suas classes de dados, entre outras configurações. É basicamente como você diz ao Java como se conectar ao banco de dados.

2. Criar sua Classe de Dados:
   Você terá uma classe especial que apresenta os dados que você deseja armazenar no banco de dados. Por exemplo, se você estiver criando um aplicativo de gerenciamento de usuarios, sua classe poderia representar um Usuario , com campos como nome, e-mail, etc.

4. Executar e Testar:
   Depois de configurar tudo, você pode rodar seu programa Java. Ele vai começar a conectar com o banco de dados usando as configurações que você definiu, e você poderá ver as operações de banco de dados acontecendo, como adicionar ou buscar dados.   

# Diagrama de classe:

![ DIAGRAMA DE CLASSE ](documentação/DIAGRAMA%20(2).png)


# MODELO MER:

![ MODELO_DER ](documentação/ModeloMER.png)

 # Breve explicação do modelo: 
Tabela tb_usuario:

Chave Primária: id_usuario
Relacionamento com tb_endereco: 1 usuário para N endereços (via id_usuario na tabela tb_endereco)
Tabela tb_endereco:

Chave Primária: id_endereco
Chave Estrangeira: id_usuario referenciando tb_usuario.id_usuario
Tabela tb_fornecedor:

Chave Primária: id_fornecedor
Tabela tb_produtos:

Chave Primária: id_produto
Chave Estrangeira: id_fornecedor referenciando tb_fornecedor.id_fornecedor
Tabela tb_datadecompra:

Chave Primária: id_compra
Chaves Estrangeiras: id_usuario referenciando tb_usuario.id_usuario, id_produto referenciando tb_produtos.id_produto



