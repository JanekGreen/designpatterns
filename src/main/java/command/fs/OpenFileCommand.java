package command.fs;

public class OpenFileCommand implements Command {

	private FileSystem fileSystem;
	
	public OpenFileCommand(FileSystem fileSystem) {
		this.fileSystem=fileSystem;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.fileSystem.openFile();
	}

}