enum LUZ{
    VERMELHO,AMBAR,VERDE
}
public class Palestra {
    private LUZ luz;

    Palestra(LUZ luz){
        this.luz = luz;
    }
    public LUZ getLuz(){
        return luz;
    }
    public void acessa(){
        switch(luz){
            case VERMELHO:
                System.out.println("Palestra indisponivel");
                break;
            case AMBAR:
                System.out.println("Palestra sendo liberada");
                break;
            case VERDE:
                System.out.println("Palestra disponivel");
                break;
        }
    }
}
