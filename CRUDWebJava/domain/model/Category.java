package domain.model;

import java.util.UUID;;

public class Category {
    private UUID id;
    private String name;

    public Category() {
        this.id = UUID.randomUUID();
    }

    public Category(String name) {
        if(name.equals("") || name == null){
            throw new IllegalArgumentException("O nome informado é inválido");
        }

        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Category other = (Category) obj;
        if (this.id == other.id) {
            return true;
        }
        return false;
    }
}