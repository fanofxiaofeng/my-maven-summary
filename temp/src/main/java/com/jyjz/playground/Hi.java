package com.jyjz.playground;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;


public class Hi extends HttpServlet {
    static {
        System.out.println("my init");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement().toString();
            System.out.println(element);
            System.out.println(request.getHeader(element));
        }
        System.out.println("=======");
        Map map = request.getParameterMap();
        System.out.println(map.toString());
        System.out.println("hihihihi");
        String name = request.getParameter("name");
        System.out.println(name);
        request.getRequestDispatcher("a.jsp").forward(request, response);
    }
}
