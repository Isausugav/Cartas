public class GrupoEscalera {

    private Grupo grupo;
    private Pinta pinta;
    private NombreCarta desde;
    private NombreCarta hasta;

    public GrupoEscalera(Grupo grupo,
            Pinta pinta,
            NombreCarta desde,
            NombreCarta hasta) {
        this.grupo = grupo;
        this.pinta = pinta;
        this.desde = desde;
        this.hasta = hasta;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Pinta getPinta() {
        return pinta;
    }

    public NombreCarta getDesde() {
        return desde;
    }

    public NombreCarta getHasta() {
        return hasta;
    }

}