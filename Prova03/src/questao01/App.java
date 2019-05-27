/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01;

import java.util.Scanner;

/**
 *
 * @author art
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tMatrix");
        Matriz m1 = Matriz.getinstance();
        System.out.print("Endereço : ");
        m1.setEndereco(sc.nextLine());
        System.out.print("Quimico : ");
        m1.setQuimico_responsavel(sc.nextLine());

        System.out.println("\t\tFabrica 01");
        Fabrica f1 = Fabrica.getinstance();
        System.out.print("Endereço : ");

        f1.setEndereco(sc.nextLine());
        System.out.print("N de Operarios : ");
        f1.setNumero_de_operarios(Integer.parseInt(sc.nextLine()));

        System.out.println("\t\tFabrica 02");
        Fabrica f2 = Fabrica.getinstance();
        System.out.print("Endereço : ");
        f2.setEndereco(sc.nextLine());
        System.out.print("N de Operarios : ");
        f2.setNumero_de_operarios(Integer.parseInt(sc.nextLine()));

        System.out.println("\t\tLoja 01");
        Loja l1 = Loja.getinstance();
        System.out.print("Endereço : ");
        l1.setEndereco(sc.nextLine());
        System.out.print("N de Vendedores : ");
        l1.setNumero_de_vendedores(Integer.parseInt(sc.nextLine()));

        System.out.println("\t\tLoja 02");
        Loja l2 = Loja.getinstance();
        System.out.print("Endereço : ");
        l2.setEndereco(sc.nextLine());
        System.out.print("N de Vendedores : ");
        l2.setNumero_de_vendedores(Integer.parseInt(sc.nextLine()));

        System.out.println("\t\tLoja 03");
        Loja l3 = Loja.getinstance();
        System.out.print("Endereço : ");
        l3.setEndereco(sc.nextLine());
        System.out.print("N de Vendedores : ");
        l3.setNumero_de_vendedores(Integer.parseInt(sc.nextLine()));
        
        
//         public Perfume(String nome, float preco, String linha, float valor_fabrica, float valor_matriz, float valor_loja) {

        System.out.println("\t\tPerfume 01");
        System.out.print("Digite o nome : ");
        String nome = sc.nextLine();
        System.out.print("Digite a linha : ");
        String linha = sc.nextLine();
        System.out.print("Digite o preco : ");
        float preco = Float.parseFloat(sc.nextLine());
                
        Perfume p1 = f1.fazerPerfume(nome, preco, linha);
        

        
        System.out.println("\t\tPerfume 02");
        System.out.print("Digite o nome : ");
        nome = sc.nextLine();
        System.out.print("Digite a linha : ");
        linha = sc.nextLine();
        System.out.print("Digite o preco : ");
        preco = Float.parseFloat(sc.nextLine());
                

        Perfume p2 = f2.fazerPerfume(nome, preco, linha);
        
        PerfumeSubject perfume = new PerfumeSubject();
        
        perfume.attach(new FabricaObserver(perfume));
        perfume.attach(new MatrizObserver(perfume));
        perfume.attach(new LojaObserver(perfume));
        
        perfume.setState(p1);
        perfume.setState(p2);

        float valor_p1 = m1.venderPerfume(p1) + f1.venderPerfume(p1) + f1.venderPerfume(p1)
                        + l1.venderPerfume(p1) + l2.venderPerfume(p1) + l3.venderPerfume(p1);
        
        float valor_p2 = m1.venderPerfume(p2) + f1.venderPerfume(p2) + f1.venderPerfume(p2)
                        + l1.venderPerfume(p2) + l2.venderPerfume(p2) + l3.venderPerfume(p2);
        
        
        float fat_anual = valor_p1 + valor_p2;
        System.out.print("Faturamento anual : " + fat_anual);
        
    }

}
