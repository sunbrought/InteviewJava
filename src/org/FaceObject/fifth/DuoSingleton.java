package org.FaceObject.fifth;

class Sex {
    private String title;
    private static final Sex male=new Sex("男");
    private static final Sex female=new Sex("女");
    //构造器私有化
    private Sex(String title){
        this.title=title;
    }
    public static Sex getInstance(int ch){
        switch (ch){
            case 1:
                return male;
            case 2:
                return female;
            default:
                return null;
        }
    }
    public String toString(){
        return this.title=title;
    }
}
interface Choose{
    public int male=1;
    public int female=2;
}
public class DuoSingleton{
    public static void main(String[] args) {
        Sex sex=Sex.getInstance(Choose.male);
        System.out.println(sex);
    }
}
