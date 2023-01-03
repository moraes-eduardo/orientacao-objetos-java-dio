package heranca2;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        // Classe
        Funcionario funcionario = new Funcionario();

        // Subclasse - upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        
        // downcast - deve ser evitado
        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
