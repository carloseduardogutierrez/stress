package com.stress.stress.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.graalvm.compiler.nodes.extended.FixedValueAnchorNode.getObject;

@RestController
public class LoginController {

    @PostMapping("/v1/oauth/accesstoken")
    Object makeLogin() {
        Resource resource = new ClassPathResource("/static/json/loginPmc.json");
        return getObject(resource);
    }
}
