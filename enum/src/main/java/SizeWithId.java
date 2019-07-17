public enum  SizeWithId {
    SMALL(10),
    MEDIUM(20),
    LARGE(25);

    private int id;
    private SizeWithId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
