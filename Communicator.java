import units.Unit;

import java.io.*;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class Communicator implements Serializable {

    private static List<Unit> fightersOnArena = new LinkedList<>();

    private static Socket socket;
    private static int port = 1702;
    //private static String ipServer = "192.168.137.1";
    private static String ipServer = "192.168.3.5";
    //private static String ipServer = "134.249.176.164";

    public static void addFighter(Unit unit){
        fightersOnArena.add(unit);
    }

    public static void dataTransfer(){
        try {
            socket = new Socket(ipServer, port);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            outputStream.writeObject(fightersOnArena);
            outputStream.flush();
            System.out.println("Data sent");


            Unit winner = (Unit) inputStream.readObject();
            System.out.print("Winner: ");
            winner.getName();

            socket.close();
            fightersOnArena.clear();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
