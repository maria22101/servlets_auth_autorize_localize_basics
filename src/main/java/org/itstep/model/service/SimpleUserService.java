package org.itstep.model.service;

import org.itstep.model.entity.Beverage;
import org.itstep.model.entity.CoffeeMachine;
import org.itstep.model.entity.User;
import org.itstep.model.entity.enums.FirstBasicIngredient;
import org.itstep.model.entity.enums.Glassful;
import org.itstep.model.entity.enums.SecondBasicIngredient;
import org.itstep.model.entity.enums.Sugar;

import javax.management.relation.Role;
import java.util.Arrays;
import java.util.List;

public class SimpleUserService {

    private List<User> users = Arrays.asList(
            new User(1, "ivan", "rio", User.ROLE.USER),
            new User(2, "rosa", "tigra", User.ROLE.USER),
            new User(3, "mari", "pass", User.ROLE.ADMIN)
    );

    public boolean userExists(String login, String password) {
        return users.stream()
                .anyMatch(u -> u.getLogin().equals(login) && u.getPassword().equals(password));
    }

    public User.ROLE getRoleByLoginAndPassword(String login, String password) {
        return users.stream()
                .filter(u -> u.getLogin().equals(login) && u.getPassword().equals(password))
                .findFirst()
                .get()
                .getRole();
    }
}
