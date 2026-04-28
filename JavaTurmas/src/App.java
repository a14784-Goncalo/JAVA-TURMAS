public class App {
    public static void main(String[] args) throws Exception {
        Professor professor = new Professor(12345, "Luis", "Santos", 1999, "Programação");
        Turma turma = new Turma("DC124", "Programador de informática", 2025, 2026);
        Aluno aluno1 = new Aluno("a14784", "Gonçalo", "Serra", 2010, turma);
        Aluno aluno2 = new Aluno("a14786", "Tomas", "Stasto", 2010, turma);
        Aluno aluno3 = new Aluno("a14777", "Tiago", "Sa", 2010, turma);

        System.out.println("Nome completo do professor: " + professor.getNomeCompleto());
    }
}
