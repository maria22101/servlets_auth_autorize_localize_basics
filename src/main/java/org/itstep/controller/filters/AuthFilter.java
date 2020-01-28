package org.itstep.controller.filters;

import org.itstep.model.entity.User;
import org.itstep.model.service.SimpleUserService;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;

import static java.util.Objects.nonNull;

public class AuthFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {

//        final HttpServletRequest req = (HttpServletRequest) request;
//        final HttpServletResponse res = (HttpServletResponse) response;
//
//        HttpSession session = req.getSession();
//        ServletContext context = request.getServletContext();
//
//        String path = req.getRequestURI();
//        path = path.replaceAll(".*/coffee/", "");
//        final String login = req.getParameter("name");
//        final String password = req.getParameter("pass");
//
//        res.getWriter().print("hello from Filter " + path); // for check
//
//        if (nonNull(session) &&
//                nonNull(session.getAttribute("login")) &&
//                nonNull(session.getAttribute("password"))) {
//            final User.ROLE role = (User.ROLE) session.getAttribute("role");
//            moveToRelatedPage(req, res, role);
//
//        } else if (simpleUserService.userExists(login, password)) {
//            final User.ROLE role = simpleUserService.getRoleByLoginAndPassword(login, password);
//            req.getSession().setAttribute("password", password);
//            req.getSession().setAttribute("login", login);
//            req.getRequestDispatcher("/WEB-INF/user/userbasis.jsp").forward(req, res); // for check
//            setUserInContext(login, context);
//            moveToRelatedPage(req, res, role);
//
//        } else {
//            moveToRelatedPage(req, res, User.ROLE.UNKNOWN);
//        }
//        System.out.println(session);
//        System.out.println(session.getAttribute("role"));
//        System.out.println(context.getAttribute("loggedUsers"));


//        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
//
//    }
//
//    // directing to the role relevant page
//    private void moveToRelatedPage(final HttpServletRequest req,
//                                   final HttpServletResponse res,
//                                   final User.ROLE role)
//            throws ServletException, IOException {
//
//        if (role.equals(User.ROLE.ADMIN)) {
//            req.getRequestDispatcher("/WEB-INF/admin/adminbasis.jsp").forward(req, res);
//        } else if (role.equals(User.ROLE.USER)) {
//            req.getRequestDispatcher("/WEB-INF/user/userbasis.jsp").forward(req, res);
//        } else {
//            req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, res);
//        }
    }

    // adding non existing user in context
    private void setUserInContext(String login, ServletContext context) {

        HashSet<String> loggedUsers = (HashSet<String>) context.getAttribute("loggedUsers");

        loggedUsers.add(login);
        context.setAttribute("loggedUsers", loggedUsers);
    }
}
