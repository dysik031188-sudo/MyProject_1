import java.time.LocalDateTime;

public final class ImmutableClass {
    private final int id;
    private final  LocalDateTime date;

    public ImmutableClass(int id, LocalDateTime date){
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date ;
    }

        @Override
        public String toString()    {
            return "ImmutableClass{" +
                    "id=" + id +
                    ", date=" + date +
                    '}';
    }
}
