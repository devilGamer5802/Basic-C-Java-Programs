class Box {
    double width,height,depth;
    double volume;
    Box(double width, double height, double depth){
        volume=width*height*depth;
        this.width=width;
        this.height=height;
        this.depth=depth;
        
    }
    }
public class ConstructBox{
    public static void main(String args[]){
        Box box1=new Box(12,10,12);
        System.out.println("Volume:"+box1.volume);
    }
}