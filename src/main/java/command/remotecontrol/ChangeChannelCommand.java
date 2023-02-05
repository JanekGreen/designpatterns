package command.remotecontrol;

public class ChangeChannelCommand implements TvRemoteCommand{
    private TvRemoteControl tvRemoteControl;

    public ChangeChannelCommand(TvRemoteControl tvRemoteControl) {
        this.tvRemoteControl = tvRemoteControl;
    }

    @Override
    public void execute() {
        tvRemoteControl.changeChannel();
    }
}
