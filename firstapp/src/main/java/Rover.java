public class Rover {
    public String ExecuteCommands(String commands) {
        String direction = "N";

        if (commands == "R"){
            direction = "E";
        }

        return "0:0:" + direction;
    }
}
