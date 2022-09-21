import java.util.*;

import static java.lang.Math.random;

public class Main {

    // Classe para entrada de dados
    static Scanner in = new Scanner(System.in);

    // Classe para gerar números aleatorios
    static Random random = new Random();

    // Criação da lista de classe de objeto
    static List<OUVINTES> OUVINTES;

    //Cores
    public static final String AZUL = "\u001B[34m";
    public static final String AMARELO = "\u001B[33m";
    public static final String PURPURO = "\u001B[35m";
    public static final String BRANCO = "\u001B[37m";
    public static final String VERDE = "\u001B[32m";
    public static final String PRETO = "\u001B[30m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String RESET_COR = "\u001B[0m";


    //Programa principal

    public static void main(String[] args) throws InterruptedException {

        //Lista de classe de orientação de objeto
        OUVINTES = new ArrayList<>();

        //GEREI ALGUNS OUVINTES APENAS PARA A LISTA DE OBJETOS NÃO INICIAR SEMPRE VAZIA E TER QUE GERAR SEMPRE NOVOS OUVINTES
        OUVINTES.add(new OUVINTES(1, "Joana", 21, "Porto", 0, 0, 0));
        OUVINTES.add(new OUVINTES(2, "Manuel", 47, "Viseu", 0, 0, 0));
        OUVINTES.add(new OUVINTES(3, "Anabela", 53, "Malhadas", 0, 0, 0));
        OUVINTES.add(new OUVINTES(4, "Albertino", 59, "Serra da Estrela", 0, 0, 0));

        //MSG QUE APENAS IRÁ APARECER QUANDO O PROGRAMA INICIAR
        System.out.println();
        System.out.println(AZUL + " --  B E M    V I N D O    A O    J O G O    D O    S A C O  --" + RESET_COR);
        System.out.println();
        // MENU PRINCIPAL QUE PROLONGA O FUNCIONAMENTO PARA AS FUNÇÕES ABAIXO
        menuPrincipal();


    }

    public static void menuPrincipal() throws InterruptedException {

            System.out.println();
            System.out.println(AZUL + "\t- MENU PRINCIPAL -" + RESET_COR);
            System.out.println();
            System.out.println(AMARELO + "[ 1 ]" + RESET_COR + PURPURO + " - JOGAR" + RESET_COR);
            System.out.println(AMARELO + "[ 2 ]" + RESET_COR + PURPURO + " - RANKING DOS OUVINTES" + RESET_COR);
            System.out.println(AMARELO + "[ 3 ]" + RESET_COR + PURPURO + " - VER DADOS DE UM OUVINTE" + RESET_COR);
            System.out.println(AMARELO + "[ 4 ]" + RESET_COR + PURPURO + " - REGISTAR NOVO OUVINTE" + RESET_COR);
            System.out.println(AMARELO + "[ 5 ]" + RESET_COR + PURPURO + " - EDITAR OUVINTE" + RESET_COR);
            System.out.println(AMARELO + "[ 6 ]" + RESET_COR + PURPURO + " - ELIMINAR OUVINTE" + RESET_COR);
            System.out.println(AMARELO + "[ 0 ]" + RESET_COR + PURPURO + " - SAIR DO PROGRAMA" + RESET_COR);
            System.out.println();
            double pesoSaco = 0;


                // PESO DO SACO CRIADO ALEATORIAMENTE DE 1 A 10 KG /////////////////////////////////////////////////////////////////////////////////////

                //Lista de armazenamento de COMPLEMENTO decimal do peso gerado random.
                List<Double> decimalTemp = new ArrayList<Double>();
                decimalTemp.add(0.0);
                decimalTemp.add(0.100);
                decimalTemp.add(0.200);
                decimalTemp.add(0.300);
                decimalTemp.add(0.400);
                decimalTemp.add(0.500);
                decimalTemp.add(0.600);
                decimalTemp.add(0.700);
                decimalTemp.add(0.800);
                decimalTemp.add(0.150);
                decimalTemp.add(0.250);
                decimalTemp.add(0.350);
                decimalTemp.add(0.450);
                decimalTemp.add(0.550);
                decimalTemp.add(0.650);
                decimalTemp.add(0.750);
                decimalTemp.add(0.850);

                //Escolha de um valor random de 1 a 9
                int pesoSacoInicial = random.nextInt(1, 9);
                double pesoSacoDecimal = decimalTemp.get(random.nextInt(decimalTemp.size()));
                double QualPesoSaco = pesoSacoInicial + pesoSacoDecimal;

                //             P E S O    D O    S A C O     F I N A L            //
                pesoSaco = random.nextDouble(pesoSacoInicial + pesoSacoDecimal, pesoSacoInicial + pesoSacoDecimal + 0.150);



//////////////////////////////////////////////////////  P A R A    O    P R O F E S S O R   //////////////////////////////////////////


                //CASO PRETENDER VIZUALIZAR O PESO DO SACO LOGO ABAIXO DO MENU PRINCIPAL PARA TESTAR O PROGRAMA, BASTA RETIRAR OS " /* " E " */ "



                /*                              //apresentação de OUTPUT das casas deciamis - "0.000" dos limites do PESO do saco

                System.out.printf("%.3f", QualPesoSaco);
                System.out.print("g  ---->  ");
                System.out.printf("%.3f", QualPesoSaco + 0.150);
                System.out.print("g");
                System.out.println();

                                                   //      Output gerado aleatoriamente do peso SACO FINAL      //

                System.out.printf("%.3f", pesoSaco);
                System.out.print("g");
                System.out.println();


                 NOTA: PARA VISUALIZAR A LISTA DOS OUVINTES EXISTENTES, BASTA IR AO "RANKING"

                 */

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                // Funcionamento do menu

                int opcao;

                //Tratamento de erros e excepções do input de escolha de opção menu
                while (true) {
                    try {
                        System.out.println(PRETO + "Sua opção: " + RESET_COR);
                        opcao = in.nextInt();
                        if (opcao > -1 && opcao < 7) {
                            break;
                        } else {
                            System.out.print("\u001B[31mERRO! Por favor, selecione a opção correta.\u001B[0m");
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31mERRO! Opção inválida, tente novamente.\u001B[0m");
                        in.nextLine();
                    }
                }

                if (opcao == 0) {
                    System.out.println();
                    Thread.sleep(250);
                    System.out.print(AZUL + "A encerrar");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.println();
                    System.out.println("Obrigado, volte sempre! :)" + RESET_COR);
                    System.exit(0);

                } else if (opcao == 1) {
                    jogar(QualPesoSaco, pesoSaco );
                    menuPrincipal();

                } else if (opcao == 2) {
                    ranking();
                    menuPrincipal();

                } else if (opcao == 3) {
                    // PROCURAR OUVINTE PELO NOME E EMITIR DADOS SOBRE O MESMO //
                    dadosOuvinte();
                    menuPrincipal();

                } else if (opcao == 4) {
                   registarOuvinte();
                   menuPrincipal();
                } else if (opcao == 5) {
                    editarOuvinte();

                } else if (opcao == 6){
                    eliminarOuvinte();
                }

    }

        //}


    public static void linha() {
        // Para exister a separação
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
    }

    public static void dadosOuvinte() throws InterruptedException {

        ////////////////////////////////////////////// PROCURAR OUVINTE PELO NOME E EMITIR DADOS SOBRE O MESMO ////////////////////////////////////

        if (OUVINTES.size() == 0) {
            System.out.println();
            System.out.println(VERMELHO + "NÃO existem ouvintes REGISTADOS, por favor efetue o registo de novos ouvintes!" + RESET_COR);
            System.out.println();
            Thread.sleep(250);
            System.out.print(BRANCO + "A regressar ao Menu Principal");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("." + RESET_COR);
            System.out.println();
            Thread.sleep(500);
            menuPrincipal();
        }

        while (true) {
            System.out.println(PURPURO + "Insira o NOME de ouvinte, de qual pretende vizualizar os dados: " + RESET_COR);
            String procura = in.next().strip();

            //Excepção/tratamento (input procurar nome) de forma a que a primeira letra seja sempre toUpperCase() e o resto toLowerCase()
            procura = procura.substring(0, 1).toUpperCase() + procura.substring(1).toLowerCase();

            //O nome é procurado dentro da cada lista e assim que encontrar sai, ou se não encontrar prossegue
            for (int p = 0; p < OUVINTES.size(); p++) {
                if (procura.contains(OUVINTES.get(p).getNome())) {
                    linha();
                    System.out.println(AMARELO + "Nome: " + OUVINTES.get(p).getNome());
                    System.out.println("Idade: " + OUVINTES.get(p).getIdade());
                    System.out.println("Localidade: " + OUVINTES.get(p).getLocalidade() + RESET_COR);
                    linha();
                    break;
                }
            }

            //Se o nome procurado pelo utilizador não for encontrado, é emitida a msg a informar que o ouvinte não existe na lista.
            int contagem = 0;
            for (int p = 0; p < OUVINTES.size(); p++) {
                if (!procura.contains(OUVINTES.get(p).getNome())){
                    contagem ++;
                }
            }
            if (contagem >= OUVINTES.size()){
                System.out.println(VERMELHO + "Infelizmente, ouvinte '" + procura + "', não foi encontrado." + RESET_COR);
                Thread.sleep(1000);
                System.out.println();
            }

            //Voltar a procurar ou não.
            System.out.println(PURPURO + "Pretende voltar a procurar um ouvinte? [S/N]" + RESET_COR);
            while (true) {
                System.out.println(PRETO + "Sua escolha:" + RESET_COR);
                String escolha = in.next().strip().toUpperCase();
                if (escolha.equals("S")) {
                    System.out.println();
                    dadosOuvinte();
                } else if (escolha.equals("N")) {
                    in.nextLine();
                    menuPrincipal();
                } else {
                    System.out.println(VERMELHO + "ERRO! Por favor, escolha entre 'S'(Sim) e 'N'(Não)" + RESET_COR);

                }
                in.nextLine();
            }

        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void ranking() throws InterruptedException {

        //O JOGADORES COM MAIS PONTOS DE JOGOS GANHOS IRÃO SEMPRE SER APRESENTADOS NO TOPO

    if (OUVINTES.size() == 0) {
        System.out.println();
        System.out.println(VERMELHO + "NÃO existem ouvintes REGISTADOS, por favor efetue o registo de novos ouvintes!" + RESET_COR);
        System.out.println();
        Thread.sleep(250);
        System.out.print(BRANCO + "A regressar ao Menu Principal");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print("." + RESET_COR);
        System.out.println();
        Thread.sleep(500);
        menuPrincipal();
    }


    //Comparaçao dos pontos de jogos ganhos e apresntação do MAIOR ao MENOR
    Collections.sort(OUVINTES, new Comparator<OUVINTES>() {
        @Override
        public int compare(OUVINTES p1, OUVINTES p2) {
            return p2.getNumVezesJogosGanhos() - p1.getNumVezesJogosGanhos();
        }
    });

    //Apresentação do resultado
    linha();
    System.out.println(VERDE+"\t\t\t\t\t - RANKING OUVINTES - "+RESET_COR);
    System.out.println();
    for (int i = 0; i < OUVINTES.size(); i++) {
        System.out.println(OUVINTES.get(i));
        linha();
        Thread.sleep(500);
        reconfigurarPosiçao();
    }
    Thread.sleep(250);
    System.out.print(BRANCO+"A regressar ao Menu Principal");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.print("."+RESET_COR);
    System.out.println();
    Thread.sleep(500);

}


public static void jogar(double QualPesoSaco, double pesoSaco) throws InterruptedException {

    /////////////////////////////////////////////////////////////// J O G A R //////////////////////////////////////////////////////////////
    linha();

    // Caso a lista esteja vazia ou existir apenas 1 ouvinte

    if (OUVINTES.size() == 0) {
        System.out.println();
        System.out.println(VERMELHO+"NÃO existem ouvintes REGISTADOS, por favor efetue o registo de novos ouvintes!"+RESET_COR);
        System.out.println();
        Thread.sleep(250);
        System.out.print(BRANCO+"A regressar ao Menu Principal");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print("."+RESET_COR);
        System.out.println();
        Thread.sleep(500);
        menuPrincipal();
    }else if (OUVINTES.size() == 1) {
        System.out.println();
        System.out.println(VERMELHO+"Necessita de existir mais do que apenas um ouvinte para jogar!"+RESET_COR);
        System.out.println();
        Thread.sleep(250);
        System.out.print(BRANCO+"A regressar ao Menu Principal");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print("."+RESET_COR);
        System.out.println();
        Thread.sleep(500);
        menuPrincipal();
    }

    System.out.println(AZUL+" QUAL O PESO DO SACO? "+RESET_COR);
    System.out.println();
    //Limite do PESO do saco, apresentação de OUTPUT das casas deciamis - "0.000g"
    System.out.printf(AMARELO+"%.3f", QualPesoSaco);
    System.out.print("g  ---->  ");
    System.out.printf("%.3f", QualPesoSaco + 0.150);
    System.out.print("g"+RESET_COR);
    System.out.println();
    System.out.println();




    //Lista temporária para guardar ID dos ouvintes, para não existir repetições na seleção.
    List<Integer> proibirRepetirOuvintes = new ArrayList<Integer>();

    //Variavel para gerar o número aleatorio dos ouvintes que irão ao jogo.
    int tamanhoListaOuvintes = random.nextInt(2, OUVINTES.size() + 1);

    // Ou se pretender que todos joguem, basta descomentar a linha abaixo
    //tamanhoListaOuvintes = OUVINTES.size();

    //Loop principal para seleção aleatoria dos ouvintes
    for (int i = 0; i < tamanhoListaOuvintes; i++) {

        int id = Integer.parseInt(String.valueOf(OUVINTES.get(random.nextInt(OUVINTES.size())).getId()));

        if (proibirRepetirOuvintes.contains(id)) {
            tamanhoListaOuvintes++;



        } else {
            proibirRepetirOuvintes.add(id);
            System.out.println(AZUL+OUVINTES.get(id - 1).getNome()+RESET_COR);

            // Tratamento de erros e excepções //
            while (true) {
                double palpite = 0;
                try {
                    System.out.println(PRETO+"Seu palpite: "+RESET_COR);
                    palpite = in.nextDouble();
                    if (palpite < QualPesoSaco || palpite > QualPesoSaco + 0.150) {
                        System.out.print("\u001B[31mERRO! Por favor, insira um valor dentro dos limites(");
                        System.out.printf("%.3f", QualPesoSaco);
                        System.out.print("g a ");
                        System.out.printf("%.3f", QualPesoSaco + 0.150);
                        System.out.print("g).\u001B[0m");
                        System.out.println();
                    } else {
                        System.out.print("\u001B[32mValor ");
                        System.out.printf("%.3f", palpite);
                        System.out.print("g, registado com sucesso!\u001B[0m");
                        System.out.println();

                        // Adiciona o palpite para a lista do OUVINTE como "ultimo palpite jogado"
                        OUVINTES.get(id - 1).setUltimoPalpite(palpite);

                        // Adiciona 1 ponto a lista de numero de vezes de jogos jogados
                        OUVINTES.get(id - 1).setNumJogos(OUVINTES.get(id - 1).getNumJogos() + 1);
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("\u001B[31mERRO! Por favor, insira um valor válido.\u001B[0m");
                    in.nextLine();
                }
            }
        }
    }
    //////////////// Forma de encontrar qual dos ouvintes esteve mais perto do peso do saco /////////////////////////////////////////////////

    Map<Double, OUVINTES> map = new HashMap();

    for (int j = 0; j < OUVINTES.size(); j++) {
        map.put(Math.abs(OUVINTES.get(j).getUltimoPalpite() - pesoSaco), OUVINTES.get(j));

    }

    List<Integer> keys = new ArrayList(map.keySet());
    Collections.sort(keys);


    //System.out.println(map.get(keys.get(0)));         //Apenas para referencia (apagar, não importante)


    //Com este laço encontro o ouvinte vencedor e adiciono-lhe 1 ponto a variavel de "vezes que ganhou os jogos"
    for (int k = 0; k < OUVINTES.size(); k++) {
        if (map.get(keys.get(0)).getId() == (OUVINTES.get(k).getId())) {
            OUVINTES.get(k).setNumVezesJogosGanhos(OUVINTES.get(k).getNumVezesJogosGanhos() + 1);

            //Output do ouvinte VENCEDOR e o PESO DO SACO
            linha();
            System.out.print(AZUL + "\t\t\t\tO PESO DO SACO É ");
            Thread.sleep(500);
            System.out.print(" -");
            Thread.sleep(500);
            System.out.print("-");
            Thread.sleep(500);
            System.out.print(">  ");
            //Thread.sleep(500);
            System.out.printf("%.3f", pesoSaco);
            System.out.print("g" + RESET_COR);
            Thread.sleep(500);
            System.out.println();
            System.out.println();
            System.out.println(VERDE + "\t\t\t\t\t! ! !  VENCEDOR  ! ! !" + RESET_COR);
            System.out.println();
            System.out.println("\t\t\t\t\t\u001B[36m ----> " + OUVINTES.get(k).getNome() + " <----\u001B[0m");
            System.out.println();
            System.out.print(BRANCO+"\t\t\t\t\t(Peso jogado: ");
            System.out.printf("%.3f", OUVINTES.get(k).getUltimoPalpite());
            System.out.print("g)"+RESET_COR);
            System.out.println();
            System.out.println();
            System.out.println(AMARELO + "\t\tGanhou o prémio no valor de XXXXX € !!!" + RESET_COR);
            System.out.println();
            linha();

            /*for (int r = 0; r < OUVINTES.size(); r++) {
                OUVINTES.get(r).setUltimoPalpite(0);
            }*/

            Thread.sleep(1000);


        }

    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void registarOuvinte() throws InterruptedException {

        System.out.println(AZUL + "  - REGISTO DE OUVINTE - " + RESET_COR);
        System.out.println();
        // NOME /////////////////////////////////////////////////////////
        System.out.println(PURPURO + "Insira NOME de ouvinte:" + RESET_COR);
        String novoNome = in.next().strip();

        //Excepção/tratamento (input inserir nome) de forma a que a primeira letra seja sempre toUpperCase() e o resto toLowerCase()
        //NOTA: Apenas é feito para o primeiro nome.
        novoNome = novoNome.substring(0, 1).toUpperCase() + novoNome.substring(1).toLowerCase();
        linha();

        // IDADE /////////////////////////////////////////////////////////

        //Tratamento de erros e exceopções do input de escolha de opção menu
        int idade;
        while (true) {
            try {
                System.out.println(PURPURO + "Insira IDADE de ouvinte:" + RESET_COR);
                System.out.println(BRANCO + "NOTA: Idade mínima para realizar o registo é de 18 ANOS." + RESET_COR);
                idade = in.nextInt();
                if (idade > 17 && idade < 111) {
                    linha();
                    break;
                } else {
                    System.out.println("\u001B[31mERRO! Por favor, digite um valor correto.");
                }
            } catch (Exception e) {
                System.out.println("\u001B[31mERRO! Por favor, digite um valor válido.\u001B[0m");
                in.nextLine();
            }
        }
        // LOCALIDADE /////////////////////////////////////////////////////////
        System.out.println(PURPURO + "Insira LOCALIDADE de ouvinte:" + RESET_COR);
        String localidade = in.next().strip();

        //Excepção/tratamento (input inserir nome) de forma a que a primeira letra seja sempre toUpperCase() e o resto toLowerCase()
        //NOTA: Apenas é feito para o primeiro nome.
        localidade = localidade.substring(0, 1).toUpperCase() + localidade.substring(1).toLowerCase();
        linha();

        OUVINTES.add(new OUVINTES(OUVINTES.size() + 1, novoNome, idade, localidade, 0, 0, 0));

        System.out.println(VERDE + "Nov@ OUVINTE, " + novoNome + ", registad@ com SUCESSO!" + RESET_COR);
        Thread.sleep(1000);
        in.nextLine();
        menuPrincipal();
    }

    public static void editarOuvinte() throws InterruptedException {

        ////////////////////////////////////////////// PROCURAR OUVINTE PELO NOME E EMITIR/EDITAR DADOS SOBRE O MESMO ////////////////////////////////////



        if (OUVINTES.size() == 0) {
            System.out.println();
            System.out.println(VERMELHO+"NÃO existem ouvintes REGISTADOS, por favor efetue o registo de novos ouvintes!"+RESET_COR);
            System.out.println();
            Thread.sleep(250);
            System.out.print(BRANCO+"A regressar ao Menu Principal");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("."+RESET_COR);
            System.out.println();
            Thread.sleep(500);
            menuPrincipal();

        }

        while (true) {

            System.out.println(PURPURO + "Insira o NOME de ouvinte, de qual pretende editar os dados: " + RESET_COR);
            String procura = in.next().strip();

            //Excepção/tratamento (input procurar nome) de forma a que a primeira letra seja sempre toUpperCase() e o resto toLowerCase()
            procura = procura.substring(0, 1).toUpperCase() + procura.substring(1).toLowerCase();

            int idTemp = 0;
            //O nome é procurado dentro da cada lista e assim que encontrar sai, ou se não encontrar prossegue
            for (int p = 0; p < OUVINTES.size(); p++) {
                if (procura.contains(OUVINTES.get(p).getNome())) {
                    linha();
                    System.out.println(AMARELO + "Nome: " + OUVINTES.get(p).getNome());
                    System.out.println("Idade: " + OUVINTES.get(p).getIdade());
                    System.out.println("Localidade: " + OUVINTES.get(p).getLocalidade() + RESET_COR);
                    idTemp = OUVINTES.get(p).getId();
                    linha();
                    break;
                }
            }

            //Se o nome procurado pelo utilizador não for encontrado, é emitida a msg a informar que o ouvinte não existe na lista.
            int contagem = 0;
            for (int p = 0; p < OUVINTES.size(); p++) {
                if (!procura.contains(OUVINTES.get(p).getNome())){
                    contagem ++;
                }
            }
            if (contagem == OUVINTES.size()) {
                System.out.println(VERMELHO + "Infelizmente, ouvinte '" + procura + "', não foi encontrado." + RESET_COR);
                Thread.sleep(1000);
                System.out.println();
                //Voltar a procurar ou não.

                System.out.println(PURPURO + "Pretende pesquisar novamente para ELIMINAR algum ouvinte? [S/N]" + RESET_COR);
                while (true) {
                    System.out.println(PRETO + "Sua escolha:" + RESET_COR);
                    String escolha2 = in.next().strip().toUpperCase();
                    if (escolha2.equals("S")) {
                        System.out.println();
                        eliminarOuvinte();
                    } else if (escolha2.equals("N")) {
                        in.nextLine();
                        menuPrincipal();
                    } else {
                        System.out.println(VERMELHO + "ERRO! Por favor, escolha entre 'S'(Sim) e 'N'(Não)" + RESET_COR);

                    }
                    in.nextLine();
                }
            }
                System.out.println();
                //in.nextLine();
                //editarOuvinte();




            //////////////////////////////////////////////////////////// MENU EDITAR ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println(AZUL + "\t- MENU EDITAR -" + RESET_COR);
            System.out.println();
            System.out.println(AMARELO + "[ 1 ]" + RESET_COR + PURPURO + " - EDITAR NOME" + RESET_COR);
            System.out.println(AMARELO + "[ 2 ]" + RESET_COR + PURPURO + " - EDITAR IDADE" + RESET_COR);
            System.out.println(AMARELO + "[ 3 ]" + RESET_COR + PURPURO + " - EDITAR LOCALIDADE" + RESET_COR);
            System.out.println(AMARELO + "[ 0 ]" + RESET_COR + PURPURO + " - VOLTAR AO MENU PRINCIPAL" + RESET_COR);
            System.out.println();

            int opcao = 0;
            while (true) {
                try {
                    System.out.println(PRETO + "Sua opção: "+RESET_COR);
                    opcao = in.nextInt();
                    if (opcao > -1 && opcao < 4){
                        break;
                    } else {
                        System.out.println(VERMELHO + "ERRO! Por favor, selecione a opção correta." + RESET_COR);
                    }
                } catch (Exception e){
                    System.out.println(VERMELHO + "ERRO! Opção inválida, por favor tente novamente." + RESET_COR);
                    in.nextLine();
                }
            }

            if (opcao == 0) {
                menuPrincipal();
            } else if (opcao == 1) {
                System.out.println();
                System.out.println(AMARELO+"Digite um NOME novo: "+RESET_COR);
                String EditarNome = in.next().strip();
                EditarNome = EditarNome.substring(0, 1).toUpperCase() + EditarNome.substring(1).toLowerCase();
                OUVINTES.get(idTemp - 1).setNome(EditarNome);
                System.out.println(VERDE+"Ouvinte editad@ com SUCESSO!"+RESET_COR);
                in.nextLine();
            }
            else if (opcao == 2) {

                int EditarIdade;
                while (true) {
                    try {
                        System.out.println();
                        System.out.println(AMARELO+"Digite uma nova IDADE: " + RESET_COR);
                        System.out.println(BRANCO + "NOTA: Idade mínima é de 18 ANOS." + RESET_COR);
                        EditarIdade = in.nextInt();
                        if (EditarIdade > 17 && EditarIdade < 111) {
                            linha();
                            break;
                        } else {
                            System.out.println("\u001B[31mERRO! Por favor, digite um valor correto.");
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31mERRO! Por favor, digite um valor válido.\u001B[0m");
                        in.nextLine();
                    }
                    in.nextLine();
                }
                OUVINTES.get(idTemp - 1).setIdade(EditarIdade);
                System.out.println(VERDE + "Ouvinte editad@ com SUCESSO!" + RESET_COR);
                System.out.println();
            }else if (opcao == 3) {
                System.out.println();
                System.out.println(AMARELO+"Digite uma nova LOCALIDADE: "+RESET_COR);
                String EditarLocalidade = in.next().strip();
                EditarLocalidade = EditarLocalidade.substring(0, 1).toUpperCase() + EditarLocalidade.substring(1).toLowerCase();
                OUVINTES.get(idTemp - 1).setLocalidade(EditarLocalidade);
                System.out.println(VERDE+"Ouvinte editad@ com SUCESSO!"+RESET_COR);
                System.out.println();
                in.nextLine();
            }


            //Voltar a procurar ou não.
            System.out.println(PURPURO + "Pretende voltar a editar dados de ouvinte? [S/N]" + RESET_COR);
            while (true) {
                System.out.println(PRETO + "Sua escolha:" + RESET_COR);
                String escolha = in.next().strip().toUpperCase();
                if (escolha.equals("S")) {
                    System.out.println();
                    editarOuvinte();
                } else if (escolha.equals("N")) {
                    in.nextLine();
                    menuPrincipal();
                } else {
                    System.out.println(VERMELHO + "ERRO! Por favor, escolha entre 'S'(Sim) e 'N'(Não)" + RESET_COR);

                }
                in.nextLine();
            }

        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    private static void eliminarOuvinte() throws InterruptedException {

        ////////////////////////////////////////////// PROCURAR OUVINTE PELO NOME E EMITIR/EDITAR DADOS SOBRE O MESMO ////////////////////////////////////


        if (OUVINTES.size() == 0) {
            System.out.println();
            System.out.println(VERMELHO + "NÃO existem ouvintes REGISTADOS, por favor efetue o registo de novos ouvintes!" + RESET_COR);
            System.out.println();
            Thread.sleep(250);
            System.out.print(BRANCO + "A regressar ao Menu Principal");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("." + RESET_COR);
            System.out.println();
            Thread.sleep(500);
            menuPrincipal();
        }


        while (true) {
            System.out.println(PURPURO + "Insira o NOME de ouvinte, qual pretende ELIMINAR: " + RESET_COR);
            String procura = in.next().strip();

            //Excepção/tratamento (input procurar nome) de forma a que a primeira letra seja sempre toUpperCase() e o resto toLowerCase()
            procura = procura.substring(0, 1).toUpperCase() + procura.substring(1).toLowerCase();

            int idTemp = 0;
            //O nome é procurado dentro da cada lista e assim que encontrar sai, ou se não encontrar prossegue
            for (int p = 0; p < OUVINTES.size(); p++) {
                if (procura.contains(OUVINTES.get(p).getNome())) {
                    linha();
                    System.out.println(AMARELO + "Nome: " + OUVINTES.get(p).getNome());
                    System.out.println("Idade: " + OUVINTES.get(p).getIdade());
                    System.out.println("Localidade: " + OUVINTES.get(p).getLocalidade() + RESET_COR);
                    idTemp = OUVINTES.get(p).getId();
                    linha();
                    break;
                }
            }

            //Se o nome procurado pelo utilizador não for encontrado, é emitida a msg a informar que o ouvinte não existe na lista.
            int contagem = 0;
            for (int p = 0; p < OUVINTES.size(); p++) {
                if (!procura.contains(OUVINTES.get(p).getNome())){
                    contagem ++;
                }
            }
            if (contagem == OUVINTES.size()) {
                System.out.println(VERMELHO + "Infelizmente, ouvinte '" + procura + "', não foi encontrado." + RESET_COR);
                Thread.sleep(1000);
                System.out.println();

                //Voltar a procurar ou não.

                System.out.println(PURPURO + "Pretende pesquisar novamente para ELIMINAR algum ouvinte? [S/N]" + RESET_COR);
                while (true) {
                    System.out.println(PRETO + "Sua escolha:" + RESET_COR);
                    String escolha2 = in.next().strip().toUpperCase();
                    if (escolha2.equals("S")) {
                        System.out.println();
                        eliminarOuvinte();
                    } else if (escolha2.equals("N")) {
                        in.nextLine();
                        menuPrincipal();
                    } else {
                        System.out.println(VERMELHO + "ERRO! Por favor, escolha entre 'S'(Sim) e 'N'(Não)" + RESET_COR);

                    }
                    in.nextLine();
                }
            }

                System.out.println();
                //in.nextLine();





            //////////////////////////////////////////////////////////// MENU ELIMINAR ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println(AZUL + "\t- MENU ELIMINAR -" + RESET_COR);
            System.out.println();
            System.out.println(AMARELO + "[ 1 ]" + RESET_COR + PURPURO + " - ELIMINAR PERMANENTEMENTE OUVINTE, "+ OUVINTES.get(idTemp-1).getNome().toUpperCase() + RESET_COR);
            System.out.println(AMARELO + "[ 0 ]" + RESET_COR + PURPURO + " - VOLTAR AO MENU PRINCIPAL" + RESET_COR);
            System.out.println();

            int opcao = 0;
            while (true) {
                try {
                    System.out.println(PRETO + "Sua opção: "+RESET_COR);
                    opcao = in.nextInt();
                    if (opcao > -1 && opcao < 2){
                        break;
                    } else {
                        System.out.println(VERMELHO + "ERRO! Por favor, selecione a opção correta." + RESET_COR);
                    }
                } catch (Exception e){
                    System.out.println(VERMELHO + "ERRO! Opção inválida, por favor tente novamente." + RESET_COR);
                    in.nextLine();
                }
            }

            if (opcao == 0) {
                menuPrincipal();
            } else if (opcao == 1) {
                String nomeOuvinteRemovido = OUVINTES.get(idTemp-1).getNome();
                OUVINTES.remove(idTemp-1);
                System.out.println();
                System.out.println(VERDE+"Ouvinte,"+nomeOuvinteRemovido+", ELIMINAD@ com SUCESSO!"+RESET_COR);
                reconfigurarPosiçao();
                System.out.println();
                Thread.sleep(1000);
                in.nextLine();
            }



            //Voltar a procurar ou não.
            System.out.println(PURPURO + "Pretende voltar a ELIMINAR algum ouvinte? [S/N]" + RESET_COR);
            while (true) {
                System.out.println(PRETO + "Sua escolha:" + RESET_COR);
                String escolha = in.next().strip().toUpperCase();
                if (escolha.equals("S")) {
                    System.out.println();
                    eliminarOuvinte();
                } else if (escolha.equals("N")) {
                    in.nextLine();
                    menuPrincipal();
                } else {
                    System.out.println(VERMELHO + "ERRO! Por favor, escolha entre 'S'(Sim) e 'N'(Não)" + RESET_COR);

                }
                in.nextLine();
            }

        }
    }

    public static void reconfigurarPosiçao(){

        // ESTA FUNÇÃO SERVE PARA COLOCAR OS ID'S POR ORDEM (APENAS PRESENTA NA FUNÇAO DE "ELIMINAR OUVINTE" E DE "RANKING")

        for (int i = 0; i < OUVINTES.size(); i++){
            OUVINTES.get(i).setId(i+1);

        }
    }
}
