package command.fs;

public class WriteFileCommand implements Command {

	private FileSystem fileSystem;
	
	public WriteFileCommand(FileSystem fileSystem){
		this.fileSystem=fileSystem;
	}
	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}

}