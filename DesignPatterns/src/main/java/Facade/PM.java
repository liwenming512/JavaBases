package main.java.Facade;/**
 * Created by Administrator on 2021/6/19.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/6/19 19:31
 **/
public class PM {

    ProjectGroup project = new FeiTian();

    public void start(String context){
        project.require();
        project.dev();
        project.test();
    }
}
