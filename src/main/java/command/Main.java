package command;

import command.fs.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        FileSystem fileSystem = new FileSystem();
        commands.add(new OpenFileCommand(fileSystem));
        commands.add(new CloseFileCommand(fileSystem));
        commands.add(new WriteFileCommand(fileSystem));
        for (Command command: commands){
            command.execute();
        }

        /*Tworzymy Program realizujący pilot od telewizora przy użyciu wzorca command Klasa TvRemoteControl*/

    }
}
