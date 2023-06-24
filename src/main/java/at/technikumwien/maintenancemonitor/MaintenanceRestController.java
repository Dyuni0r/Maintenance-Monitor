package at.technikumwien.maintenancemonitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MaintenanceRestController {

    MaintenanceMonitor m = new MaintenanceMonitor();

    @RequestMapping("/api/message")
    public String getMessage(){
        return m.getMessage();
        //return message;
    }

    @RequestMapping ("/api/message/set")
    public void setMessage(@RequestParam String message)
    {
        m.setMessage(message);
    }

    @RequestMapping("/api/message/reset")
    public void resetMessage()
    {
        m.resetMessage();
    }


}
