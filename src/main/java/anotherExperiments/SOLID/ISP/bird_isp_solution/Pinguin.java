package anotherExperiments.SOLID.ISP.bird_isp_solution;

public class Pinguin implements ISwim {

    @Override
    public void swim() {
        System.out.println("Pinguin is swimming...");
    }
}
