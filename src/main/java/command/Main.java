package command;

import command.fs.UnixFileSystemReceiver;
import command.fs.WindowsFileSystemReceiver;

public class Main {
    public static void main(String[] args) {
        WindowsFileSystemReceiver win = new WindowsFileSystemReceiver();
        UnixFileSystemReceiver unix = new UnixFileSystemReceiver();

        Command command = new OpenFileCommand(win);
        Command commandTwo = new OpenFileCommand(unix);
        command.execute();
        commandTwo.execute();

    }
}
