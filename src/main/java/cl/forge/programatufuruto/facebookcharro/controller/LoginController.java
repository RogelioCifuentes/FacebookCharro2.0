package cl.forge.programatufuruto.facebookcharro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/login")
public class LoginController{

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String handleGetRequest() {
        return "login";
    }
}