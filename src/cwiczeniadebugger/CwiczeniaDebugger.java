
package cwiczeniadebugger;

public class CwiczeniaDebugger {

    public static void main(String[] args) {
        new CwiczeniaDebugger().calculate(0, 10);
    }

    public CwiczeniaDebugger() {
        int x;
        int y;
    }
    
    private void calculate(int x, int y) {
        for (int i = 0; i < 10; i++) {
            x++;
            ++y;
            int wynik = x + y;
            System.out.println("wynik dla " + i + "-tej iteracji wynosi " + wynik);
        }
    }
}

