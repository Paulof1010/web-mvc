package io.codeforall.bootcamp.canifetes;

public class Canifete {

    private int id;
    private String name;
    private String email;
    private int phone;

    public Canifete(int id, String name, String email, int phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getPhone() { return phone; }
}
