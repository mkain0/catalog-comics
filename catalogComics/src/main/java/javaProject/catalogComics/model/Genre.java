package javaProject.catalogComics.model;

public class Genre {

    private int id;
    private String description;

    public Genre() {

    }

    public Genre(String description) {
	this.description = description;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "Genre ID: " + id + ", Description: " + description;
    }

}
