package com.example.baitap;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Product Discount Calculator", value = "/Product Discount Calculator")
public class DiscountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy dữ liệu từ request
        String description = request.getParameter("description");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        // Tính toán
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;

        // Hiển thị kết quả
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Discount Result</title></head><body>");
        out.println("<h1>Discount Result</h1>");
        out.println("<p><strong>Product Description:</strong> " + description + "</p>");
        out.println("<p><strong>Discount Amount:</strong> " + discountAmount + "</p>");
        out.println("<p><strong>Discount Price:</strong> " + discountPrice + "</p>");
        out.println("</body></html>");
    }
}