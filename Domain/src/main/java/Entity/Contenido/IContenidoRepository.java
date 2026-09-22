package Entity.Contenido;

import java.util.List;

public interface IContenidoRepository {
    public Contenido crear (Contenido contenido);

    public List<Contenido> buscar();
    public Contenido buscarId(ContenidoId id);

    public int borrar (ContenidoId id);
    public int modificar (ContenidoId id);
}
