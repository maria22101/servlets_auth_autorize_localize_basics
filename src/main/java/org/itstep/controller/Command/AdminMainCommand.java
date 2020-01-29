package org.itstep.controller.Command;

import javax.servlet.http.HttpServletRequest;

public class AdminMainCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/admin/adminbasis.jsp";
    }
}
