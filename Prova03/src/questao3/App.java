package questao3;


public class App {

    public static void main(String[] args) {
        
        ColaboradorKen ken = new ColaboradorKen();
        ColaboradorRyu ryu = new ColaboradorRyu();
        
        MediadorKenRyu med = new MediadorKenRyu(ryu, ken);
        
        System.out.println("Ken: " +ken.getVitalidade());
        System.out.println("Ryu: " +ryu.getVitalidade());
        ryu.chamarOperacao();
        System.out.println("Ken: " +ken.getVitalidade());
        System.out.println("Ryu: " +ryu.getVitalidade());
        ryu.chamarOperacao();
        System.out.println("Ken: " +ken.getVitalidade());
        System.out.println("Ryu: " +ryu.getVitalidade());
        med.OperacaoMediada();
        System.out.println("Ken: " +ken.getVitalidade());
        System.out.println("Ryu: " +ryu.getVitalidade());
        
//        do{
//            System.out.print("HADOUKEN!!!");
//            ryu.chamarOperacao();
//            System.out.print("vida Ryu: " + ken.getVitalidade());
//            System.out.print("vida Ken: " + ryu.getVitalidade());
//        }while(ken.getVitalidade() > 0);
//        
        System.out.println("FIM DA LUTA!!");
             
    }
    
}
