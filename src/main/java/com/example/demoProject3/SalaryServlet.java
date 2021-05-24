package com.example.demoProject3;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "salary", value = "/salary")
public class SalaryServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double basic = Double.parseDouble(request.getParameter("basic"));
        double hra = Double.parseDouble(request.getParameter("hra"));
        double da = Double.parseDouble(request.getParameter("da"));
        double ma = Double.parseDouble(request.getParameter("ma"));
        double pf = Double.parseDouble(request.getParameter("pf"));
        double insurance = Double.parseDouble(request.getParameter("insurance"));

        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        if (!Employee.EmpIdName.containsKey(id))
            out.print("<h1>INVALID EMPLOYEE ID");
        else {
            out.print("<h1> Gross salary is: " + Employee.getGrossSalary(basic, hra, da, ma) + " </h1>");
            out.print("<h1> Net Salary is: " + Employee.getNetSalary(basic, hra, da, ma, pf, insurance) + " </h1>");
        }
        out.print("</body></html>");
    }
}
