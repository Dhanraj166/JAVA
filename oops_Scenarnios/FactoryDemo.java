
abstract class FactoryDemo extends SmartPhone {

    static int price = 0;
    boolean isOriginalPiece = false;

    public abstract void verifyFingerPrint();

    public abstract void providePattern();

    public void browse() {
        super.browse();
        System.out.println("Factory Demo browsing");
    }

}
