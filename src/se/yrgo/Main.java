package se.yrgo;

public class Main {
    public static void main(String[] args) {
        System.out.println(LazyRootUser.getInstance());
        System.out.println(StaticFinalRootUser.INSTANCE);
        System.out.println(EnumRootUser.INSTANCE);
    }
}
