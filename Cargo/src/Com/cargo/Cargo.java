package Com.cargo;

public class Cargo {
private String name;
private String description;
private double length;
private double width;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getLength() {
	return length;
}
public void setLength(double string) {
	this.length = string;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
@Override
public String toString() {
	return "Cargo [name=" + name + ", description=" + description + ", length=" + length + ", width=" + width + "]";
} 

}