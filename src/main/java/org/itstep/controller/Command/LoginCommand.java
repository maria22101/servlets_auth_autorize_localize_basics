package org.itstep.controller.Command;

import org.itstep.model.entity.User;
import org.itstep.model.service.SimpleUserService;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements Command{
    private SimpleUserService simpleUserService = new SimpleUserService();

    @Override
    public String execute(HttpServletRequest request) {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        if( name == null || name.equals("") || pass == null || pass.equals("")  ){
            //System.out.println("Not");
            return "/login.jsp";
        }
//        System.out.println(name + " " + pass);

//        return "/login.jsp";

        //System.out.println("Yes!");
//todo: check login with DB

        if(simpleUserService.userExists(name, pass) &&
                simpleUserService.getRoleByLoginAndPassword(name, pass).equals(User.ROLE.USER)) {
//            return "/WEB-INF/user/userbasis.jsp";
            return "redirect:/user/userbasis.jsp";

        }else if(simpleUserService.userExists(name, pass) &&
                simpleUserService.getRoleByLoginAndPassword(name, pass).equals(User.ROLE.ADMIN)) {
            return "redirect:/admin/adminbasis.jsp";

        }else {
            return "/login.jsp";
        }

//        if(CommandUtility.checkUserIsLogged(request, name)){
//            return "/WEB-INF/error.jsp";
//        }

//        if (name.equals("Admin")){
//            CommandUtility.setUserRole(request, User.ROLE.ADMIN, name);
//            return "/WEB-INF/admin/adminbasis.jsp";
//        } else if(name.equals("User")) {
//            CommandUtility.setUserRole(request, User.ROLE.USER, name);
//            return "/WEB-INF/user/userbasis.jsp";
//        } else {
//            CommandUtility.setUserRole(request, User.ROLE.UNKNOWN, name);
//            return "/login.jsp";
//        }


    }

}
