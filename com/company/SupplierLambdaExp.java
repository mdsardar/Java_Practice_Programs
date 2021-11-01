package com.company;



import java.util.Map;
import java.util.function.Supplier;


public class SupplierLambdaExp {
    public static void main(String[] args) {
        Supplier<String> userSupplier = () -> {
            Map<String, String> env = System.getenv();
            return env.get("USER");
        };
        System.out.println("Usesr is: " + userSupplier.get());
    }
}
