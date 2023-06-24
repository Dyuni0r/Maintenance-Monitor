package at.technikumwien.maintenancemonitor;

public class MaintenanceMonitor {

    private static final String DefaultMessage = "Everything works as expected";
    private String message = "";

    public String getMessage(){
        return message;
    }

    public void setMessage(String m)
    {
        message = m;
    }

    public void resetMessage()
    {
        message = DefaultMessage;
    }
}
