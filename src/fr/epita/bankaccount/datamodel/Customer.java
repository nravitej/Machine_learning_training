package fr.epita.bankaccount.datamodel;

import java.util.Objects;

public class Customer {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(Objects.toString(name, "")).append('\"');
        sb.append(",\"address\":\"")
                .append(Objects.toString(address, "")).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
