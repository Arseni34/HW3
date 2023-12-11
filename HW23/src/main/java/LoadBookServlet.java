import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;



    @WebServlet("/load-book")
    @MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 10)
    public class LoadBookServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            try {
                request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            try {
                Part filePart = request.getPart("file");
                String name = filePart.getSubmittedFileName();
                filePart.write("/Users/arseniartamonov/Downloads/\\" + name);
                response.getWriter().print("The file uploaded successfully");
            } catch (Exception e) {
                response.getWriter().print("Something went wrong ");
            }
        }
    }


