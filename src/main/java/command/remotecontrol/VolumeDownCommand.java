package command.remotecontrol;

public class VolumeDownCommand implements TvRemoteCommand{
    private TvRemoteControl tvRemoteControl;

    public VolumeDownCommand(TvRemoteControl tvRemoteControl) {
        this.tvRemoteControl = tvRemoteControl;
    }

    @Override
    public void execute() {
        tvRemoteControl.volumeDown();

    }
}
