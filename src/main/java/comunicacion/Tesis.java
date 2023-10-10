package comunicacion;

public class Tesis extends Escrito {

    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * 5; // Factor 5 para Tesis
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Título: ").append(getTitulo()).append("\n");
        result.append("Autor: ").append(getAutor()).append("\n");
        result.append("Idea: ").append(idea).append("\n");
        result.append("Argumentos: ");
        for (String argumento : argumentos) {
            result.append(argumento).append(", ");
        }
        result.delete(result.length() - 2, result.length()); // Elimina la última coma y espacio
        result.append("\n");
        result.append("Conclusion: ").append(conclusion).append("\n");
        result.append("Referencias: ").append(referencias).append("\n");
        result.append("Páginas: ").append(getPaginas()).append("\n");
        return result.toString();
    }
}