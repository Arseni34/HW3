import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/book")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 10)
public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getParameter("fileName");
        if (fileName != null) {
            String filePath = "/Users/arseniartamonov/Downloads/" + fileName;
            File file = new File(filePath);
            if (file.exists()) {
                response.setContentType("application/octet-stream");
                response.setContentLengthLong(file.length());
                response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
                try (FileInputStream fileInputStream = new FileInputStream(file);
                     OutputStream outputStream = response.getOutputStream()) {

                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                    return;
                }
            } else {
                response.getWriter().println("File not found.");
            }
        }

        response.setContentType("text/html");
        try {
            request.getRequestDispatcher("/WEB-INF/Download.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }



}
