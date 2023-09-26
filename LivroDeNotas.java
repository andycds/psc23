public class LivroDeNotas {

    private String nomeDoCurso;

    public LivroDeNotas(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public void exibirMensagem() {
        System.out.printf("Bem vindo ao livro de notas do curso %s\n", getNomeDoCurso());
    }
}
