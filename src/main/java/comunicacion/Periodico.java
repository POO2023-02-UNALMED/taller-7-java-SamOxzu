package comunicacion;

public class Periodico extends Escrito {

    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
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
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Título: ").append(getTitulo()).append("\n");
        result.append("Autor: ").append(getAutor()).append("\n");
        result.append("Fecha: ").append(fecha).append("\n");
        result.append("Primicia: ").append(primicia).append("\n");
        result.append("Páginas: ").append(getPaginas()).append("\n");
        return result.toString();
    }
}
