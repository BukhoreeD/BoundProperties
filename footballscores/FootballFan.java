package footballscores;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class FootballFan implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("live result: " + event.getNewValue());
    }
}
