public class LivroDeNotasE {
    private String nomeDoCurso;

    public LivroDeNotasE(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public void exibirMensagem() {
        System.out.printf("Bem vindo ao livro de notas do curso %s",
                getNomeDoCurso());
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }
}