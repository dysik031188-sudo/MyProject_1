import java.util.Date;

public final class ImutableClass {
    private final int id;
    private final  Date date;

    public ImutableClass(int id, Date date){
        this.id = id;
        this.date = new Date(date.getTime());
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
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
