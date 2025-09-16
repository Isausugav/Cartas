   public String getEscaleras() {
        GrupoEscalera[] grupos = null;
        String mensaje = "No hay grupos";
        ordenar();
        int totalCartasGrupo = 0;
        NombreCarta desde = null;
        NombreCarta hasta = null;
        Pinta pinta = null;
        for (int i = 1; i < cartas.length; i++) {
            if (cartas[i - 1].getIndice() + 1 == cartas[i].getIndice()
                    && cartas[i - 1].getPinta() == cartas[i].getPinta()) {
                if (totalCartasGrupo == 0) {
                    totalCartasGrupo = 2;
                    desde = cartas[i - 1].getNombre();
                    hasta = cartas[i].getNombre();
                    pinta = cartas[i].getPinta();
                } else {
                    totalCartasGrupo++;
                    hasta = cartas[i].getNombre();
                }
            } else {
                if (totalCartasGrupo > 0) {
                    GrupoEscalera g = new GrupoEscalera(Grupo.values()[totalCartasGrupo], pinta, desde, hasta);
                    if (grupos == null) {
                        grupos = new GrupoEscalera[1];
                    } else {
                        grupos = (GrupoEscalera[]) Util.redimensionar(grupos, grupos.length + 1);
                    }
                    grupos[grupos.length - 1] = g;
                }
                desde = null;
                hasta = null;
                pinta = null;
                totalCartasGrupo = 0;
            }
        }
        if (totalCartasGrupo > 0) {
            GrupoEscalera g = new GrupoEscalera(Grupo.values()[totalCartasGrupo], pinta, desde, hasta);
            if (grupos == null) {
                grupos = new GrupoEscalera[1];
            } else {
                grupos = (GrupoEscalera[]) Util.redimensionar(grupos, grupos.length + 1);
            }
            grupos[grupos.length - 1] = g;
        }
        if (grupos != null) {
            mensaje = "Los grupos encontrados fueron:\n";
            for (GrupoEscalera grupo : grupos) {

                mensaje += grupo.getGrupo() + " de " + grupo.getPinta() + " entre " + grupo.getDesde() + " y " + grupo.getHasta() + "\n";

            }
        }
        return mensaje;
    }