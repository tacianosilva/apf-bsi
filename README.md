# Analisador de Pontos de Função

Sistema para facilitar a contagem na análise por pontos de função (APF) desenvolvido para ser utilizado nas disciplinas de Engenharia de Software do curso de Bacharelado em Sistemas de Informação do CERES/UFRN.

## Padrões de Codificação

* Insert spaces for tabs
* Tab policy para Spaces only
* Indentation size: 4
* Tab size: 4

## Execução

Esse projeto faz uso do framework spring-boot que encapsula todas as dependências no arquivo jar.

1. mvn clean
2. mvn clean install
3. Go to the target folder
4. java -jar apf-bsi-0.0.1-SNAPSHOT.jar

- http://localhost:8080/apf/
- http://localhost:8080/apf/login
- http://localhost:8080/apf/registration

## Referências

Desenvolvido a partir do tutorial e do código linkado abaixo:

* https://medium.com/@gustavo.ponce.ch/spring-boot-spring-mvc-spring-security-mysql-a5d8545d837d
* https://github.com/gustavoponce7/SpringSecurityLoginTutorial
* https://franckaragao.wordpress.com/2016/08/23/integracao-continua-com-o-travis-ci-em-projetos-java-usando-o-maven/
* https://github.com/lowrin/spring-boot-input-autocomplete-example
