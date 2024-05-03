public class Main {
    public static void main(String[] args) {
        FerrisWheel ferrisWheel = new FerrisWheel();
        Adult paulo = new Adult("Paulo", 42);
        Child joao = new Child("Joao", 5);
        Child maria = new Child("Maria", 12);
        Child pedro = new Child("Pedro", 13);
        Child henrique = new Child("Henrique", 10);

        ferrisWheel.board(42, joao); // Joao e pai Paulo
        ferrisWheel.board(3, maria); // Maria independente
        ferrisWheel.board(13, pedro); // Pedro independente
        ferrisWheel.board(16, henrique); // Erro: Henrique -12 anos e não tem pai

        ferrisWheel.status();
    }
}
