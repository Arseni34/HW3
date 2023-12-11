import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.annotation.WebListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    @WebListener
    public class Task1Servlet  implements jakarta.servlet.ServletRequestListener {
/*Написать приложение, которое при запуске будет сообщать в консоль что оно
работает. На любой запрос в консоли должна отображаться запись со временем этого
запроса.
 */
        @Override
        public void requestInitialized(ServletRequestEvent Event) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedTime = LocalDateTime.now().format(formatter);
            System.out.println("Time is "+formattedTime);
        }


    }

