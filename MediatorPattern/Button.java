package MediatorPattern;

public class Button extends Component {
    public void press() {
        if (mediator != null) {
            mediator.notify(this, "button_pressed");
        }
    }
}
