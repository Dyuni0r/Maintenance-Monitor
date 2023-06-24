package at.technikumwien.maintenancemonitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MaintenanceRestController {

    String message = "Everything works as expected";

    @RequestMapping("/api/message")
    public String getMessage(){
        return message;
        //return message;
    }

    @RequestMapping ("/api/message/set")
    public String setNewMessage(@RequestParam String newMessage){
        message = newMessage;
        return getOK();
    }

    private String getOK(){
        return "ok";
    }
}
