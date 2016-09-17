package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Пример сервлета
 */
public class MyServlet extends HttpServlet {
    /**
     * Обработка POST-запроса
     *
     * @param request  запрос от браузера
     * @param response ответ браузеру
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintStream out = new PrintStream(response.getOutputStream());
        out.println("Hello world!");
    }

    /**
     * Обработка GET-запроса
     *
     * @param request  запрос от браузера
     * @param response ответ браузеру
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintStream out = new PrintStream(response.getOutputStream());
        out.println("Hello world!");
    }
}
