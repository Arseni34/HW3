import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class Task1Servlet2  implements jakarta.servlet.ServletContextListener {
    /*Написать приложение, которое при запуске будет сообщать в консоль что оно
    работает. На любой запрос в консоли должна отображаться запись со временем этого
    запроса.
     */

    @Override
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("Application is working");
    }
}

