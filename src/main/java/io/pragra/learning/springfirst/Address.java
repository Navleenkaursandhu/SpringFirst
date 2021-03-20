package io.pragra.learning.springfirst;

public class Address {
    private String type;
    private String location;

    public Address(String type, String location) {
        this.type= type;
        this.location = location;
    }


    @Override
    public String toString() {
        return "Address{" +
                "house_no='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
