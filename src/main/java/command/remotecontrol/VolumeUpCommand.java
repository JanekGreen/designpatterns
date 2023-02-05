package command.remotecontrol;

public class VolumeUpCommand implements  TvRemoteCommand {
    private TvRemoteControl tvRemoteControl;

    public VolumeUpCommand(TvRemoteControl tvRemoteControl) {
        this.tvRemoteControl = tvRemoteControl;
    }

    @Override
    public void execute() {
        tvRemoteControl.volumeUp();

    }
}
