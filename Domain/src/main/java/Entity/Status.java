package Entity;

public enum Status {
    BORRADOR {
        public boolean pasar(Status status){
            return status == EN_REVISION || status == ARCHIVADO;
        }
    },
    EN_REVISION {
        public boolean pasar(Status status){
            return status == PUBLICADO || status == ARCHIVADO;
        }
    },
    PUBLICADO {
        public boolean pasar(Status status){
            return status == ARCHIVADO;
        }
    },
    ARCHIVADO {
        public boolean pasar(){
            return false;
        }
    };

    public static Genero fromString(String dato){
        if(dato == null || dato.isBlank()){
            return null;
        }
        try {
            return Genero.valueOf(dato.toUpperCase().replace("-", "_"));
        }catch (IllegalArgumentException e){
            throw new DomainException();
        }
    }
}
