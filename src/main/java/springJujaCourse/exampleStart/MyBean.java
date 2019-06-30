package springJujaCourse.exampleStart;

public class MyBean {
    private Service service;
    private String name;
    private String text;

    public MyBean(String text, Service service) {
        this.text = text;
        this.service = service;
    }

    public String getText() {
        return text + "{" + service.getData() + "}";
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name + "{" + service.getData() + "}";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service getService() {
        return service;
    }

    public void sayHello() {
        System.out.println(getText());
    }
}
