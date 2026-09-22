package Entity.Contenido;

import java.util.UUID;

public final class ContenidoId {
    private final String value;

    private ContenidoId(String value) {
        if(value == null || value.isBlank()){
            throw new DomainException("El id del contenido no puede ser vacio");
        }
        this.value = value.strip();
    }

    public static ContenidoId generate(){
        return new ContenidoId(UUID.randomUUID().toString());
    }

    public static ContenidoId of(String value){
        return new ContenidoId(value);
    }

    public String value(){
        return this.value;
    }
}
