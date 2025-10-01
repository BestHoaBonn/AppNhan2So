package Nhan2So;

public class Nhan2SoUseCaseControl {
    private InputInterface in;
    private OutputInterface out;
    private Nhan2So n2so;

    public Nhan2SoUseCaseControl(InputInterface in, OutputInterface out, Nhan2So n2so) {
        this.in = in;
        this.out = out;
        this.n2so = n2so;
    }

    public void execute() {
    
        InputData inData = in.input();
        if (inData == null) return;
        n2so.setNumber1(inData.num1);
        n2so.setNumber2(inData.num2);
        int result = n2so.nhan2So();
        OutputData outData = new OutputData(result);
        out.output(outData);
        
    }
}
