package Demo05ObjectMethodReference;

public class Demo01ObjectMethodReference {
    public static void printstring(Printable p){
        p.print("Helloworld");
    }

    public static void main(String[] args) {
        MethodRerObject obj = new MethodRerObject();
        printstring(obj::printUpperCaseString);
    }
}
//使用方法引用优化laimuda
//对象是已经存在的MethodRerObject obj
//成员方法也是已经存在的printUpperCaseString
//我们可以用对象名引用成员方法