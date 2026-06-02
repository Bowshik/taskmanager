package com.bowshik.taskmanager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")

public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService=authService;
    }
    @PostMapping("/register")
    public String register(@RequestBody AuthRequest request){
        return authService.register(request.getEmail(), request.getPassword());

    }
    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {
        return authService.login(request.getEmail(), request.getPassword());
    }
}
