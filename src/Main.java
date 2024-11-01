//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // implementar uma interface de comunicação humano-computador

        int j = 0;
        while(j!=4){
            Interface.menuInicial();
            j = IO.inputInt();
        }

    }
}