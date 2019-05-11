package hello;

public class DemoAdd {

    private final long id;
    private final long summand;
    private final long addend;
    public DemoAdd(long id) {
        this.id = id;
        this.summand = id+1;
        this.addend = id+2;

    }

    public long getId() {
        return id;
    }

    public long getsummand() {
        return summand;
    }
    public long getaddend() {
        return addend;
    }
    public long getAdd_result() {
        return addend+summand;
    }
}
