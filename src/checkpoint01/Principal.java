package checkpoint01;

import java.util.Scanner;

public class Principal {
    // Função para criar Gerentes
    public static Funcionarios criarGerente(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Insira o sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Insira o cpf: ");
        String cpf = entrada.nextLine();

        return new Gerente(nome, sobrenome, cpf);
    }
    // Função para criar Promotores
    public static Funcionarios criarPromotores(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Insira o sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Insira o cpf: ");
        String cpf = entrada.nextLine();
        System.out.println("Insira o estado: ");
        String estado = entrada.nextLine();
        System.out.println("Insira a quantidade de setores: ");
        int quantidadeSetores = entrada.nextInt();
        System.out.println("Insira a quantidade de vendedoras: ");
        int qtdVendedoras = entrada.nextInt();

        return new PromotorVendas(nome, sobrenome, cpf, estado, quantidadeSetores, qtdVendedoras);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando o objeto empresa na classe Empresa
        Empresa mordor = new Empresa("Mordor tecidos", "32141241412");
        System.out.println("Bem vindo ao sistema da Empresa " + mordor.getNome() );
        mordor.produzirMercadorias();

        // Trabalhando os dados e métodos da classe Gerente

        System.out.println("Cadastre os Gerentes: ");
        // Esse bloco de código eu gostaria de fazer de uma maneira mais dinâmica
        // Mas, não entendi ainda como implementar isso em Java
        Funcionarios gerenteI = criarGerente();
        System.out.println("Próximo");
        Funcionarios gerenteII = criarGerente();

        System.out.println("Digite o valor de estoque do Gerente: ");
        int quantoMercadoria = input.nextInt();
        ((Gerente) gerenteI).estoqueMercadoria(quantoMercadoria);
        System.out.println("Próximo: ");
        quantoMercadoria = input.nextInt();
        ((Gerente) gerenteII).estoqueMercadoria(quantoMercadoria);

        System.out.println("Digite quanto de Mercadoria os gerentes vão distribuir: ");
        int distribuir = input.nextInt();
        ((Gerente) gerenteI).distribuirMercadoria(distribuir);

        System.out.println("Próximo: ");
        distribuir = input.nextInt();
        ((Gerente) gerenteII).distribuirMercadoria(distribuir);

        // Trabalhando os dados e métodos da classe PromotorVendas
        System.out.println("Cadastre os Promotores: ");
        // Esse bloco de código eu gostaria de fazer de uma maneira mais dinâmica
        // Mas, não entendi ainda como implementar isso em Java
        Funcionarios promotorI = criarPromotores();
        System.out.println("Próximo");
        Funcionarios promotorII = criarPromotores();
        System.out.println("Próximo");
        Funcionarios promotorIII = criarPromotores();

        System.out.println("Digite quanto de mercadoria cada promotor irá receber: ");
        int qtdMercadoria = input.nextInt();
        ((PromotorVendas) promotorI).estoqueMercadoria(qtdMercadoria);

        System.out.println("Próximo: ");
        qtdMercadoria = input.nextInt();
        ((PromotorVendas) promotorII).estoqueMercadoria(qtdMercadoria);

        System.out.println("Próximo: ");
        qtdMercadoria = input.nextInt();
        ((PromotorVendas) promotorIII).estoqueMercadoria(qtdMercadoria);

        // Cadastrando na ArrayList de funcinários da Empresa

        mordor.addFuncionarios(gerenteI);
        mordor.addFuncionarios(gerenteII);
        mordor.addFuncionarios(promotorI);
        mordor.addFuncionarios(promotorII);
        mordor.addFuncionarios(promotorIII);

        // Cadastrando os Promotores de cada Gerente

        ((Gerente) gerenteI).adicionarPromotor((PromotorVendas) promotorI);
        ((Gerente) gerenteII).adicionarPromotor((PromotorVendas) promotorII);
        ((Gerente) gerenteI).adicionarPromotor((PromotorVendas) promotorIII);
    }
}
