一、servlet 3.X新规范解读

`WEB`三大组件：`servlet、filter、listener`

1.配置途径：原生`J2EE`中`web.xml` 中`servlet`标签配置 --->> `spring-mvc.xml`

2.非配置途径：`@WebServlet(value={"/hello","/world"})`注解一个继承`HttpServlet`的类，并重写`doGet` 或者 `doPost`方法，同理`@WebFilter() / @WebListener()`

3.`SPI` (服务动态扩展)：通过`servletContext`来管理`WEB`三大组件

```java
// IParseDoc 接口 及其两个实现类

// 在/META-INF/services目录下新建文件，名为IParseDoc接口的全类路径名，内容为指定实现的服务全类路径名

// Main方法（启动类）
private static ServiceLoader<IParseDoc> paseDocs = ServiceLoader.load(IParseDoc.class);
ServiceLoader<IParseDoc> paseDocs = ServiceLoader.load(IParseDoc.class);
for(IParseDoc parseDoc:paseDocs){
    parseDoc.parse();
}
```

```java
// ServletContainerInitializer 接口

// 在/META-INF/services目录下新建文件，名为ServletContainerInitializer接口的全类路径名，内容为指定实现的服务全类路径名（文件名为 javax.servlet.ServletContainerInitializer）

// 实现类
@HandlesTypes(value = {ITestService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        List<ITestService> testServices = new ArrayList<>();
        if(set != null){
            for (Class<?> aClass : set) {
                
            }
        }
    }
}
```

当`Tomcat`启动时候就会自动的去加载`onStartup()`方法.

附加1：`spring-IOC 的 refresh()`方法：

附件2：`spring.io  --> spring-framework --> spring MVC` 官网说明

>  https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html 



去除`web.xml`



```java
tomcat.onstart() {
	SpringServletContainerInitializer.onStartup(WebApplicationInitializer 集合) {
		// 通过反射创建 WebApplicationInitializer 对象
		WebApplicationInitializer.onStartup() {
			// 1.创建IOC容器
			// 2.注册我们的dispatchServlet
		}
	}
}
```



















