
public class Square implements Shape {
    protected int w;
    void setWidth(int w){
        this.w=w;
    }
    @Override
    public int area() {
        setWidth(w);
        return w*w;
    }
}