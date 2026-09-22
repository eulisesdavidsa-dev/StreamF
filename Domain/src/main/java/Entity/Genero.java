package Entity;

public enum Genero {
    ACCION, DRAMA, COMEDIA, DOCUMENTAL, SUSPENSO, TERROR, ANIMACION, CIENCIA_FICCION;

    public static Genero fromString(String dato){
        if(dato == null || dato.isBlank()){
            return null;
        }
        try {
            return Genero.valueOf(dato.toUpperCase().replace("-", "_"));
        }catch (IllegalArgumentException e){
            throw new DomainException("Genero no existe: "+ dato);
        }
    }
}
