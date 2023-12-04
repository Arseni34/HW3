package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
@WebServlet("/beijing")
public class beijingTimeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ZoneId beijingZone = ZoneId.of("Asia/Shanghai");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTime = LocalDateTime.now(beijingZone).format(formatter);
        try(PrintWriter writer = resp.getWriter()){
            writer.write("<h2>"+formattedTime+"</h2>");
        }
    }
}

