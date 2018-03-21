
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ParamServlet",
        value = "/config",
        loadOnStartup = 1,
        initParams = {

                @WebInitParam(name = "city", value = "London"),
                @WebInitParam(name = "times", value = "5")
        })

public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        String city = getInitParameter("city");
        String times = getInitParameter("times");

        httpServletResponse.getWriter().print("You visited " + city + " " + times + " times");

    }
}
