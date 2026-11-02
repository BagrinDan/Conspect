


1. Implementor (ПОДЧИНЕННЫЙ: Исполнитель)
    public abstract class TV {
        public abstract void on();
        public abstract void off();
        public abstract void tuneChannel(int channel);
    }


2. Concrete Implementors
    public class Sony extends TV {
        public void on() { ... }
        public void off() { ... }
        public tuneChannel(int channel) { ... }
    }

    public class RCA extends TV {
        public void on() { ... }
        public void off() { ... }
        public void tuneChannel(int channel) { ... }
    }


3. Abstraction (ГЛАВНЫЙ: заказчик)
    public abstract class RemoteControl {
        // Ссылка на Implementor
        protected TV tv;

        public void on() { tv.on(); }
        public void off() { tv.off(); }
        public void setChannel(int channel) { tv.tuneChannel(channel); }
    }


4. Refined Abstraction
public class ConcreteRemote extends RemoteControl {
    private int currentChannel = 0;

    public ConcreteRemote(TV tv){
        super(tv)
    }

    public void nextChannel(){
        currentChannel++;
        setChannel(currentChannel);
    }
    
    public void prevChannel() {
        currentChannel--;
        setChannel(currentChannel);
    }
}