package command;

import command.fs.*;
import command.remotecontrol.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        FileSystem fileSystem = new FileSystem();
        commands.add(new OpenFileCommand(fileSystem));
        commands.add(new CloseFileCommand(fileSystem));
        commands.add(new WriteFileCommand(fileSystem));
        for (Command command : commands) {
            command.execute();
        }

        TvRemoteControl remoteControl = new TvRemoteControl();
        List<TvRemoteCommand> remoteCommands = Arrays.asList(new ChangeChannelCommand(remoteControl),
                new VolumeDownCommand(remoteControl), new VolumeUpCommand(remoteControl));

        remoteCommands.forEach(tvRemoteCommand -> tvRemoteCommand.execute());

        /*Tworzymy Program realizujący pilot od telewizora przy użyciu wzorca command Klasa TvRemoteControl*/

    }
}
