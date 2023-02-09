package org.example;

@Category(name = "Lamps")
public class TableLamp {
    private String model;
    private int height;
    private int width;
    private int length;
    public TableLamp(String model , int height, int width, int length){

    this.model=model;
    this.height=height;
    this.width=width;
    this.length=length;


    Category annotation=this.getClass().getAnnotation(Category.class);

    System.out.println("Category of item ="+annotation.name());

}

public String getModel(){
    return this.model;
}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void showProportions(){

        System.out.println("Height="+height+"mm. Width="+width+"mm. Length="+length+" mm.");
    }

}
