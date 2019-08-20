package springFramework.ch4;

import org.springframework.beans.factory.BeanNameAware;

public class NameSinger implements BeanNameAware {
    private String name;

    @Override
    public void setBeanName(String beanName) {
        this.name = beanName;
    }

    public void sing() {
        System.out.println("Singer " + name + " - sing()");
    }
}
