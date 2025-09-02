import java.util.HashMap;
import java.util.Map;

public enum Categoria {

    FICCAO("F"),
    NAO_FICCAO("N"),
    TECNOLOGIA("T"),
    HISTORIA("H");

    private final String codigo;


    private static final Map<String, Categoria> MAPA_CATEGORIAS = new HashMap<>();

    static {
        for (Categoria c : values()) {
            MAPA_CATEGORIAS.put(c.codigo, c);
        }
    }

    Categoria(String codigo) {
        this.codigo = codigo;
    }


    public String getCodigo() {
        return codigo;
    }



    public static Categoria fromCodigo(String codigo) {
        Categoria categoria = MAPA_CATEGORIAS.get(codigo);
        if (categoria == null) {
            throw new IllegalArgumentException("Código inválido: " + codigo);
        }
        return categoria;
    }

}
