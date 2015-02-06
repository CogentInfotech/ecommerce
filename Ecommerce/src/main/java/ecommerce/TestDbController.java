package ecommerce;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestDbController {
	

    @Autowired
    private TestDAO guestDao;
 
    @RequestMapping(value="/ecommerce")
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
    	System.out.println("Hello world,Spring is Here!");
        String name = request.getParameter("name");
        if (name != null)
            guestDao.persist(new TestDB(name));
 
        // Prepare the result view (guest.jsp):
        return new ModelAndView("login.jsp", "guestDao", guestDao);
    }

}
