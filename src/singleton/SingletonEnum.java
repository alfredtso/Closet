package singleton;

public enum SingletonEnum {
    UNIQUE_INSTANCE, UNIQUE_INSTANCE_2, UNIQUE_INSTANCE_3;

    int val;

    public void setVal(int val) { this.val = val; }
    public int getVal() { return this.val;}

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.UNIQUE_INSTANCE;
        SingletonEnum singleton2 = SingletonEnum.UNIQUE_INSTANCE_2;
        SingletonEnum single3 = Enum.valueOf(SingletonEnum.class, "UNIQUE_INSTANCE_3");
        singleton2.setVal(1);
        singleton.setVal(2);
        single3.setVal(3);
        System.out.println(singleton2.getVal());
        System.out.println(singleton.getVal());
        System.out.println(single3.getVal());
        System.out.println(SingletonEnum.values());
    }
}


