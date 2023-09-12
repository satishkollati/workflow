@RestController
public class UserController {
    @GetMapping
    public String demo() {
      return "hello world";
   } 
}