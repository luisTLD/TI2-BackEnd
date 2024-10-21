# PlanejaPrato

## Portal de Receitas - TI2

Este é um projeto desenvolvido para o Trabalho Interdisciplinar 2 (TI2), que visa a integração de tecnologias de back-end e banco de dados, com funcionalidades adicionais de IA. O portal permite que os usuários se registrem, façam login, cadastrem receitas e pesquisem por receitas de outros usuários. Além disso, o sistema gera imagens automáticas das receitas cadastradas utilizando inteligência artificial.

## Funcionalidades Principais

- **Cadastro de Usuário e Login**: O usuário pode se cadastrar e realizar login no portal usando e-mail e senha. O sistema é protegido contra ataques de SQL Injection.
  
- **Cadastro de Receitas**: Após o login, o usuário pode cadastrar receitas com a lista de ingredientes e suas respectivas quantidades. O sistema calcula automaticamente o preço total com base nos preços fictícios fornecidos para teste.
  
- **Geração de Imagens com IA**: Ao cadastrar uma receita, uma imagem da receita é gerada automaticamente utilizando IA. A imagem fica salva junto com a receita para visualização futura.
  
- **Visualização de Receitas**: O usuário pode acessar uma lista de suas receitas cadastradas, assim como buscar por receitas de outros usuários no sistema.

- **Integração com Banco de Dados PostgreSQL**: Todos os dados de usuários e receitas são armazenados em um banco de dados PostgreSQL, gerido localmente no pgAdmin.

## Tecnologias Utilizadas

- **Back-end**: Java com Spark para a lógica de servidor e integração com o banco de dados.
- **Banco de Dados**: PostgreSQL, gerido no pgAdmin local (sem uso de Azure).
- **Proteção de Segurança**: Sistema protegido contra ataques de SQL Injection para segurança de dados.
- **Inteligência Artificial**: Utilizada para gerar imagens das receitas ao cadastrá-las.

## Requisitos para Execução

1. Clone o repositório do projeto em sua máquina local.
2. Configure o PostgreSQL e pgAdmin para rodar localmente.
3. Importe o projeto no Eclipse IDE.
4. Verifique as dependências e execute o arquivo `Aplicacao.java` para iniciar o servidor Spark.
5. Abra o navegador e acesse `http://localhost:{porta}`, onde `{porta}` é a porta configurada no servidor Spark, para utilizar a aplicação e realizar login para acessar as funcionalidades.

## Como Executar o Projeto

1. Clone o repositório do projeto em sua máquina local.
2. Configure o PostgreSQL e pgAdmin para rodar localmente.
3. Importe o projeto no Eclipse IDE.
4. Verifique as dependências e execute o servidor Spark.
5. Abra o portal no navegador e realize o login para acessar as funcionalidades.

## Observações

Este projeto foi desenvolvido com o foco em aprendizado e integração das tecnologias estudadas em sala de aula, portanto, algumas funcionalidades utilizam dados fictícios e a geração de imagens via IA é apenas para fins de teste e treinamento.
