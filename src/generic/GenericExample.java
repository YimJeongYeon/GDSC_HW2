package generic;

public class GenericExample {
    public static void main(String[] args) {
        MyGenericClass<Integer> exampleInteger = new MyGenericClass<>();
        //Bounded Type 파라미터에 의해 Number 클래스와
        //그 자식 클래스들이 아니면 사용할 수 없음!
        MyGenericClass<String> exampleString = new MyGenericClass<>();

        exampleInteger.setValue(1);
        exampleString.setValue("Hello, generics");
        System.out.println(exampleInteger.getValue());
        System.out.println(exampleString.getValue());
    }
}
