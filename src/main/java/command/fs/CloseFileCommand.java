package command.fs;

public class CloseFileCommand implements Command {

	private FileSystem fileSystem;
	
	public CloseFileCommand(FileSystem fileSystem){
		this.fileSystem=fileSystem;
	}
	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

}