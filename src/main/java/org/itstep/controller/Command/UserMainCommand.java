package org.itstep.controller.Command;

import javax.servlet.http.HttpServletRequest;

public class UserMainCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/user/userbasis.jsp";
    }
}
