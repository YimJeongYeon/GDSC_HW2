package generic;

public class MyGenericClass <T> { //<T extends Number> 넘버의 자식들만 올 수 있다
    private  T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}
