public class StringWrapper {

    String s;

    public StringWrapper(String s) {
        this.s = s;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("!!!");
        super.finalize();
    }

}
