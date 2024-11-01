public class Animais {
    private int animaisBovinos;
    private int animaisSuinos;
    private int animaisOvinos;
    private int animaisCaprinos;
    private int animaisEquinos;

    public void adicionarBovino(int numero_de_bovinos){
        this.animaisBovinos = this.animaisBovinos + numero_de_bovinos;
    }
    
    public void removerBovino(int numero_de_bovinos){
        if(numero_de_bovinos == 0){
            System.out.println("Numero de bovinos nulo!");
        }
        else this.animaisBovinos -= numero_de_bovinos;
    }

    public int totaldeBovinos(){
        return this.animaisBovinos;
    }

    public void adicionarOvinos(int numero_de_ovinos){
        this.animaisOvinos += numero_de_ovinos;
    }

    public void removerOvinos(int numero_de_ovinos){
        if(this.animaisOvinos == 0) System.out.println("Numero de ovinos nulo!");
        else this.animaisOvinos = this.animaisOvinos - numero_de_ovinos;
    }
    
    

}
