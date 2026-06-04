========================================================================
  RPG-POO - Sistema de RPG em Java
  Projeto de Programacao Orientada a Objetos
========================================================================

DESCRICAO
------------------------------------------------------------------------
Sistema de RPG em modo texto que demonstra os quatro pilares da
Programacao Orientada a Objetos (POO):

  - Abstracao    : classes abstratas Personagem e Arquetipos, e as
                   interfaces CorpoACorpo e LongoAlcance.
  - Heranca      : Guerreiro, Mago, Assassino e Arqueiro herdam de
                   Arquetipos, que herda de Personagem.
  - Encapsulamento: todos os atributos sao privados, acessados por
                   getters e setters.
  - Polimorfismo : metodos como atacar(), defender() e
                   usarHabilidadeEspecial() sao sobrescritos (@Override)
                   em cada classe.

Tambem utiliza composicao (Personagem possui um Inventario; Guilda e
Inventario armazenam arrays de objetos).


ESTRUTURA DO PROJETO
------------------------------------------------------------------------
RPG-POO/
  src/
    Main.java                  -> ponto de entrada (metodo main)
    Personagem.java            -> classe abstrata base
    Arquetipos.java            -> classe abstrata intermediaria
    CorpoACorpo.java           -> interface (ataque corpo a corpo)
    LongoAlcance.java          -> interface (ataque a distancia)
    Guerreiro.java             -> classe concreta
    Mago.java                  -> classe concreta
    Assassino.java             -> classe concreta
    Arqueiro.java              -> classe concreta
    PersonagemNaoJogavel.java  -> NPC
    Guilda.java                -> agrupa personagens
    Inventario.java            -> armazena itens
    Item.java                  -> item do jogo


REQUISITOS
------------------------------------------------------------------------
  - JDK 25 ou superior.

    O arquivo Main.java usa o metodo "main" de instancia simplificado
    (sem declaracao de classe), recurso finalizado no Java 25. Por isso
    e necessario o JDK 25+.

  - Verifique a versao instalada com:
        java -version


COMO EXECUTAR
------------------------------------------------------------------------
Opcao A - Linha de comando (a partir da pasta raiz RPG-POO):

  1) Compilar todas as classes para a pasta "out":

         Windows (PowerShell / CMD):
             javac -d out src\*.java

         Linux / macOS:
             javac -d out src/*.java

  2) Executar a classe principal:

         java -cp out Main


Opcao B - IntelliJ IDEA:

  1) Abra a pasta RPG-POO como projeto.
  2) Configure o SDK do projeto para o JDK 25
     (File > Project Structure > Project SDK).
  3) Abra src/Main.java e clique no botao "Run" (triangulo verde)
     ao lado do metodo main.


SAIDA ESPERADA
------------------------------------------------------------------------
O programa instancia os personagens (Matheus, Bruno, Luis, Rafael e o
NPC Joao), monta uma guilda, manipula inventario e executa acoes de
combate, imprimindo no terminal algo como:

    O item Claymore foi adicionado ao inventario.
    O item Claymore foi usado!
    Joao diz: Ola!
    Rafael entrou na guilda Magos Amarelos.
    Luis entrou na guilda Magos Amarelos.
    Luis saiu da guilda Magos Amarelos.
    Rafael lanca uma magia do elemento Magia de sangue!
    Rafael canaliza todo o seu poder magico em um feitico devastador!
    Bruno se move na direcao do personagem Luis
    Bruno ataca Luis corpo a corpo com sua arma!
    Luis tenta esquivar de 2 de dano usando sua agilidade.
    Bruno desfere um golpe pesado no Rafael com toda a sua forca!
    O nivel do personagem e: 12
    ...


OBSERVACAO SOBRE ACENTOS
------------------------------------------------------------------------
Se os acentos aparecerem incorretos no terminal do Windows, o problema
e apenas a codificacao do console (code page), nao do programa. Para
exibir UTF-8 corretamente no PowerShell/CMD, execute antes:

    chcp 65001

E rode informando a codificacao:

    java -Dfile.encoding=UTF-8 -cp out Main

========================================================================
