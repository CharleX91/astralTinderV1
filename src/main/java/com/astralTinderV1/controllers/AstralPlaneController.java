package com.astralTinderV1.controllers;

import com.astralTinderV1.enttities.User;
import com.astralTinderV1.enums.ZodiacSigns;
import com.astralTinderV1.services.AstralPlaneService;
import com.astralTinderV1.services.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/perfilAstral")
public class AstralPlaneController {

    AstralPlaneService apServ;
    UserService uS;

    @Autowired
    public AstralPlaneController(AstralPlaneService apServ, UserService uS) {
        this.apServ = apServ;
        this.uS = uS;
    }
//    @GetMapping("/mostrar")
//    public String showProfile(ModelMap model, HttpSession session) {
//        User currentUser = (User) session.getAttribute("userSession");
//        model.put("descripcion", currentUser.getAstralPlane());
//
//        return "/user-astral-profile";
//
//    }

    @GetMapping("/mostrar/{id}")
    public String showProfile(ModelMap m, @PathVariable String id) {
        User user = uS.getById(id);
        try {
            m.addAttribute("astralPlane", user.getAstralPlane());
            return "user-astral-profile";
        } catch (Exception e) {
            System.out.println(id);
            System.out.println(user.getAstralPlane());
            System.out.println("no se encontro el usurio con esa id");
            return "redirect:/ruleta";
        }
    }

}
