public class Turma {
    private String codigo;
    private String nomeCurso;
    private int anoInicio;
    private int anoFim;

    // Construtores
    public Turma() {
        this.codigo = "";
        this.nomeCurso = "";
        this.anoInicio = 0;
        this.anoFim = 0;
    }

    public Turma(String codigo, String nomeCurso, int anoInicio, int anoFim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    // Getters & Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    // To string
    @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", anoInicio=" + anoInicio + ", anoFim="
                + anoFim + "]";
    }

    // Metodo para devolver a informação da turma
    public String getInfoTurma() {
        return "Codigo da turma: " + codigo.toUpperCase() + "\n" + "Nome do curso: " + nomeCurso.toUpperCase() + "\n" + "Ano do Inicio: " + 
                anoInicio + "Ano Fim da turma: " + anoFim;
    }

}
