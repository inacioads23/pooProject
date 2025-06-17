# [DIO](www.dio.me) - Trilha Java Básico

## Autores
- [José Inácio](https://github.com/inacioads23)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Proposta do desafio: modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML. Em seguida, implementar as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Diagrama UML (Mermaid)
```mermaid
classDiagram
    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet    
	class Iphone {
        +tocar() void
        +pausar() void
        +ligar(numero: String) void
        +selecionarMusica(musica: String) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(url: String) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }
    class ReprodutorMusical{
      +tocar() void
	  +pausar() void
	  +selecionarMusica(musica: String) void
    }
    class AparelhoTelefonico{
      +ligar(numero: String) void
	  +atender() void
	  +iniciarCorreioVoz() void
    }
    class NavegadorInternet{
      +exibirPagina(url: String) void
      +adicionarNovaAba() void
	  +atualizarPagina() void
    }
```

