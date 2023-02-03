package singletons;

enum SingletonEnum {
    /*thread safe*/
    INSTANCE("data");

    SingletonEnum(String data) {
        this.data = data;
    }
    private final String data;

    public String getData() {
        return data;
    }
}
