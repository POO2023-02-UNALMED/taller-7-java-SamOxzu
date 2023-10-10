package comunicacion;

public class Fabula extends Escrito {

    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina;
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
        result.append("Enseñanza: ").append(ensenanza).append("\n");
        result.append("Páginas: ").append(getPaginas()).append("\n");
        return result.toString();
    }
}
