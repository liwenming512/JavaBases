package decorator;/**
 * Created by Administrator on 2020/7/8.
 */

/**
 * @Author liwenming
 * @Description 装饰模式
 * @Date 2020/7/8 20:13
 **/
public class DecoratorPattern {

    public static void main(String[] args) {

    }
}

interface Component{

    void operation();
}

class ConcreteComponent implements Component{

    public ConcreteComponent(){
        System.out.println("创建具体构件角色");
    }

    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}

class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
