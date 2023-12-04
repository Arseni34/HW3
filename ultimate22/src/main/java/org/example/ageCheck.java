package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/ageCheck")
public class ageCheck extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String age = req.getParameter("age");
        String message = null;
        if(Integer.parseInt(age)>=18){
             message = "Совершеннолетний";
        }
        else {
             message = "Несовершеннолетний";
        }
        try(PrintWriter writer = resp.getWriter()){
            writer.write("<h2>"+message+"</h2>");
        }
    }
}

