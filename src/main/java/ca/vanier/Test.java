package ca.vanier;

import java.io.Console;

public class Test {
    public static void main(String[] args) {
        ProductObjectManager pr = new ProductObjectManager();
        pr.CreateProduct(args);
        pr.List();
    }
}