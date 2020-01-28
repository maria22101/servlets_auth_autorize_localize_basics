package org.itstep.controller.Command;

import org.itstep.model.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashSet;

class CommandUtility {
    static void setUserRole(HttpServletRequest request,
                     User.ROLE role, String name) {
        HttpSession session = request.getSession();
        ServletContext context = request.getServletContext();
        context.setAttribute("userName", name);
        session.setAttribute("role", role);
    }

    static boolean checkUserIsLogged(HttpServletRequest request, String username){
        HashSet<String> loggedUsers = (HashSet<String>) request
                .getServletContext()
                .getAttribute("loggedUsers");

        if(loggedUsers.stream().anyMatch(username::equals)){
            return true;
        }

        loggedUsers.add(username);
        request.getServletContext().setAttribute("loggedUsers", loggedUsers);
        return false;
    }
}
