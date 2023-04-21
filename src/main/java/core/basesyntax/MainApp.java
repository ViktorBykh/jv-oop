package core.basesyntax;

public class MainApp {
    private Machine[] machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};

    public Machine[] getMachines() {
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
        return machines;
    }
}
