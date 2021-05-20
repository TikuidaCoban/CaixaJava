package caixaeletronico;

/**
 * JSON - Número da conta -> Criar de forma ordenada
 * 
 */
class Metodo2 {

    void Menu() {
        System.out.println("===== NetBank Menu=====");
        System.out.println("1 - Para ver seu Saldo");
        System.out.println("2 - Para fazer um depósito");
        System.out.println("3 - Para efetuar um saque");
        System.out.println("4 - Para efetuar uma transferência");
        System.out.println("5 - Para consultar seu extrato");
        System.out.println("0 - Para sair");
        System.out.print("Digite a sua opção:");
    }
    
    void SecretCode() {
        String[] carct ={"0","1","2","3","4","5","6","7","8","9"};

        String senha = "";

        for (int x=0; x < 6; x++){
            int j = (int) (Math.random()*carct.length);
            senha += carct[j];
        }
        
        System.out.println("Senha: " + senha);
    }  
    
    void NumberCont() {
        
    
    }
    
    void BlockAccount() {
        
    
    }   
}
