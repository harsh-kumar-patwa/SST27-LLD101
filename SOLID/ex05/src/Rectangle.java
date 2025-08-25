public class Rectangle implements Shape{
    protected int w,h;
    void setWidth(int w){ this.w = w; }
    void setHeight(int h){ this.h = h; }
    public int area(){ 
        setWidth(w);
        setHeight(h);
        return w*h;
    }
}