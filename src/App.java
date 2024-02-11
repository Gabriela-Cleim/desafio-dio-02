/*Entendendo o Desafio
 
Agora é a sua hora de brilhar e construir um perfil de destaque na DIO! Explore todos os conceitos explorados até aqui e replique (ou melhore, porque não?) este projeto prático. Para isso, crie seu próprio repositório e aumente ainda mais seu portfólio de projetos no GitHub, o qual pode fazer toda diferença em suas entrevistas técnicas 😎
 
Neste repositório, insira todos os links e arquivos necessários para seu projeto, seja um arquivo de banco de dados ou um link para o template no Figma.
 
Dica: Se o expert forneceu um repositório Github, você pode dar um "fork" no repositório dele para organizar suas alterações e evoluções mantendo uma referência direta ao código-fonte original.
 
Instruções para entrega
 # 2️⃣ Calculadora de partidas Rankeadas
**O Que deve ser utilizado**

- Variáveis - ok
- Operadores
- Laços de repetição
- Estruturas de decisões
- Funções

## Objetivo:

Crie uma função que recebe como parâmetro a quantidade de vitórias e derrotas de um jogador,
depois disso retorne o resultado para uma variável, o saldo de Rankeadas deve ser feito através do calculo (vitórias - derrotas)

Se vitórias for menor do que 10 = Ferro
Se vitórias for entre 11 e 20 = Bronze
Se vitórias for entre 21 e 50 = Prata
Se vitórias for entre 51 e 80 = Ouro
Se vitórias for entre 81 e 90 = Diamante
Se vitórias for entre 91 e 100= Lendário
Se vitórias for maior ou igual a 101 = Imortal

## Saída

Ao final deve se exibir uma mensagem:
"O Herói tem de saldo de **{saldoVitorias}** está no nível de **{nivel}**"
 */


public class App {
    public static void main(String[] args) throws Exception {


        calculatorWinlost(57, 6);
    }


    public static int calculatorWinlost(int win, int lost){
        int result = win - lost;
        
        if(win < 10){
            System.out.println("O Herói tem de saldo de vitorias " + result + " e está no nível Ferro");
        }else if(win > 10 && win <= 20){
            System.out.println("O Herói tem de saldo de vitorias " + result + " e está no nível Bronze");
        }else if(win > 20 && win <= 50){
            System.out.println("O Herói tem de saldo de vitorias " + result + " e está no nível Prata");
        }else if(win > 50 && win <= 80){
            System.out.println("O Herói tem de saldo de vitorias " + result + " e está no nível Ouro");
        }else if(win > 80 && win <= 90){
            System.out.println("O Herói tem de saldo de vitorias " + result + " e está no nível Diamante");
        }else if(win > 90 && win <= 100){
            System.out.println("O Herói tem de saldo de vitorias " + result + " e está no nível Lendário");
        }else if(win >= 101){
            System.out.println("O Herói tem de saldo de vitorias " + result + " e está no nível Imortal");
        }


        return result;
    }
}
