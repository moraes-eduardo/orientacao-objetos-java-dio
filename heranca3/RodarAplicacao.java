package heranca3;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        // Polimorfismo nas classes filhas
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        // polimorfismo e sobrescrita
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        // sobrescrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }

}
